package com.carniceria.productos.service;
import com.carniceria.productos.dto.ProductoDTO;
import com.carniceria.productos.model.Producto;
import com.carniceria.productos.repository.ProductoRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carniceria.Dto.CompraDTO;

@Service
public class ServiceProducto {
    private static final Logger log = LoggerFactory.getLogger(ServiceProducto.class);
    @Autowired
    private MermaRepository productoRepository;

    public ControllerCompra guardarProducto(CompraDTO dto) {
        log.info("Registrando de forma formal el corte: {}", dto.getNombre());
        ControllerCompra producto = new ControllerCompra();
        producto.setCodigo(dto.getCodigo());
        producto.setNombre(dto.getNombre());
        producto.setCategoria(dto.getCategoria());
        producto.setUnidadMedida(dto.getUnidadMedida());
        return productoRepository.save(producto);
    }
}