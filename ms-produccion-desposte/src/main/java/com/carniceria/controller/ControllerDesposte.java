package com.carniceria.desposte.controller;
import com.carniceria.desposte.dto.DesposteDTO;
import com.carniceria.desposte.model.Desposte;
import com.carniceria.desposte.service.ServiceDesposte;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/desposte")
public class ControllerDesposte {
    @Autowired
    private ServiceDesposte serviceDesposte;

    @PostMapping
    public ResponseEntity<Desposte> crear(@Valid @RequestBody DesposteDTO dto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(serviceDesposte.registrarDesposte(dto));
    }
}