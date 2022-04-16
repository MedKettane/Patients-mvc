package med.patientsmvc;

import med.patientsmvc.entities.Patient;
import med.patientsmvc.repositories.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class PatientsMvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(PatientsMvcApplication.class, args);
    }
   //@Bean
    CommandLineRunner commandLineRunner(PatientRepository patientRepository){
        return args -> {
            patientRepository.save(new Patient( null,"Killua",new Date(),false,(int)(Math.random()*10.5)));
            patientRepository.save(new Patient(null,"GON",new Date(),false,(int)(Math.random()*10.5)));
            patientRepository.save(new Patient(null,"Kurrapika",new Date(),false,(int)(Math.random()*10.5)));
            patientRepository.save(new Patient(null,"Hisoka",new Date(),false,(int)(Math.random()*10.5)));

            patientRepository.findAll().forEach(p->{
                System.out.println(p.getNom());
            });

        };
    }
}
