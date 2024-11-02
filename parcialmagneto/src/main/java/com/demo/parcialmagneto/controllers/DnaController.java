package com.demo.parcialmagneto.controllers;

import com.demo.parcialmagneto.dto.DnaRequest;
import com.demo.parcialmagneto.dto.DnaResponse;
import com.demo.parcialmagneto.services.DnaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

// Controlador REST que maneja solicitudes para la ruta "/mutant"
@RestController
@RequestMapping("/mutant")
@Validated
public class DnaController {

    private final DnaService dnaService;

    // Inyección de dependencias de DnaService en el constructor
    @Autowired
    public DnaController(DnaService dnaService) {
        this.dnaService = dnaService;
    }

    // Método POST para verificar si el ADN pertenece a un mutante
    @PostMapping
    public ResponseEntity<DnaResponse> checkMutant(@Valid @RequestBody DnaRequest dnaRequest) {
        // Llama al servicio para analizar el ADN y obtiene un valor booleano
        boolean isMutant = dnaService.analyzeDna(dnaRequest.getDna());

        // Crea una respuesta con el resultado
        DnaResponse dnaResponse = new DnaResponse(isMutant);

        // Retorna HTTP 200 (OK) si es mutante, o 403 (Forbidden) si no lo es
        if (isMutant) {
            return ResponseEntity.ok(dnaResponse);
        } else {
            return ResponseEntity.status(HttpStatus.FORBIDDEN).body(dnaResponse);
        }
    }
}
