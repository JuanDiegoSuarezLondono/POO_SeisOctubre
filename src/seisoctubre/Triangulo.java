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
public class Triangulo implements Figura{
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }   
    
    @Override
    public double area() {
            return (base*altura)/2;
    }

    @Override
    public double perimetro() {
        return  (((altura/Math.sin(Math.atan(altura/(base*2))))*2)+base);
    }    
    
    
}
