/**
 * Clase MODELO donde se describe el tipo de perro que ha llegado a la perrera.
 * 
 * @author Josúe Samuel Argueta Hernández
 */
public class Perro {
    private String color;
    private String raza;
    private String nombre;
    private String tamanio;
    private String salud;
    private String edad;

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
    public Perro(String tamanio, String raza, String color, String edad, String salud, String nombre) {
        this.tamanio = tamanio;
        this.raza = raza;
        this.color = color;
        this.edad = edad;
        this.salud = salud;
        this.nombre = nombre;
    }

    /**
     * Getter que devuelve la raza del perro.
     * 
     * @return raza: String
     */
    public String raza_perro(String nomnbre) {
        return raza;
    }

    /**
     * Getter que devuelve el color del perro.
     * 
     * @return color: String
     */
    public String color_perro() {
        return color;
    }

    /**
     * Getter que devuelve el nombre del perro.
     * 
     * @return nombre: String
     */
    public String nombre_perro() {
        return nombre;
    }

    /**
     * Getter que devuelve el tamaño del perro.
     * 
     * @return tamanio: String
     */
    public String tamanio_perro() {
        return tamanio;
    }

    /**
     * Getter que devuelve la salud del perro.
     * 
     * @return salud: int
     */
    public String salud_perro() {
        return salud;
    }

    /**
     * Getter que devuelve la edad del perro.
     * 
     * @return edad: int
     */
    public String edad_perro() {
        return edad;
    }

}
