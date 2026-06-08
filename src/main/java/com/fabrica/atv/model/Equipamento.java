package com.fabrica.atv.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Equipamento {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;

    private String nome;
    private int numeroDeSerie;
    private BigDecimal valor;
    private LocalDate dataAquisicao;

    @ManyToOne
    private Setor setor;

    public Equipamento (String nome, int numeroDeSerie, BigDecimal valor, LocalDate dataAquisicao){
        this.nome=nome;
        this.numeroDeSerie=numeroDeSerie;
        this.valor=valor;
        this.dataAquisicao=dataAquisicao;

    }
    
}
