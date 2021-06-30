/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serpientesescaleras.tablero.fichas;

import javax.swing.Icon;
import serpientesescaleras.tablero.casillas.Casilla;


/**
 *
 * @author CIROSS
 */
public class Ficha {

    private int posicion, filaF, columnaF;
    private boolean puedeMover;
    private Icon icono;
    private Casilla casillaActual;

    public boolean isPuedeMover() {
        return puedeMover;
    }

    public void setPuedeMover(boolean puedeMover) {
        this.puedeMover = puedeMover;
    }

    public Icon getIcono() {
        return icono;
    }

    public void setIcono(Icon icono) {
        this.icono = icono;
    }

    public Ficha() {
        this.puedeMover = true;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public int getFilaF() {
        return filaF;
    }

    public void setFilaF(int filaF) {
        this.filaF = filaF;
    }

    public int getColumnaF() {
        return columnaF;
    }

    public void setColumnaF(int columnaF) {
        this.columnaF = columnaF;
    }

    public boolean isTurnoActivo() {
        return puedeMover;
    }

    public void setTurnoActivo(boolean turnoActivo) {
        this.puedeMover = turnoActivo;
    }
    
    
    
}
