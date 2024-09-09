package edu.br.infnet.petfriends.pedido.aggregate;

import edu.br.infnet.petfriends.pedido.command.CriarPedidoCommand;
import edu.br.infnet.petfriends.pedido.event.PedidoCriadoEvent;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.spring.stereotype.Aggregate;


import static org.axonframework.modelling.command.AggregateLifecycle.apply;

@Aggregate
public class PedidoAggregate {

    @AggregateIdentifier
    private String id;
    private String descricao;
    private double valor;

    public PedidoAggregate() { }

    @CommandHandler
    public PedidoAggregate(CriarPedidoCommand command) {
        apply(new PedidoCriadoEvent(command.getId(), command.getDescricao(), command.getValor()));
    }

    @EventSourcingHandler
    public void on(PedidoCriadoEvent event) {
        this.id = event.getId();
        this.descricao = event.getDescricao();
        this.valor = event.getValor();
    }
}
