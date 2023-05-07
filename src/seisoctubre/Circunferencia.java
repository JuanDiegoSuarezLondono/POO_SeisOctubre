/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seisoctubre;

/**
 *
 * @author suare
 */
public class Circunferencia implements Figura{
    private double radio;

    public Circunferencia(double radio) {
        this.radio = radio;
    }   
    
    @Override
    public double area() {
        return PI*Math.pow(radio, 2);
    }

    @Override
    public double perimetro() {
        return PI*2*radio;
    }
        
    
}
