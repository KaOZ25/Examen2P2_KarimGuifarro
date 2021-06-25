package examen2p2_karimguifarro;


public class Echufable extends auto{
  private int maletero;
  private int gal_combustible;

    public Echufable(String marca, String modelo, String VIN, String carroceria,int maletero, int gal_combustible) {
        this.maletero = maletero;
        this.gal_combustible = gal_combustible;
    }

    public int getMaletero() {
        return maletero;
    }

    public void setMaletero(int maletero) {
        this.maletero = maletero;
    }

    public int getGal_combustible() {
        return gal_combustible;
    }

    public void setGal_combustible(int gal_combustible) {
        this.gal_combustible = gal_combustible;
    }

    @Override
    public String toString() {
        return "Echufable{"+ super.toString() + "maletero=" + maletero + ", gal_combustible=" + gal_combustible + '}';
    }
  
}
