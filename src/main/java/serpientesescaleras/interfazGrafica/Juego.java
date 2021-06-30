/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serpientesescaleras.interfazGrafica;

import java.util.Random;
import serpientesescaleras.tablero.Tablero;

/**
 *
 * @author CIROSS
 */
public class Juego extends javax.swing.JFrame {

    /**
     * Creates new form Juego
     */
    public Juego() {
        initComponents();
        setLocationRelativeTo(null);
        setSize(1000, 700);
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        jLbDado = new javax.swing.JLabel();
        jBtnLanzar = new javax.swing.JButton();
        jBtnDetener = new javax.swing.JButton();
        jLbFilas = new javax.swing.JLabel();
        jTxtNumFilas = new javax.swing.JTextField();
        jLbColumnas = new javax.swing.JLabel();
        jTxtNumColumnas = new javax.swing.JTextField();
        jBtnCrearTablero = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jLbFondo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuIr = new javax.swing.JMenu();
        jMenuItemInicio = new javax.swing.JMenuItem();
        jMenuItemJugadores = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel.setBackground(new java.awt.Color(255, 204, 153));
        jPanel.setOpaque(false);

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 623, Short.MAX_VALUE)
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLbDado.setBackground(new java.awt.Color(255, 255, 255));
        jLbDado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/serpientesescaleras/interfazGrafica/images/Dado6.png"))); // NOI18N
        getContentPane().add(jLbDado, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 320, 210, -1));

        jBtnLanzar.setText("Lanzar");
        jBtnLanzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnLanzarActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnLanzar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 600, 85, -1));

        jBtnDetener.setText("Detener");
        jBtnDetener.setEnabled(false);
        jBtnDetener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnDetenerActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnDetener, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 600, 85, -1));

        jLbFilas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLbFilas.setForeground(new java.awt.Color(255, 255, 255));
        jLbFilas.setText("Filas:");
        getContentPane().add(jLbFilas, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 30, -1, 23));

        jTxtNumFilas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTxtNumFilas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jTxtNumFilas, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 30, 37, -1));

        jLbColumnas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLbColumnas.setForeground(new java.awt.Color(255, 255, 255));
        jLbColumnas.setText("Columnas:");
        getContentPane().add(jLbColumnas, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 30, -1, 23));

        jTxtNumColumnas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTxtNumColumnas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jTxtNumColumnas, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 30, 37, -1));

        jBtnCrearTablero.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBtnCrearTablero.setText("Crear Tablero");
        jBtnCrearTablero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCrearTableroActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnCrearTablero, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 30, -1, 26));

        jTable.setBackground(new java.awt.Color(255, 102, 51));
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Apellido", "Posicion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable.setOpaque(false);
        jScrollPane1.setViewportView(jTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 70, 320, 210));

        jLbFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/serpientesescaleras/interfazGrafica/images/cave-in-mountain.png"))); // NOI18N
        getContentPane().add(jLbFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 1012, -1));

        jMenuBar1.setBackground(new java.awt.Color(160, 125, 75));
        jMenuBar1.setBorder(null);
        jMenuBar1.setBorderPainted(false);

        jMenuIr.setText("Ir a ...");

        jMenuItemInicio.setText("Inicio");
        jMenuItemInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemInicioActionPerformed(evt);
            }
        });
        jMenuIr.add(jMenuItemInicio);

        jMenuItemJugadores.setText("Ver Jugadores");
        jMenuItemJugadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemJugadoresActionPerformed(evt);
            }
        });
        jMenuIr.add(jMenuItemJugadores);

        jMenuBar1.add(jMenuIr);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnLanzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLanzarActionPerformed
        jLbDado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/serpientesescaleras/interfazGrafica/images/dado.gif")));
        jBtnLanzar.setEnabled(false);
        jBtnDetener.setEnabled(true);
    }//GEN-LAST:event_jBtnLanzarActionPerformed

    Random rnd = new Random();
    private void jBtnDetenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnDetenerActionPerformed
        int dado = rnd.nextInt(6);
        if (dado==0) {
            jLbDado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/serpientesescaleras/interfazGrafica/images/Dado1.png")));
        } else if (dado==1) {
            jLbDado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/serpientesescaleras/interfazGrafica/images/Dado2.png")));
        } else if (dado==2) {
            jLbDado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/serpientesescaleras/interfazGrafica/images/Dado3.png")));
        } else if (dado==3) {
            jLbDado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/serpientesescaleras/interfazGrafica/images/Dado4.png")));
        } else if (dado==4) {
            jLbDado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/serpientesescaleras/interfazGrafica/images/Dado5.png")));
        } else if (dado==5) {
            jLbDado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/serpientesescaleras/interfazGrafica/images/Dado6.png")));
        }
        jBtnLanzar.setEnabled(true);
        jBtnDetener.setEnabled(false);
    }//GEN-LAST:event_jBtnDetenerActionPerformed

    private void jMenuItemInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemInicioActionPerformed
        Inicio inicio = new Inicio();
        inicio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItemInicioActionPerformed

    private void jMenuItemJugadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemJugadoresActionPerformed
        JugadoresFrm tabla = new JugadoresFrm();
        tabla.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItemJugadoresActionPerformed

    private void jBtnCrearTableroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCrearTableroActionPerformed
        Tablero tablero = new Tablero(jPanel);
        tablero.crearMatriz(Integer.parseInt(jTxtNumFilas.getText()), Integer.parseInt(jTxtNumColumnas.getText()));
    }//GEN-LAST:event_jBtnCrearTableroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnCrearTablero;
    private javax.swing.JButton jBtnDetener;
    private javax.swing.JButton jBtnLanzar;
    private javax.swing.JLabel jLbColumnas;
    private javax.swing.JLabel jLbDado;
    private javax.swing.JLabel jLbFilas;
    private javax.swing.JLabel jLbFondo;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuIr;
    private javax.swing.JMenuItem jMenuItemInicio;
    private javax.swing.JMenuItem jMenuItemJugadores;
    private javax.swing.JPanel jPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField jTxtNumColumnas;
    private javax.swing.JTextField jTxtNumFilas;
    // End of variables declaration//GEN-END:variables
}
