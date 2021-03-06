/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serpientesescaleras.tablero.casillas;

import javax.swing.JLabel;
import serpientesescaleras.tablero.Formato;
import serpientesescaleras.tablero.fichas.Ficha;

/**
 *
 * @author CIROSS
 */
public abstract class Casilla implements Formato {
    
    private int numeroCasilla, fila, columna;
    private JLabel lblCasilla;
    private Ficha fichaJugador;    

    public Ficha getFichaJugador() {
        return fichaJugador;
    }

    public void setFichaJugador(Ficha fichaJugador) {
        this.fichaJugador = fichaJugador;
    }

    public boolean isTieneFicha() {
        return tieneFicha;
    }

    public void setTieneFicha(boolean tieneFicha) {
        this.tieneFicha = tieneFicha;
    }
    private boolean tieneFicha;

    public Casilla(int numeroCasilla, int fila, int columna, JLabel lblCasilla) {
        this.numeroCasilla = numeroCasilla;
        this.fila = fila;
        this.columna = columna;
        this.lblCasilla = lblCasilla;
    }

    public Casilla(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
    }

    @Override
    public void definirFormatoGeneral() {
        definirNumeroCasilla();
        definirFila();
        definirColumna();
    }
    
    @Override
    public void definirFicha(Ficha fichaJugador) {       
        getLblCasilla().setIcon(fichaJugador.getIcono());       
    }
  
    public int getNumeroCasilla() {
        return numeroCasilla;
    }

    public void setNumeroCasilla(int numeroCasilla) {
        this.numeroCasilla = numeroCasilla;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public JLabel getLblCasilla() {
        return lblCasilla;
    }

    public void setLblCasilla(JLabel lblCasilla) {
        this.lblCasilla = lblCasilla;
    }
    
    
}
