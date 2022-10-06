/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.IngaJuan_ExamenFinal.controller;

import com.example.IngaJuan_ExamenFinal.entity.Cliente;
import com.example.IngaJuan_ExamenFinal.service.ClienteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Juann Inga
 */

@RestController
@RequestMapping("/api")
public class ClienteController {
    
    @Autowired
    private ClienteService clienteService;
    
    @GetMapping("/listar")
    public ResponseEntity<List<Cliente>> listarPantalones() {
        
        return new ResponseEntity<>(clienteService.findAll(), HttpStatus.OK);
        
    }

    //metodo para crear los pantalones
    @PostMapping("/crear")
    public ResponseEntity<Cliente> crearPantalon(@RequestBody Cliente c) {
        
        return new ResponseEntity<>(clienteService.crear(c), HttpStatus.OK);
        
    }
    
    @GetMapping("/buscar/{id}")
    public ResponseEntity<Cliente> listar_id(@PathVariable Long id) {
        
        return new ResponseEntity<>(clienteService.findById(id), HttpStatus.OK);
        
    }
    
    @DeleteMapping("/eliminar/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        
       clienteService.eliminar(id);
    }
    
    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Cliente> actualizarPantalones(@PathVariable Long id, @RequestBody Cliente p) {
        
        Cliente pt = buscarCliente(id);
        
        if (pt == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            
        } else {
            
            try {
                
               pt.setNombre(p.getNombre());
               pt.setApellido(p.getApellido());
               pt.setTelefono(p.getTelefono());
                
                return new ResponseEntity<>(clienteService.update(p), HttpStatus.CREATED);
                
            } catch (Exception e) {
                
                return new ResponseEntity<>(clienteService.update(p), HttpStatus.INTERNAL_SERVER_ERROR);
                
            }
            
        }
        
    }
    
    public Cliente buscarCliente(Long id) {
        
        return clienteService.findById(id);
    }
    
}
