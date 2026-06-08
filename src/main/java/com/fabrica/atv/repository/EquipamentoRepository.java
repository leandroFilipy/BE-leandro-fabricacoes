package com.fabrica.atv.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.fabrica.atv.model.Equipamento;

@Repository
public interface EquipamentoRepository extends JpaRepository<Equipamento, Long>{
    

    @Query("SELECT e FROM Equipamento e WHERE e.setor.nome = :nome")
    List<Equipamento> findBySetorNome(@Param("nome") String nome);

    @Query(value="SELECT e.nome AS nomeEquipamento, e.valor AS valorEquipamento, s.nome AS nomeSetor FROM equipamento e JOIN setor s ON s.id = e.setor_id", nativeQuery = true)
    List<RelatorioProjection> relatorio();
}
