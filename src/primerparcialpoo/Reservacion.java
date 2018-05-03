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

    private String Inf_huesped;
    private int dias_reservados;
    private String Numero_habitacion;

    public String getInf_huesped() {
        return Inf_huesped;
    }

    public void setInf_huesped(String Inf_huesped) {
        this.Inf_huesped = Inf_huesped;
    }

    public int getDias_reservados() {
        return dias_reservados;
    }

    public void setDias_reservados(int dias_reservados) {
        this.dias_reservados = dias_reservados;
    }

    public String getNumero_habitacion() {
        return Numero_habitacion;
    }

    public void setNumero_habitacion(String Numero_habitacion) {
        this.Numero_habitacion = Numero_habitacion;
    }

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
