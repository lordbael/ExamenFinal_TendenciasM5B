/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.IngaJuan_ExamenFinal.service;

import com.example.IngaJuan_ExamenFinal.entity.Cliente;
import java.util.List;

/**
 *
 * @author Juann Inga
 */
public interface ClienteService {
    
    Cliente crear(Cliente c);
    public Cliente update(Cliente update);
    public Cliente findById(Long id);
    public List<Cliente> findAll();
    public void eliminar(Long id);
    
}
