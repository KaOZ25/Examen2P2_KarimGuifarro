package examen2p2_karimguifarro;

import java.io.Serializable;

public class auto implements Serializable{
    private String marca;
    private String modelo;
    private String VIN;
    private String carroceria;
    private Bateria bateria;

    public auto(String marca, String modelo, String VIN, String carroceria) {
        this.marca = marca;
        this.modelo = modelo;
        this.VIN = VIN;
        this.carroceria = carroceria;
    }
    public Bateria getBateria() {
        return bateria;
    }

    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getVIN() {
        return VIN;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    public String getCarroceria() {
        return carroceria;
    }

    public void setCarroceria(String carroceria) {
        this.carroceria = carroceria;
    }

    @Override
    public String toString() {
        return "auto{" + "marca=" + marca + ", modelo=" + modelo + ", VIN=" + VIN + ", carroceria=" + carroceria;
    }
    
}
