package com.demo.parcialmagneto.controllers;

import com.demo.parcialmagneto.dto.StatsResponse;
import com.demo.parcialmagneto.services.StatsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Controlador REST para la ruta "/stats", que maneja estadísticas
@RestController
@RequestMapping("/stats")
public class StatsController {

    private final StatsService statsService;

    // Inyección de dependencias de StatsService en el constructor
    public StatsController(StatsService statsService) {
        this.statsService = statsService;
    }

    // Método GET para obtener estadísticas de mutantes vs humanos
    @GetMapping
    public StatsResponse getStats() {
        return statsService.getStats();
    }
}

