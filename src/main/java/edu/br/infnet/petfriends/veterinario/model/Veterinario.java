package edu.br.infnet.petfriends.veterinario.model;

import jakarta.persistence.*;

@Entity
public class Veterinario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String especialidades;

    public Veterinario(Long id, String nome, String especialidades) {
        this.id = id;
        this.nome = nome;
        this.especialidades = especialidades;
    }

    public Veterinario() {}

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

    public String getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(String especialidades) {
        this.especialidades = especialidades;
    }
}