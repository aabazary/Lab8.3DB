package edu.sdccd.cisc191.dblab.repositories;

import edu.sdccd.cisc191.dblab.models.Vehicle;
import org.springframework.data.repository.CrudRepository;

public interface VehicleRespository extends CrudRepository<Vehicle, String> {

}
