/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serpientesescaleras.tablero.casillas;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import serpientesescaleras.tablero.fichas.Ficha;

/**
 *
 * @author CIROSS
 */
public class Bajada extends Casilla {
    
    private int filaFinal, columnaFinal;
    private final String RUTA = "/serpientesescaleras/interfazGrafica/images/Serpiente.png";

    public Bajada(int fila, int columna, int filaFinal, int columnaFinal) {
        super(fila, columna);
        this.filaFinal = filaFinal;
        this.columnaFinal = columnaFinal;
    }

    public int getFilaFinal() {
        return filaFinal;
    }

    public void setFilaFinal(int filaFinal) {
        this.filaFinal = filaFinal;
    }

    public int getColumnaFinal() {
        return columnaFinal;
    }

    public void setColumnaFinal(int columnaFinal) {
        this.columnaFinal = columnaFinal;
    }

    @Override
    public void definirFormatoGeneral() {
       super.definirFormatoGeneral();
        definirIcono();
    }

    @Override
    public void setColorFondo() {
        super.getLblCasilla().setBackground(new java.awt.Color(65, 105, 50));
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
        Icon icono = new ImageIcon(img.getImage().getScaledInstance((int)(0.7*super.getLblCasilla().getHeight()), super.getLblCasilla().getHeight()-20, Image.SCALE_SMOOTH));
        super.getLblCasilla().setIcon(icono);
    }


    
    
}
