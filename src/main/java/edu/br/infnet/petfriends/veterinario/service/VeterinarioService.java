package edu.br.infnet.petfriends.veterinario.service;

import edu.br.infnet.petfriends.veterinario.model.Veterinario;
import edu.br.infnet.petfriends.veterinario.repository.VeterinarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class VeterinarioService {
    @Autowired
    private VeterinarioRepository veterinarioRepository;

    public Veterinario salvarVeterinário(Veterinario passeador) {
        return veterinarioRepository.save(passeador);
    }

    public Optional<Veterinario> buscarVeterinarioPorId(Long id) {
        return veterinarioRepository.findById(id);
    }
}
