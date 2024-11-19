package br.com.demo.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.demo.Model.Aet;

@Repository
public interface AetRepository extends CrudRepository<Aet,String>{
    
}
