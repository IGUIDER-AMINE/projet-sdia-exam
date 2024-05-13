package iguider.amine.entities;

import iguider.amine.enums.ReservationsStatut;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reservations {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date date;
    private double duree;
    private String description;
    @Enumerated(EnumType.STRING)
    private ReservationsStatut statut;
    @ManyToOne
    private Employe employe;
    @ManyToOne
    private Salle salle;
    @ManyToMany
    @JoinTable(name = "reservation_equipment",
            joinColumns = @JoinColumn(name = "reservation_id"),
            inverseJoinColumns = @JoinColumn(name = "equipment_id"))
    private List<Equipement> equipments;
}
