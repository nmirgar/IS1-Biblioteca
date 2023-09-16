/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacion;

/**
 *
 * @author admin
 */
import java.util.GregorianCalendar;

public class Controladora {

    private Almacen almacen;

    private Prestamo prestamoActual;
    private String IDprestamo;

    private Devolucion devolucionActual;
    private String IDdevolucion;

    private ReservaSalaGrupo reservaActual;
    private String IDreserva;
    private int duracionReserva;

    public Controladora(Almacen almacen) {
        this.almacen = almacen;
    }

    public Almacen getAlmacen() {
        return almacen;
    }

    public void setAlmacen(Almacen almacen) {
        this.almacen = almacen;
    }

    // Gestion Prestamo
    public void realizarPrestamo() {
        this.prestamoActual = new Prestamo(IDprestamo, new GregorianCalendar());
    }

    public Socio identificarSocioP(String IDsocio) {
        Socio socio = this.almacen.obtenerSocio(IDsocio);
        this.prestamoActual.setSocio(socio);
        return socio;
    }

    public Libro introducirLibroP(String IDlibro) {
        Libro libro = almacen.obtenerLibro(IDlibro);
        this.prestamoActual.crearLineaDePrestamo(libro);
        return libro;
    }

    public void introducirDatosLibro(String IDlibro, String Titulo, String autor, String descripcion) {
        Libro libro = new Libro(IDlibro, Titulo, autor, descripcion);
        almacen.addLibro(libro);
    }

    public void confirmarPrestamo() {
        this.almacen.addPrestamo(prestamoActual);
    }

    // Gestion Devolucion
    public void devolucionLibro() {
        this.devolucionActual = new Devolucion(IDdevolucion, new GregorianCalendar());
    }

    public Socio identificarSocioD(String IDsocio) {
        Socio socio = this.almacen.obtenerSocio(IDsocio);
        this.devolucionActual.setSocio(socio);
        return socio;
    }

    public Libro introducirLibroD(String IDlibro) {
        Libro libro = almacen.obtenerLibro(IDlibro);
        return libro;
    }

    public void confirmarDevolucion(Libro libro) {
        this.almacen.addLibro(libro);
    }

    // Gestion Sala Grupos
    public void reservaSalaGrupo() {
        this.reservaActual = new ReservaSalaGrupo(IDreserva, new GregorianCalendar(), duracionReserva);
    }

    public Socio identificarSocioRS(String IDsocio) {
        Socio socio = this.almacen.obtenerSocio(IDsocio);
        this.reservaActual.setSocio(socio);
        return socio;
    }

    public SalaGrupo introducirSala(int numSala) {
        SalaGrupo sala = almacen.obtenerSala(numSala);
        return sala;
    }

    //coger de la reserva en activo
    public void confirmarReservaSG(SalaGrupo sala) {
        sala.setEstadoDisponibilidad(false);
    }

    public void confirmarCancelacionSG(SalaGrupo sala) {
        sala.setEstadoDisponibilidad(true);
    }

    // Gestion Socios
    public void introducirDatosSocio(String dni, String nombre, String apellidos, String IDsocio) {
        Socio socio = new Socio(dni, nombre, apellidos, IDsocio);
        almacen.addSocio(socio);
    }
}
