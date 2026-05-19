package com.carniceria.clientes.dto;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class ClienteDTO {
    @NotBlank(message = "El RUT es obligatorio.")
    private String rut;
    @NotBlank(message = "La razón social es obligatoria.")
    private String razonSocial;
    @NotBlank(message = "El estado del crédito es obligatorio.")
    private String estadoCredito;
}