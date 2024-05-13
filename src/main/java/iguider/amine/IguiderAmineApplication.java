package iguider.amine;

import iguider.amine.entities.Employe;
import iguider.amine.entities.Equipement;
import iguider.amine.entities.Salle;
import iguider.amine.enums.EquipementType;
import iguider.amine.enums.SalleType;
import iguider.amine.services.ReservationService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Random;
import java.util.stream.Stream;

@SpringBootApplication
public class IguiderAmineApplication {

	public static void main(String[] args) {
		SpringApplication.run(IguiderAmineApplication.class, args);
	}
	@Bean
	CommandLineRunner start(ReservationService reservationService){
		return args -> {
			Stream.of("Hassan","Imane","Mohamed").forEach(name->{
				Employe employe=new Employe();
				employe.setNom(name);
				employe.setEmail(name+"@gmail.com");
				reservationService.saveEmploye(employe);
			});

			Stream.of("equi1","equi2","equi3").forEach(name->{
				Equipement equipement=new Equipement();
				equipement.setNom(name);
				equipement.setPoids(145);
				equipement.setType(EquipementType.CAMERA);
				reservationService.saveEquipement(equipement);
			});

			Random random = new Random();
			Stream.of("salle1","salle2","salle3").forEach(name->{
				Salle salle=new Salle();
				salle.setNom(name);
				salle.setNumero(random.nextInt());
				salle.setNbrPlaces(random.nextInt());
				salle.setType(SalleType.COURS);
				reservationService.saveSalle(salle);
			});
		};
	}
}
