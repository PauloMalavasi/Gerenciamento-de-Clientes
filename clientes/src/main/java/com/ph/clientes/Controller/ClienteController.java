package com.ph.clientes.Controller;


import com.ph.clientes.Entity.ClientesEntity;
import com.ph.clientes.Services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    public ClienteService clienteService;

    @PostMapping
    public ClientesEntity create(@RequestBody ClientesEntity clienteEntity){
        return clienteService.create(clienteEntity);
    }

    @GetMapping
    public List<ClientesEntity> findAll(){
        return clienteService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<ClientesEntity> findById(@PathVariable Long id){
        return clienteService.findId(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        clienteService.delete(id);
    }
}
