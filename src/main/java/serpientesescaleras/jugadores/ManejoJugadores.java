/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serpientesescaleras.jugadores;

import java.util.ArrayList;

/**
 *
 * @author CIROSS
 */
public class ManejoJugadores {
    private ArrayList<Jugador> jugadores = new ArrayList<>();

    public ManejoJugadores() {

    }

    public void ingresarJugador(String nombre, String apellido) {

        Jugador jugador = new Jugador(nombre, apellido);

        boolean repetido;
        do {
            repetido = compararId(jugador);
        } while (repetido);

        jugadores.add(jugador);

    }

    public boolean compararId(Jugador jugador) {

        boolean repetido = false;

        for (int i = 0; i < jugadores.size(); i++) {

            if (jugador.getId() == jugadores.get(i).getId()) {
                jugador.setId(jugador.generarId());
                repetido = true;
            }
        }
        return repetido;
    }

    public void ordenarPor(int columna) {

        for (int i = 0; i < jugadores.size()-1; i++) {
            for (int j = 0; j < jugadores.size()-1; j++) {
                if (columna == 0 && jugadores.get(j).getId() > jugadores.get(j + 1).getId()) {
                    cambiar(j);
                }
                else if (columna == 1 && jugadores.get(j).getNombre().compareToIgnoreCase(jugadores.get(j + 1).getNombre())>0) {
                    cambiar(j);
                }
                else if (columna == 2 && jugadores.get(j).getApellido().compareToIgnoreCase(jugadores.get(j + 1).getApellido())>0) {
                    cambiar(j);
                }
                else if (columna == 3 && jugadores.get(j).getPartidasJugadas() < jugadores.get(j + 1).getPartidasJugadas()) {
                    cambiar(j);
                }
                else if (columna == 4 && jugadores.get(j).getPartidasGanadas() < jugadores.get(j + 1).getPartidasGanadas()) {
                    cambiar(j);
                }
                else if (columna == 5 && jugadores.get(j).getPartidasPerdidas() < jugadores.get(j + 1).getPartidasPerdidas()) {
                    cambiar(j);
                }
                
            }
        }
    }

    public void cambiar(int j) {
        Jugador aux1 = jugadores.get(j);
        Jugador aux2 = jugadores.get(j+1);
        jugadores.set(j, aux2);
        jugadores.set(j+1, aux1);
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
}
