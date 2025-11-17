package com.siteshkumar.bms.Entity;

import java.time.LocalDateTime;
import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name="posts")
public class PostEntity {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long postId;

    @NotBlank(message="title is required")
    private String title;

    @NotBlank(message="content is required")
    private String content;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    @ManyToOne
    @JoinColumn(name="userId", nullable = false)            // Owning side
    private UserEntity author;

    @OneToMany(mappedBy = "post", cascade=CascadeType.ALL, orphanRemoval=true)
    private List<CommentEntity> comments;
}
