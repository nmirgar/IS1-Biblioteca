/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacion;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class Socio {

    private String dni;
    private String nombre;
    private String apellidos;
    private String IDsocio;

    public Socio(String dni, String nombre, String apellidos, String IDsocio) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.IDsocio = IDsocio;

    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getIDsocio() {
        return IDsocio;
    }

    public void setIDsocio(String IDsocio) {
        this.IDsocio = IDsocio;
    }

    @Override
    public String toString() {
        return "Socio{" + "dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", IDsocio=" + IDsocio;
    }

}
