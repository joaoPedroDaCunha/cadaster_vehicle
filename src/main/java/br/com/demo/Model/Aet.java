package br.com.demo.Model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Aet {
    
    private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Integer id;
    @OneToOne
    @JoinColumn(name = "plate_id")
    private Vehicle mainPlate;
    private @Column Date maturity;

    public Aet(){
        
    }
    
    public Aet(Vehicle mainPlate, Date maturity) {
        this.mainPlate = mainPlate;
        this.maturity = maturity;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

}
