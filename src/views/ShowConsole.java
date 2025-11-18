package views;

import models.Persona;

public class ShowConsole {
    public void showResult(int resultado, int valorBuscado){
        if (resultado != -1) {
            System.out.println("El número " + valorBuscado + " se encontró en el índice: " + resultado);
        } else {
            System.out.println("El número " + valorBuscado + " no se encontró en el arreglo.");
        }

    }

    public void showResult(Persona persona, String nombreBuscado){
        if (persona != null) {
            System.out.println("La persona encontrada es: " + persona);
        } else {
            System.out.println("No se encontró una persona con el nombre: " + nombreBuscado);
        }
    }
    
}