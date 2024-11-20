package br.com.demo.Controller;

import java.util.Optional;
import java.util.Set;

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
import br.com.demo.Service.VehicleService;
import jakarta.validation.Valid;

@RestController
@CrossOrigin("*")
public class VehicleController {


    private @Autowired VehicleService vehicleService;

    @GetMapping("/getvehicles")
    public ResponseEntity<Set<Vehicle>> getVehicles(){
        Set<Vehicle> get  = vehicleService.getAll();
        return ResponseEntity.status(200).body(get);
    }
    @PostMapping("/postVehicle")
    public ResponseEntity<Vehicle> postVehicle(@Valid @RequestBody Vehicle vehicle){
        vehicleService.post(vehicle);
        return ResponseEntity.status(201).build();
    }

    @GetMapping("/vehicle/{plate}")
    public ResponseEntity<Optional<Vehicle>> getVehicleByPlate(@PathVariable("plate") String plate){
        return ResponseEntity.status(200).body(vehicleService.getVehicleByPlate(plate));
    }

    @PutMapping("/vehicle/atualizar")
    public ResponseEntity<Vehicle> putVehicle(@Valid @RequestBody Vehicle vehicle){
        vehicleService.put(vehicle);
        return ResponseEntity.status(201).build();
    }

    @DeleteMapping("/deleteVehicle/{plate}")
    public ResponseEntity<?> deleteById(@PathVariable String plate){
        vehicleService.deleteById(plate);
        return ResponseEntity.status(204).build();
    }

}
