package com.fabrica.atv.dto.equipamento;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.fabrica.atv.dto.setor.SetorResume;

public record EquipamentoResponse (
    long id,
    String nome,
    int numeroDeSerie,
    BigDecimal valor,
    LocalDate dataAquisicao,
    SetorResume setor
){
    
}
