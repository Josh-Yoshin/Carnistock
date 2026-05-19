package com.carniceria.merma.controller;
import com.carniceria.merma.dto.MermaDTO;
import com.carniceria.merma.model.Merma;
import com.carniceria.merma.service.ServiceMerma;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/mermas")
public class ControllerMerma {
    @Autowired
    private ServiceMerma serviceMerma;

    @PostMapping
    public ResponseEntity<Merma> crear(@Valid @RequestBody MermaDTO dto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(serviceMerma.registrarMerma(dto));
    }
}