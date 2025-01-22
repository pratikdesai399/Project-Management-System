package com.pratik.project_management.repository;

import com.pratik.project_management.models.Subscription;
import com.pratik.project_management.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubscriptionRepository extends JpaRepository<Subscription, Long> {
    Subscription findByUser(User user);
}
