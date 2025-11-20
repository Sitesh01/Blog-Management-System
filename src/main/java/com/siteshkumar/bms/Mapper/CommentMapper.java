package com.siteshkumar.bms.Mapper;

import com.siteshkumar.bms.DTO.CommentDTO;
import com.siteshkumar.bms.Entity.CommentEntity;

public class CommentMapper {
    
    public static CommentDTO entityToDto(CommentEntity entity){
        if(entity == null)
            return null;
            
        return new CommentDTO(
            entity.getCommentId(),
            entity.getText(),
            entity.getCreatedAt(),
            entity.getAuthor().getUserId(),
            entity.getPost().getPostId()
        );
    }
}
