package com.fabrica.atv.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.fabrica.atv.dto.setor.SetorRequest;
import com.fabrica.atv.dto.setor.SetorResponse;
import com.fabrica.atv.mapper.SetorMapper;
import com.fabrica.atv.model.Setor;
import com.fabrica.atv.repository.SetorRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SetorService {
    
    
    private final SetorRepository repository;
    private final SetorMapper mapper;


    public SetorResponse create(SetorRequest setorRequest){
        Setor setor = mapper.toEntity(setorRequest);
        Setor setorSalvo = repository.save(setor);
        SetorResponse setorResponse = mapper.toResponse(setorSalvo);
        return setorResponse;
    }

    public List<SetorResponse> listAll(){
        List<Setor> setores = repository.findAll();
        List<SetorResponse> dto = new ArrayList<>();

        for(Setor s: setores){
            dto.add(mapper.toResponse(s));
        }
        return dto;
    }

    public SetorResponse findById(long id){
        Setor setor = repository.findById(id).orElseThrow(()-> new RuntimeException());
        SetorResponse setorResponse = mapper.toResponse(setor);
        return setorResponse;
    }

    public SetorResponse update(long id, SetorRequest setorRequest){
        Setor setor = repository.findById(id).orElseThrow(()-> new RuntimeException());
        setor.setNome(setorRequest.nome());
        Setor setorSalvo = repository.save(setor);
        SetorResponse setorResponse = mapper.toResponse(setorSalvo);
        return setorResponse;
    }

    public void delete(long id){
        repository.deleteById(id);
    }

    
    
}
