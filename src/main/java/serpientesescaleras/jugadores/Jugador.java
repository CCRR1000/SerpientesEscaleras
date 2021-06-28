/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serpientesescaleras.jugadores;

import java.util.Random;

/**
 *
 * @author CIROSS
 */
public class Jugador {
    private String nombre, apellido;
    private int id, partidasJugadas, partidasGanadas, partidasPerdidas;
    private Random rnd = new Random();

    public Jugador() {
    }

    public Jugador(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = generarId();
        this.partidasJugadas = 0;
        this.partidasGanadas = 0;
        this.partidasPerdidas = 0;
    }
    
    /**
     * Asigna un id aleatorio de 3 digitos al jugador
     * @return id
     */
    public int generarId() {
        return rnd.nextInt(1000-100)+100;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", apellido=" + apellido + ", id=" + id + ", partidasJugadas=" + partidasJugadas + ", partidasGanadas=" + partidasGanadas + ", partidasPerdidas=" + partidasPerdidas + '}';
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPartidasJugadas() {
        return partidasJugadas;
    }

    public void setPartidasJugadas(int partidasJugadas) {
        this.partidasJugadas = partidasJugadas;
    }

    public int getPartidasGanadas() {
        return partidasGanadas;
    }

    public void setPartidasGanadas(int partidasGanadas) {
        this.partidasGanadas = partidasGanadas;
    }

    public int getPartidasPerdidas() {
        return partidasPerdidas;
    }

    public void setPartidasPerdidas(int partidasPerdidas) {
        this.partidasPerdidas = partidasPerdidas;
    }
    
}
