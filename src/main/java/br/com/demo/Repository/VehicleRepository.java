package br.com.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.demo.Model.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, String>{
    
}
