import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * Esta clase es la Vista para poder interactuar con el usuario.
 * 
 * @author Josúe Samuel Argueta Hernández.
 */
public class Interaccion {
    // Se agrega esta propiedad para generlaizar Scanner
    private Scanner entrada;
    private Perrera perro = new Perrera();

    /**
     * Constructor que instancia Scanner
     */
    public Interaccion() {
        entrada = new Scanner(System.in);
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
        System.out.println("4. Listar perros.");
        System.out.println("5. Salir.");
        byte opcion = entrada.nextByte();
        return (opcion);
    }

    public void datos_familia() {
        String raza = JOptionPane.showInputDialog(
                "Ingrese la raza del perro, si no es una de las razas conocidas, ingresar la palabra Metizo: ");
        String color = JOptionPane.showInputDialog("Ingrese el color del perro: ");
        String tamanio = JOptionPane.showInputDialog("Ingrese el tamaño del perro (grande, mediano, pequeño): ");

        String edad = JOptionPane.showInputDialog("Ingrese la edad del perro 0-20: ");
        String salud = JOptionPane.showInputDialog("Ingrese la salud del perro en el rango de 0-100: ");

        String nombre = JOptionPane.showInputDialog("Ingrese el nombre que le pondra al perro: ");

        Perro nuevo_perro = new Perro(tamanio, raza, color, edad, salud, nombre);
        perro.registro_perros(nombre, raza, tamanio, color, edad, salud);
    }

    /**
     * Informacion del perro que llega a la perrera
     */
    public void datos_perro() {
        // Datos del perro
        String raza = JOptionPane.showInputDialog(
                "Ingrese la raza del perro, si no es una de las razas conocidas, ingresar la palabra Metizo: ");
        String color = JOptionPane.showInputDialog("Ingrese el color del perro: ");
        String tamanio = JOptionPane.showInputDialog("Ingrese el tamaño del perro (grande, mediano, pequeño): ");

        String edad = JOptionPane.showInputDialog("Ingrese la edad del perro 0-20: ");
        String salud = JOptionPane.showInputDialog("Ingrese la salud del perro en el rango de 0-100: ");

        String nombre = JOptionPane.showInputDialog("Ingrese el nombre que le pondra al perro: ");

        Perro nuevo_perro = new Perro(tamanio, raza, color, edad, salud, nombre);
        perro.registro_perros(nombre, raza, tamanio, color, edad, salud);
    }

    /**
     * Listado de los perros que fueron ingresados al sistema
     */
    public void lista_perros() {
        perro.perros_ingresados();
    }

    /**
     * Mensaje de bienvenida para el usuario
     */
    public void bienvenida() {
        System.out.println("Bienvenido al sistema de distribucion para perros abandondos.");
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

    /**
     * Mensaje sobre las razas consideradas peligrosas.
     */
    public void peligrosos() {
        System.out.println("A continuacion, se presentan las razas consideradas peligrosas.");
    }
}
