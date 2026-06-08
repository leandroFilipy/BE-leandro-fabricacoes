package com.fabrica.atv.dto.setor;

import java.util.List;

import com.fabrica.atv.dto.equipamento.EquipamentoResponse;

public record SetorResponse (
    long id,
    String nome,
    List<EquipamentoResponse> equipamentos
){
    
}
