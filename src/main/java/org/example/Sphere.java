package org.example;




public class Sphere {

    double diameter;




    public Sphere(){

    }

    public Sphere(double diameter){
        this.diameter = diameter;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double Volume(){
        return (4.3)*Math.PI*Math.pow(diameter/2, 3);
    }

    public double Surface(){
        return 4 * Math.PI * Math.pow(diameter/2, 2);
    }
}
