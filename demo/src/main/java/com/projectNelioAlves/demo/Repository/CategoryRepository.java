package com.projectNelioAlves.demo.Repository;

import com.projectNelioAlves.demo.Entities.Category;
import com.projectNelioAlves.demo.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository <Category,Long> {
}
