package iguider.amine.dtos;

import iguider.amine.enums.ReservationsStatut;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;

import java.util.Date;

@Data
public class Reservations {
    private Long id;
    private Date date;
    private double duree;
    private String description;
    @Enumerated(EnumType.STRING)
    private ReservationsStatut statut;
}
