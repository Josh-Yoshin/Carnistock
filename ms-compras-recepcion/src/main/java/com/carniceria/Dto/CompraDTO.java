package com.carniceria.compras.Dto;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class CompraDTO {
    @NotBlank(message = "El número de factura es obligatorio.")
    private String numeroFactura;
    @NotBlank(message = "El RUT del proveedor es obligatorio.")
    private String rutProveedor;
    @NotNull(message = "Los kilos recibidos no pueden ser nulos.")
    @Positive(message = "Los kilos deben ser mayores a cero.")
    private Double totalKilosRecibidos;
}