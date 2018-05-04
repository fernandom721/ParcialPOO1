/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerparcialpoo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
/**
 *Todos los commit que se realizaron el dia miercoles 2 de abril alrededor de las
 * 12 horas del mediodia, fueron realizadas por este autor, con el error de
 * subirlos a nombre de la cuenta uca.
 * @author Steven Diaz
 */
public class Habitacion {

    private int NumeroDeHabitacion;
    private String TipoDeHabitacion;
    private boolean Disponibilidad;
    private int PrecioDeHabitacion;
    ArrayList<String> Piso = new ArrayList<>();
    ArrayList<String> NumeroHabitacion = new ArrayList<>();

    String [] PisosExtras = {"G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};

    public Habitacion(){}
    
    public Habitacion(String TipoDeHabitacion, boolean Disponibilidad, int PrecioDeHabitacion){ 
        this.TipoDeHabitacion = TipoDeHabitacion;
        this.Disponibilidad = Disponibilidad;
        this.PrecioDeHabitacion = PrecioDeHabitacion;
    }
    
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    
    public void AgregarPisoInicial(){
        Piso.add("F");
        Piso.add("E");
        Piso.add("D");
        Piso.add("C");
        Piso.add("B");
        Piso.add("A");
    }
    */
    
    public void recibirNuevoPiso() {
        System.out.println("Ingrese las cantidades de Pisos a agregar:");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        switch (a){
            case 1:
                Iterator<String> it = Piso.iterator();
                while(it.hasNext()){
                    System.out.println(it.next());
                }
                Piso.add("G");
                MostrarPisos();
                break;
            case 2:
                int cantElementos = Piso.size();
                Piso.add("H");
                Piso.add("G");
                MostrarPisos();
                break;
            case 3:
                Piso.add("I");
                Piso.add("H");
                Piso.add("G");
                MostrarPisos();
                break;
            case 4:
                Piso.add("J");
                Piso.add("I");
                Piso.add("H");
                Piso.add("G");
                MostrarPisos();
                break;
            case 5:
                Piso.add("K");
                Piso.add("J");
                Piso.add("I");
                Piso.add("H");
                Piso.add("G");
                MostrarPisos();
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            default:
                System.out.println("Por favor ingrese una cantidad valida");
                recibirNuevoPiso();
                break;
        }
    }
    public void recibirNuevaHabitacion() {
        System.out.println("Ingrese las cantidades de habitacines a agregar:");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
    }
    
    public void MostrarPisos(){
        for(int i = 0; i < Piso.size(); i++) {
            System.out.println(Piso.get(i));
        
        }
    }
    
    
  
    public void MostrarNumeroHabitacion(){
        for(int i = 0; i < Piso.size(); i++) {
        System.out.println(Piso.get(i));
        
        }
    }
    
    public void asignarTipoHabitacion(){
        if (NumeroDeHabitacion%2 ==0){
            TipoDeHabitacion = "Doble";
        }
        else {
            TipoDeHabitacion = "Simple";
        }
    }
    
    
    public void Disponibilidad(String piso){
        boolean reservacion = true;
        
        if (reservacion == true){
            if (Disponibilidad == true){
                Disponibilidad = false;
            }
            else {
            Disponibilidad = false;
            }
        }
        
    }
    

    public void setNumeroDeHabitacion (int NumeroDeHabitacion){
        this.NumeroDeHabitacion = NumeroDeHabitacion;
    }
    
    public int getNumeroDeHabitacion (){
        return NumeroDeHabitacion;
    }
    public void setTipoDeHabitacion (String TipoDeHabitacion){
        this.TipoDeHabitacion = TipoDeHabitacion;
    }
    
    public String getTipoDeHabitacion (){
        return TipoDeHabitacion;
    }
    public void setDisponibilidad (boolean Disponibilidad){
        this.Disponibilidad = Disponibilidad;
    }
    
    public boolean getDisponibilidad (){
        return Disponibilidad;
    }
    public void setPrecioDeHabitacion (int PrecioDeHabitacion){
        this.PrecioDeHabitacion = PrecioDeHabitacion;
    }
    
    public int getPrecioDeHabitacion (){
        return PrecioDeHabitacion;
    }
}
