import javax.swing.JOptionPane;

public class Principal {
    private static Interaccion vista = new Interaccion();
    private static Perrera perro = new Perrera();

    public static void main(String[] args) {

        vista.bienvenida();
        byte opcion = 0;
        while (opcion != 5) {
            opcion = vista.menu();

            switch (opcion) {
                case 1:
                    // Ingresar nueva Familia

                    break;
                case 2:
                    // Recibir perro.
                    vista.peligrosos();
                    perro.perros_peligrosos();
                    opcion_2();
                    break;
                case 3:
                    // Asignar perro.
                    break;
                case 4:
                    // listar perros.
                    perro.perros_ingresados();
                    break;
                case 5:
                    // Cerrar el programa.
                    vista.despedida();
                    break;
                default:
                    vista.opcion_invalida();
            }

        }
    }

    public static void opcion_1() {

    }

    public static void opcion_2() {
        // Datos del perro
        String raza = JOptionPane.showInputDialog(
                "Ingrese la raza del perro, si no es una de las razas conocidas, ingresar la palabra Metizo: ");
        String color = JOptionPane.showInputDialog("Ingrese el color del perro: ");
        String tamanio = JOptionPane.showInputDialog("Ingrese el tamaño del perro (grande, mediano, pequeño): ");
        String edad = JOptionPane.showInputDialog("Ingrese la edad del perro: ");
        String salud = JOptionPane.showInputDialog("Ingrese la salud del perro en el rango de 0-100: ");
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre que le pondra al perro: ");

        // Creacion del nuevo objeto perro
        Perro nuevo_perro = new Perro(tamanio, raza, color, edad, salud, nombre);

        perro.registro_perros(nombre, raza, tamanio, color, edad, salud);
    }

    public static void opcion_3() {

    }
}