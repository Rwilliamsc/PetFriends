package edu.br.infnet.petfriends.pedido.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Pedido{

    @Id
    private String id;
    private String descricao;
    private double valor;

    // Construtor padrão
    public Pedido() {}

    // Construtor com parâmetros
    public Pedido(String id, String descricao, double valor) {
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
    }

    // Getters e Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "PedidoEntity{" +
                "id='" + id + '\'' +
                ", descricao='" + descricao + '\'' +
                ", valor=" + valor +
                '}';
    }
}
