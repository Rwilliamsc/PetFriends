package edu.br.infnet.petfriends.agendamento.model;

import edu.br.infnet.petfriends.cliente.model.Cliente;
import edu.br.infnet.petfriends.loja.model.Loja;
import edu.br.infnet.petfriends.passeador.model.Passeador;
import edu.br.infnet.petfriends.veterinario.model.Veterinario;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Agendamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime dataHora;

    public Agendamento(LocalDateTime dataHora, String status, Cliente cliente, Veterinario veterinario, Passeador passeador, Loja loja) {
        this.dataHora = dataHora;
        this.status = status;
        this.cliente = cliente;
        this.veterinario = veterinario;
        this.passeador = passeador;
        this.loja = loja;
    }

    public Agendamento() {}

    private String status;

    @ManyToOne
    private Cliente cliente;

    @ManyToOne
    private Veterinario veterinario;

    @ManyToOne
    private Passeador passeador;

    @ManyToOne
    private Loja loja;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    public Passeador getPasseador() {
        return passeador;
    }

    public void setPasseador(Passeador passeador) {
        this.passeador = passeador;
    }

    public Loja getLoja() {
        return loja;
    }

    public void setLoja(Loja loja) {
        this.loja = loja;
    }
}
