package com.example.restaurantordermanagement.repository;

import com.example.restaurantordermanagement.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
}
