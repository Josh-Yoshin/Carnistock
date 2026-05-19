package com.carniceria.clientes.controller;
import com.carniceria.clientes.dto.ClienteDTO;
import com.carniceria.clientes.model.ClienteMayorista;
import com.carniceria.clientes.service.ServiceCliente;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/clientes")
public class ControllerCliente {
    @Autowired
    private ServiceCliente serviceCliente;

    @PostMapping
    public ResponseEntity<ClienteMayorista> crear(@Valid @RequestBody ClienteDTO dto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(serviceCliente.registrarCliente(dto));
    }
}