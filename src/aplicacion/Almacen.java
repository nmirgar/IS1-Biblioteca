/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacion;

/**
 *
 * @author admin
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Almacen {

    private String nombre;
    private String direccion;

    private List<Socio> listaSocios;
    private List<Libro> listaLibros;
    private List<SalaGrupo> listaSalas;
    private List<Prestamo> listaPrestamos;
    private List<Libro> listaLibrosPrestados;

    public Almacen(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.listaSocios = new ArrayList<Socio>();
        this.listaLibros = new ArrayList<Libro>();
        this.listaSalas = new ArrayList<SalaGrupo>();
        this.listaPrestamos = new ArrayList<Prestamo>();
        inicializar();
    }

    private void inicializar() {
        listaSocios.add(new Socio("1111", "Nombre1", "Apellidos1", "IDs1"));
        listaSocios.add(new Socio("2222", "Nombre2", "Apellidos2", "IDs2"));
        listaSocios.add(new Socio("3333", "Nombre3", "Apellidos3", "IDs3"));

        listaLibros.add(new Libro("idL1", "Titulo1", "Autor1", "Descripcion1"));
        listaLibros.add(new Libro("idL2", "Titulo2", "Autor2", "Descripcion2"));
        listaLibros.add(new Libro("idL1", "Titulo3", "Autor3", "Descripcion3"));

        listaSalas.add(new SalaGrupo(1, false));
        listaSalas.add(new SalaGrupo(2, true));
        listaSalas.add(new SalaGrupo(3, true));

    }

    public Socio obtenerSocio(String IDsocio) {
        Socio socio = null;
        boolean enc = false;
        Iterator it = this.listaSocios.iterator();

        while (it.hasNext() && (!enc)) {
            Socio s = (Socio) it.next();
            if (s.getIDsocio().equals(IDsocio)) {
                enc = true;
                socio = s;
            }
        }
        return socio;
    }

    public void addSocio(Socio socio) {
        this.listaSocios.add(socio);
    }

    public Libro obtenerLibro(String IDlibro) {
        Libro libro = null;
        boolean enc = false;
        Iterator it = this.listaLibros.iterator();

        while (it.hasNext() && (!enc)) {
            Libro li = (Libro) it.next();
            if (li.getIDlibro().equals(IDlibro)) {
                enc = true;
                libro = li;
            }
        }
        return libro;
    }

    public void addLibro(Libro libro) {
        this.listaLibros.add(libro);
    }

    public SalaGrupo obtenerSala(int numSala) {
        SalaGrupo sala = null;
        boolean enc = false;
        Iterator it = this.listaSalas.iterator();

        while (it.hasNext() && (!enc)) {
            SalaGrupo sa = (SalaGrupo) it.next();
            if (sa.getNumSala() == numSala) {
                enc = true;
                sala = sa;
            }
        }
        return sala;
    }

    public void addSala(SalaGrupo sala) {
        this.listaSalas.add(sala);
    }

    public void addPrestamo(Prestamo p) {
        this.listaPrestamos.add(p);
    }

    public String toString() {
        String t = "Almacen{" + "nombre=" + nombre + ", direccion=" + direccion;
        t += "\nLista de socios:";
        for (Socio s : this.listaSocios) {
            t += s.toString();
        }

        t += "\nLista de libros:";
        for (Libro l : this.listaLibros) {
            t += l.toString();
        }

        t += "\nLista de salas de grupo:";
        for (SalaGrupo sa : this.listaSalas) {
            t += sa.toString();
        }

        t += "\nLista de prestamos";
        for (Prestamo p : this.listaPrestamos) {
            t += p.toString();
        }
        return t;
    }
}
