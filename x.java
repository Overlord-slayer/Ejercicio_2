import javax.swing.JOptionPane;

public class x {
    public static void main(String[] args) {
        String respuesta1 = "si";
        String respusta2 = "no";
        String pregunta1 = JOptionPane.showInputDialog("¿Posee niños menores?");
        /*
         * switch (pregunta1) { case "si": String menores_10 =
         * JOptionPane.showInputDialog("Ingrese la cantidad de niños"); break; case
         * "no": String pregunta2 =
         * JOptionPane.showInputDialog("¿Posee niños mayores a 10 años?").toLowerCase();
         * switch (pregunta2) { case "si": String mayores_10 = JOptionPane
         * .showInputDialog("Ingrese la cantiadad de niños que hay en la familia: ");
         * break; case "no": String ninios = "0"; break; default:
         * System.out.println("Vuelva a ingresar los datos"); } break; default:
         * System.out.println("Vuelva a ingresar los datos"); }
         */

        /*
         * if (pregunta1 == respuesta1) { String menores_10 =
         * JOptionPane.showInputDialog("Ingrese la cantidad de niños"); } else if
         * (pregunta1 == respusta2) { String pregunta2 =
         * JOptionPane.showInputDialog("¿Posee niños mayores a 10 años?").toLowerCase();
         * if (pregunta2 == respuesta1) { String mayores_10 = JOptionPane
         * .showInputDialog("Ingrese la cantiadad de niños que hay en la familia: ");
         * 
         * } else if (pregunta2 == respusta2) { String ninios = "0"; } else {
         * System.out.println("Vuelva a ingresar los datos"); } } else {
         * System.out.println("Vuelva a ingresar los datos"); }
         */
    }

}
