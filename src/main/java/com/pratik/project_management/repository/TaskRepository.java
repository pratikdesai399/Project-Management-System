package com.pratik.project_management.repository;

import com.pratik.project_management.models.Project;
import com.pratik.project_management.models.Task;
import com.pratik.project_management.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByProject(Project project);
    List<Task> findByAssignedTo(User user);
}
