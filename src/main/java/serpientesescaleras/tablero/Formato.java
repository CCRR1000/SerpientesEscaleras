/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serpientesescaleras.tablero;

import serpientesescaleras.tablero.fichas.Ficha;

/**
 *
 * @author CIROSS
 */
public interface Formato {
    
    public abstract void definirFormatoGeneral();
    
    public abstract void setColorFondo();
    
    public abstract void definirIcono();
    
    public abstract void definirFicha(Ficha fichaJugador);
    
    public abstract void definirNumeroCasilla();
    
    public abstract void definirFila();
    
    public abstract void definirColumna();
}
