package com.demo.parcialmagneto.repositories;

import com.demo.parcialmagneto.entities.Dna;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DnaRepository extends JpaRepository<Dna, Long> {

    // Método para buscar una entrada de ADN específica por su secuencia de ADN
    Optional<Dna> findByDna(String dnaSequence);

    // Método para contar la cantidad de registros de ADN que son mutantes o no, según el valor de 'isMutant'
    long countByIsMutant(boolean isMutant);
}
