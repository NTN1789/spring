package com.projectNelioAlves.demo.Repository;

import com.projectNelioAlves.demo.Entities.Order;
import com.projectNelioAlves.demo.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository <Order,Long> {
}
