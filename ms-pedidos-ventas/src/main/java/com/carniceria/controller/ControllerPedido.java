package com.carniceria.pedidos.controller;
import com.carniceria.pedidos.dto.PedidoDTO;
import com.carniceria.pedidos.model.PedidoVenta;
import com.carniceria.pedidos.service.ServicePedido;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pedidos")
public class ControllerPedido {
    @Autowired
    private ServicePedido servicePedido;

    @PostMapping
    public ResponseEntity<PedidoVenta> crear(@Valid @RequestBody PedidoDTO dto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(servicePedido.registrarPedido(dto));
    }
}