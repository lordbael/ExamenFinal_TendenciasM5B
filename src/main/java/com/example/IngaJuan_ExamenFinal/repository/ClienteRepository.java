/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.IngaJuan_ExamenFinal.repository;

import com.example.IngaJuan_ExamenFinal.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Juann Inga
 */
public interface ClienteRepository extends JpaRepository<Cliente, Long>{
    
}
