package iguider.amine.web;

import iguider.amine.entities.Employe;
import iguider.amine.entities.Salle;
import iguider.amine.services.ReservationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin("*")
@AllArgsConstructor
public class SalleRestController {
    private ReservationService reservationService;
    @GetMapping("/salles")
    public List<Salle> salles(){
        return reservationService.getSalle();
    }

    @PostMapping("/salles")
    public Salle saveEmploye(@RequestBody Salle salle){
        return reservationService.saveSalle(salle);
    }

    @DeleteMapping("/salles/{id}")
    public void deleteEmploye(@PathVariable Long id){
        reservationService.deleteSalle(id);
    }
}
