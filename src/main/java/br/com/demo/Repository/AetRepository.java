package br.com.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.demo.Model.Aet;

@Repository
public interface AetRepository extends JpaRepository<Aet,String>{
    
}
