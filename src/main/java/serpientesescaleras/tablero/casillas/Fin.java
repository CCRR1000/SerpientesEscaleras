/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serpientesescaleras.tablero.casillas;

import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author CIROSS
 */
public class Fin extends Casilla {
    
    private final String RUTA = "/serpientesescaleras/interfazGrafica/images/nature-cave.jpg";

    public Fin(int fila, int columna) {
        super(fila, columna);
    }

    @Override
    public void setColorFondo() {
        super.getLblCasilla().setBackground(Color.GRAY);
    }

    @Override
    public void definirIcono() {
        ImageIcon img = new ImageIcon(getClass().getResource(this.RUTA));
        Icon icono = new ImageIcon(img.getImage().getScaledInstance((int) (0.7 * super.getLblCasilla().getHeight()), super.getLblCasilla().getHeight() - 20, Image.SCALE_SMOOTH));
        super.getLblCasilla().setIcon(icono);

    }

    @Override
    public void definirNumeroCasilla() {
    }

    @Override
    public void definirFila() {
    }

    @Override
    public void definirColumna() {
    }

}
