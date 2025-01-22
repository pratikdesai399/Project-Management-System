package com.pratik.project_management.repository;


import com.pratik.project_management.models.Invitation;
import com.pratik.project_management.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InvitationRepository extends JpaRepository<Invitation, Long> {
    List<Invitation> findByProject(Project project); // Custom query to find invitations by project
    Invitation findByInvitedEmail(String email); // Custom query to find invitation by email
}
