package com.carniceria.desposte.dto;
import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class DesposteDTO {
    @NotBlank(message = "El código de la pieza de origen es requerido.")
    private String codigoPiezaOrigen;
    @NotBlank(message = "El corte obtenido es requerido.")
    private String corteObtenido;
    @NotNull(message = "Los kilos obtenidos no pueden ser nulos.")
    @Positive(message = "Los kilos deben ser positivos.")
    private Double kilosObtenidos;
}public class DesposteDTO {

}
