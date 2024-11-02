package com.demo.parcialmagneto.entities;

import jakarta.persistence.Entity;
import lombok.*;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Getter
@Setter
public class Dna extends Base implements Serializable {
    private String dna; // Almacena la cadena de ADN

    private boolean isMutant; // Indica si el ADN corresponde a un mutante

}
