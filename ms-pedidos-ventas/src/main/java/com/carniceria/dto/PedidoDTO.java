package com.carniceria.pedidos.dto;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class PedidoDTO {
    @NotBlank(message = "El código de pedido es obligatorio.")
    private String codigoPedido;
    @NotBlank(message = "El RUT del cliente es obligatorio.")
    private String rutCliente;
    @NotNull(message = "El monto total no puede ser nulo.")
    @Positive(message = "El monto total debe ser positivo.")
    private Double montoTotal;
}