package com.carniceria.lotes.controller;
import com.carniceria.lotes.dto.LoteDto;
import com.carniceria.lotes.model.LoteVencimiento;
import com.carniceria.lotes.service.ServiceLote;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/lotes")
public class ControllerLote {
    @Autowired
    private ServiceLote serviceLote;

    @PostMapping
    public ResponseEntity<LoteVencimiento> crear(@Valid @RequestBody LoteDto dto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(serviceLote.registrarLote(dto));
    }
}public class ControllerLote {

}
