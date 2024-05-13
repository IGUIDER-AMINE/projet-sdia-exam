package iguider.amine.web;

import iguider.amine.entities.Employe;
import iguider.amine.services.ReservationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@AllArgsConstructor
public class EmployeRestController {
    private ReservationService reservationService;
    @GetMapping("/employes")
    public List<Employe> employes(){
        return reservationService.getEmployes();
    }

    @PostMapping("/employes")
    public Employe saveEmploye(@RequestBody Employe employe){
        return reservationService.saveEmploye(employe);
    }

    @DeleteMapping("/employes/{id}")
    public void deleteEmploye(@PathVariable Long id){
        reservationService.deleteEmploye(id);
    }

}
