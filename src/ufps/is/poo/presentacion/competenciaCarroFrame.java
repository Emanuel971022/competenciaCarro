/*
 * Copyright (C) 2015 Emanuel Martinez Pinzon
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package ufps.is.poo.presentacion;

import javax.swing.JPanel;
import ufps.is.poo.negocio.Competencia;

/**
 * Este es el formulario principal de la interfaz grafica de la aplicacion.
 * @author Emanuel Martinez Pinzon
 */
public class competenciaCarroFrame extends javax.swing.JFrame {

    private Competencia competenciaCarro;
    private JPanel bienvenida,
            registrarCarro, registrarPremio, registrarPropietario,
            modificarCarro, modificarPremio, modificarPropietario,
            eliminarCarro, eliminarPremio, eliminarPropietario;
    
    public competenciaCarroFrame() {
        initComponents();
        competenciaCarro = new Competencia();
        jmAñadirCarroActionPerformed(null);
        setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jmBienvenida = new javax.swing.JMenuItem();
        jmSalir = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jmAñadirCarro = new javax.swing.JMenuItem();
        jmAñadirPremio = new javax.swing.JMenuItem();
        jmAñadirPropietario = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jmModificarCarro = new javax.swing.JMenuItem();
        jmModificarPremio = new javax.swing.JMenuItem();
        jmModificarPropietario = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jmEliminarCarro = new javax.swing.JMenuItem();
        jmEliminarPremio = new javax.swing.JMenuItem();
        jmEliminarPropietario = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        jMenuItem4.setText("jMenuItem4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Competencia Carro");
        setResizable(false);

        jMenu2.setText("Inicio");

        jmBienvenida.setText("Bienvenida");
        jmBienvenida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmBienvenidaActionPerformed(evt);
            }
        });
        jMenu2.add(jmBienvenida);

        jmSalir.setText("Salir");
        jmSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmSalirActionPerformed(evt);
            }
        });
        jMenu2.add(jmSalir);

        jMenuBar1.add(jMenu2);

        jMenu1.setText("Acciones");

        jMenu5.setText("Registrar");

        jmAñadirCarro.setText("Añadir carro");
        jmAñadirCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmAñadirCarroActionPerformed(evt);
            }
        });
        jMenu5.add(jmAñadirCarro);

        jmAñadirPremio.setText("Añadir premio");
        jmAñadirPremio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmAñadirPremioActionPerformed(evt);
            }
        });
        jMenu5.add(jmAñadirPremio);

        jmAñadirPropietario.setText("Añadir propietario");
        jmAñadirPropietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmAñadirPropietarioActionPerformed(evt);
            }
        });
        jMenu5.add(jmAñadirPropietario);

        jMenu1.add(jMenu5);

        jMenu6.setText("Actualizar");

        jmModificarCarro.setText("Modificar carro");
        jmModificarCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmModificarCarroActionPerformed(evt);
            }
        });
        jMenu6.add(jmModificarCarro);

        jmModificarPremio.setText("Modificar premio");
        jmModificarPremio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmModificarPremioActionPerformed(evt);
            }
        });
        jMenu6.add(jmModificarPremio);

        jmModificarPropietario.setText("Modificar propietario");
        jmModificarPropietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmModificarPropietarioActionPerformed(evt);
            }
        });
        jMenu6.add(jmModificarPropietario);

        jMenu1.add(jMenu6);

        jMenu7.setText("Eliminar");

        jmEliminarCarro.setText("Eliminar carro");
        jmEliminarCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmEliminarCarroActionPerformed(evt);
            }
        });
        jMenu7.add(jmEliminarCarro);

        jmEliminarPremio.setText("Eliminar premio");
        jmEliminarPremio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmEliminarPremioActionPerformed(evt);
            }
        });
        jMenu7.add(jmEliminarPremio);

        jmEliminarPropietario.setText("Eliminar propietario");
        jmEliminarPropietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmEliminarPropietarioActionPerformed(evt);
            }
        });
        jMenu7.add(jmEliminarPropietario);

        jMenu1.add(jMenu7);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Consultas");
        jMenuBar1.add(jMenu3);

        jMenu4.setText("Ayuda");
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmAñadirCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmAñadirCarroActionPerformed
        remover();
        registrarCarro = new registrarCarroPanel(competenciaCarro);
        getContentPane().add(registrarCarro);
        pack();
    }//GEN-LAST:event_jmAñadirCarroActionPerformed

    private void jmSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jmSalirActionPerformed

    private void jmAñadirPremioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmAñadirPremioActionPerformed
        remover();
        registrarPremio = new registrarPremioPanel(competenciaCarro);
        getContentPane().add(registrarPremio);
        pack();
    }//GEN-LAST:event_jmAñadirPremioActionPerformed

    private void jmAñadirPropietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmAñadirPropietarioActionPerformed
        remover();
        registrarPropietario = new registrarPropietarioPanel(competenciaCarro);
        getContentPane().add(registrarPropietario);
        pack();
    }//GEN-LAST:event_jmAñadirPropietarioActionPerformed

    private void jmModificarCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmModificarCarroActionPerformed
        remover();
        modificarCarro = new modificarCarroPanel(competenciaCarro);
        getContentPane().add(modificarCarro);
        pack();
    }//GEN-LAST:event_jmModificarCarroActionPerformed

    private void jmModificarPremioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmModificarPremioActionPerformed
        remover();
        modificarPremio = new modificarPremioPanel(competenciaCarro);
        getContentPane().add(modificarPremio);
        pack();
    }//GEN-LAST:event_jmModificarPremioActionPerformed

    private void jmModificarPropietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmModificarPropietarioActionPerformed
        remover();
        modificarPropietario = new modificarPropietarioPanel(competenciaCarro);
        getContentPane().add(modificarPropietario);
        pack();
    }//GEN-LAST:event_jmModificarPropietarioActionPerformed

    private void jmBienvenidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmBienvenidaActionPerformed
        remover();
        bienvenida = new bienvenidaPanel();
        getContentPane().add(bienvenida);
        pack();
    }//GEN-LAST:event_jmBienvenidaActionPerformed

    private void jmEliminarCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmEliminarCarroActionPerformed
        remover();
        eliminarCarro = new eliminarCarroPanel(competenciaCarro);
        getContentPane().add(eliminarCarro);
        pack();
    }//GEN-LAST:event_jmEliminarCarroActionPerformed

    private void jmEliminarPremioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmEliminarPremioActionPerformed
        remover();
        eliminarPremio = new eliminarPremioPanel(competenciaCarro);
        getContentPane().add(eliminarPremio);
        pack();
    }//GEN-LAST:event_jmEliminarPremioActionPerformed

    private void jmEliminarPropietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmEliminarPropietarioActionPerformed
        remover();
        eliminarPropietario = new eliminarPropietarioPanel(competenciaCarro);
        getContentPane().add(eliminarPropietario);
        pack();
    }//GEN-LAST:event_jmEliminarPropietarioActionPerformed

    private void remover(){
        if(bienvenida != null)
            remove(bienvenida);
        
        if(registrarCarro != null)
            remove(registrarCarro);
        if(registrarPremio != null)
            remove(registrarPremio);
        if(registrarPropietario != null)
            remove(registrarPropietario);
        
        if(modificarCarro != null)
            remove(modificarCarro);
        if(modificarPremio != null)
            remove(modificarPremio);
        if(modificarPropietario != null)
            remove(modificarPropietario);
        
        if(eliminarCarro != null)
            remove(eliminarCarro);
        if(eliminarPremio != null)
            remove(eliminarPremio);
        if(eliminarPropietario != null)
            remove(eliminarPropietario);
    }
    
    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(competenciaCarroFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(competenciaCarroFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(competenciaCarroFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(competenciaCarroFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new competenciaCarroFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JMenuItem jmAñadirCarro;
    private javax.swing.JMenuItem jmAñadirPremio;
    private javax.swing.JMenuItem jmAñadirPropietario;
    private javax.swing.JMenuItem jmBienvenida;
    private javax.swing.JMenuItem jmEliminarCarro;
    private javax.swing.JMenuItem jmEliminarPremio;
    private javax.swing.JMenuItem jmEliminarPropietario;
    private javax.swing.JMenuItem jmModificarCarro;
    private javax.swing.JMenuItem jmModificarPremio;
    private javax.swing.JMenuItem jmModificarPropietario;
    private javax.swing.JMenuItem jmSalir;
    // End of variables declaration//GEN-END:variables
}