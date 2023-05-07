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
public class SeisOctubre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Figura[] f=new Figura[3];
        
        f[0]=new Circunferencia(8);
        f[1]=new Rectangulo(3,4);
        f[2]=new Triangulo(3,4);
        
        System.out.println(f[0].area());
        System.out.println(f[1].area());
        System.out.println(f[2].area());
        System.out.println(f[0].perimetro());
        System.out.println(f[1].perimetro());
        System.out.println(f[2].perimetro());
        // TODO code application logic here
    }
    
}
