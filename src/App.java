import controllers.BusquedaBinaria;
import controllers.PersonaController;
import models.Persona;
import views.ShowConsole;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Dayanna Chacha");
        PersonaController personaController = new PersonaController();
        ShowConsole showConsole = new ShowConsole();
        BusquedaBinaria busquedaBinaria = new BusquedaBinaria();

        int [] num = new int[]{10, 15, 25, 8, 5, 7, 9};
        Integer resultado = busquedaBinaria.busquedaBinaria(num, 10);
        showConsole.showResult(resultado, 10);

        Persona[] people = new Persona[]{
            new Persona("Juan", 25),
            new Persona("Ana", 30),
            new Persona("Pedro", 20),
            new Persona("Maria", 28),
            new Persona("Luis", 22),
            new Persona("Carmen", 27),
            new Persona("Sofia", 24)
        };

        Persona encontPersona = personaController.findByName(people, "Pedro");
        showConsole.showResult(encontPersona, "Pedro");


    }
}