package com.pbo2.toko_elektronik.repository;

import com.pbo2.toko_elektronik.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsernameAndPassword(String username, String password);
}