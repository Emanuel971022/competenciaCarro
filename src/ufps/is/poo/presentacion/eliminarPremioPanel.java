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

import ufps.is.poo.negocio.Competencia;
import ufps.is.poo.util.Notificacion;

/**
 * Este es el panel para eliminar premios de la interfaz grafica de la aplicacion.
 * @author Emanuel Martinez Pinzon
 */
public class eliminarPremioPanel extends javax.swing.JPanel {

    private Competencia competencia;
    
    public eliminarPremioPanel(Competencia competencia) {
        this.competencia = competencia;
        initComponents();
        llenarCombos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmbPlacaEliminarPremio = new javax.swing.JComboBox();
        cmbPremioEliminarPremio = new javax.swing.JComboBox();
        cmdEliminarPremios = new javax.swing.JButton();
        cmdEliminarTodosPremios = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setFont(new java.awt.Font("DejaVu Sans Mono", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Eliminar premio");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Elimina un premio del sistema");

        jLabel3.setText("Placa: ");

        jLabel4.setText("Premio: ");

        cmbPlacaEliminarPremio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPlacaEliminarPremioActionPerformed(evt);
            }
        });

        cmdEliminarPremios.setText("Eliminar");
        cmdEliminarPremios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdEliminarPremiosActionPerformed(evt);
            }
        });

        cmdEliminarTodosPremios.setText("Eliminar todos");
        cmdEliminarTodosPremios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdEliminarTodosPremiosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbPlacaEliminarPremio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbPremioEliminarPremio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cmdEliminarTodosPremios)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                        .addComponent(cmdEliminarPremios)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmbPlacaEliminarPremio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbPremioEliminarPremio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdEliminarPremios)
                    .addComponent(cmdEliminarTodosPremios))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmdEliminarPremiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdEliminarPremiosActionPerformed
        String placa = cmbPlacaEliminarPremio.getSelectedItem().toString();
        String premio = cmbPremioEliminarPremio.getSelectedItem().toString();
        if(competencia.borrarPremio(placa, premio)){
            Notificacion.alertaInformativo("Sistema", "Premio eliminado con exito");
            cmbPlacaEliminarPremio.setSelectedIndex(0);
        }else
            Notificacion.alertaAtencion("Sistema", "Algo no se ha hecho bien y no se han efectuado cambios");
    }//GEN-LAST:event_cmdEliminarPremiosActionPerformed

    private void cmbPlacaEliminarPremioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPlacaEliminarPremioActionPerformed
        String placa = cmbPlacaEliminarPremio.getSelectedItem().toString();
        String[] premios = competencia.concatenarPremios(placa).split("~");
        cmbPremioEliminarPremio.removeAllItems();
        for(String x: premios)
            cmbPremioEliminarPremio.addItem(x);
    }//GEN-LAST:event_cmbPlacaEliminarPremioActionPerformed

    private void cmdEliminarTodosPremiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdEliminarTodosPremiosActionPerformed
        String placa = cmbPlacaEliminarPremio.getSelectedItem().toString();
        if(competencia.borrarTodosPremios(placa)){
            Notificacion.alertaInformativo("Sistema", "Se han borrado todos los premios de este carro.");
            cmbPlacaEliminarPremio.setSelectedIndex(0);
        }
    }//GEN-LAST:event_cmdEliminarTodosPremiosActionPerformed

    private void llenarCombos(){
        String []nombres = competencia.concatenarplacas().split("~");
        cmbPlacaEliminarPremio.removeAllItems();
        for(String x: nombres)
                cmbPlacaEliminarPremio.addItem(x);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbPlacaEliminarPremio;
    private javax.swing.JComboBox cmbPremioEliminarPremio;
    private javax.swing.JButton cmdEliminarPremios;
    private javax.swing.JButton cmdEliminarTodosPremios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
