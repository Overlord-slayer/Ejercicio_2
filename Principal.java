
/**
 * Clase Principal.java, es el controlador del progarma.
 * 
 * @author Josúe Samuel Argueta Hernández
 */
public class Principal {
    private static Interaccion vista = new Interaccion();
    private static Perrera perro = new Perrera();
    private static Familia familia = new Familia();

    /**
     * Metodo principal del programa que se encarga del funcionamiento logico.
     * 
     * @param args: String[]
     */
    public static void main(String[] args) {

        vista.bienvenida();
        byte opcion = 0;
        while (opcion != 6) {
            opcion = vista.menu();

            switch (opcion) {
                case 1:
                    // Ingresar nueva Familia
                    opcion_1();
                    break;
                case 2:
                    // Recibir perro.
                    vista.peligrosos();
                    perro.perros_peligrosos();
                    opcion_2();
                    break;
                case 3:
                    // Asignar perro.
                    familia.familias_mayores();
                    familia.familias_menores();
                    familia.familias_ninguno();
                    break;
                case 4:
                    // listar perros.
                    perro.perros_ingresados();
                    break;
                case 5:
                    // Listar familias
                    familia.mostrar_familia();
                    break;
                case 6:
                    // Cerrar el programa.
                    vista.despedida();
                    break;
                default:
                    vista.opcion_invalida();
            }

        }

    }

    /**
     * Metodo que procesa la informacoin del usuario
     */
    private static void opcion_1() {
        String apellido = vista.apellido_familia();
        String integrantes = vista.ingtegrantes_familia();
        String pregunta1 = vista.respuesta1_familia();

        switch (pregunta1) {
            // Respuesta positiva
            case "si":
                String menores_10 = vista.menores_de10();
                familia.agregar_familia_menores(apellido, integrantes, menores_10);
                break;
            // Respuesta negativa
            case "no":
                String pregunta2 = vista.respuesta2_familia();
                // opciones
                switch (pregunta2) {
                    // Respuesta positiva
                    case "si":
                        String mayores_10 = vista.mayores_de10();
                        familia.agragar_familia_mayores(apellido, integrantes, mayores_10);
                        break;
                    // Respuesta negativa
                    case "no":
                        String ninios = "0";
                        familia.agregar_familia_ningun(apellido, integrantes, ninios);
                        break;
                    // mal dato
                    default:
                        vista.respustas_invalidas1();
                }
                break;
            // mal dato
            default:
                vista.respustas_invalidas1();
        }
    }

    private static void opcion_2() {
        String raza = vista.raza_perro();

        String color = vista.color_perro();
        String tamanio = vista.tamanio_perro();
        String nombre = vista.nombre_perro();
        boolean bandera = true;
        while (bandera) {
            try {
                String edad = vista.edad_perro();
                String salud = vista.salud_perro();
                int edad_dato = Integer.parseInt(edad);
                int salud_dato = Integer.parseInt(salud);
                if ((edad_dato < 0) || (edad_dato > 20)) {
                    if ((salud_dato < 0) || (salud_dato > 100)) {
                        System.out.println("Debe ingresar un valor entre 0 y 100");
                    } else {
                        Perro nuevo_perro = new Perro(tamanio, raza, color, edad, salud, nombre);
                        perro.registro_perros(nombre, raza, tamanio, color, edad, salud);
                        bandera = false;
                    }
                } else {
                    break;
                }

            } catch (NumberFormatException e) {
                // TODO: handle exception
                System.out.println("Debe ingresar un valor numerico");
            }
        }

    }
}