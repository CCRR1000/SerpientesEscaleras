/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serpientesescaleras.interfazGrafica;

import java.awt.Image;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import serpientesescaleras.jugadores.Jugador;
import serpientesescaleras.jugadores.ManejoJugadores;

/**
 *
 * @author CIROSS
 */
public class JugadoresFrm extends javax.swing.JFrame {

    private ManejoJugadores manejoJ = new ManejoJugadores();
    private ArrayList<Jugador> listaJugadores;

    DefaultTableModel modeloTabla;

    /**
     * Creates new form JugadoresFrm
     */
    public JugadoresFrm() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        listaJugadores = manejoJ.getJugadores();
        
        ImageIcon icono = new ImageIcon(getClass().getResource("/serpientesescaleras/interfazGrafica/images/Serpiente.png"));
        setIconImage(icono.getImage());
        
        ImageIcon img = new ImageIcon(getClass().getResource("/serpientesescaleras/interfazGrafica/images/cave-in-mountain.png"));
        jLbFondo.setIcon(new ImageIcon(img.getImage().getScaledInstance(this.jLbFondo.getWidth(), this.jLbFondo.getHeight(), Image.SCALE_SMOOTH)));
        
        inicializarTabla();
    }
    
    private void inicializarTabla() {

        modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("ID");
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Apellido");
        modeloTabla.addColumn("P. Jugadas");
        modeloTabla.addColumn("P. Ganadas");
        modeloTabla.addColumn("P. Perdidas");

        this.jTable.setModel(modeloTabla);
        mostrarTabla();
    }    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelJugadores = new javax.swing.JPanel();
        jLbIngresarJugador = new javax.swing.JLabel();
        jLbNombre = new javax.swing.JLabel();
        jLbApellido = new javax.swing.JLabel();
        jTxFiNombre = new javax.swing.JTextField();
        jTxFiApellido = new javax.swing.JTextField();
        jBtnIngresar = new javax.swing.JButton();
        jLbListado = new javax.swing.JLabel();
        jScrollPane = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jLbFondo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuIr = new javax.swing.JMenu();
        jMenuItemInicio = new javax.swing.JMenuItem();
        jMenuItemPartida = new javax.swing.JMenuItem();
        jMenuOrdenar = new javax.swing.JMenu();
        jMenuItemId = new javax.swing.JMenuItem();
        jMenuItemNombre = new javax.swing.JMenuItem();
        jMenuItemApellido = new javax.swing.JMenuItem();
        jMenuItemJugadas = new javax.swing.JMenuItem();
        jMenuItemGanadas = new javax.swing.JMenuItem();
        jMenuItemPerdidas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Serpientes y Escaleras");

        jPanelJugadores.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLbIngresarJugador.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLbIngresarJugador.setForeground(new java.awt.Color(255, 255, 255));
        jLbIngresarJugador.setText("INGRESAR JUGADOR");
        jPanelJugadores.add(jLbIngresarJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        jLbNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLbNombre.setForeground(new java.awt.Color(255, 255, 255));
        jLbNombre.setText("Ingrese el Nombre:");
        jLbNombre.setPreferredSize(new java.awt.Dimension(116, 60));
        jPanelJugadores.add(jLbNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, 30));

        jLbApellido.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLbApellido.setForeground(new java.awt.Color(255, 255, 255));
        jLbApellido.setText("Ingrese el Apellido:");
        jLbApellido.setPreferredSize(new java.awt.Dimension(116, 60));
        jPanelJugadores.add(jLbApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, 30));

        jTxFiNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanelJugadores.add(jTxFiNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 330, 30));

        jTxFiApellido.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanelJugadores.add(jTxFiApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 330, 30));

        jBtnIngresar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jBtnIngresar.setText("Ingresar");
        jBtnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnIngresarActionPerformed(evt);
            }
        });
        jPanelJugadores.add(jBtnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, -1, -1));

        jLbListado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLbListado.setForeground(new java.awt.Color(255, 255, 255));
        jLbListado.setText("Listado de Jugadores:");
        jPanelJugadores.add(jLbListado, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Apellido", "P. Jugadas", "P. Ganadas", "P. Perdidas"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane.setViewportView(jTable);

        jPanelJugadores.add(jScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 460, 120));

        jLbFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/serpientesescaleras/interfazGrafica/images/cave-in-mountain.png"))); // NOI18N
        jPanelJugadores.add(jLbFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, -4, 560, 440));

        jMenuIr.setText("Ir a ...");

        jMenuItemInicio.setText("Inicio");
        jMenuItemInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemInicioActionPerformed(evt);
            }
        });
        jMenuIr.add(jMenuItemInicio);

        jMenuItemPartida.setText("Partida");
        jMenuItemPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPartidaActionPerformed(evt);
            }
        });
        jMenuIr.add(jMenuItemPartida);

        jMenuBar1.add(jMenuIr);

        jMenuOrdenar.setText("Ordenar");

        jMenuItemId.setText("Por ID");
        jMenuItemId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemIdActionPerformed(evt);
            }
        });
        jMenuOrdenar.add(jMenuItemId);

        jMenuItemNombre.setText("Por Nombre");
        jMenuItemNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNombreActionPerformed(evt);
            }
        });
        jMenuOrdenar.add(jMenuItemNombre);

        jMenuItemApellido.setText("Por Apellido");
        jMenuItemApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemApellidoActionPerformed(evt);
            }
        });
        jMenuOrdenar.add(jMenuItemApellido);

        jMenuItemJugadas.setText("Por Partidas Jugadas");
        jMenuItemJugadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemJugadasActionPerformed(evt);
            }
        });
        jMenuOrdenar.add(jMenuItemJugadas);

        jMenuItemGanadas.setText("Por Partidas Ganadas");
        jMenuItemGanadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemGanadasActionPerformed(evt);
            }
        });
        jMenuOrdenar.add(jMenuItemGanadas);

        jMenuItemPerdidas.setText("Por Partidas Perdidas");
        jMenuItemPerdidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPerdidasActionPerformed(evt);
            }
        });
        jMenuOrdenar.add(jMenuItemPerdidas);

        jMenuBar1.add(jMenuOrdenar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelJugadores, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelJugadores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemInicioActionPerformed
        Inicio inicio = new Inicio();
        inicio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItemInicioActionPerformed

    private void jMenuItemPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPartidaActionPerformed
        Juego partida = new Juego();
        partida.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItemPartidaActionPerformed

    private void jMenuItemIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemIdActionPerformed
        manejoJ.ordenarPor(0);
        actualizarTabla();
    }//GEN-LAST:event_jMenuItemIdActionPerformed

    private void jMenuItemNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNombreActionPerformed
        manejoJ.ordenarPor(1);
        actualizarTabla();
    }//GEN-LAST:event_jMenuItemNombreActionPerformed

    private void jMenuItemApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemApellidoActionPerformed
        manejoJ.ordenarPor(2);
        actualizarTabla();
    }//GEN-LAST:event_jMenuItemApellidoActionPerformed

    private void jMenuItemJugadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemJugadasActionPerformed
        manejoJ.ordenarPor(3);
        actualizarTabla();
    }//GEN-LAST:event_jMenuItemJugadasActionPerformed

    private void jMenuItemGanadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGanadasActionPerformed
        manejoJ.ordenarPor(4);
        actualizarTabla();
    }//GEN-LAST:event_jMenuItemGanadasActionPerformed

    private void jMenuItemPerdidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPerdidasActionPerformed
        manejoJ.ordenarPor(5);
        actualizarTabla();
    }//GEN-LAST:event_jMenuItemPerdidasActionPerformed

    private void jBtnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIngresarActionPerformed

        if (jTxFiNombre.getText().equals("") || jTxFiApellido.getText().equals("")) {
            JOptionPane.showMessageDialog(jPanelJugadores,"Error. Debe llenar los dos campos de informacion");
        } else {
            manejoJ.ingresarJugador(jTxFiNombre.getText(), jTxFiApellido.getText());
            jTxFiNombre.setText("");
            jTxFiApellido.setText("");

            agregarATabla();
        }

    }//GEN-LAST:event_jBtnIngresarActionPerformed

        public void agregarATabla() {

        Object[] filaJugador = new Object[6];
        filaJugador[0] = listaJugadores.get(listaJugadores.size() - 1).getId();
        filaJugador[1] = listaJugadores.get(listaJugadores.size() - 1).getNombre();
        filaJugador[2] = listaJugadores.get(listaJugadores.size() - 1).getApellido();
        filaJugador[3] = listaJugadores.get(listaJugadores.size() - 1).getPartidasJugadas();
        filaJugador[4] = listaJugadores.get(listaJugadores.size() - 1).getPartidasGanadas();
        filaJugador[5] = listaJugadores.get(listaJugadores.size() - 1).getPartidasPerdidas();
        modeloTabla.addRow(filaJugador);
    }

    public void mostrarTabla() {

        Object[] filaJugador = new Object[6];

        for (int i = 0; i < listaJugadores.size(); i++) {

            filaJugador[0] = listaJugadores.get(i).getId();
            filaJugador[1] = listaJugadores.get(i).getNombre();
            filaJugador[2] = listaJugadores.get(i).getApellido();
            filaJugador[3] = listaJugadores.get(i).getPartidasJugadas();
            filaJugador[4] = listaJugadores.get(i).getPartidasGanadas();
            filaJugador[5] = listaJugadores.get(i).getPartidasPerdidas();

            modeloTabla.addRow(filaJugador);
        }

    }
    
    public void actualizarTabla() {
        for (int i = 0; i < modeloTabla.getRowCount(); i++) {
            modeloTabla.setValueAt(listaJugadores.get(i).getId(), i, 0);
            modeloTabla.setValueAt(listaJugadores.get(i).getNombre(), i, 1);
            modeloTabla.setValueAt(listaJugadores.get(i).getApellido(), i, 2);
            modeloTabla.setValueAt(listaJugadores.get(i).getPartidasJugadas(), i, 3);
            modeloTabla.setValueAt(listaJugadores.get(i).getPartidasGanadas(), i, 4);
            modeloTabla.setValueAt(listaJugadores.get(i).getPartidasPerdidas(), i, 5);
            
        }

    }
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnIngresar;
    private javax.swing.JLabel jLbApellido;
    private javax.swing.JLabel jLbFondo;
    private javax.swing.JLabel jLbIngresarJugador;
    private javax.swing.JLabel jLbListado;
    private javax.swing.JLabel jLbNombre;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuIr;
    private javax.swing.JMenuItem jMenuItemApellido;
    private javax.swing.JMenuItem jMenuItemGanadas;
    private javax.swing.JMenuItem jMenuItemId;
    private javax.swing.JMenuItem jMenuItemInicio;
    private javax.swing.JMenuItem jMenuItemJugadas;
    private javax.swing.JMenuItem jMenuItemNombre;
    private javax.swing.JMenuItem jMenuItemPartida;
    private javax.swing.JMenuItem jMenuItemPerdidas;
    private javax.swing.JMenu jMenuOrdenar;
    private javax.swing.JPanel jPanelJugadores;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField jTxFiApellido;
    private javax.swing.JTextField jTxFiNombre;
    // End of variables declaration//GEN-END:variables
}
