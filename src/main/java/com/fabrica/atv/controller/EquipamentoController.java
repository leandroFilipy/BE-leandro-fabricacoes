package com.fabrica.atv.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fabrica.atv.dto.equipamento.EquipamentoRequest;
import com.fabrica.atv.dto.equipamento.EquipamentoResponse;
import com.fabrica.atv.repository.RelatorioProjection;
import com.fabrica.atv.service.EquipamentoService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/equipamentos")
@RequiredArgsConstructor
public class EquipamentoController {
    
    private final EquipamentoService service;

    @PostMapping
    public ResponseEntity<EquipamentoResponse> create(@RequestBody EquipamentoRequest equipamentoRequest){
        return ResponseEntity.status(201).body(service.create(equipamentoRequest));
    }

    @GetMapping
    public ResponseEntity<List<EquipamentoResponse>> listAll(){
        return ResponseEntity.status(200).body(service.listAll());
    }

    @PutMapping("/{id}")
    public ResponseEntity<EquipamentoResponse> update(@PathVariable long id, @RequestBody EquipamentoRequest equipamentoRequest){
        return ResponseEntity.status(200).body(service.update(id, equipamentoRequest));
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable long id){
        service.delete(id);
        return ResponseEntity.status(204).build();
    }

    @GetMapping("/nome/{nome}")
    public ResponseEntity<List<EquipamentoResponse>> findBySetorNome(@PathVariable String nome){
        return ResponseEntity.status(200).body(service.findBySetorNome(nome));
    }


    @GetMapping("/relatorio")
    public ResponseEntity<List<RelatorioProjection>> relatorio(){
        return ResponseEntity.status(200).body(service.relatorio());
    }

}
