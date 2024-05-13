package iguider.amine.web;

import iguider.amine.entities.Employe;
import iguider.amine.entities.Equipement;
import iguider.amine.services.ReservationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin("*")
@AllArgsConstructor
public class EquipmentRestController {
    private ReservationService reservationService;
    @GetMapping("/equipements")
    public List<Equipement> equipements(){
        return reservationService.getEquipement();
    }

    @PostMapping("/equipements")
    public Equipement saveEmploye(@RequestBody Equipement equipement){
        return reservationService.saveEquipement(equipement);
    }

    @DeleteMapping("/equipements/{id}")
    public void deleteEquipements(@PathVariable Long id){
        reservationService.deleteEquipement(id);
    }
}
