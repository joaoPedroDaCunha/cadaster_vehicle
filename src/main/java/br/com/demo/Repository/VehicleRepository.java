package br.com.demo.Repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.demo.Model.Vehicle;

@Repository
public interface VehicleRepository extends CrudRepository<Vehicle, String>{
    
}
