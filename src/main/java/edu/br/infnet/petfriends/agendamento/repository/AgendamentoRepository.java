package edu.br.infnet.petfriends.agendamento.repository;

import edu.br.infnet.petfriends.agendamento.model.Agendamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgendamentoRepository extends JpaRepository<Agendamento, Long> {}
