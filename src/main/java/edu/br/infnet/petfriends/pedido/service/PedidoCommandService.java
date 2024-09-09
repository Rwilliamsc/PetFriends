package edu.br.infnet.petfriends.pedido.service;

import edu.br.infnet.petfriends.pedido.command.CriarPedidoCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.stereotype.Service;

@Service
public class PedidoCommandService {
    private final CommandGateway commandGateway;

    public PedidoCommandService(CommandGateway commandGateway) {
        this.commandGateway = commandGateway;
    }

    public void criarPedido(String id, String descricao, double valor) {
        CriarPedidoCommand command = new CriarPedidoCommand(id, descricao, valor);
        commandGateway.send(command);
    }
}