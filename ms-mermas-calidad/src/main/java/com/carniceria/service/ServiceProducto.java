package com.carniceria.merma.service;
import com.carniceria.merma.dto.MermaDTO;
import com.carniceria.merma.model.Merma;
import com.carniceria.merma.repository.MermaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;

@Service
public class ServiceMerma {
    private static final Logger log = LoggerFactory.getLogger(ServiceMerma.class);
    @Autowired
    private MermaRepository mermaRepository;

    public Merma registrarMerma(MermaDTO dto) {
        log.warn("REGISTRO DE MERMA CRÍTICA: {} kg perdidos del producto {}", dto.getKilosMermados(), dto.getCodigoProducto());
        Merma merma = new Merma();
        merma.setCodigoProducto(dto.getCodigoProducto());
        merma.setKilosMermados(dto.getKilosMermados());
        merma.setMotivo(dto.getMotivo());
        merma.setFechaRegistro(LocalDateTime.now());
        return mermaRepository.save(merma);
    }
}