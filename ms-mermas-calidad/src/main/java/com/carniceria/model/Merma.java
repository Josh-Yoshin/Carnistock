package com.carniceria.merma.model;
import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Table(name = "mermas_calidad")
@Data
public class Merma {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String codigoProducto;
    @Column(nullable = false)
    private Double kilosMermados;
    @Column(nullable = false)
    private String motivo;
    @Column(nullable = false)
    private LocalDateTime fechaRegistro;
}
}