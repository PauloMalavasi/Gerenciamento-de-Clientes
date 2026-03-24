package com.ph.clientes.Services;

import com.ph.clientes.Entity.ClientesEntity;
import com.ph.clientes.Repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    public ClientesRepository clienteRepository;

    public List<ClientesEntity> findAll(){
        return clienteRepository.findAll();
    }

    public ClientesEntity create(ClientesEntity clienteEntity){
        return clienteRepository.save(clienteEntity);
    }

    public void delete(Long id){
        clienteRepository.deleteById(id);
    }

    public Optional<ClientesEntity> findId(Long id){
        return clienteRepository.findById(id);
    }
}
