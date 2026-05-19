package com.carniceria.compras.service;
import com.carniceria.compras.dto.CompraDTO;
import com.carniceria.compras.model.CompraRecepcion;
import com.carniceria.compras.repository.CompraRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;

@Service
public class ServiceCompra {
    private static final Logger log = LoggerFactory.getLogger(ServiceCompra.class);
    @Autowired
    private CompraRepository compraRepository;

    public CompraRecepcion registrarRecepcion(CompraDTO dto) {
        log.info("Procesando entrada de mercadería mediante Factura N°: {}", dto.getNumeroFactura());
        CompraRecepcion compra = new CompraRecepcion();
        compra.setNumeroFactura(dto.getNumeroFactura());
        compra.setRutProveedor(dto.getRutProveedor());
        compra.setTotalKilosRecibidos(dto.getTotalKilosRecibidos());
        compra.setFechaRecepcion(LocalDateTime.now());
        return compraRepository.save(compra);
    }
}