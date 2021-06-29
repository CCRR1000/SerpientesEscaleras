/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serpientesescaleras.tablero;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author CIROSS
 */
public class Tablero {

    JPanel panel;
    JLabel[][] matriz;
    int filas, columnas, altoFila, anchoColumna;

    public Tablero(JPanel jPanel) {
        this.panel = jPanel;
    }

    public void crearMatriz(int filas, int columnas) {
        panel.removeAll();

        matriz = new JLabel[filas][columnas];
        this.altoFila = panel.getHeight()/ filas;
        this.anchoColumna = panel.getWidth()/ columnas;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                JLabel lbl = new JLabel("");
                lbl.setBounds(this.anchoColumna * j, this.altoFila * i, this.anchoColumna, this.altoFila);
                lbl.setHorizontalAlignment(SwingConstants.CENTER);
                lbl.setForeground(Color.black);
                lbl.setOpaque(true);
                matriz[i][j] = lbl;
                if ((i + j) % 2 == 0) {
                    matriz[i][j].setBackground(new java.awt.Color(160, 82, 65));
                } else {
                    matriz[i][j].setBackground(new java.awt.Color(245, 222, 179));
                }
                if (j % 2 == 0) {
                    matriz[i][j].setText("<");
                } else {
                    matriz[i][j].setText(">");
                }
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                panel.add(matriz[i][j]);
            }
        }
        
        panel.repaint();
    }
    
    

}
