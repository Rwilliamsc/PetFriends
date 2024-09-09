package edu.br.infnet.petfriends.agendamento.vo;

import jakarta.persistence.Embeddable;

@Embeddable
public class TipoServico {
    private String nome;

    public TipoServico(String nome) {
        this.nome = nome;
    }
    public TipoServico() {}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}

