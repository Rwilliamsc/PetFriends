package edu.br.infnet.petfriends.veterinario.repository;

import edu.br.infnet.petfriends.veterinario.model.Veterinario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VeterinarioRepository extends JpaRepository<Veterinario, Long> {}