package edu.br.infnet.petfriends.pedido.command;

public class CriarPedidoCommand extends BaseCommand<String> {
    private final String descricao;
    private final double valor;

    public CriarPedidoCommand(String id, String descricao, double valor) {
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
