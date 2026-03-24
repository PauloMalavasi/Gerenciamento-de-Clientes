package com.ph.clientes.Repository;

import com.ph.clientes.Entity.ClientesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientesRepository extends JpaRepository <ClientesEntity, Long> {
}
