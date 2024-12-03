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

import br.com.demo.Model.Aet;
import br.com.demo.Service.AetService;
import jakarta.validation.Valid;

@RestController
@CrossOrigin("*")
public class AetController {


    private @Autowired AetService aetService;

    @GetMapping("/getAets")
    public ResponseEntity<Set<Aet>> getAllEntity()
    {
        return ResponseEntity.status(200).body(aetService.getAll());
    }
    
    @GetMapping("/aet/{id}")
    public ResponseEntity<Optional<Aet>> getAetByIdEntity(@PathVariable("id") String id){
        return ResponseEntity.status(200).body(aetService.getAetByPlate(id));
    }

    @PostMapping("/PostAet")
    public ResponseEntity<Aet> post(@Valid @RequestBody Aet aet){
        aetService.post(aet);
        return ResponseEntity.status(201).build();
    }

    @PutMapping("/putAet")
    public ResponseEntity<Aet> put(@Valid @RequestBody Aet aet){
        aetService.put(aet);
        return ResponseEntity.status(201).build();
    }

    @DeleteMapping("/aetdelete")
    public ResponseEntity<Aet> delete(@Valid @RequestBody Aet aet){
        aetService.delete(aet);
        return ResponseEntity.status(204).build();
    }
}
