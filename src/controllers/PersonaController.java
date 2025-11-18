package controllers;

import models.Persona;

public class PersonaController {

    public Persona findByName(Persona[] personas, String nombre){
        for (int i = 0; i < personas.length - 1; i++) {
            for (int j = 0; j < personas.length - i - 1; j++) {
                if (personas[j].getNombre().compareTo(personas[j + 1].getNombre()) > 0) {
                    Persona temp = personas[j];
                    personas[j] = personas[j + 1];
                    personas[j + 1] = temp;
                }
            }
        }

        
        int iz = 0;
        int der = personas.length - 1;

        while (iz <= der) {
            int medio = iz + (der - iz) / 2;
            int comparacion = personas[medio].getNombre().compareTo(nombre);

            if (comparacion == 0) {
                return personas[medio]; 
            }
            if (comparacion < 0) {
                iz = medio + 1;
            } else {
                der = medio - 1;
            }
        }
        return null; 
    }

    
}