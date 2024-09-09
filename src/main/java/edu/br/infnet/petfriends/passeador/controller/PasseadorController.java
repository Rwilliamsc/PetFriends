package edu.br.infnet.petfriends.passeador.controller;

import edu.br.infnet.petfriends.passeador.model.Passeador;
import edu.br.infnet.petfriends.passeador.service.PasseadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/passeadores")
public class PasseadorController {
    @Autowired
    private PasseadorService passeadorService;

    @PostMapping
    public ResponseEntity<Passeador> criarPasseador(@RequestBody Passeador passeador) {
        Passeador novoPasseador = passeadorService.salvarPasseador(passeador);
        return new ResponseEntity<>(novoPasseador, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Passeador> consultarPasseador(@PathVariable Long id) {
        Optional<Passeador> passeador = passeadorService.buscarPasseadorPorId(id);
        return passeador.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
}
