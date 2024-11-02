package com.demo.parcialmagneto.dto;

import lombok.Getter;
import lombok.Setter;
import com.demo.parcialmagneto.validators.ValidDna;

// DTO para recibir el ADN en formato de array de Strings desde una solicitud
@Getter
@Setter
public class DnaRequest {

    @ValidDna // Anotación personalizada para validar el formato del ADN
    private String[] dna;
}
