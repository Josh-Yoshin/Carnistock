package com.carniceria.lotes.service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carniceria.lotes.dto.LoteDto;
import com.carniceria.lotes.model.LoteVencimiento;
import com.carniceria.lotes.repository.LoteRepository;

@Service
public class ServiceLote {
    private static final Logger log = LoggerFactory.getLogger(ServiceLote.class);
    @Autowired
    private LoteRepository loteRepository;

    public LoteVencimiento registrarLote(LoteDto dto) {
        log.info("Registrando lote de trazabilidad {} para producto {}", dto.getCodigoLote(), dto.getCodigoProducto());
        LoteVencimiento lote = new LoteVencimiento();
        lote.setCodigoLote(dto.getCodigoLote());
        lote.setCodigoProducto(dto.getCodigoProducto());
        lote.setFechaVencimiento(dto.getFechaVencimiento());
        return loteRepository.save(lote);
    }
}