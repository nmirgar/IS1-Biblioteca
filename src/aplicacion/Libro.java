/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacion;

/**
 *
 * @author admin
 */
public class Libro {

    private String IDlibro;
    private String Titulo;
    private String autor;
    private String descripcion;

    public Libro(String IDlibro, String Titulo, String autor, String descripcion) {
        this.IDlibro = IDlibro;
        this.Titulo = Titulo;
        this.autor = autor;
        this.descripcion = descripcion;
    }

    public String getIDlibro() {
        return IDlibro;
    }

    public void setIDlibro(String IDlibro) {
        this.IDlibro = IDlibro;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Libro{" + "IDlibro=" + IDlibro + ", Titulo=" + Titulo + ", autor=" + autor + ", descripcion=" + descripcion + '}';
    }

}
