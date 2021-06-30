/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serpientesescaleras.tablero.casillas;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author CIROSS
 */
public class Retrocede extends Casilla {
    
    private int cantPosiciones;
    private final String RUTA = "/serpientesescaleras/interfazGrafica/images/Derrumbe.png";

    public Retrocede(int fila, int columna, int cantPosiciones) {
        super(fila, columna);
        this.cantPosiciones = cantPosiciones;
    }

    public int getCantPosiciones() {
        return cantPosiciones;
    }

    public void setCantPosiciones(int cantPosiciones) {
        this.cantPosiciones = cantPosiciones;
    }

    @Override
    public void definirFormatoGeneral() {
        super.definirFormatoGeneral();
        definirIcono();
    }

    @Override
    public void setColorFondo() {
        super.getLblCasilla().setBackground(new java.awt.Color(255, 255, 75));
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
        ImageIcon img = new ImageIcon(getClass().getResource(this.RUTA));
        Icon icono = new ImageIcon(img.getImage().getScaledInstance(super.getLblCasilla().getWidth(), super.getLblCasilla().getHeight(), Image.SCALE_SMOOTH));
        super.getLblCasilla().setIcon(icono);
    }

    
    
}
