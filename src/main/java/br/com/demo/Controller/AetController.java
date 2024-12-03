package br.com.demo.Controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.demo.Model.Aet;
import br.com.demo.Service.AetService;

@RestController
@CrossOrigin("*")
public class AetController {


    private @Autowired AetService aetService;

    @GetMapping("/getAets")
    public ResponseEntity<Set<Aet>> getAllEntity()
    {
        return ResponseEntity.status(200).body(aetService.getAll());
    }
}
