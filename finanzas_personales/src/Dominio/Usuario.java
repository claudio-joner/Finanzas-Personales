package Dominio;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Usuario implements Serializable {
    private static int id_usuario;
    private String nombre;
    private String apellido;
    private double montoCuenta;
    private List<Movimiento> listaMovimientos;
    private double objetivoAhorro;
    private boolean estadoUsuario;

    public double getObjetivoAhorro() {
        return objetivoAhorro;
    }

    public void setObjetivoAhorro(double objetivo_ahorro) {
        this.objetivoAhorro = objetivo_ahorro;
    }

    public List<Movimiento> getListaMovimientos() {
        return listaMovimientos;
    }

    public void setLisa_movimientos(List<Movimiento> lisa_movimientos) {
        this.listaMovimientos = lisa_movimientos;
    }

    public double getMontoCuenta() {
        return montoCuenta;
    }

    public void setMontoCuenta(double monto_cuenta) {
        this.montoCuenta = monto_cuenta;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Usuario() {
        id_usuario = hashCode();
    }

    public Usuario(String nombre, String apellido, double monto_cuenta, double objetivo_ahorro) {
        this();//Aca estoy llamando el Contrustor sin parametro.
        this.nombre = nombre;
        this.apellido = apellido;
        this.montoCuenta = monto_cuenta;
        this.lisa_movimientos = new ArrayList<Movimiento>();
        this.objetivo_ahorro = objetivo_ahorro;
        this.estadoUsuario = true;
    }

    @Override
    public String toString() {
        return "--------Usuario---------\n" +
                "nombre='" + getNombre() + '\'' +
                ", apellido='" + getApellido() + '\'' +
                ", monto_cuenta=" + getMontoCuenta() +
                ", objetivo_ahorro=" + getObjetivoAhorro();
    }
}
