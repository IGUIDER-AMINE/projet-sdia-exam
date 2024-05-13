package iguider.amine.dtos;

import iguider.amine.enums.EquipementType;
import lombok.Data;

@Data
public class Equipement {
    private Long id;
    private String nom;
    private double poids;
    private EquipementType type;
    private String catalogue;
}
