/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serpientesescaleras.tablero.casillas;

import javax.swing.JLabel;

/**
 *
 * @author CIROSS
 */
public class Avanza extends Casilla {
    
    private int cantPosiciones;

    public Avanza(int fila, int columna, int cantPosiciones) {
        super(fila, columna);
        this.cantPosiciones = cantPosiciones;
    }

    public int getCantPosiciones() {
        return cantPosiciones;
    }

    public void setCantPosiciones(int cantPosiciones) {
        this.cantPosiciones = cantPosiciones;
    }
    
    
}
