package br.com.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.demo.Model.Vehicle;
import br.com.demo.Repository.VehicleRepository;

@RestController
@CrossOrigin("*")
public class VehicleController {

    private @Autowired VehicleRepository vehicleRepository;

    @GetMapping("/getvehicles")
    public List<Vehicle> getVehicles(){
        return (List<Vehicle>) vehicleRepository.findAll();
    }
    @PostMapping("/postVehicle")
    public void postVehicle(@RequestBody Vehicle vehicle){
        vehicleRepository.save(vehicle);
    }

    @GetMapping("/vehicle/{plate}")
    public Optional<Vehicle> getVehicleByPlate(@PathVariable("plate") String plate){
        return vehicleRepository.findById(plate);
    }

    @PutMapping("/vehicle/atualizar")
    public void putVehicle(@RequestBody Vehicle vehicle){
        vehicleRepository.save(vehicle);
    }

    @DeleteMapping("/deleteVehicle/{plate}")
    public void deleteById(@PathVariable String plate){
        vehicleRepository.deleteById(plate);
    }

}
