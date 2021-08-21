
/**
 * Clase Principal.java, es el controlador del progarma.
 * 
 * @author Josúe Samuel Argueta Hernández
 */
public class Principal {
    private static Interaccion vista = new Interaccion();
    private static Perrera perro = new Perrera();

    /**
     * Metodo principal del programa que se encarga del funcionamiento logico.
     * 
     * @param args: String[]
     */
    public static void main(String[] args) {

        vista.bienvenida();
        byte opcion = 0;
        while (opcion != 5) {
            opcion = vista.menu();

            switch (opcion) {
                case 1:
                    // Ingresar nueva Familia
                    vista.datos_familia();
                    break;
                case 2:
                    // Recibir perro.
                    vista.peligrosos();
                    perro.perros_peligrosos();
                    vista.datos_perro();
                    break;
                case 3:
                    // Asignar perro.
                    break;
                case 4:
                    // listar perros.
                    vista.lista_perros();
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
}