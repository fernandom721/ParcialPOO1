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
public class Menu {
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        menu_inicio();          
        
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        menus_secundarios(a);

        
        
    }
    public static void menu_inicio () {
        
        System.out.println("----Hotel Viña Rafinha----");
        System.out.println("Seleccione una Opción");
        System.out.println("1) Habitaciones");
        System.out.println("2) Precios");
        System.out.println("3) Reservas");
        System.out.println("4) Administrar");
        System.out.println("5) Salir");
    }
    
    public static void menus_secundarios(int a)
    {
        Scanner input = new Scanner(System.in);
        switch(a)
        {
            case 1:
                System.out.println("----Habitaciones----");
                System.out.println("1) Habilitar/Desabilitar habitaciones");
                System.out.println("2) Habilitar/Desabilitar pisos");
                System.out.println("3) Back");
                int w = input.nextInt();
                switch (w)
                {
                    case 3:
                        menu_inicio();
                        int b = input.nextInt();
                        menus_secundarios(b);
                        
                }
                break;
            case 2:
                System.out.println("----Precios----");
                System.out.println("1) Modificar Precio de Habitaciones");
                System.out.println("2) Modificar Precio de Paquetes");
                System.out.println("3) Back");
                int x = input.nextInt();
                switch (x)
                {
                    case 3:
                        menu_inicio();
                        int b = input.nextInt();
                        menus_secundarios(b);
                }
                break;
            case 3:
                System.out.println("----Reservas----");
                System.out.println("1) Agregar Reserva");
                System.out.println("2) Modificar Reserva");
                System.out.println("3) Eliminar Reserva");
                System.out.println("4) Back");
                int y = input.nextInt();
                switch(y)
                {
                    case 4:
                        menu_inicio();
                        int b = input.nextInt();
                        menus_secundarios(b);
                }
                break;
            case 4:
                System.out.println("----Administrar----");
                System.out.println("1) Agregar Habitación");
                System.out.println("2) Agregar Piso");
                System.out.println("3) Back");
                int z = input.nextInt();
                switch(z)
                {
                    case 2:
                        Habitacion Piso = new Habitacion();
                        Piso.AgregarPisoInicial();
                        Piso.MostrarPisos();
                    case 3:
                        menu_inicio();
                        int b = input.nextInt();
                        menus_secundarios(b);
                }
                break;
            case 5:
                break;
            default:
                System.out.println("no se puede");
                menu_inicio();
                int b = input.nextInt();
                menus_secundarios(b);
        }
    }
}
