package com.carniceria.proveedores.Dto;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class ProveedorDto {
    @NotBlank(message = "El RUT es obligatorio.")
    private String rut;
    @NotBlank(message = "El nombre de la empresa es obligatorio.")
    private String nombreEmpresa;
    @NotBlank(message = "El rubro es obligatorio.")
    private String rubro;
}