package com.carniceria.stock.service;
import com.carniceria.stock.dto.StockDTO;
import com.carniceria.stock.model.Stock;
import com.carniceria.stock.model.StockDto;
import com.carniceria.stock.repository.StockRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceStock {
    private static final Logger log = LoggerFactory.getLogger(ServiceStock.class);
    @Autowired
    private StockRepository stockRepository;

    public Stock actualizarStock(StockDto dto) {
        log.info("Actualizando niveles de stock para producto: {}", dto.getCodigoProducto());
        Stock stock = stockRepository.findByCodigoProducto(dto.getCodigoProducto()).orElse(new Stock());
        stock.setCodigoProducto(dto.getCodigoProducto());
        stock.setCantidadKilos(dto.getCantidadKilos());
        stock.setUbicacionCamara(dto.getUbicacionCamara());
        return stockRepository.save(stock);
    }
}