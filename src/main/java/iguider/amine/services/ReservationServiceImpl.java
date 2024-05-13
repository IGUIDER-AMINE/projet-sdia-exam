package iguider.amine.services;

import iguider.amine.entities.Employe;
import iguider.amine.entities.Equipement;
import iguider.amine.entities.Reservations;
import iguider.amine.entities.Salle;
import iguider.amine.repositories.EmployeRepository;
import iguider.amine.repositories.EquipmentRepository;
import iguider.amine.repositories.ReservationsRepository;
import iguider.amine.repositories.SalleRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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
    public List<Employe> getEmployes() {
        return  employeRepository.findAll();
    }

    @Override
    public List<Reservations> getReservations() {
        return  reservationsRepository.findAll();
    }

    @Override
    public List<Equipement> getEquipement() {
        return  equipmentRepository.findAll();
    }

    @Override
    public List<Salle> getSalle() {
        return  salleRepository.findAll();
    }


    @Override
    public Equipement saveEquipement(Equipement equipement) {
        return equipmentRepository.save(equipement);
    }

    @Override
    public Reservations saveReservations(Reservations reservations) {
        return reservationsRepository.save(reservations);
    }

    @Override
    public Salle saveSalle(Salle salle) {
        return salleRepository.save(salle);
    }

    @Override
    public void deleteSalle(Long salleId) {
        salleRepository.deleteById(salleId);
    }

    @Override
    public void deleteReservation(Long ReservationId) {
        reservationsRepository.deleteById(ReservationId);
    }

    @Override
    public void deleteEmploye(Long employeId) {
        employeRepository.deleteById(employeId);
    }

    @Override
    public void deleteEquipement(Long equipementId) {
        equipmentRepository.deleteById(equipementId);
    }

}
