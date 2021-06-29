/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

import ico.fes.animales.Gato;
import ico.fes.animales.Perro;

/**
 *
 * @author jose_
 */
public class Animal {

    private int numeroPatas; 
    private String clasificacion;
    private int numeroOrejas;

    public Animal() {
    }

    public Animal(int numeroPatas, String clasificacion, int numeroOrejas) {
        this.numeroPatas = numeroPatas;
        this.clasificacion = clasificacion;
        this.numeroOrejas = numeroOrejas;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public int getNumeroOrejas() {
        return numeroOrejas;
    }

    public void setNumeroOrejas(int numeroOrejas) {
        this.numeroOrejas = numeroOrejas;
    }

    @Override
    public String toString() {
        return "Animal{" + "numeroPatas=" + numeroPatas + ", clasificacion=" + clasificacion + ", numeroOrejas=" + numeroOrejas + '}';
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Animal a1= new Animal(4, " mamiferos", 2);
        System.out.println(a1);
        
        Perro p1 = new Perro(" Chiuahua", 5, " Si");
        System.out.println(p1);
        
        Gato g1 = new Gato(" Egipsio", 2, " No");
        System.out.println(g1);
    }
    
}

