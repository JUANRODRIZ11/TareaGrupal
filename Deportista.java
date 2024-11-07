/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectogrupal1;

/**
 *
 * @author User
 */

    public class Deportista extends Persona {
    private String deporte;
    private String categoria;

    
    public Deportista(String nombre, int edad, String genero, String deporte, String categoria) {
        super(nombre, edad, genero);
        this.deporte = deporte;
        this.categoria = categoria;
    }

    
    public String establecerDeporte() {
        return deporte;
    }

    public void obtenerDeporte(String deporte) {
        this.deporte = deporte;
    }

    public String establecerCategoria() {
        return categoria;
    }

    public void obtenerCategoria(String categoria) {
        this.categoria = categoria;
    }

   
    @Override
    public void imprimirInformacion() {
        System.out.println("Nombre: " + establecerNombre());
        System.out.println("Edad: " + establecerEdad());
        System.out.println("Género: " + establecerGenero());
        System.out.println("Deporte: " + establecerDeporte());
        System.out.println("Categoría: " + establecerCategoria());
    }
}


