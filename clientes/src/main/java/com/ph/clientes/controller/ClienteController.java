package com.ph.clientes.controller;


import com.ph.clientes.entity.ClientesEntity;
import com.ph.clientes.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController //controlador
@RequestMapping("/clientes") //Defini a rota do banco
public class ClienteController {

    @Autowired //Sobrescrita de uma classe
    public ClienteService clienteService;

    @PostMapping //Criar
    public ClientesEntity create(@RequestBody ClientesEntity clienteEntity){
        return clienteService.create(clienteEntity);
    }

    @GetMapping //Buscar
    public List<ClientesEntity> findAll(){
        return clienteService.findAll();
    }

    @GetMapping("/{id}") //Buscar por id
    public Optional<ClientesEntity> findById(@PathVariable Long id){
        return clienteService.findId(id);
    }

    @DeleteMapping("/{id}") //Delete por id
    public void delete(@PathVariable Long id){
        clienteService.delete(id);
    }

    @PutMapping("/{id}") //Alterar por id
    public ClientesEntity update(@RequestBody /*Pega as informações do classe*/ ClientesEntity clientes, @PathVariable /* Localiza a variavel pelo id*/ Long id){
        return clienteService.update(clientes, id);
    }
}
