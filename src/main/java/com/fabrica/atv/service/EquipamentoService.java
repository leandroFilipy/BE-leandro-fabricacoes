package com.fabrica.atv.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.fabrica.atv.dto.equipamento.EquipamentoRequest;
import com.fabrica.atv.dto.equipamento.EquipamentoResponse;
import com.fabrica.atv.mapper.EquipamentoMapper;
import com.fabrica.atv.model.Equipamento;
import com.fabrica.atv.model.Setor;
import com.fabrica.atv.repository.EquipamentoRepository;
import com.fabrica.atv.repository.RelatorioProjection;
import com.fabrica.atv.repository.SetorRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EquipamentoService {
    

    private final EquipamentoRepository repository;
    private final EquipamentoMapper mapper;
    private final SetorRepository setorRepository;


    public EquipamentoResponse create(EquipamentoRequest equipamentoRequest){
        Setor setor = setorRepository.findById(equipamentoRequest.idSetor()).orElseThrow(() -> new RuntimeException());
        Equipamento equipamento = mapper.toEntity(equipamentoRequest);
        equipamento.setSetor(setor);
        Equipamento equipamentoSalvo = repository.save(equipamento);
        EquipamentoResponse equipamentoResponse = mapper.toResponse(equipamentoSalvo);
        return equipamentoResponse;
    }

    public List<EquipamentoResponse> listAll(){
        List<Equipamento> equipamentos = repository.findAll();
        List<EquipamentoResponse> dto = new ArrayList<>();

        for(Equipamento e: equipamentos){
            dto.add(mapper.toResponse(e));
        }
        return dto;
    }

    public EquipamentoResponse update(long id, EquipamentoRequest equipamentoRequest){
        Setor setor = setorRepository.findById(equipamentoRequest.idSetor()).orElseThrow(()-> new RuntimeException());
        Equipamento equipamento = repository.findById(id).orElseThrow(()-> new RuntimeException());
        equipamento.setNome(equipamentoRequest.nome());
        equipamento.setNumeroDeSerie(equipamentoRequest.numeroDeSerie());
        equipamento.setValor(equipamentoRequest.valor());
        equipamento.setDataAquisicao(equipamentoRequest.dataAquisicao());
        equipamento.setSetor(setor);
        Equipamento equipamentoSalvo = repository.save(equipamento);
        EquipamentoResponse equipamentoResponse = mapper.toResponse(equipamentoSalvo);
        return equipamentoResponse;
    }

    public void delete(long id){
        repository.deleteById(id);
    }

    public List<EquipamentoResponse> findBySetorNome(String nome){
        List<Equipamento> equipamentos = repository.findBySetorNome(nome);
        List<EquipamentoResponse>dto = new ArrayList<>();

        for(Equipamento e: equipamentos){
            dto.add(mapper.toResponse(e));
        }
        return dto;
    }

    public List<RelatorioProjection> relatorio(){
        return repository.relatorio();
    }

}
