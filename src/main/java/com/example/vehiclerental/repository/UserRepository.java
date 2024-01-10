package com.example.vehiclerental.repository;

import com.example.vehiclerental.enums.UserRole;
import com.example.vehiclerental.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    Optional<User> findFirstByEmail(String email);


    User findByUserRole(UserRole admin);
}
