package com.carniceria.desposte.service;
import com.carniceria.desposte.dto.DesposteDTO;
import com.carniceria.desposte.model.Desposte;
import com.carniceria.desposte.repository.DesposteRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;

@Service
public class ServiceDesposte {
    private static final Logger log = LoggerFactory.getLogger(ServiceDesposte.class);
    @Autowired
    private DesposteRepository desposteRepository;

    public Desposte registrarDesposte(DesposteDTO dto) {
        log.info("Ejecutando proceso de desposte industrial para la pieza: {}", dto.getCodigoPiezaOrigen());
        Desposte desposte = new Desposte();
        desposte.setCodigoPiezaOrigen(dto.getCodigoPiezaOrigen());
        desposte.setCorteObtenido(dto.getCorteObtenido());
        desposte.setKilosObtenidos(dto.getKilosObtenidos());
        desposte.setFechaProceso(LocalDateTime.now());
        return desposteRepository.save(desposte);
    }
}public class ServiceDesposte {

}
