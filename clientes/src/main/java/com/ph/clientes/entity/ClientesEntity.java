package com.ph.clientes.entity;

import com.ph.clientes.enums.ClientesEnum;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_cliente")
public class ClientesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @Column(name = "emailCliente")
    private String email;
    @Column(name = "telefoneCliente")
    private String telefone;

    private ClientesEnum login;
    private String password;

    public ClientesEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}