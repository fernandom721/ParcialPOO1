/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerparcialpoo;

/**
 *
 * @author Steven Diaz
 */
public class Reservacion {
    private String Fecha;
    private int CantidadDeHabitaciones;
    private float TotalAPagar;

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public int getCantidadDeHabitaciones() {
        return CantidadDeHabitaciones;
    }

    public void setCantidadDeHabitaciones(int CantidadDeHabitaciones) {
        this.CantidadDeHabitaciones = CantidadDeHabitaciones;
    }

    public float getTotalAPagar() {
        return TotalAPagar;
    }

    public void setTotalAPagar(float TotalAPagar) {
        this.TotalAPagar = TotalAPagar;
    }
    
    
}
