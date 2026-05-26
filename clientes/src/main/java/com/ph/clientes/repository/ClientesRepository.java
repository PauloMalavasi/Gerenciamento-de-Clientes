package com.ph.clientes.repository;

import com.ph.clientes.entity.ClientesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface ClientesRepository extends JpaRepository <ClientesEntity, Long> {

    UserDetails findBylogin(String login);

}
