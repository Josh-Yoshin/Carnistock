package com.carniceria.stock.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carniceria.stock.model.Stock;

public interface StockRepository extends JpaRepository<Stock, Long> {
    Optional<Stock> findByCodigoProducto(String codigoProducto);
}