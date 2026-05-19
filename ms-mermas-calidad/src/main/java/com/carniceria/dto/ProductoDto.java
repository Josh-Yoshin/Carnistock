package com.carniceria.merma.dto;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class MermaDTO {
    @NotBlank(message = "El código de producto es requerido.")
    private String codigoProducto;
    @NotNull(message = "Los kilos mermados no pueden ser nulos.")
    @Positive(message = "Los kilos mermados deben ser mayores a cero.")
    private Double kilosMermados;
    @NotBlank(message = "El motivo de la merma es requerido.")
    private String motivo;
}