/**
 * Clase donde se describe el tipo de perro que ha llegado a la perrera.
 * 
 * @author Josúe Samuel Argueta Hernández
 */
public class Perro {
    private String color;
    private String raza;
    private String nombre;
    private String tamanio;
    private int salud;
    private int edad;

    /**
     * Constructor que crea un nuevo perro segun los datos ingresados por el
     * usuario.
     * 
     * @param tamanio: String
     * @param raza:    String
     * @param color:   String
     * @param edad:    int
     * @param salud:   int
     * @param nombre:  String
     */
    public Perro(String tamanio, String raza, String color, int edad, int salud, String nombre) {
        this.tamanio = tamanio;
        this.raza = raza;
        this.color = color;
        this.edad = edad;
        this.salud = salud;
        this.nombre = nombre;

    }

}
