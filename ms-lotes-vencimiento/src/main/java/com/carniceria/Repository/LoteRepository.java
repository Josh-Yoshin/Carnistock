package com.carniceria.lotes.repository;
import com.carniceria.lotes.model.LoteVencimiento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoteRepository extends JpaRepository<LoteVencimiento, Long> {}