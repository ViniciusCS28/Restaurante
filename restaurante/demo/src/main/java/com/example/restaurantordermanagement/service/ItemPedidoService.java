package com.example.restaurantordermanagement.service;

import com.example.restaurantordermanagement.model.ItemPedido;
import com.example.restaurantordermanagement.repository.ItemPedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemPedidoService {
    @Autowired
    private ItemPedidoRepository itemPedidoRepository;

    public List<ItemPedido> findAll() {
        return itemPedidoRepository.findAll();
    }

    public ItemPedido findById(Long id) {
        return itemPedidoRepository.findById(id).orElse(null);
    }

    public ItemPedido save(ItemPedido itemPedido) {
        return itemPedidoRepository.save(itemPedido);
    }

    public void deleteById(Long id) {
        itemPedidoRepository.deleteById(id);
    }
}
