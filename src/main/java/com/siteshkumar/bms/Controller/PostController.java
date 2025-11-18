package com.siteshkumar.bms.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.siteshkumar.bms.DTO.CreatePostDTO;
import com.siteshkumar.bms.DTO.PostDTO;
import com.siteshkumar.bms.DTO.UpdatePostDTO;
import com.siteshkumar.bms.Service.PostService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/v1/posts")
public class PostController {
    
    private final PostService postService;

    public PostController(PostService postService){
        this.postService = postService;
    }

    @PostMapping("/create")
    public ResponseEntity<PostDTO> createPost(@Valid @RequestBody CreatePostDTO dto){
        PostDTO createdPost = postService.createPost(dto);
        return ResponseEntity.status(201).body(createdPost);
    }

    @PutMapping("/update/{postId}")
    public ResponseEntity<PostDTO> updatePost(@PathVariable Long postId, @Valid @RequestBody UpdatePostDTO dto){
        PostDTO updatedPost = postService.updatePost(postId, dto);
        return ResponseEntity.status(200).body(updatedPost);
    }
}
