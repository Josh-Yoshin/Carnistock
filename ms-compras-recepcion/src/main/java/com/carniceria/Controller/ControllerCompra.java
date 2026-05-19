package com.carniceria.compras.controller;
import com.carniceria.compras.dto.CompraDTO;
import com.carniceria.compras.model.CompraRecepcion;
import com.carniceria.compras.service.ServiceCompra;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/compras")
public class ControllerCompra {
    @Autowired
    private ServiceCompra serviceCompra;

    @PostMapping
    public ResponseEntity<CompraRecepcion> crear(@Valid @RequestBody CompraDTO dto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(serviceCompra.registrarRecepcion(dto));
    }
}