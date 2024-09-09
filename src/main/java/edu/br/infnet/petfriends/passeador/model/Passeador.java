package edu.br.infnet.petfriends.passeador.model;

import jakarta.persistence.*;

@Entity
public class Passeador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String disponibilidade;
    private String tiposAnimaisAceitos;

    public Passeador(String nome, String disponibilidade, String tiposAnimaisAceitos) {
        this.nome = nome;
        this.disponibilidade = disponibilidade;
        this.tiposAnimaisAceitos = tiposAnimaisAceitos;
    }
    
    public Passeador() {}
    
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

    public String getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(String disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public String getTiposAnimaisAceitos() {
        return tiposAnimaisAceitos;
    }

    public void setTiposAnimaisAceitos(String tiposAnimaisAceitos) {
        this.tiposAnimaisAceitos = tiposAnimaisAceitos;
    }

   

    
}