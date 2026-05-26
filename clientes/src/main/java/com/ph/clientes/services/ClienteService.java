package com.ph.clientes.services;

import com.ph.clientes.entity.ClientesEntity;
import com.ph.clientes.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;
import java.util.Optional;

@Service
public class ClienteService implements UserDetailsService{

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
    public ClientesEntity update(ClientesEntity cliente, Long id){
        ClientesEntity response = clienteRepository.findById(id).get();
        response.setEmail(cliente.getEmail());
        response.setNome(cliente.getNome());
        response.setTelefone(cliente.getTelefone());
        return clienteRepository.save(response);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return clienteRepository.findBylogin(username);
    }

}
