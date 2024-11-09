/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectogrupal;

import Helpers.Deportista;
import Helpers.Doctor;

/**
 *
 * @author User
 */
public class ProyectoGrupal {

    public static void main(String[] args) {
    
   
        Doctor doctor = new Doctor("Mateo López", 50, "Masculino", "Dermatólogo");
        
        
        Deportista deportista = new Deportista("Norvin Avelar", 29, "Masculino", "Futbol", "Principiante");

        System.out.println("Información general del Doctor:");
        doctor.imprimirInformacion();
        
        System.out.println("\nInformación general del Deportista:");
        deportista.imprimirInformacion();
    }
}

    

