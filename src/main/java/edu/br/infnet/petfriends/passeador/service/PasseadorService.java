package edu.br.infnet.petfriends.passeador.service;

import edu.br.infnet.petfriends.passeador.model.Passeador;
import edu.br.infnet.petfriends.passeador.repository.PasseadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PasseadorService {
    @Autowired
    private PasseadorRepository passeadorRepository;

    public Passeador salvarPasseador(Passeador passeador) {
        return passeadorRepository.save(passeador);
    }

    public Optional<Passeador> buscarPasseadorPorId(Long id) {
        return passeadorRepository.findById(id);
    }
}
