package iguider.amine.entities;

import iguider.amine.enums.EquipementType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Equipement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private double poids;
    @Enumerated(EnumType.STRING)
    private EquipementType type;
    private String catalogue;
}
