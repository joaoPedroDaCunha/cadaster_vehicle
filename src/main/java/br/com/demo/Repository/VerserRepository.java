package br.com.demo.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.demo.Model.Verser;

@Repository
public interface VerserRepository extends CrudRepository<Verser,Integer>{
    
}
