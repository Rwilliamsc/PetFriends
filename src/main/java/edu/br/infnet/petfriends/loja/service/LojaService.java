package edu.br.infnet.petfriends.loja.service;

import edu.br.infnet.petfriends.loja.model.Loja;
import edu.br.infnet.petfriends.loja.repository.LojaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LojaService {
    @Autowired
    private LojaRepository lojaRepository;

    public Loja salvarLoja(Loja loja) {
        return lojaRepository.save(loja);
    }

    public Optional<Loja> buscarLojaPorId(Long id) {
        return lojaRepository.findById(id);
    }
}

