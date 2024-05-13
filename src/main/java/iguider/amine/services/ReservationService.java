package iguider.amine.services;

import iguider.amine.entities.Employe;
import iguider.amine.entities.Equipement;
import iguider.amine.entities.Reservations;
import iguider.amine.entities.Salle;

import java.util.List;

public interface ReservationService {

    Employe saveEmploye(Employe employe);

    List<Employe> getEmployes();

    List<Reservations> getReservations();

    List<Equipement> getEquipement();

    List<Salle> getSalle();

    Equipement saveEquipement(Equipement equipement);

    Reservations saveReservations(Reservations reservations);

    Salle saveSalle(Salle salle);

    void deleteSalle(Long salleId);
    void deleteReservation(Long ReservationId);
    void deleteEmploye(Long employeId);
    void deleteEquipement(Long equipementId);
}
