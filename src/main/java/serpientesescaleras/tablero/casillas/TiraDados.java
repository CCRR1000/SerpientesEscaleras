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
public class TiraDados extends Casilla {

    private final String RUTA = "/serpientesescaleras/interfazGrafica/images/Agua en cueva.jpg";
    
    public TiraDados(int fila, int columna) {
        super(fila, columna);
    }

    @Override
    public void definirFormatoGeneral() {
        super.definirFormatoGeneral();
        definirIcono();
    }

    @Override
    public void setColorFondo() {
        super.getLblCasilla().setBackground(new java.awt.Color(130, 255, 215));
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
