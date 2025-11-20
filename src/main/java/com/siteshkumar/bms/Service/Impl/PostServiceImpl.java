package com.siteshkumar.bms.Service.Impl;

import java.time.LocalDateTime;
import java.util.List;
import org.springframework.stereotype.Service;
import com.siteshkumar.bms.DTO.CreatePostDTO;
import com.siteshkumar.bms.DTO.PostDTO;
import com.siteshkumar.bms.DTO.UpdatePostDTO;
import com.siteshkumar.bms.Entity.PostEntity;
import com.siteshkumar.bms.Entity.UserEntity;
import com.siteshkumar.bms.Mapper.PostMapper;
import com.siteshkumar.bms.Repository.PostRepository;
import com.siteshkumar.bms.Repository.UserRepository;
import com.siteshkumar.bms.Service.PostService;

@Service
public class PostServiceImpl implements PostService{
    
    private final PostRepository postRepository;
    private final UserRepository userRepository;

    public PostServiceImpl(PostRepository postRepository, UserRepository userRepository){
        this.postRepository = postRepository;
        this.userRepository = userRepository;
    }

    @Override
    public PostDTO createPost(CreatePostDTO dto){
        UserEntity user = userRepository.findById(dto.getUserId())
                        .orElseThrow(() -> new RuntimeException("User not found!!!"));

        PostEntity post = new PostEntity();

        post.setTitle(dto.getTitle());
        post.setContent(dto.getContent());
        post.setCreatedAt(LocalDateTime.now());
        post.setUpdatedAt(LocalDateTime.now());
        post.setAuthor(user);

        PostEntity saved = postRepository.save(post);
        return PostMapper.entityToDto(saved);
    }

    @Override
    public PostDTO updatePost(Long postId, UpdatePostDTO dto){
        PostEntity post = postRepository.findById(postId)
                        .orElseThrow(() -> new RuntimeException(" Post not found!!! "));

        if(dto.getContent() != null && !dto.getContent().isBlank())
            post.setContent(dto.getContent());

        if(dto.getTitle() != null && !dto.getTitle().isBlank())
            post.setTitle(dto.getTitle());

        post.setUpdatedAt(LocalDateTime.now());

        PostEntity saved = postRepository.save(post);
        return PostMapper.entityToDto(saved);
    }

    @Override
    public void deletePost(Long postId){
        PostEntity post = postRepository.findById(postId)
                        .orElseThrow(() -> new RuntimeException("Post not found!!!"));

        postRepository.delete(post);
    }

    @Override
    public List<PostDTO> getAllPosts(){
        List<PostEntity> postEntities = postRepository.findAll();

        List<PostDTO> posts = postEntities.stream().map(PostMapper::entityToDto).toList();
        return posts;
    }

    @Override
    public PostDTO getPostById(Long postId){
        PostEntity post = postRepository.findById(postId)
                        .orElseThrow(() -> new RuntimeException("Post not found!!!"));

        return PostMapper.entityToDto(post);
    }
}
