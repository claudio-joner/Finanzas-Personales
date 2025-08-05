package Dominio;

import Dominio.Enum.Motivos;
import Dominio.Enum.Tipo_Movimientos;

public class Movimiento {

    private int id_movimiento;
    private Tipo_Movimientos tipo_mov;
    private Motivos motivo;
    private String observaciones;

    public void setId_movimiento(int id_movimiento) {
        this.id_movimiento = id_movimiento;
    }

    public int getId_movimiento() {
        return id_movimiento;
    }

    public Tipo_Movimientos getTipo_mov() {
        return tipo_mov;
    }

    public void setTipo_mov(Tipo_Movimientos tipo_mov) {
        this.tipo_mov = tipo_mov;
    }

    public Motivos getMotivo() {
        return motivo;
    }

    public void setMotivo(Motivos motivo) {
        this.motivo = motivo;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Movimiento(String observaciones, Motivos motivo, Tipo_Movimientos tipo_mov, int id_movimiento) {
        setObservaciones(observaciones);
        setMotivo(motivo);
        setTipo_mov(tipo_mov);
        setId_movimiento(id_movimiento);
    }

    @Override
    public String toString(){
        return  "\n--------MOVIMIENTO---------\n"+ "Movimiento nro: " + getId_movimiento() + "\nTipo Movimiento:"+
                tipo_mov.name() + "\nMotivo movimiento: " + motivo.toString() + "\nObservaciones: " + getObservaciones();
    }
}
