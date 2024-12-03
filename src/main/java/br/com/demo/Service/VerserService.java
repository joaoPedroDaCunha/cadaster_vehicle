package br.com.demo.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.demo.Model.Verser;
import br.com.demo.Repository.VerserRepository;

@Service
public class VerserService {
    private @Autowired VerserRepository verserRepository;

    public Set<Verser> getAll(){
        Set<Verser> get = new TreeSet<>((List<Verser>) verserRepository.findAll());
        return get;
    }

    public Optional<Verser> getVerserById(Integer id){
        return verserRepository.findById(id);
    }

    public void post(Verser verser){
        verserRepository.save(verser);
    }

    public void put(Verser verser){
        verserRepository.save(verser);
    }

    public void delete(Verser verser){
        verserRepository.delete(verser);
    }
}
