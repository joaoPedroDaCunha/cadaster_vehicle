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

import br.com.demo.Model.Verser;
import br.com.demo.Service.VerserService;
import jakarta.validation.Valid;

@RestController
@CrossOrigin("*")
public class VerserController {
    
    private @Autowired VerserService verserService;

    @GetMapping("/getversers")
    public ResponseEntity<Set<Verser>> gelAllEntity(){
        return ResponseEntity.status(200).body(verserService.getAll());
    }

    @GetMapping("/Verser/{id}")
    public ResponseEntity<Optional<Verser>> getVerser(@PathVariable("id") Integer id){
        return ResponseEntity.status(200).body(verserService.getVerserById(id));
    }

    @PostMapping("/Postverser")
    public ResponseEntity<Verser> post(@Valid @RequestBody Verser verser){
        verserService.post(verser);
        return ResponseEntity.status(201).build();
    }

    @PutMapping("/Putverser")
    public ResponseEntity<Verser> put(@Valid @RequestBody Verser verser){
        verserService.put(verser);
        return ResponseEntity.status(201).build();
    }

    @DeleteMapping("/Delete")
    public ResponseEntity<Verser> delete(@Valid @RequestBody Verser verser){
        verserService.delete(verser);
        return ResponseEntity.status(204).build();
    }
}
