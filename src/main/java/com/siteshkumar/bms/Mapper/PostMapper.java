package com.siteshkumar.bms.Mapper;

import com.siteshkumar.bms.DTO.PostDTO;
import com.siteshkumar.bms.Entity.PostEntity;

public class PostMapper {
    
    public static PostDTO entityToDto(PostEntity entity){
        if(entity == null)
            return null;

        Long authorId = entity.getAuthor().getUserId();

        PostDTO dto = new PostDTO();
        dto.setPostId(entity.getPostId());
        dto.setTitle(entity.getTitle());
        dto.setContent(entity.getContent());
        dto.setCreatedAt(entity.getCreatedAt());
        dto.setUpdatedAt(entity.getUpdatedAt());
        dto.setAuthorId(authorId);

        return dto;
    }
}
