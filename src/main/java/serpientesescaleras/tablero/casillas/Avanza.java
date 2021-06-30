/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serpientesescaleras.tablero.casillas;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import serpientesescaleras.tablero.fichas.Ficha;

/**
 *
 * @author CIROSS
 */
public class Avanza extends Casilla {

    private int cantPosiciones;
    private final String RUTA = "/serpientesescaleras/interfazGrafica/images/Antorcha.png";

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

    @Override
    public void definirFormatoGeneral() {
        super.definirFormatoGeneral();
        definirIcono();
    }

    @Override
    public void setColorFondo() {
        super.getLblCasilla().setBackground(new java.awt.Color(95, 160, 160));
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
        Icon icono = new ImageIcon(img.getImage().getScaledInstance((int) (0.7 * super.getLblCasilla().getHeight()), super.getLblCasilla().getHeight() - 20, Image.SCALE_SMOOTH));
        super.getLblCasilla().setIcon(icono);
    }

}
