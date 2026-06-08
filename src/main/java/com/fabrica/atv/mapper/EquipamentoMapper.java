package com.fabrica.atv.mapper;

import org.springframework.stereotype.Component;

import com.fabrica.atv.dto.equipamento.EquipamentoRequest;
import com.fabrica.atv.dto.equipamento.EquipamentoResponse;
import com.fabrica.atv.dto.setor.SetorResume;
import com.fabrica.atv.model.Equipamento;

@Component
public class EquipamentoMapper {
    

    public Equipamento toEntity(EquipamentoRequest equipamentoRequest){
        return new Equipamento(
            equipamentoRequest.nome(),
            equipamentoRequest.numeroDeSerie(),
            equipamentoRequest.valor(),
            equipamentoRequest.dataAquisicao()
        );
    }

    public EquipamentoResponse toResponse(Equipamento equipamento){
        return new EquipamentoResponse(
            equipamento.getId(),
            equipamento.getNome(),
            equipamento.getNumeroDeSerie(),
            equipamento.getValor(),
            equipamento.getDataAquisicao(),
            new SetorResume(
                equipamento.getSetor().getId(),
                equipamento.getSetor().getNome()
            )
        );
    }
}
