/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2p2_karimguifarro;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Karim Ozael
 */
public class adminauto {

    private ArrayList<Combustion> lista = new ArrayList();
    private ArrayList<Echufable> lista1 = new ArrayList();
    private ArrayList<Hibrido> lista2 = new ArrayList();
    private ArrayList<Electrico> lista3 = new ArrayList();
    private File archivo = null;

    public adminauto(String path) {
        archivo = new File(path);
    }

    public ArrayList<Combustion> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Combustion> lista) {
        this.lista = lista;
    }

    public ArrayList<Echufable> getLista1() {
        return lista1;
    }

    public void setLista1(ArrayList<Echufable> lista1) {
        this.lista1 = lista1;
    }

    public ArrayList<Hibrido> getLista2() {
        return lista2;
    }

    public void setLista2(ArrayList<Hibrido> lista2) {
        this.lista2 = lista2;
    }

    public ArrayList<Electrico> getLista3() {
        return lista3;
    }

    public void setLista3(ArrayList<Electrico> lista3) {
        this.lista3 = lista3;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public void setCombustion(Combustion a) {
        lista.add(a);
    }
     public void setHibrido(Hibrido a) {
        lista2.add(a);
    }
      public void setElectrico(Electrico a) {
        lista3.add(a);
    }
       public void setEchufable(Echufable a) {
        lista1.add(a);
    }

    public void cargarArchivo() {
        try {
            lista = new ArrayList();
            Combustion temp;
            if (archivo.exists()) {
                FileInputStream entrada
                        = new FileInputStream(archivo);
                ObjectInputStream objeto
                        = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Combustion) objeto.readObject()) != null) {
                        lista.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
     public void cargarArchivo1() {
        try {
            lista = new ArrayList();
            Echufable temp;
            if (archivo.exists()) {
                FileInputStream entrada
                        = new FileInputStream(archivo);
                ObjectInputStream objeto
                        = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Echufable) objeto.readObject()) != null) {
                        lista1.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
      public void cargarArchivo2() {
        try {
            lista = new ArrayList();
            Hibrido temp;
            if (archivo.exists()) {
                FileInputStream entrada
                        = new FileInputStream(archivo);
                ObjectInputStream objeto
                        = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Hibrido) objeto.readObject()) != null) {
                        lista2.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
       public void cargarArchivo3() {
        try {
            lista = new ArrayList();
            Electrico temp;
            if (archivo.exists()) {
                FileInputStream entrada
                        = new FileInputStream(archivo);
                ObjectInputStream objeto
                        = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Electrico) objeto.readObject()) != null) {
                        lista3.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo, true);
            bw = new ObjectOutputStream(fw);
            for (Combustion t : lista) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
     public void escribirArchivo1() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo, true);
            bw = new ObjectOutputStream(fw);
            for (Echufable t : lista1) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
      public void escribirArchivo2() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo, true);
            bw = new ObjectOutputStream(fw);
            for (Hibrido t : lista2) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
       public void escribirArchivo3() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo, true);
            bw = new ObjectOutputStream(fw);
            for (Electrico t : lista3) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
}
