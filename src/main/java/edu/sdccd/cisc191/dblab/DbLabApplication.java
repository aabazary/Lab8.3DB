package edu.sdccd.cisc191.dblab;

import edu.sdccd.cisc191.dblab.models.Option;
import edu.sdccd.cisc191.dblab.models.Vehicle;
import edu.sdccd.cisc191.dblab.repositories.OptionRepository;
import edu.sdccd.cisc191.dblab.repositories.VehicleRespository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DbLabApplication {

    public static void main(String[] args) {
        SpringApplication.run(DbLabApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(VehicleRespository vehicleRespository, OptionRepository optionRepository) {
        return args -> {
            Option moonroof = new Option("moonroof");
            optionRepository.save(moonroof);
            Option headLight = new Option("headLight");
            optionRepository.save(headLight);

            List<Option> options = new ArrayList<>();
            options.add(headLight);
            options.add(moonroof);

            Vehicle ford = new Vehicle("Ford Fiesta",100,24000,4,options );
            vehicleRespository.save(ford);


            };

    }

}
