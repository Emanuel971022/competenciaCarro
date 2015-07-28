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
 *
 * @author Emanuel Martinez Pinzon
 */
public class consultasPanel extends javax.swing.JPanel {

    private Competencia competencia;
    
    /**
     * Creates new form consultasPanel
     * @param competencia
     */
    public consultasPanel(Competencia competencia) {
        this.competencia = competencia;
        
        initComponents();
        llenarcombos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAInfo = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        cmbRangoModelos = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cmbPlacaMostrarPremios = new javax.swing.JComboBox();
        cmdMostrarCarrosporModelos = new javax.swing.JButton();
        cmdMostrarPremios = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cmbPlacaMostrarPropietario = new javax.swing.JComboBox();
        cmbAñoMostrarPropietario = new javax.swing.JComboBox();
        cmdConsultarPropietarios = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cmbAñoPropietariosGanadores = new javax.swing.JComboBox();
        cmdMostrarPropietariosGanadores = new javax.swing.JButton();
        txtEventoPropietariosGanadores = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtPropietarioMostrarsusPremios = new javax.swing.JTextField();
        cmdMostrarPremiosPropietario = new javax.swing.JButton();
        cmdMostrarTodo = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 255));

        jLabel1.setFont(new java.awt.Font("DejaVu Sans Mono", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Consultas al sistema");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Realizar consultas en el sistema");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Mostrar carros por modelo");

        txtAInfo.setColumns(20);
        txtAInfo.setRows(5);
        txtAInfo.setEnabled(false);
        jScrollPane1.setViewportView(txtAInfo);

        jLabel4.setText("Modelo: ");

        cmbRangoModelos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2014-2012", "2011-2009", "2008-2006", "2005-Menor" }));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Mostrar premios del carro");

        jLabel6.setText("Placa: ");

        cmdMostrarCarrosporModelos.setText("Mostrar");
        cmdMostrarCarrosporModelos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMostrarCarrosporModelosActionPerformed(evt);
            }
        });

        cmdMostrarPremios.setText("Mostrar");
        cmdMostrarPremios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMostrarPremiosActionPerformed(evt);
            }
        });

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Consultar propietario");

        jLabel8.setText("Placa: ");

        jLabel9.setText("Año: ");

        cmbAñoMostrarPropietario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015" }));

        cmdConsultarPropietarios.setText("Mostrar");
        cmdConsultarPropietarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdConsultarPropietariosActionPerformed(evt);
            }
        });

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Propietarios de un evento ganador");

        jLabel11.setText("Evento: ");

        jLabel12.setText("Año: ");

        cmbAñoPropietariosGanadores.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015" }));

        cmdMostrarPropietariosGanadores.setText("Mostrar");
        cmdMostrarPropietariosGanadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMostrarPropietariosGanadoresActionPerformed(evt);
            }
        });

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Premios de un propietario");

        jLabel14.setText("Propietario: ");

        cmdMostrarPremiosPropietario.setText("Mostrar");
        cmdMostrarPremiosPropietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMostrarPremiosPropietarioActionPerformed(evt);
            }
        });

        cmdMostrarTodo.setText("Mostrar todo");
        cmdMostrarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMostrarTodoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(6, 6, 6)
                                                    .addComponent(cmdMostrarTodo)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(cmdMostrarPremiosPropietario))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel14)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(txtPropietarioMostrarsusPremios, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(cmbRangoModelos, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(cmdMostrarCarrosporModelos))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(cmbPlacaMostrarPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addComponent(cmbAñoMostrarPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(cmdConsultarPropietarios))))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(cmbPlacaMostrarPremios, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(cmdMostrarPremios))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addComponent(cmbAñoPropietariosGanadores, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(cmdMostrarPropietariosGanadores))
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addComponent(txtEventoPropietariosGanadores)
                                                                .addGap(82, 82, 82))))))
                                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(6, 6, 6))))
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cmbRangoModelos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmdMostrarCarrosporModelos))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cmbPlacaMostrarPremios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmdMostrarPremios))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(cmbPlacaMostrarPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(cmbAñoMostrarPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmdConsultarPropietarios))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtEventoPropietariosGanadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(cmbAñoPropietariosGanadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmdMostrarPropietariosGanadores))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txtPropietarioMostrarsusPremios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmdMostrarPremiosPropietario)
                            .addComponent(cmdMostrarTodo))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmdMostrarCarrosporModelosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMostrarCarrosporModelosActionPerformed
        String rango = cmbRangoModelos.getSelectedItem().toString();
        
        txtAInfo.setText("Carros de modelo entre "+rango+"\n"
                +competencia.imprimirCarrosParaUnRango(rango));
    }//GEN-LAST:event_cmdMostrarCarrosporModelosActionPerformed

    private void cmdMostrarPremiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMostrarPremiosActionPerformed
        String placa = cmbPlacaMostrarPremios.getSelectedItem().toString();
        
        txtAInfo.setText("Premios obtenidos por el carro - Placa: "+placa+"\n"
                +competencia.imprimirPremiosCarro(placa));
    }//GEN-LAST:event_cmdMostrarPremiosActionPerformed

    private void cmdConsultarPropietariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdConsultarPropietariosActionPerformed
        String placa = cmbPlacaMostrarPropietario.getSelectedItem().toString();
        String año = cmbAñoMostrarPropietario.getSelectedItem().toString();
                
        txtAInfo.setText("Propietarios del año "+año+"\n"
                +competencia.imprimirPropietarios(placa, Integer.parseInt(año)));
    }//GEN-LAST:event_cmdConsultarPropietariosActionPerformed

    private void cmdMostrarPropietariosGanadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMostrarPropietariosGanadoresActionPerformed
        String evento = txtEventoPropietariosGanadores.getText();
        String año = cmbAñoPropietariosGanadores.getSelectedItem().toString();
        
        if(evento.isEmpty()){
            Notificacion.alertaError("Sistema", "Debe ingresar todos los datos");
            return;
        }
        
        txtAInfo.setText("Propietarios para el evento "+evento+"\n"
                +competencia.propietarioParaUnaVictoria(evento, Integer.parseInt(año)));
        
        txtEventoPropietariosGanadores.setText("");
    }//GEN-LAST:event_cmdMostrarPropietariosGanadoresActionPerformed

    private void cmdMostrarPremiosPropietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMostrarPremiosPropietarioActionPerformed
        String cc = txtPropietarioMostrarsusPremios.getText();
        
        if(cc.isEmpty()){
            Notificacion.alertaError("Sistema", "Debe ingresar todos los datos");
            return;
        }
        
        txtAInfo.setText("Premios del propietario con CC "+cc+"\n"
                +competencia.premiosdePropietario(cc));
        
        txtPropietarioMostrarsusPremios.setText("");
    }//GEN-LAST:event_cmdMostrarPremiosPropietarioActionPerformed

    private void cmdMostrarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMostrarTodoActionPerformed
        txtAInfo.setText(competencia.recorrerPremios());
    }//GEN-LAST:event_cmdMostrarTodoActionPerformed

    private void llenarcombos(){
        String []nombres = competencia.concatenarplacas().split("~");
        cmbPlacaMostrarPremios.removeAllItems();
        cmbPlacaMostrarPropietario.removeAllItems();
        for(String x: nombres){
            cmbPlacaMostrarPremios.addItem(x);
            cmbPlacaMostrarPropietario.addItem(x);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbAñoMostrarPropietario;
    private javax.swing.JComboBox cmbAñoPropietariosGanadores;
    private javax.swing.JComboBox cmbPlacaMostrarPremios;
    private javax.swing.JComboBox cmbPlacaMostrarPropietario;
    private javax.swing.JComboBox cmbRangoModelos;
    private javax.swing.JButton cmdConsultarPropietarios;
    private javax.swing.JButton cmdMostrarCarrosporModelos;
    private javax.swing.JButton cmdMostrarPremios;
    private javax.swing.JButton cmdMostrarPremiosPropietario;
    private javax.swing.JButton cmdMostrarPropietariosGanadores;
    private javax.swing.JButton cmdMostrarTodo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtAInfo;
    private javax.swing.JTextField txtEventoPropietariosGanadores;
    private javax.swing.JTextField txtPropietarioMostrarsusPremios;
    // End of variables declaration//GEN-END:variables
}
