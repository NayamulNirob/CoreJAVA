
package geomatry;

import java.util.Date;


public abstract class GeomatryObject {
    
    private String color ="White";
    private boolen filled;
    private Date dateCrteated;

    public GeomatryObject(boolen filled, Date dateCrteated) {
        this.filled = filled;
        this.dateCrteated = dateCrteated;
    }



    public GeomatryObject() {
        this.dateCrteated = new Date();
    }

    public GeomatryObject(boolen filled, String color) {
        this.filled = filled;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolen getFilled() {
        return filled;
    }

    public void setFilled(boolen filled) {
        this.filled = filled;
    }

    public Date getDateCrteated() {
        return dateCrteated;
    }

    public void setDateCrteated(Date dateCrteated) {
        this.dateCrteated = dateCrteated;
    }

    @Override
    public String toString() {
        return "GeomatryObject{" + "color=" + color + ", filled=" + filled + ", dateCrteated=" + dateCrteated + '}';
    }
    
    public abstract double getArea();
    public abstract double getPerimeter();

    
}
