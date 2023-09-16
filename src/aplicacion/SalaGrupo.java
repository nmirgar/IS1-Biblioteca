/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacion;

/**
 *
 * @author admin
 */
public class SalaGrupo {

    private int numSala;
    private boolean estadoDisponibilidadSG;

    public SalaGrupo(int numSala, boolean estadoDisponibilidad) {
        this.numSala = numSala;
        this.estadoDisponibilidadSG = estadoDisponibilidad;
    }

    public int getNumSala() {
        return numSala;
    }

    public void setNumSala(int numSala) {
        this.numSala = numSala;
    }

    public boolean isEstadoDisponibilidad() {
        return estadoDisponibilidadSG;
    }

    public void setEstadoDisponibilidad(boolean estadoDisponibilidad) {
        this.estadoDisponibilidadSG = estadoDisponibilidad;
    }

    @Override
    public String toString() {
        return "SalaGrupo{" + "numSala=" + numSala + ", estadoDisponibilidad=" + estadoDisponibilidadSG + '}';
    }

}
