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

    @PostMapping("/customers")
    public Employe saveEmploye(@RequestBody Employe employe){
        return reservationService.saveEmploye(employe);
    }

}
