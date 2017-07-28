package com.reddit.Reddit.repository;

import com.reddit.Reddit.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.List;

@EnableJpaRepositories(basePackages = "repository")
public interface UserRepository extends JpaRepository<User, Integer> {
    List<User> getAllBy();
}
