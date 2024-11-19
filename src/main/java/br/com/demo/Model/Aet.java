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
public class Aet implements Comparable<Aet> {
    
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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Aet other = (Aet) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    @Override
    public int compareTo(Aet o) {
        return mainPlate.getPlate().compareToIgnoreCase(o.mainPlate.getPlate());
    }

    
}
