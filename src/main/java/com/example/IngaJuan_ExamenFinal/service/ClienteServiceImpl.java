/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.IngaJuan_ExamenFinal.service;

import com.example.IngaJuan_ExamenFinal.entity.Cliente;
import com.example.IngaJuan_ExamenFinal.repository.ClienteRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Juann Inga
 */

@Service
public class ClienteServiceImpl implements ClienteService{
    
    @Autowired
    private ClienteRepository cursoRepository;
    
    
    @Override
    public Cliente crear(Cliente c) {

        return cursoRepository.save(c);

    }

    @Override
    public Cliente update(Cliente update) {


        return cursoRepository.save(update);


    }

    @Override
    public Cliente findById(Long id) {

        return cursoRepository.findById(id).orElse(null);

    }

    @Override
    public List<Cliente> findAll() {
        return cursoRepository.findAll();
    }

    @Override
    public void eliminar(Long id) {

cursoRepository.deleteById(id);
    }
    
}
