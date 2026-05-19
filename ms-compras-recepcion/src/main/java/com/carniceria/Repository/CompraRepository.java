package com.carniceria.compras.repository;
import com.carniceria.compras.model.CompraRecepcion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompraRepository extends JpaRepository<CompraRecepcion, Long> {}