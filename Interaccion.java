import java.util.Scanner;

/**
 * Esta clase es la Vista para poder interactuar con el usuario.
 * 
 * @author Josúe Samuel Argueta Hernández.
 */
public class Interaccion {
    // Se agrega esta propiedad para generlaizar Scanner
    private Scanner entrada;

    /**
     * Constructor que instancia Scanner
     */
    public Interaccion() {
        entrada = new Scanner(System.in);
    }

    /**
     * Mensaje de bienvenida para el usuario
     */
    public void bienvenida() {
        System.out.println("Bienvenido al sistema de distribucion para perros abandondos.");
    }

    /**
     * Menu de opciones para el usuario
     * 
     * @return opcion: byte
     */
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

    /**
     * Mensaje de error por dato fuera de las opciones del menu.
     */
    public void opcion_invalida() {
        System.out.println("Debe seleccionar una de las opciones del menu.");
    }

    /**
     * Mensaje de despdida para el usuario.
     */
    public void despedida() {
        System.out.println("Gracias por utilizar el sistema, ¡Feliz día!");
    }

}
