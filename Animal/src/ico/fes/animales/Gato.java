/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.animales;

/**
 *
 * @author jose_
 */
public class Gato extends animal.Animal{
    private String raza;
    private int edad;
    private String pelaje;

    public Gato() {
    }

    public Gato(String raza, int edad, String pelaje) {
        this.raza = raza;
        this.edad = edad;
        this.pelaje = pelaje;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPelaje() {
        return pelaje;
    }

    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }

    @Override
    public String toString() {
        return "Gato{" + "raza=" + raza + ", edad=" + edad + ", pelaje=" + pelaje + '}';
    }
    
    
}
