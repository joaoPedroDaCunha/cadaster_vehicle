package br.com.demo.Model;

import java.util.Date;

import br.com.demo.Enum.Situation;

public class Vehicle implements Comparable<Vehicle>{

    private String plate;
    private String ranavam;
    private String chasis;
    private String mark;
    private String model;
    private String version;
    private String type;
    private Date dueDate;
    private Situation situation;
    
    public Vehicle(String plate, String ranavam, String chasis, String mark, String model, String version, String type,
            Date dueDate, Situation situation) {
        this.plate = plate;
        this.ranavam = ranavam;
        this.chasis = chasis;
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
