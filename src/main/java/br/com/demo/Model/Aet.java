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
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Aet {
    
    private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) String id;
    @ManyToOne
    @JoinColumn(name = "plate_id")
    private Vehicle mainPlate;
    private @Column Date maturity;
    @OneToMany(mappedBy = "plate")
    private Set<Vehicle> verser;

    public Aet(){
        
    }
    
    public Aet(Vehicle mainPlate, Date maturity, Set<String> verser) {
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

    public Vehicle getMainPlate() {
        return mainPlate;
    }

    public void setMainPlate(Vehicle mainPlate) {
        this.mainPlate = mainPlate;
    }

    public Date getMaturity() {
        return maturity;
    }

    public void setMaturity(Date maturity) {
        this.maturity = maturity;
    }

    public void addVehicleInVerser(Vehicle plate){
        verser.add(plate);
    }

    public void removeVehicleInVerser(String plate){
        verser.removeIf(pla -> pla.getPlate().equalsIgnoreCase(plate));
    }
    

}
