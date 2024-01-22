package com.projectNelioAlves.demo.Repository;

import com.projectNelioAlves.demo.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User,Long> {
}
