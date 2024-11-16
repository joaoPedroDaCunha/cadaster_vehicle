package br.com.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.demo.Model.Vehicle;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, String>{
    
}
