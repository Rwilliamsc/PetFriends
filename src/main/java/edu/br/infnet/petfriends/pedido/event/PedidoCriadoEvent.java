package edu.br.infnet.petfriends.pedido.event;

public class PedidoCriadoEvent extends BaseEvent<String> {
    private final String descricao;
    private final double valor;

    public PedidoCriadoEvent(String id, String descricao, double valor) {
        super(id);
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }
}
