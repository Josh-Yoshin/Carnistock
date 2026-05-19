package com.carniceria.Dto;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class ProductoDto {
    @NotBlank(message = "El código es obligatorio.")
    private String codigo;
    @NotBlank(message = "El nombre es obligatorio.")
    private String nombre;
    @NotBlank(message = "La categoría es obligatoria.")
    private String categoria;
    @NotBlank(message = "La unidad de medida es obligatoria.")
    private String unidadMedida;
}