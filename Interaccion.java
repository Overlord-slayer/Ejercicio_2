import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Esta clase es la Vista para poder interactuar con el usuario.
 * 
 * @author Josúe Samuel Argueta Hernández.
 */
public class Interaccion {
    // Se agrega esta propiedad para generlaizar Scanner
    private Scanner entrada;

    private Interaccion() {
        entrada = new Scanner(System.in);
    }

    public void bienvenida() {
        System.out.println("Bienvenido al sistema de distribucion para perros abandondos.");
    }

    public byte menu() {
        System.out.println("¿Qué desea hacer?");
        // Se modificio Crea nueva familia por Ingresar nueva familia.
        System.out.println("1. Ingresar nueva familia.");
        System.out.println("2. Recibir perro.");
        System.out.println("3. Asignar perro a familia.");
        System.out.println("4. Listar Familias.");
        System.out.println("5. Listar Perros.");
        System.out.println("6. Salir.");
        byte opcion = entrada.nextByte();
        return (opcion);
    }

    public void opcion_invalida() {
        System.out.println("Debe seleccionar una de las opciones del menu.");
    }

    public void despedida() {
        System.out.println("Gracias por utilizar el sistema, ¡Feliz día!");
    }

}
