package iguider.amine.services;

import iguider.amine.entities.Employe;
import iguider.amine.entities.Equipement;
import iguider.amine.entities.Salle;

public interface ReservationService {

    Employe saveEmploye(Employe employe);

    Equipement saveEquipement(Equipement equipement);
    Salle saveSalle(Salle salle);
}
