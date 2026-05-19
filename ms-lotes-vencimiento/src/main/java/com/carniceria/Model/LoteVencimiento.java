package com.carniceria.model;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "lotes_vencimiento")
@Data
public class LoteVencimiento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true)
    private String codigoLote;
    @Column(nullable = false)
    private String codigoProducto;
    @Column(nullable = false)
    private LocalDate fechaVencimiento;
}