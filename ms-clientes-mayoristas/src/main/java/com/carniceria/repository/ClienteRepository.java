package com.carniceria.clientes.repository;
import com.carniceria.clientes.model.ClienteMayorista;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<ClienteMayorista, Long> {}