import javax.swing.text.StyledEditorKit.FontFamilyAction;

public class Principal {
    public static void main(String[] args) {
        Interaccion vista = new Interaccion();

        vista.bienvenida();
        byte opcion = 0;
        while (opcion != 6) {
            opcion = vista.menu();

            switch (opcion) {
                case 1:
                    // Ingresar nueva Familia
                    break;
                case 2:
                    // Recibir perro.
                    break;
                case 3:
                    // Asignar perro.
                    break;
                case 4:
                    // Listar Familias.
                    Familia familiares = new Familia();
                    familiares.mostrar_familia();
                    break;
                case 5:
                    // Listar Perros.
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
}
