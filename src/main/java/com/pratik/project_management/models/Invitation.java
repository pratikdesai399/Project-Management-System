package com.pratik.project_management.models;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Data
public class Invitation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long invitationId;

    @ManyToOne
    @JoinColumn(name = "project_id", nullable = false)
    private Project project;

    @Column(nullable = false, length = 100)
    private String invitedEmail;

    @Column(nullable = false, length = 50)
    private String status = "Pending"; // Pending, Accepted, Rejected

    @Column(nullable = false, updatable = false)
    private LocalDateTime invitedAt = LocalDateTime.now();
}
