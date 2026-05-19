package com.carniceria.desposte.Model;
import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Table(name = "produccion_desposte")
@Data
public class Desposte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String codigoPiezaOrigen;
    @Column(nullable = false)
    private String corteObtenido;
    @Column(nullable = false)
    private Double kilosObtenidos;
    @Column(nullable = false)
    private LocalDateTime fechaProceso;
}public class Desposte {

}
