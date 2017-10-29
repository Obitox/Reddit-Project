package com.reddit.Reddit.repository;

import com.reddit.Reddit.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@EnableJpaRepositories(basePackages = "repository")
public interface UserRepository extends JpaRepository<User, Integer> {
    List<User> getAllBy();
    @Query("SELECT CASE WHEN COUNT(c) > 0 THEN true ELSE false END FROM User c WHERE c.username = :username AND c.password = :password")
    boolean existsByUsernameAndPassword(@Param("username") String username, @Param("password") String password);
}
