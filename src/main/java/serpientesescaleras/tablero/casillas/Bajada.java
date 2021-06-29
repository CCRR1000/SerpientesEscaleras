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
public class Bajada extends Casilla {
    
    private int filaFinal, columnaFinal;

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
    
    
}
