package br.com.demo.Model;

import java.util.Date;

import br.com.demo.Enum.Situation;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Vehicle implements Comparable<Vehicle>{

    private @Id @Column(name = "plate_id",length = 7,nullable = false) String plate;
    private @Column(nullable = false,length = 20) String ranavam;
    private @Column(length = 20,nullable = false) String chasis;
    private @Column(length = 4,nullable = false) String exercice;
    private @Column(length = 20,nullable = false) String mark;
    private @Column(length = 20,nullable = false) String model;
    private @Column(length = 20,nullable = false) String version;
    private @Column(length = 20,nullable = false) String type;
    private @Column Date dueDate;
    private @Column(length = 20,nullable = false) Situation situation;

    public Vehicle(){
        
    }
    
    public Vehicle(String plate, String ranavam, String chasis,String exercice ,String mark, String model, String version, String type,
            Date dueDate, Situation situation) {
        this.plate = plate;
        this.ranavam = ranavam;
        this.chasis = chasis;
        this.exercice = exercice;
        this.mark = mark;
        this.model = model;
        this.version = version;
        this.type = type;
        this.dueDate = dueDate;
        this.situation = situation;
    }

    public String getPlate() {
        return plate;
    }

    public String getRanavam() {
        return ranavam;
    }

    public String getChasis() {
        return chasis;
    }

    public String getExercice(){
        return exercice;
    }

    public void setExercice(String exercice){
        this.exercice = exercice;
    }

    public String getType() {
        return type;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Situation getSituation() {
        return situation;
    }

    public void setSituation(Situation situation) {
        this.situation = situation;
    }

    @Override
    public String toString() {
        return "Vehicle [plate=" + plate + ", ranavam=" + ranavam + ", chasis=" + chasis + ", mark=" + mark + ", model="
                + model + ", version=" + version + ", type=" + type + ", dueDate=" + dueDate + ", situation="
                + situation + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((plate == null) ? 0 : plate.hashCode());
        result = prime * result + ((ranavam == null) ? 0 : ranavam.hashCode());
        result = prime * result + ((chasis == null) ? 0 : chasis.hashCode());
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
        Vehicle other = (Vehicle) obj;
        if (plate == null) {
            if (other.plate != null)
                return false;
        } else if (!plate.equals(other.plate))
            return false;
        if (ranavam == null) {
            if (other.ranavam != null)
                return false;
        } else if (!ranavam.equals(other.ranavam))
            return false;
        if (chasis == null) {
            if (other.chasis != null)
                return false;
        } else if (!chasis.equals(other.chasis))
            return false;
        return true;
    }

    @Override
    public int compareTo(Vehicle arg0) {
        return plate.compareToIgnoreCase(arg0.getPlate());
    }

    
    
}
