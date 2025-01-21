package com.pratik.project_management.models;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Entity
@Data
public class Subscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long subscriptionId;

    @OneToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(nullable = false, length = 50)
    private String planName; // Free, Premium

    @Column(nullable = false)
    private LocalDate startDate = LocalDate.now();

    private LocalDate endDate;

    @Column(nullable = false)
    private Boolean isActive = true;
}
