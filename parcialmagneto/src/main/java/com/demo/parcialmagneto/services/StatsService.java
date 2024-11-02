package com.demo.parcialmagneto.services;

import com.demo.parcialmagneto.repositories.DnaRepository;
import com.demo.parcialmagneto.dto.StatsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StatsService {

    private final DnaRepository dnaRepository;

    @Autowired
    public StatsService(DnaRepository dnaRepository) {
        this.dnaRepository = dnaRepository;
    }

    // Calcula las estadísticas de ADN mutante y humano
    public StatsResponse getStats() {
        // Cuenta el número de ADN mutantes en la base de datos
        long countMutantDna = dnaRepository.countByIsMutant(true);

        // Cuenta el número de ADN humanos en la base de datos
        long countHumanDna = dnaRepository.countByIsMutant(false);

        // Calcula el ratio de mutantes a humanos
        double ratio = countHumanDna == 0 ? 0 : (double) countMutantDna / countHumanDna;

        // Retorna la respuesta con estadísticas
        return new StatsResponse(countMutantDna, countHumanDna, ratio);
    }
}
