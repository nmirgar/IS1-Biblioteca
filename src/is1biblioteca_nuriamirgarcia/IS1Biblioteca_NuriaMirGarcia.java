package is1biblioteca_nuriamirgarcia;

import aplicacion.Controladora;
import aplicacion.Almacen;
import vista.Pantalla;

/**
 *
 * @author admin
 */
public class IS1Biblioteca_NuriaMirGarcia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Almacen almacen = new Almacen("Nunux", "Casa");
        Controladora controladora = new Controladora(almacen);

        Pantalla pantalla = new Pantalla(controladora);

        pantalla.mostrarOpciones();
    }

}
