/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerparcialpoo;
import java.util.Scanner;

/**
 *
 * @author Fernando Martínez
 */
public class PrimerParcialPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        System.out.println("----Hotel Viña Rafinha----");
        System.out.println("Seleccione una Opción");
        System.out.println("1) Habitaciones");
        System.out.println("2) Precios");
        System.out.println("3) Reservas");
        System.out.println("4) Administrar");
        System.out.println("5) Salir");
        int a = input.nextInt();
        
        switch(a)
        {
            case 1:
                System.out.println("----Habitaciones----");
                System.out.println("1) Habilitar/Desabilitar habitaciones");
                System.out.println("2) Habilitar/Desabilitar pisos");
                System.out.println("3) Back");
                int x = input.nextInt();
                break;
            case 2:
                System.out.println("----Precios----");
                System.out.println("1) Modificar Precio de Habitaciones");
                System.out.println("2) Modificar Precio de Paquetes");
                System.out.println("3) Back");
                int y = input.nextInt();
                break;
            case 3:
                System.out.println("----Reservas----");
                System.out.println("1) Agregar Reserva");
                System.out.println("2) Modificarr Reserva");
                System.out.println("3) Eliminar Reserva");
                System.out.println("4) Back");
                int z = input.nextInt();
                break;
            case 4:
                System.out.println("----Administrar----");
                System.out.println("1) Agregar Habitación");
                System.out.println("2) Agregar Piso");
                System.out.println("3) Back");
                int b = input.nextInt();
                break;
            case 5:
                break;
            
        }
        
        
    }
    
}
