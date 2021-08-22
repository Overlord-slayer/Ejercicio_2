
/**
 * Clase MODELO que da la funcion de las familias en la perrera.
 */
public class Familia {
    private String[][] familias;
    private String[][] menores = new String[12][3];
    private String[][] mayores;
    private String[][] ninguno;
    private int i = 3;
    private int j = 0;
    private int x = 0;
    private int z = 0;

    /**
     * Contructor que agrega los valore necesarios en las listas, segun sea
     * necesario.
     * 
     * @param apellido:    String
     * @param integrantes: int
     * @param ninios:      int
     */
    public Familia() {
        familias = new String[15][3];
        menores = new String[12][3];
        mayores = new String[12][3];
        ninguno = new String[12][3];
        // Apellidos
        familias[0][0] = "Argueta";
        familias[1][0] = "Alburez";
        familias[2][0] = "Mendoza";
        // integrantes
        familias[0][1] = "2";
        familias[1][1] = "4";
        familias[2][1] = "3";
        // Cantidad de niños
        familias[0][2] = "0";
        familias[1][2] = "2";
        familias[2][2] = "1";
    }

    /**
     * Getter que devuelve los datos generales de las familias.
     */
    public void mostrar_familia() {
        System.out.println("Apellidos       Cantidad de miembros    Cantidad de niños");

        // Ciclo para recorrer todos los reglones de la matriz
        for (int i = 0; i < familias.length; i++) {
            // Cantidad de veces que se mostrar una respuesta . En este caso, solo se desea
            // mostrar 1 vez
            for (int j = 0; j < 1; j++) {
                // Verificacion si hay null en una matriz, de haberlo, no se imprime;
                if ((familias[i] != null) && (familias[i][j] != null)) {
                    System.out.println(familias[i][0] + "                 " + familias[i][1] + "                      "
                            + familias[i][2]);
                } else {
                    continue;
                }
            }
        }
        System.out.println("");
    }

    /**
     * Setter que agrega la inforamcion de las familias con menores de 10 años
     */
    public void agregar_familia_menores(String apellido, String integrantes, String menores) {
        familias[i][0] = apellido;
        familias[i][1] = integrantes;
        familias[i][2] = menores;
        i++;
        this.menores[j][0] = apellido;
        this.menores[j][1] = integrantes;
        this.menores[j][2] = menores;
        j++;
    }

    /**
     * Setter que agrega la informacion de las familias con mayores de 10 años
     */
    public void agragar_familia_mayores(String apellido, String integrantes, String mayores) {
        familias[i][0] = apellido;
        familias[i][1] = integrantes;
        familias[i][2] = mayores;
        i++;
        this.mayores[x][0] = apellido;
        this.mayores[x][1] = integrantes;
        this.mayores[x][2] = mayores;
        x++;
    }

    /**
     * Setter que agrea la informacion de las familiass que no tiene niños
     */
    public void agregar_familia_ningun(String apellido, String integrantes, String ninguno) {
        familias[i][0] = apellido;
        familias[i][1] = integrantes;
        familias[i][2] = ninguno;
        i++;
        this.ninguno[z][0] = apellido;
        this.ninguno[z][0] = integrantes;
        this.ninguno[z][0] = ninguno;
        z++;
    }

}
