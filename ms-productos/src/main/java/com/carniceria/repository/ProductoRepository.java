package com.carniceria.Repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carniceria.Model.ControllerCompra;

public interface ProductoRepository extends JpaRepository<ControllerCompra, Long> {
    Optional<ControllerCompra> findByCodigo(String codigo);
}