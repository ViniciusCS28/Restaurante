package com.example.restaurantordermanagement.repository;

import com.example.restaurantordermanagement.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
