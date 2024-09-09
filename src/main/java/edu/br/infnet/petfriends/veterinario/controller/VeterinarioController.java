package edu.br.infnet.petfriends.veterinario.controller;

import edu.br.infnet.petfriends.veterinario.model.Veterinario;
import edu.br.infnet.petfriends.veterinario.service.VeterinarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/veterinarios")
public class VeterinarioController {

    @Autowired
    private VeterinarioService veterinarioService;

    @PostMapping
    public ResponseEntity<Veterinario> criarVeterinario(@RequestBody Veterinario veterinario) {
        Veterinario novoVeterinario = veterinarioService.salvarVeterinário(veterinario);
        return new ResponseEntity<>(novoVeterinario, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Veterinario> consultaVeterinario(@PathVariable Long id) {
        Optional<Veterinario> veterinario = veterinarioService.buscarVeterinarioPorId(id);
        return veterinario.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
}
