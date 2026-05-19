package com.carniceria.clientes.service;
import com.carniceria.clientes.dto.ClienteDTO;
import com.carniceria.clientes.model.ClienteMayorista;
import com.carniceria.clientes.repository.ClienteRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceCliente {
    private static final Logger log = LoggerFactory.getLogger(ServiceCliente.class);
    @Autowired
    private ClienteRepository clienteRepository;

    public ClienteMayorista registrarCliente(ClienteDTO dto) {
        log.info("Registrando cuenta comercial mayorista para: {}", dto.getRazonSocial());
        ClienteMayorista cliente = new ClienteMayorista();
        cliente.setRut(dto.getRut());
        cliente.setRazonSocial(dto.getRazonSocial());
        cliente.setEstadoCredito(dto.getEstadoCredito());
        return clienteRepository.save(cliente);
    }
}