package com.carniceria.lotes.Dto;
import java.time.LocalDate;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class LoteDto {
    @NotBlank(message = "El código de lote es obligatorio.")
    private String codigoLote;
    @NotBlank(message = "El código de producto es obligatorio.")
    private String codigoProducto;
    @NotNull(message = "La fecha de vencimiento es obligatoria.")
    private LocalDate fechaVencimiento;
}