
package ParcialLFCMs3;

/**
 *
 * @author Luis Fabian
 */
public class Host {
private String Host; 
private String SisOp;
private Conectar coneccion;
private Red red;

    public String getHost() {
        return Host;
    }

    public void setHost(String Host) {
        this.Host = Host;
    }

    public String getSisOp() {
        return SisOp;
    }

    public void setSisOp(String SisOp) {
        this.SisOp = SisOp;
    }
    
    

    public Conectar getConeccion() {
        return coneccion;
    }

    public void setConeccion(Conectar coneccion) {
        this.coneccion = coneccion;
    }


}
