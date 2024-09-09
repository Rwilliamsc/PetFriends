package edu.br.infnet.petfriends.loja.model;

import jakarta.persistence.*;

@Entity
public class Loja {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String endereco;
    private String regiaoAtendida;

    public Loja(String nome, String endereco, String regiaoAtendida) {
        this.nome = nome;
        this.endereco = endereco;
        this.regiaoAtendida = regiaoAtendida;
    }

    public Loja() {
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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getRegiaoAtendida() {
        return regiaoAtendida;
    }

    public void setRegiaoAtendida(String regiaoAtendida) {
        this.regiaoAtendida = regiaoAtendida;
    }
}

