package com.residencia.firstapi.controller;

import com.residencia.firstapi.entity.Autor;
import com.residencia.firstapi.service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/autor")
public class AutorController {
    @Autowired
    private AutorService autorService;

    @GetMapping
    public ResponseEntity<List<Autor>> findAll(){
        return ResponseEntity.ok().body(autorService.findAll());
    }

    @GetMapping("/{id}")
    public Autor findById(@PathVariable(value = "id") Integer id){
        return autorService.findById(id);
    }

    @GetMapping("/nome/{nome}")
    public Optional <Autor> findByAutorNome(@PathVariable(value = "nome") String nome){
        return autorService.findByAutorNome(nome);
    }

    @PostMapping
    public Autor save(@RequestBody Autor autor){
        return autorService.save(autor);
    }

    @PutMapping("/{id}")//ou colocar integer id ou coloca (value="id") e integer nomeVariavel
    public Autor update(@PathVariable (value = "id") Integer autorId , @RequestBody Autor autor) {
        return autorService.update(autor, autorId);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable (value = "id")  Integer autorId){
        autorService.delete(autorId);
    }
}