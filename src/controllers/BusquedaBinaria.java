package controllers;

public class BusquedaBinaria {
    public Integer busquedaBinaria(int[] numeros, int valor){
        int iz = 0;
        int der = numeros.length - 1;

        while (iz <= der){
            int medio = iz + (der - iz)/2;
            if (numeros[medio] == valor){
                return medio;
            }
            if (numeros[medio] < valor){
                iz = medio + 1;
            } else {
                der = medio - 1;
            }
            
        }
        return -1;

    }
    
}