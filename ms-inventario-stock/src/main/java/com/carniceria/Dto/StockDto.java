package com.carniceria.stock.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "inventario_stock")
@Data
public class StockDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true)
    private String codigoProducto;
    @Column(nullable = false)
    private Double cantidadKilos;
    @Column(nullable = false)
    private String ubicacionCamara;
}