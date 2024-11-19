package br.com.demo.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.demo.Model.Vehicle;
import br.com.demo.Repository.VehicleRepository;

@Service
public class VehicleService {

    private @Autowired VehicleRepository vehicleRepository;

    public Set<Vehicle> getAll(){
        Set<Vehicle> get  = new TreeSet<>((List<Vehicle>) vehicleRepository.findAll());
        return get;
    }

    public void post(Vehicle vehicle){
        vehicleRepository.save(vehicle);
    }

    public Optional<Vehicle> getVehicleByPlate(String plate){
        return vehicleRepository.findById(plate);
    }

    public void put(@RequestBody Vehicle vehicle){
        vehicleRepository.save(vehicle);
    }

    public void deleteById(String plate){
        vehicleRepository.deleteById(plate);
    }
}
