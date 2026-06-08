package com.fabrica.atv.dto.equipamento;

import java.math.BigDecimal;
import java.time.LocalDate;

public record EquipamentoRequest (
    String nome,
    int numeroDeSerie,
    BigDecimal valor,
    LocalDate dataAquisicao,
    Long idSetor
){
    
}
