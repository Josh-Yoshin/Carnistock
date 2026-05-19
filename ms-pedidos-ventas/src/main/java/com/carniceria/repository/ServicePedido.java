package com.carniceria.pedidos.service;
import com.carniceria.pedidos.dto.PedidoDTO;
import com.carniceria.pedidos.model.PedidoVenta;
import com.carniceria.pedidos.repository.PedidoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;

@Service
public class ServicePedido {
    private static final Logger log = LoggerFactory.getLogger(ServicePedido.class);
    @Autowired
    private PedidoRepository pedidoRepository;

    public PedidoVenta registrarPedido(PedidoDTO dto) {
        log.info("Procesando salida y despacho de pedido de venta código: {}", dto.getCodigoPedido());
        PedidoVenta pedido = new PedidoVenta();
        pedido.setCodigoPedido(dto.getCodigoPedido());
        pedido.setRutCliente(dto.getRutCliente());
        pedido.setMontoTotal(dto.getMontoTotal());
        pedido.setFechaPedido(LocalDateTime.now());
        return pedidoRepository.save(pedido);
    }
}