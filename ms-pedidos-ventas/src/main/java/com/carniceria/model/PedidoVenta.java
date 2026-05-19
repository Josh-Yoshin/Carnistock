package com.carniceria.pedidos.model;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "pedidos_venta")
@Data
public class PedidoVenta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String codigoPedido;
    @Column(nullable = false)
    private String rutCliente;
    @Column(nullable = false)
    private Double montoTotal;
    @Column(nullable = false)
    private LocalDateTime fechaPedido;
}