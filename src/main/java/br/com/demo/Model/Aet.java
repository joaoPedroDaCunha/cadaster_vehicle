package br.com.demo.Model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Aet {
    
    private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) String id;
    @OneToOne
    @JoinColumn(name = "plate_id")
    private @Column(name = "mainPlate",length = 7) String mainPlate;
    private @Column Date maturity;
    @OneToOne(mappedBy = "Aet")
    @JoinColumn(name = "plate_id")
    private Set<String> verser;

    public Aet(){
        
    }
    
    public Aet(String mainPlate, Date maturity, Set<String> verser) {
        this.mainPlate = mainPlate;
        this.maturity = maturity;
        this.verser = new HashSet<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMainPlate() {
        return mainPlate;
    }

    public void setMainPlate(String mainPlate) {
        this.mainPlate = mainPlate;
    }

    public Date getMaturity() {
        return maturity;
    }

    public void setMaturity(Date maturity) {
        this.maturity = maturity;
    }

    public void addVehicleInVerser(String plate){
        verser.add(plate);
    }

    public void removeVehicleInVerser(String plate){
        verser.removeIf(pla -> pla.equalsIgnoreCase(plate));
    }
    

}
