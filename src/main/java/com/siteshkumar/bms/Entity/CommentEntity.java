package com.siteshkumar.bms.Entity;

import java.time.LocalDateTime;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name="comments")
public class CommentEntity {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long commentId;

    @NotBlank(message="comments is required")
    private String text;
    private LocalDateTime createdAt;

    @ManyToOne
    @JoinColumn(name="userId", nullable = false)            // Owning side
    private UserEntity author;

    @ManyToOne
    @JoinColumn(name="postId", nullable = false)            // Owning side
    private PostEntity post;
}
