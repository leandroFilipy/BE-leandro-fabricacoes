package com.fabrica.atv.mapper;

import org.springframework.stereotype.Component;

import com.fabrica.atv.dto.setor.SetorRequest;
import com.fabrica.atv.dto.setor.SetorResponse;
import com.fabrica.atv.model.Setor;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Component
public class SetorMapper {
    
    private final EquipamentoMapper mapper;

    public Setor toEntity(SetorRequest setorRequest){
        return new Setor(
            setorRequest.nome()
        );
    }

    public SetorResponse toResponse(Setor setor){
        return new SetorResponse(
            setor.getId(),
            setor.getNome(),
            setor.getEquipamentos()!= null? setor.getEquipamentos().stream().map(mapper::toResponse).toList(): null
        );
    }
}
