/**
 * Esta clase representa la funcionalidad de la perrera con respecto a los
 * perros.
 * 
 * @author Josúe Samuel Argueta Hernández
 */
public class Perrera {
    // Se modifico perros_peligrosos por raza_peligrosa.
    private String[] raza_peligrosa = { "Pit bull terrier", "American Staffordshire terrier", "Tosa Inu",
            "Dogo argentino", "Dogo guatemalteco", "Fila brasileño", "Presa canario", "Dóberman", "Gran perro japonés",
            "Mastín napolitano", "Presa Mallorqui", "Dogo de burdeos", "Bullmastiff", "Bull terrier inglés",
            "Buldog americano", "Rhodesiano", "Rottweiler" };;
    private String[] perros_ingresados;
    private String[] perros_enviados;

    /**
     * Constructor que inicializa el valor de las listas.
     */
    public Perrera() {

    }

    public String perro_perrera() {
        return "modificar";
    }
}