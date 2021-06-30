/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serpientesescaleras.tablero.casillas;

/**
 *
 * @author CIROSS
 */
public class Vacia extends Casilla {

    public Vacia(int fila, int columna) {
        super(fila, columna);
    }

    @Override
    public void setColorFondo() {
        if (super.getNumeroCasilla()%2 == 0) {
            super.getLblCasilla().setBackground(new java.awt.Color(245, 222, 179));
        } else {
            super.getLblCasilla().setBackground(new java.awt.Color(160, 82, 65));
        }
    }

    @Override
    public void definirNumeroCasilla() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void definirFila() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void definirColumna() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void definirIcono() {
        super.getLblCasilla().setText(""+super.getNumeroCasilla());
    }
    
}
