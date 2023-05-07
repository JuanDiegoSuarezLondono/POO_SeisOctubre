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
public class Rectangulo implements Figura{
    private double alto;
    private double ancho;

    public Rectangulo(double alto, double ancho) {
        this.alto = alto;
        this.ancho = ancho;
    }   
    
    @Override
    public double area() {
        return alto*ancho;
    }

    @Override
    public double perimetro() {
        return (alto*2)+(ancho*2);
    }
    
       
}
