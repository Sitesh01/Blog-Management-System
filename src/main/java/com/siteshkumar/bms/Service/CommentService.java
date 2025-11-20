package com.siteshkumar.bms.Service;

import java.util.List;
import com.siteshkumar.bms.DTO.CommentDTO;
import com.siteshkumar.bms.DTO.CreateCommentDTO;

public interface CommentService {
    
    public CommentDTO addCommentInPost(Long postId, CreateCommentDTO dto);
    public List<CommentDTO> getAllCommentsOfAPosts(Long postId);
    public void deleteCommentOfAPost(Long commentId);
}
