package com.example.restaurantordermanagement.service;

import com.example.restaurantordermanagement.model.Prato;
import com.example.restaurantordermanagement.repository.PratoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PratoService {
    @Autowired
    private PratoRepository pratoRepository;

    public List<Prato> findAll() {
        return pratoRepository.findAll();
    }

    public Prato findById(Long id) {
        return pratoRepository.findById(id).orElse(null);
    }

    public Prato save(Prato prato) {
        return pratoRepository.save(prato);
    }

    public void deleteById(Long id) {
        pratoRepository.deleteById(id);
    }
}
