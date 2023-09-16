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
public class Devolucion {

    private String IDdevolucion;
    private GregorianCalendar fechaDevolucion;
    private Socio socio;

    public Devolucion(String IDdevolucion, GregorianCalendar fechaDevolucion) {
        this.IDdevolucion = IDdevolucion;
        this.fechaDevolucion = fechaDevolucion;
    }

    public void setSocio(Socio socio) {
        this.socio = socio;
    }

    @Override
    public String toString() {
        return "Devolucion{" + "IDdevolucion=" + IDdevolucion + ", fechaDevolucion=" + fechaDevolucion + ", socio=" + socio + '}';
    }

}
