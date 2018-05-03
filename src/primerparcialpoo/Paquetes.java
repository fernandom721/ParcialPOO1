/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package primerparcialpoo;

/**
 *
 * @author Rodrigo Cruz <00115417@uca.edu.sv>
 */

public class Paquetes {
    private String Beneficios, nombrePaquete;
    private int precio;

    public Paquetes(String Beneficios, String nombrePaquete, int precio){
        this.Beneficios = Beneficios;
        this.nombrePaquete = nombrePaquete;
        this.precio = precio;
    }
    public String getBeneficios() {
        return Beneficios;
    }
    public void setBeneficios(String Beneficios) {
        this.Beneficios = Beneficios;
    }
    public String getPaquete() {
        return nombrePaquete;
    }
    public void setPaquete(String Paquete) {
        this.nombrePaquete = nombrePaquete;
    }
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
       
    //Clases de tipo de paquete
    private static class Premium {
        private String habitacion, nombre;
        private int precioT;

        public Premium(String nombre, String habitacion, int precioT) {
            this.habitacion = habitacion;
            this.nombre = nombre;
            this.precioT = precioT;
            
        }

        public String getHabitacion() {
            return habitacion;
        }

        public void setHabitacion(String habitacion) {
            this.habitacion = habitacion;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getPrecioT() {
            return precioT;
        }

        public void setPrecioT(int precioT) {
            this.precioT = precioT;
        }
    }
    private static class Basic {
        private String habitacion, nombre;
        private int precioT;

        public Basic(String nombre, String habitacion, int precioT) {
            this.habitacion = habitacion;
            this.nombre = nombre;
            this.precioT = precioT;
        }

        public String getHabitacion() {
            return habitacion;
        }

        public void setHabitacion(String habitacion) {
            this.habitacion = habitacion;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getPrecioT() {
            return precioT;
        }

        public void setPrecioT(int precioT) {
            this.precioT = precioT;
        }
        
    }
}