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
public class Combustion extends auto{
     private int cilindrada;
    private int cilindros;
    private int consumo_combustible;
    
    public Combustion(String marca, String modelo, String VIN, String carroceria ,int cilindrada, int cilindros, int consumo_combustible) {
        this.cilindrada = cilindrada;
        this.cilindros = cilindros;
        this.consumo_combustible = consumo_combustible;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getCilindros() {
        return cilindros;
    }

    public void setCilindros(int cilindros) {
        this.cilindros = cilindros;
    }

    public int getConsumo_combustible() {
        return consumo_combustible;
    }

    public void setConsumo_combustible(int consumo_combustible) {
        this.consumo_combustible = consumo_combustible;
    }

    @Override
    public String toString() {
        return "Hibrido{"+ super.toString() + "cilindrada=" + cilindrada + ", cilindros=" + cilindros + ", consumo_combustible=" + consumo_combustible + '}';
    }
    
}
