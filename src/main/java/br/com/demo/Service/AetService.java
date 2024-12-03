package br.com.demo.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.demo.Model.Aet;
import br.com.demo.Repository.AetRepository;

@Service
public class AetService {

    private @Autowired AetRepository aetRepository;

    public Set<Aet> getAll(){
        Set<Aet> aets = new TreeSet<>((List<Aet>)aetRepository.findAll());
        return aets;
    }

    public void post(Aet aet){
        aetRepository.save(aet);
    }

    public Optional<Aet> getAetByPlat(String plate){
        return aetRepository.findById(plate);
    }

    public void put(@RequestBody Aet aet){
        aetRepository.save(aet);
    }

    public void delete(Aet aet){
        aetRepository.delete(aet);
    }
}
