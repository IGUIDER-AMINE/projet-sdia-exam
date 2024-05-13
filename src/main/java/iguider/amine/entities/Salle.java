package iguider.amine.entities;

import iguider.amine.enums.SalleType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Salle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int numero;
    private String nom;
    private int nbrPlaces;
    @Enumerated(EnumType.STRING)
    private SalleType type;
    @OneToMany(mappedBy = "salle",fetch = FetchType.LAZY)
    private List<Reservations> reservations;
}