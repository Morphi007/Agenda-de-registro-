
import controlador.Controlador;
import vista.Vista;


/**
 *
 * @author MPZ
 */
public class Agenda {

    public static void main(String args[]) {
        Vista v = new Vista();
        Controlador c = new Controlador(v);
        v.setVisible(true);
        v.setLocationRelativeTo(null);
    }
}
