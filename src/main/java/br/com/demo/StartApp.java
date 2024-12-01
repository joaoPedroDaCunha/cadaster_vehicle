package br.com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import br.com.demo.Repository.AetRepository;
import br.com.demo.Repository.VehicleRepository;
import br.com.demo.Repository.VerserRepository;

@Component
public class StartApp implements CommandLineRunner {
    private @Autowired VehicleRepository vehicleRepository;
    private @Autowired AetRepository aetRepository;
    private @Autowired VerserRepository verserRepository;
    @Override
    public void run(String... args) throws Exception {
        
        //vehicleRepository.save(null);

        //aetRepository.save(null);
    }
    
}
