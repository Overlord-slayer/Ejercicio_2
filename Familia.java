
/**
 * Clase MODELO que da la funcion de las familias en la perrera.
 */
public class Familia {
    private String[][] familia;

    /**
     * Contructor que agrega los valore necesarios en las listas, segun sea
     * necesario.
     * 
     * @param apellido:    String
     * @param integrantes: int
     * @param ninios:      int
     */
    public Familia() {
        familia = new String[15][3];
        // Apellidos
        familia[0][0] = "Argueta";
        familia[1][0] = "Alburez";
        familia[2][0] = "Mendoza";
        // integrantes
        familia[0][1] = "2";
        familia[1][1] = "4";
        familia[2][1] = "3";
        // Cantidad de niños
        familia[0][2] = "0";
        familia[1][2] = "2";
        familia[2][2] = "1";
    }

    /**
     * Getter que devuelve los datos generales de las familias.
     */
    public void mostrar_familia() {
        System.out.println("Apellidos       Cantidad de miembros    Cantidad de niños");

        // Ciclo para recorrer todos los reglones de la matriz
        for (int i = 0; i < familia.length; i++) {
            // Cantidad de veces que se mostrar una respuesta . En este caso, solo se desea
            // mostrar 1 vez
            for (int j = 0; j < 1; j++) {
                // Verificacion si hay null en una matriz, de haberlo, no se imprime;
                if ((familia[i] != null) && (familia[i][j] != null)) {
                    System.out.println(familia[i][0] + "                 " + familia[i][1] + "                      "
                            + familia[i][2]);
                } else {
                    continue;
                }
            }
        }
        System.out.println("");
    }

    public void agregar_familia() {

    }

    public void buscar_optimo() {
    }
}
