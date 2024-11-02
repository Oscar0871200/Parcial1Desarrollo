package com.demo.parcialmagneto.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

// DTO para devolver estadísticas sobre mutantes y humanos
@AllArgsConstructor
@Getter
@Setter
public class StatsResponse {

    @JsonProperty("count_mutant_dna") // Mapea el campo a "count_mutant_dna" en JSON
    private long countMutantDna;

    @JsonProperty("count_human_dna") // Mapea el campo a "count_human_dna" en JSON
    private long countHumanDna;

    private double ratio; // Relación entre mutantes y humanos
}
