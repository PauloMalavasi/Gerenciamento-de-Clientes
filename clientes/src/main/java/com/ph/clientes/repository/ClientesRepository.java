package com.ph.clientes.repository;

import com.ph.clientes.entity.ClientesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientesRepository extends JpaRepository <ClientesEntity, Long> {
}
