/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2p2_karimguifarro;

/**
 *
 * @author Karim Ozael
 */
public class Hibrido extends auto{
   private int km_autonomia;
   private int cant_pasajeros;
   private int precio;

    public Hibrido(String marca, String modelo, String VIN, String carroceria,int km_autonomia, int cant_pasajeros, int precio) {
        super(marca, modelo, VIN, carroceria);
        this.km_autonomia = km_autonomia;
        this.cant_pasajeros = cant_pasajeros;
        this.precio = precio;
    }

  

    public int getKm_autonomia() {
        return km_autonomia;
    }

    public void setKm_autonomia(int km_autonomia) {
        this.km_autonomia = km_autonomia;
    }

    public int getCant_pasajeros() {
        return cant_pasajeros;
    }

    public void setCant_pasajeros(int cant_pasajeros) {
        this.cant_pasajeros = cant_pasajeros;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Hibrido{"+ super.toString() + "km_autonomia=" + km_autonomia + ", cant_pasajeros=" + cant_pasajeros + ", precio=" + precio + '}';
    }
   
}
