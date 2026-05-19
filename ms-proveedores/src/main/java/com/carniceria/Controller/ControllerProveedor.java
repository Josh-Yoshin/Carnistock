package com.carniceria.proveedores.controller;
import com.carniceria.proveedores.dto.ProveedorDto;
import com.carniceria.proveedores.model.Proveedor;
import com.carniceria.proveedores.service.ServiceProveedor;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.carniceria.proveedores.Dto.ProveedorDto;

@RestController
@RequestMapping("/api/proveedores")
public class ControllerProveedor {
    @Autowired
    private ServiceProveedor serviceProveedor;

    @PostMapping
    public ResponseEntity<Proveedor> crear(@Valid @RequestBody ProveedorDto dto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(serviceProveedor.guardarProveedor(dto));
    }
}