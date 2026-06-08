package com.fabrica.atv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fabrica.atv.model.Setor;

@Repository
public interface SetorRepository extends JpaRepository<Setor, Long>{
    

}
