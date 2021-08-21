/**
 * Clase que da la funcion de las familias en la perrera.
 */
public class Familia {
    private String[] familia = { "Argueta", "Aguilar", "Mendoza" };
    private int[] cantidad_miembros = { 4, 2, 5 };
    private int[] cantidad_ninios = { 2, 0, 3 };

    /**
     * Contructor para poder tener acceso a los metodos de la clase.
     */
    public Familia() {
        /* Se agrega esta método al diseño */
    }

    /**
     * Contructor que agrega los valore necesarios en las listas, segun sea
     * necesario.
     * 
     * @param apellido:    String
     * @param integrantes: int
     * @param ninios:      int
     */
    public Familia(String apellido, int integrantes, int ninios) {
        this.familia[familia.length] = apellido;
        this.cantidad_miembros[cantidad_miembros.length - 1] = integrantes;
        this.cantidad_ninios[cantidad_ninios.length - 1] = ninios;
    }

    /**
     * Getter que devuelve los datos generales de las familias.
     */
    public void mostrar_familia() {
        System.out.println("Apellidos       Cantidad de miembros    Cantidad de niños");
        for (int i = 0; i < familia.length; i++) {
            System.out.println(familia[i] + "                 " + cantidad_miembros[i] + "                      "
                    + cantidad_ninios[i]);
        }
    }

    public void buscar_optimo() {
    }

}
