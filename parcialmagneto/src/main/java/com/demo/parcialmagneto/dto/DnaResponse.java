package com.demo.parcialmagneto.dto;

import lombok.AllArgsConstructor;
import lombok.Setter;

// DTO para enviar la respuesta sobre si el ADN es de un mutante
@AllArgsConstructor
@Setter
public class DnaResponse {
    private boolean isMutant;

    // Método getter para acceder al campo isMutant
    public boolean isMutant() {
        return isMutant;
    }
}
