package edu.br.infnet.petfriends.loja.controller;

import edu.br.infnet.petfriends.loja.model.Loja;
import edu.br.infnet.petfriends.loja.service.LojaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/lojas")
public class LojaController {
    @Autowired
    private LojaService lojaService;

    @PostMapping
    public ResponseEntity<Loja> criarLoja(@RequestBody Loja loja) {
        Loja novaLoja = lojaService.salvarLoja(loja);
        return new ResponseEntity<>(novaLoja, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Loja> consultarLoja(@PathVariable Long id) {
        Optional<Loja> loja = lojaService.buscarLojaPorId(id);
        return loja.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
}

