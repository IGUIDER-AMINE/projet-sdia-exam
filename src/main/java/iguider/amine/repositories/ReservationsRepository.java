package iguider.amine.repositories;

import iguider.amine.entities.Reservations;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationsRepository extends JpaRepository<Reservations,Long> {
}
