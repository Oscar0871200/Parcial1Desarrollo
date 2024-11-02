package com.demo.parcialmagneto.validators;

import jakarta.validation.Payload;
import jakarta.validation.Constraint;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Anotación que se utiliza para validar secuencias de ADN
@Constraint(validatedBy = DnaValidator.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidDna {
    String message() default "Secuencia de ADN inválida"; // Mensaje por defecto si la validación falla
    Class<?>[] groups() default {}; // Grupos de validación
    Class<? extends Payload>[] payload() default {}; // Información adicional para la validación
}

