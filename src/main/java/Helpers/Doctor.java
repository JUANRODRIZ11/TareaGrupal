/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helpers;

/**
 *
 * @author User
 */

public class Doctor extends Persona {
    private String especialidad;

   
    public Doctor(String nombre, int edad, String genero, String especialidad) {
        super(nombre, edad, genero);
        this.especialidad = especialidad;
    }

    
    public String establecerEspecialidad() {
        return especialidad;
    }

    public void obtenerEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

   
    @Override
    public void imprimirInformacion() {
        System.out.println("Nombre: " + establecerNombre());
        System.out.println("Edad: " + establecerEdad());
        System.out.println("Género: " + establecerGenero());
        System.out.println("Especialidad: " + establecerEspecialidad());
    }
}
