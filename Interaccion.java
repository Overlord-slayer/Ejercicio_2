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
        System.out.println("3. ver asignaciones.");
        System.out.println("4. Listar perros.");
        System.out.println("5. Listar familias.");
        System.out.println("6. Salir.");
        byte opcion = entrada.nextByte();
        return (opcion);
    }

    /**
     * Apellido con el cual se identificara la familia
     */
    public String apellido_familia() {
        String apellido = JOptionPane.showInputDialog("Ingrese el apellido de la familia: ");
        return apellido;
    }

    /**
     * Cantidad de miembros que hay en la familia.
     */
    public String ingtegrantes_familia() {
        String integrantes = JOptionPane
                .showInputDialog("Ingrese la cantidad de integrantes que conforma la familia: ");
        return integrantes;
    }

    /**
     * Pregunta, en caso tenga niños menores de 10 años
     * 
     * @return pregunta1: String
     */
    public String respuesta1_familia() {
        String pregunta1 = JOptionPane.showInputDialog("¿Posee niños menores a 10 años?").toLowerCase();
        return pregunta1;
    }

    /**
     * Cantidad de niños menores de 10 años
     * 
     * @return menores_10: String
     */
    public String menores_de10() {
        String menores_10 = JOptionPane.showInputDialog("Ingrese la cantidad de niños");
        return menores_10;
    }

    /**
     * Pregunta en caso no posee niños menores de 10 años
     * 
     * @return pregunta2: String
     */
    public String respuesta2_familia() {
        String pregunta2 = JOptionPane.showInputDialog("¿Posee niños mayores a 10 años?").toLowerCase();
        return pregunta2;
    }

    /**
     * Cantidad de niños mayores de 10 años en la familia
     * 
     * @return mayores_10: String
     */
    public String mayores_de10() {
        String mayores_10 = JOptionPane.showInputDialog("Ingrese la cantiadad de niños que hay en la familia: ");
        return mayores_10;
    }

    /**
     * respuesta mala del usuario
     */
    public void respustas_invalidas1() {
        System.out.println("Vuelva a ingresar los datos");
    }

    /**
     * Raza del perro que ingresa
     * 
     * @return raza: String
     */
    public String raza_perro() {
        String raza = JOptionPane.showInputDialog(
                "Ingrese la raza del perro, si no es una de las razas conocidas, ingresar la palabra Metizo: ");
        return raza;
    }

    /**
     * Color del perro que ingresa
     * 
     * @return color: String
     */
    public String color_perro() {
        String color = JOptionPane.showInputDialog("Ingrese el color del perro: ");
        return color;
    }

    /**
     * Tamamnio del perro que ingresa
     * 
     * @return tamanio: String
     */
    public String tamanio_perro() {
        String tamanio = JOptionPane.showInputDialog("Ingrese el tamaño del perro (grande, mediano, pequeño): ");
        return tamanio;
    }

    /**
     * edad del perro que ingresa
     * 
     * @return edad: String
     */
    public String edad_perro() {
        String edad = JOptionPane.showInputDialog("Ingrese la edad del perro 0-20: ");
        return edad;
    }

    /**
     * estado de salud del perro que ingresa
     */
    public String salud_perro() {
        String salud = JOptionPane.showInputDialog("Ingrese la salud del perro en el rango de 0-100: ");
        return salud;
    }

    /**
     * Informacion del perro que llega a la perrera
     * 
     * @return nombre: String
     */
    public String nombre_perro() {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre que le pondra al perro: ");
        return nombre;
    }

    /**
     * metodo que muestra el rango de edad del perro
     */
    public void rango_edad() {
        System.out.println("Debe ingresar un valor entre 1 a 20");
    }

    /**
     * metodo que muestra el rango de salud del perro
     */
    public void rango_salud() {
        System.out.println("Debe ingresar un valor entre 0 y 100");
    }

    public void busqueda() {
        System.out.println("A continuacion se muestran los perros que se han asignado");
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
