/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacion;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

/**
 *
 * @author admin
 */
public class Prestamo {

    private String IDprestamo;
    private GregorianCalendar fechaPrestamo;
    private List<LineaDePrestamo> listaLineas;
    private Socio socio;

    public Prestamo(String IDprestamo, GregorianCalendar fechaPrestamo) {
        this.IDprestamo = IDprestamo;
        this.fechaPrestamo = fechaPrestamo;
        this.listaLineas = new ArrayList<LineaDePrestamo>();
    }

    public void setSocio(Socio socio) {
        this.socio = socio;
    }

    public void crearLineaDePrestamo(Libro li) {
        LineaDePrestamo ldp = new LineaDePrestamo(li);
        this.listaLineas.add(ldp);
    }

    @Override
    public String toString() {
        return "Prestamo{" + "IDprestamo=" + IDprestamo + ", fechaPrestamo=" + fechaPrestamo + ", listaLineas=" + listaLineas + ", socio=" + socio + '}';
    }

}
