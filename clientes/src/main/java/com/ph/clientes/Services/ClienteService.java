package com.ph.clientes.Services;

import com.ph.clientes.Entity.ClientesEntity;
import com.ph.clientes.Repository.ClientesRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    public ClientesRepository clientesRepository;

    public ClientesEntity create(ClientesEntity clientes){
        return clientesRepository.save(clientes);
    }

    public List<ClientesEntity> findAll(){
        return clientesRepository.findAll();
    }

    public Optional<ClientesEntity> findById(Long id){
        return clientesRepository.findById(id);
    }

    public void delete(Long id){
        clientesRepository.deleteById(id);
    }
}
