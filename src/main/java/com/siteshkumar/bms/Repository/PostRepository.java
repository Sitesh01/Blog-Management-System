package com.siteshkumar.bms.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.siteshkumar.bms.Entity.PostEntity;

@Repository
public interface PostRepository extends JpaRepository<PostEntity, Long>{
    
}
