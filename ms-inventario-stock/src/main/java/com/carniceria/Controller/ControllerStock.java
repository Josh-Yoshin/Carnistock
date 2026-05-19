package com.carniceria.stock.controller;
import com.carniceria.stock.dto.StockDTO;
import com.carniceria.stock.model.Stock;
import com.carniceria.stock.model.StockDto;
import com.carniceria.stock.service.ServiceStock;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/stock")
public class ControllerStock {
    @Autowired
    private ServiceStock serviceStock;

    @PutMapping
    public ResponseEntity<Stock> actualizar(@Valid @RequestBody StockDto dto) {
        return ResponseEntity.ok(serviceStock.actualizarStock(dto));
    }
}