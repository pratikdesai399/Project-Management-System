package com.pratik.project_management.repository;

import com.pratik.project_management.models.Comment;
import com.pratik.project_management.models.Task;
import com.pratik.project_management.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByUser(User user);
    List<Comment> findByTask(Task task);
}
