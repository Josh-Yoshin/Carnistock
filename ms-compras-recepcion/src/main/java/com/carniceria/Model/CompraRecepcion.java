package com.carniceria.compras.model;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "compras_recepcion")
@Data
public class CompraRecepcion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String numeroFactura;
    @Column(nullable = false)
    private String rutProveedor;
    @Column(nullable = false)
    private Double totalKilosRecibidos;
    @Column(nullable = false)
    private LocalDateTime fechaRecepcion;
}