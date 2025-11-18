package com.siteshkumar.bms.Service;

import com.siteshkumar.bms.DTO.CreatePostDTO;
import com.siteshkumar.bms.DTO.PostDTO;
import com.siteshkumar.bms.DTO.UpdatePostDTO;

public interface PostService {

    public PostDTO createPost(CreatePostDTO dto);
    public PostDTO updatePost(Long postId, UpdatePostDTO dto);
}
