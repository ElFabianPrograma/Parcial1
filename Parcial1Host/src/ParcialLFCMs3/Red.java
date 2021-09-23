/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ParcialLFCMs3;

/**
 *
 * @author Luis Fabian
 */
public class Red {
  private String nombre;
  private String Tipo;
  private int maxhost;
  private int hostconect;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public int getMaxhost() {
        return maxhost;
    }

    public void setMaxhost(int maxhost) {
        this.maxhost = maxhost;
    }

    public int getHostconect() {
        return hostconect;
    }

    public void setHostconect(int hostconect) {
        this.hostconect = hostconect;
    }
  
    
}
