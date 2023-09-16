/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacion;

import java.util.GregorianCalendar;
import java.util.Date;

/**
 *
 * @author admin
 */
public class ReservaSalaGrupo {

    private String IDreserva;
    private GregorianCalendar fechaReserva;
    private int duracionReserva;
    private Socio socio;
    private SalaGrupo sala;

    public ReservaSalaGrupo(String IDreserva, GregorianCalendar fechaReserva, int duracionReserva) {
        this.IDreserva = IDreserva;
        this.fechaReserva = fechaReserva;
        this.duracionReserva = duracionReserva;
    }
    
    public void setSocio(Socio socio){
        this.socio = socio;
    }
    
    public void setSalaGrupo(SalaGrupo sala){
        this.sala = sala;
    }

    @Override
    public String toString() {
        return "ReservaSalaGrupo{" + "IDreserva=" + IDreserva + ", fechaReserva=" + fechaReserva + ", duracionReserva=" + duracionReserva + ", socio=" + socio + ", sala=" + sala + '}';
    }
    
    

}
