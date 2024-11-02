package com.demo.parcialmagneto.validators;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

// Implementación de la lógica de validación para la anotación ValidDna
public class DnaValidator implements ConstraintValidator<ValidDna, String[]> {

    private static final String VALID_CHARACTERS = "AGTC"; // Caracteres válidos en una secuencia de ADN

    @Override
    public void initialize(ValidDna constraintAnnotation) {
        // Método de inicialización, no se usa en este caso
    }

    // Método que valida si una secuencia de ADN es válida
    @Override
    public boolean isValid(String[] dna, ConstraintValidatorContext context) {
        if (dna == null) {
            return false; // El ADN no puede ser nulo
        }

        int n = dna.length;
        if (n == 0) {
            return false; // El ADN no puede estar vacío
        }

        for (String sequence : dna) {
            if (sequence == null || sequence.length() != n) {
                return false; // Todas las secuencias deben ser del mismo tamaño
            }
            for (char c : sequence.toCharArray()) {
                if (VALID_CHARACTERS.indexOf(c) == -1) {
                    return false; // Verifica si solo contiene caracteres válidos
                }
            }
        }
        return true; // Si pasa todas las validaciones, es válido
    }
}
