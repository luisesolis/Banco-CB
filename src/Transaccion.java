import java.util.Date;

/**
 *
 * @author CBTS
 */
public class Transaccion {   
    protected String id;
    protected String clabe;
    protected Date fecha;
    protected double monto;
    
    public Transaccion(String id, String clabe, double monto) {
        this.id = id;
        this.clabe = clabe;
        fecha = new Date(System.currentTimeMillis());
        this.monto = monto;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClabe() {
        return clabe;
    }

    public void setClabe(String clabe) {
        this.clabe = clabe;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    @Override
    public String toString() {
        return "Transaccion[" + "id=" + id + ", clabe=" + clabe + ", fecha=" + fecha + ", monto=" + monto + ']';
    }
}
