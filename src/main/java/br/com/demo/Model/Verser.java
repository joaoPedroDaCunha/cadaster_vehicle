package br.com.demo.Model;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

public class Verser {

    private @ManyToOne @JoinColumn(name = "id") Aet aet;
    private @OneToOne @JoinColumn(name = "plate_id") Vehicle vehicle;

    public Verser() {
    }
    
    public Verser(Aet aet, Vehicle vehicle) {
        this.aet = aet;
        this.vehicle = vehicle;
    }

    public Aet getAet() {
        return aet;
    }

    public void setAet(Aet aet) {
        this.aet = aet;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    
}
