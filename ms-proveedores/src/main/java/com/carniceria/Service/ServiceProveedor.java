package com.carniceria.proveedores.service;
import com.carniceria.proveedores.dto.ProveedorDto;
import com.carniceria.proveedores.model.Proveedor;
import com.carniceria.proveedores.repository.ProveedorRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceProveedor {
    private static final Logger log = LoggerFactory.getLogger(ServiceProveedor.class);
    @Autowired
    private ProveedorRepository proveedorRepository;

    public Proveedor guardarProveedor(ProveedorDto dto) {
        log.info("Registrando nuevo proveedor externo: {}", dto.getNombreEmpresa());
        Proveedor proveedor = new Proveedor();
        proveedor.setRut(dto.getRut());
        proveedor.setNombreEmpresa(dto.getNombreEmpresa());
        proveedor.setRubro(dto.getRubro());
        return proveedorRepository.save(proveedor);
    }
}