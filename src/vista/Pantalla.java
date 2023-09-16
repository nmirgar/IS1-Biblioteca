/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.util.Scanner;
import aplicacion.Socio;
import aplicacion.Controladora;
import aplicacion.Libro;

/**
 *
 * @author admin
 */
public class Pantalla {

    private Controladora controladora;

    public Pantalla(Controladora controladora) {
        this.controladora = controladora;
    }

    public void mostrarOpciones() {
        Scanner s = new Scanner(System.in);
        int opc = -1;

        do {
            System.out.println("\n\n\n\tMenú Principal:\n");
            System.out.println("\t1. Gestion de Libros");
            System.out.println("\t2. Gestion de Salas de Grupo");
            System.out.println("\t3. Carnet Biblioteca");
            System.out.println("\t---------------------");
            System.out.println("\t\t0. Salir");
            System.out.print("\n\n--> Introduzca una opcion: ");
            opc = s.nextInt();
            while (opc < 0 || opc > 3) {
                System.out.print("--> Introduzca una opcion valida: ");
                opc = s.nextInt();
                System.out.println("\n");
            }
            if (opc != 0) {
                realizarOpcion(opc);
            }
        } while (opc != 0);
    }

    void realizarOpcion(int opc) {
        switch (opc) {
            case 1:
                mostrarMenuGestionLibros();
                break;
            case 2:
                //mostrarMenuGestionSalaGrupo();
                break;
            case 3:
                //mostrarMenuGestionCarnet();
        }
    }

    private void mostrarMenuGestionLibros() {
        Scanner s = new Scanner(System.in);
        int opc = -1;

        do {
            System.out.println("\n\n\n\tMenu Gestion Libros:\n");
            System.out.println("\t1. Alta Libro");
            System.out.println("\t2. Consulta Libro");
            System.out.println("\t3. Prestamo Libro");
            System.out.println("\t4. Devolucion Libro");
            System.out.println("\t---------------------");
            System.out.println("\t\t0. Salir");
            System.out.print("\n\n--> Introduzca una opción: ");
            opc = s.nextInt();
            while (opc < 0 || opc > 5) {
                System.out.print("--> Introduzca una opción valida: ");
                opc = s.nextInt();
                System.out.println("\n");
            }
            if (opc != 0) {
                realizarOpcionesLibros(opc);
            }
        } while (opc != 0);
    }

    private void realizarOpcionesLibros(int opc) {
        System.out.println("Opción elegida: " + opc);
        switch (opc) {
            case 1:
                mostrarAltaLibro();
                break;
            case 2:
                mostrarConsultaLibro();
                break;
            case 3:
                //mostrarPrestamo();
                break;
            case 4:
               // mostrarDevolucion();
                break;
        }
    }

    private void mostrarAltaLibro() {
        Scanner s = new Scanner(System.in);

        System.out.println("\n\n\n\tRealizar Alta Libro:\n");

        System.out.println("\t\tIntroduzca ID:");
        String id = s.nextLine();

        System.out.println("\t\tIntroduzca Titulo:");
        String titulo = s.nextLine();

        System.out.println("\t\tIntroduzca autor:");
        String autor = s.nextLine();

        System.out.println("\t\tIntroduzca descripcion:");
        String desc = s.nextLine();

        this.controladora.introducirDatosLibro(id, titulo, autor, desc);
    }

    private void mostrarConsultaLibro() {
        Scanner s = new Scanner(System.in);

        System.out.println("\n\n\n\tRealizar Consulta Libro:\n");

        System.out.println("\t\tIntroduzca ID:");
        String id = s.nextLine();

        System.out.println("Libro: " + this.controladora.introducirLibroP(id));
    }
}
