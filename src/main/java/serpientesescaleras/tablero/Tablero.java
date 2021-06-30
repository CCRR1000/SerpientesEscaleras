/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serpientesescaleras.tablero;

import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
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
        this.filas = filas;
        this.columnas = columnas;
        
        panel.removeAll();

        matriz = new JLabel[filas][columnas];
        this.altoFila = panel.getHeight()/ filas;
        this.anchoColumna = panel.getWidth()/ columnas;

        for (int i = 0 ; i < matriz.length ; i++) {
            for (int j = 0 ; j < matriz[0].length ; j++) {
                
                JLabel lbl = new JLabel("");
                lbl.setBounds(this.anchoColumna * j, this.altoFila * i, this.anchoColumna, this.altoFila);
                lbl.setHorizontalAlignment(SwingConstants.CENTER);
                lbl.setForeground(Color.black);
                lbl.setOpaque(true);
                matriz[i][j] = lbl;
                if ((i + j) % 2 == 0) {
                    //matriz[i][j].setBackground(new java.awt.Color(155, 110, 55));
                    matriz[i][j].setBackground(new java.awt.Color(160, 82, 65));
                } else {
                    //matriz[i][j].setBackground(new java.awt.Color(180, 140, 80));
                    matriz[i][j].setBackground(new java.awt.Color(245, 222, 179));
                }                   
                
            }
        }

        int c = filas*columnas + 1;
        //for (int i = matriz.length-1; i >= 0 ; i--) {
        //    for (int j = matriz[0].length-1; j >= 0 ; j--) {
        for (int i = 0 ; i < matriz.length ; i++) {
            for (int j = 0 ; j < matriz[0].length ; j++) {

                int numCasilla;
                if (i % 2 == 0) {
                    numCasilla = c - ((i*columnas) + j + 1);
                } else {
                    numCasilla = c - ((i*columnas) + columnas - j);
                }
                
                if (j % 2 == 0) {
                    matriz[i][j].setText(""+numCasilla);
                } else {
                    matriz[i][j].setText(""+numCasilla);
                }
                
            }
        }
        
        matriz[5][3].setText("");
        matriz[5][3].setIcon(escalarImagen("/serpientesescaleras/interfazGrafica/images/fichas/h _ Nathan Drake.png"));
        
        matriz[filas-1][0].setText("");
        matriz[filas-1][0].setIcon(escalarImagenCasilla("/serpientesescaleras/interfazGrafica/images/cave-at-the-forest.jpg"));
        
        matriz[0][0].setText("");
        matriz[0][0].setIcon(escalarImagenCasilla("/serpientesescaleras/interfazGrafica/images/nature-cave.jpg"));
        
        matriz[filas-1][1].setText("");
        matriz[filas-1][1].setIcon(escalarImagenCasilla("/serpientesescaleras/interfazGrafica/images/Derrumbe.png"));
        matriz[filas-1][1].setBackground(Color.YELLOW);
        
        matriz[filas-1][3].setText("");
        matriz[filas-1][3].setIcon(escalarImagenCasilla("/serpientesescaleras/interfazGrafica/images/Agua en cueva.jpg"));
        
        matriz[filas-1][4].setText("");
        matriz[filas-1][4].setIcon(escalarImagen("/serpientesescaleras/interfazGrafica/images/Escalera.png"));
        matriz[filas-1][4].setBackground(Color.orange);
        
        matriz[filas-1][7].setText("");
        matriz[filas-1][7].setIcon(escalarImagen("/serpientesescaleras/interfazGrafica/images/Antorcha.png"));
        matriz[filas-1][7].setBackground(Color.lightGray);
        
        matriz[filas-2][3].setText("");
        matriz[filas-2][3].setIcon(escalarImagenCasilla("/serpientesescaleras/interfazGrafica/images/Agujero.png"));
        matriz[filas-2][3].setBackground(Color.BLACK);
        
        matriz[filas-3][4].setText("");
        matriz[filas-3][4].setIcon(escalarImagen("/serpientesescaleras/interfazGrafica/images/Serpiente.png"));
        matriz[filas-3][4].setBackground(new java.awt.Color(65, 105, 50));
        
        
        
        for (int i = 0 ; i < matriz.length ; i++) {
            for (int j = 0 ; j < matriz[0].length ; j++) {
   
                panel.add(matriz[i][j]);
            }
        }
        
        
        panel.repaint();
    }
    
    public Icon escalarImagen(String ruta) {
        ImageIcon img = new ImageIcon(getClass().getResource(ruta));
        Icon icono = new ImageIcon(img.getImage().getScaledInstance((int)(0.4*altoFila), altoFila-20, Image.SCALE_SMOOTH));        
        return icono;
    }
    
    public Icon escalarImagenCasilla(String ruta) {
        ImageIcon img = new ImageIcon(getClass().getResource(ruta));
        Icon icono = new ImageIcon(img.getImage().getScaledInstance(anchoColumna, altoFila, Image.SCALE_SMOOTH));        
        return icono;
    }
    
    

}
