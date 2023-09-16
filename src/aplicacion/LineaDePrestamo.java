/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacion;

import java.util.GregorianCalendar;

/**
 *
 * @author admin
 */
public class LineaDePrestamo {

    private Libro libro;
    private GregorianCalendar fechaLimite;
    private Devolucion devolucion;

    public LineaDePrestamo(Libro libro) {
        this.libro = libro;
        this.fechaLimite = new GregorianCalendar();
        fechaLimite.add(GregorianCalendar.DAY_OF_MONTH, 15);
        this.devolucion = null;
    }

    public Devolucion getDevolucion() {
        return devolucion;
    }

    public void setDevolucion(Devolucion devolucion) {
        this.devolucion = devolucion;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public GregorianCalendar getFechaLimite() {
        return fechaLimite;
    }

    public void setFechaLimite(GregorianCalendar fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    @Override
    public String toString() {
        return "LineaDePrestamo{" + "libro=" + libro + ", fechaLimite=" + fechaLimite + ", devolucion=" + devolucion + '}';
    }

}
