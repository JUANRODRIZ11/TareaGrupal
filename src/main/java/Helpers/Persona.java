/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helpers;

/**
 *
 * @author User
 */

public abstract class Persona {
    private String nombre;
    private int edad;
    private String genero;

    
    public Persona(String nombre, int edad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    
    public String establecerNombre() {
        return nombre;
    }

    public void obtenerNombre(String nombre) {
        this.nombre = nombre;
    }

    public int establecerEdad() {
        return edad;
    }

    public void obtenerEdad(int edad) {
        this.edad = edad;
    }

    public String establecerGenero() {
        return genero;
    }

    public void obtenerGenero(String genero) {
        this.genero = genero;
    }

   
    public abstract void imprimirInformacion();
}

