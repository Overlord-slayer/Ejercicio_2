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
    private Familia familia = new Familia();

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
        System.out.println("5. Listar familias.");
        System.out.println("6. Salir.");
        byte opcion = entrada.nextByte();
        return (opcion);
    }

    public void datos_familia() {
        String apellido = JOptionPane.showInputDialog("Ingrese el apellido de la familia: ");
        String integrantes = JOptionPane
                .showInputDialog("Ingrese la cantidad de integrantes que conforma la familia: ");

        String pregunta1 = JOptionPane.showInputDialog("¿Posee niños menores a 10 años?").toLowerCase();
        if (pregunta1 == "si") {
            String menores_10 = JOptionPane.showInputDialog("Ingrese la cantidad de ninios que hay en la familia: ");
            familia.agregar_familia_menores(apellido, integrantes, menores_10);
        } else if (pregunta1 == "no") {

            String pregunta2 = JOptionPane.showInputDialog("¿Posee niños mayores a 10 años?").toLowerCase();
            if (pregunta2 == "si") {
                String mayores_10 = JOptionPane
                        .showInputDialog("Ingrese la cantiadad de niños que hay en la familia: ");
                familia.agragar_familia_mayores(apellido, integrantes, mayores_10);

            } else if (pregunta2 == "no") {
                String ninios = "0";
                familia.agregar_familia_ningun(apellido, integrantes, ninios);
            } else {
                System.out.println("Pregunta 2 " + pregunta2);
                System.out.println("Vuelva a ingresar los datos");
            }
        } else {
            System.out.println("Pregunta 1 " + pregunta1);
            System.out.println("Vuelva a ingresar los datos");
        }

        // Familia familia = new Familia();
    }

    public void listado_familias() {
        familia.mostrar_familia();
    }

    public void asignacion() {

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
