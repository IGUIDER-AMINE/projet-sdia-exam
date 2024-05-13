package iguider.amine.dtos;

import iguider.amine.enums.SalleType;
import lombok.Data;

@Data
public class Salle {
    private Long id;
    private int numero;
    private String nom;
    private int nbrPlaces;
    private SalleType type;
}
