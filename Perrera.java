/**
 * Esta clase MODELO representa la funcionalidad de la perrera con respecto a
 * los perros.
 * 
 * @author Josúe Samuel Argueta Hernández
 */
public class Perrera {
    // Se modifico perros_peligrosos por raza_peligrosa.
    private String[] raza_peligrosa = { "Pit bull terrier", "American Staffordshire terrier", "Tosa Inu",
            "Dogo argentino", "Dogo guatemalteco", "Fila brasileño", "Presa canario", "Dóberman", "Gran perro japonés",
            "Mastín napolitano", "Presa Mallorqui", "Dogo de burdeos", "Bullmastiff", "Bull terrier inglés",
            "Buldog americano", "Rhodesiano", "Rottweiler" };
    private String[][] perros_ingresados = new String[100][6];
    private String[] perros_enviados = new String[100];
    private int i = 0;

    /**
     * Constructor que inicializa el valor de las listas.
     */
    public Perrera() {

    }

    public String perro_perrera() {

        return "modificar";
    }

    /**
     * Getter que lista las razas consideras como peligrosas
     */
    public void perros_peligrosos() {
        for (int i = 0; i < raza_peligrosa.length; i++) {
            System.out.println(raza_peligrosa[i]);
        }
        System.out.println("");
    }

    public void registro_perros(String nombre, String raza, String tamanio, String color, String edad, String salud) {
        perros_ingresados[i][0] = nombre;
        perros_ingresados[i][1] = raza;
        perros_ingresados[i][2] = tamanio;
        perros_ingresados[i][3] = color;
        perros_ingresados[i][4] = edad;
        perros_ingresados[i][5] = salud;
        i++;

    }

    public void perros_ingresados() {
        // Ciclo para recorrer todos los regloes de la matriz
        for (int i = 0; i < perros_ingresados.length; i++) {
            // Cantidad de veces que se mostrar una respuesta . En este caso, solo se desea
            // mostrar 1 vez
            for (int j = 0; j < 1; j++) {
                // Verificacion si hay null en una matriz, de haberlo, no se imprime;
                if ((perros_ingresados[i] != null) && (perros_ingresados[i][j] != null)) {
                    System.out.println(perros_ingresados[i][0]);
                    System.out.println(perros_ingresados[i][1]);
                    System.out.println(perros_ingresados[i][2]);
                    System.out.println(perros_ingresados[i][3]);
                    System.out.println(perros_ingresados[i][4]);
                    System.out.println(perros_ingresados[i][5]);
                } else {
                    break;
                }

            }
        }
    }
}