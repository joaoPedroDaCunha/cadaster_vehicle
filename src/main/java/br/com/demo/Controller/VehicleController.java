package br.com.demo.Controller;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<Set<Vehicle>> getVehicles(){
        Set<Vehicle> get  = new TreeSet<>((List<Vehicle>) vehicleRepository.findAll());
        return ResponseEntity.status(200).body(get);
    }
    @PostMapping("/postVehicle")
    public ResponseEntity<Vehicle> postVehicle(@RequestBody Vehicle vehicle){
        vehicleRepository.save(vehicle);
        return ResponseEntity.status(201).body(null);
    }

    @GetMapping("/vehicle/{plate}")
    public ResponseEntity<Optional<Vehicle>> getVehicleByPlate(@PathVariable("plate") String plate){
        return ResponseEntity.status(200).body(vehicleRepository.findById(plate));
    }

    @PutMapping("/vehicle/atualizar")
    public ResponseEntity<Vehicle> putVehicle(@RequestBody Vehicle vehicle){
        vehicleRepository.save(vehicle);
        return ResponseEntity.status(201).body(null);
    }

    @DeleteMapping("/deleteVehicle/{plate}")
    public ResponseEntity<?> deleteById(@PathVariable String plate){
        vehicleRepository.deleteById(plate);
        return ResponseEntity.status(204).build();
    }

}
