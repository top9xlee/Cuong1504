package com.Website.Step2.repository;


import com.Website.Step2.model.Comment;
import com.Website.Step2.model.Post;
import com.Website.Step2.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByPost(Post post);
    List<Comment> findAllByUser(User user);
    Optional<Comment> findById(String Id);
}
