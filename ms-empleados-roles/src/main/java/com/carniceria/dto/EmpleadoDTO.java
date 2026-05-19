package com.carniceria.empleados.dto;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class EmpleadoDTO {
    @NotBlank(message = "El RUT del empleado es obligatorio.")
    private String rut;
    @NotBlank(message = "El nombre completo es obligatorio.")
    private String nombreCompleto;
    @NotBlank(message = "El rol asignado en la bodega es obligatorio.")
    private String rolBodega;
}