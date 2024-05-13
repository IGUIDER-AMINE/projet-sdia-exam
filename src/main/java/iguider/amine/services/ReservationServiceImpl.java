package iguider.amine.services;

import iguider.amine.entities.Employe;
import iguider.amine.entities.Equipement;
import iguider.amine.entities.Salle;
import iguider.amine.repositories.EmployeRepository;
import iguider.amine.repositories.EquipmentRepository;
import iguider.amine.repositories.ReservationsRepository;
import iguider.amine.repositories.SalleRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
//l'injection des dependance
@AllArgsConstructor
public class ReservationServiceImpl implements ReservationService{
    private EmployeRepository employeRepository;
    private EquipmentRepository equipmentRepository;
    private ReservationsRepository reservationsRepository;
    private SalleRepository salleRepository;
    @Override
    public Employe saveEmploye(Employe employe) {
        return  employeRepository.save(employe);
    }

    @Override
    public Equipement saveEquipement(Equipement equipement) {
        return equipmentRepository.save(equipement);
    }

    @Override
    public Salle saveSalle(Salle salle) {
        return salleRepository.save(salle);
    }

}
