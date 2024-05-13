package iguider.amine.web;

import iguider.amine.entities.Employe;
import iguider.amine.entities.Reservations;
import iguider.amine.services.ReservationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin("*")
@AllArgsConstructor
public class reservationController {
    private ReservationService reservationService;
    @GetMapping("/reservations")
    public List<Reservations> reservations(){
        return reservationService.getReservations();
    }

    @PostMapping("/reservations")
    public Reservations saveEmploye(@RequestBody Reservations reservation){
        return reservationService.saveReservations(reservation);
    }

    @DeleteMapping("/reservations/{id}")
    public void deleteReservation(@PathVariable Long id){
        reservationService.deleteReservation(id);
    }
}
