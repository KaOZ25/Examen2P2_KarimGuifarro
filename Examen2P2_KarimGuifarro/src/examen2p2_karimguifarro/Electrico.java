
package examen2p2_karimguifarro;


public class Electrico extends auto{
    private int coe_aerodinamico;
    private int cant_motores;
    private int recarga;

    public Electrico(String marca, String modelo, String VIN, String carroceria,int coe_aerodinamico, int cant_motores, int recarga) {
        this.coe_aerodinamico = coe_aerodinamico;
        this.cant_motores = cant_motores;
        this.recarga = recarga;
    }

    public int getCoe_aerodinamico() {
        return coe_aerodinamico;
    }

    public void setCoe_aerodinamico(int coe_aerodinamico) {
        this.coe_aerodinamico = coe_aerodinamico;
    }

    public int getCant_motores() {
        return cant_motores;
    }

    public void setCant_motores(int cant_motores) {
        this.cant_motores = cant_motores;
    }

    public int getRecarga() {
        return recarga;
    }

    public void setRecarga(int recarga) {
        this.recarga = recarga;
    }

    @Override
    public String toString() {
        return "Electrico{"+ super.toString() + "coe_aerodinamico=" + coe_aerodinamico + ", cant_motores=" + cant_motores + ", recarga=" + recarga + '}';
    }
    
}
