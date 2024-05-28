package com.example.restaurantordermanagement.repository;

import com.example.restaurantordermanagement.model.Prato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PratoRepository extends JpaRepository<Prato, Long> {
}
