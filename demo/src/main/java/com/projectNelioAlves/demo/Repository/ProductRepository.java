package com.projectNelioAlves.demo.Repository;

import com.projectNelioAlves.demo.Entities.Category;
import com.projectNelioAlves.demo.Entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository <Product,Long> {
}
