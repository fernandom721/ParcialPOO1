/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerparcialpoo;
import java.util.ArrayList;
import primerparcialpoo.Paquetes;
/**
 *
 * @author Rodrigo Cruz <00115417@uca.edu.sv>
 */
public class ListadoPaquetes {
    private ArrayList<Paquetes> ListadoPaquetes = new ArrayList<Paquetes>();
    public ListadoPaquetes(ArrayList<Paquetes> ListadoPaquetes){
        this.ListadoPaquetes = ListadoPaquetes;
    }
    public ListadoPaquetes(){}
    
    public ArrayList<Paquetes>getListadoPaquetes(){
        return ListadoPaquetes;
    }
    public void setListadoPaquetes(ArrayList<Paquetes> ListadoPaquetes){
        this.ListadoPaquetes = ListadoPaquetes;
    }
    public void agregarPaquete(Paquetes p){
        this.ListadoPaquetes.add(p);
    }
    public void mostrar(){
        if(ListadoPaquetes != null){
            for(Paquetes opc: ListadoPaquetes){
                System.out.println(" ");
                System.out.println(opc.getBeneficios());
                System.out.println(opc.getPaquete());
                System.out.println(opc.getPrecio());
            }
        }
        else{
            System.out.println("No hay paquetes disponibles.");
                    }
        }
    }
