package ufps.is.poo.vista;

import ufps.is.poo.util.Notificacion;
import ufps.is.poo.negocio.Competencia;

/**
 *
 * @author Emanuel Martínez Pinzón
 */
public class competenciaCarroForm extends javax.swing.JFrame {

    private final Competencia competencia;
    public competenciaCarroForm() {
        initComponents();
        setLocationRelativeTo(null);
        this.competencia = new Competencia();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtPlacaAñadirCarro = new javax.swing.JTextField();
        txtModeloAñadirCarro = new javax.swing.JTextField();
        txtMarcaAñadirCarro = new javax.swing.JTextField();
        cmdAñadirCarro = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtAñoAñadirPremio = new javax.swing.JTextField();
        txtPuestoAñadirPremio = new javax.swing.JTextField();
        txtEventoAñadirPremio = new javax.swing.JTextField();
        cmbCarroAñadirPremio = new javax.swing.JComboBox();
        cmdAñadirPremio = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        cmbModeloMostrarCarro = new javax.swing.JComboBox();
        cmdMostrar = new javax.swing.JButton();
        cmdMostrarPremios = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAInfo = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        cmbPlacaMostrarPremio = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Placa: ");

        jLabel3.setText("Marca: ");

        jLabel4.setText("Modelo: ");

        cmdAñadirCarro.setText("Añadir");
        cmdAñadirCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAñadirCarroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cmdAñadirCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPlacaAñadirCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtModeloAñadirCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMarcaAñadirCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtPlacaAñadirCarro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtMarcaAñadirCarro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtModeloAñadirCarro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdAñadirCarro)
                .addGap(33, 33, 33))
        );

        jTabbedPane1.addTab("Añadir carro", jPanel1);

        jLabel2.setText("Carro: ");

        jLabel5.setText("Año: ");

        jLabel6.setText("Puesto: ");

        jLabel7.setText("Evento: ");

        cmdAñadirPremio.setText("Añadir");
        cmdAñadirPremio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAñadirPremioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cmdAñadirPremio, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtAñoAñadirPremio)
                            .addComponent(txtPuestoAñadirPremio)
                            .addComponent(txtEventoAñadirPremio)
                            .addComponent(cmbCarroAñadirPremio, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbCarroAñadirPremio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtAñoAñadirPremio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtPuestoAñadirPremio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtEventoAñadirPremio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdAñadirPremio)
                .addGap(15, 15, 15))
        );

        jTabbedPane1.addTab("Añadir premios", jPanel2);

        jLabel8.setText("Modelo: ");

        cmbModeloMostrarCarro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2014-2012", "2011-2009", "2008-2006", "2005-Menor" }));

        cmdMostrar.setText("Mostrar");
        cmdMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMostrarActionPerformed(evt);
            }
        });

        cmdMostrarPremios.setText("Mostrar");
        cmdMostrarPremios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMostrarPremiosActionPerformed(evt);
            }
        });

        txtAInfo.setColumns(20);
        txtAInfo.setRows(5);
        jScrollPane1.setViewportView(txtAInfo);

        jLabel9.setText("Placa: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbModeloMostrarCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdMostrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbPlacaMostrarPremio, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdMostrarPremios)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(cmbModeloMostrarCarro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmdMostrar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmdMostrarPremios)
                            .addComponent(jLabel9)
                            .addComponent(cmbPlacaMostrarPremio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdAñadirCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAñadirCarroActionPerformed
        String placa = txtPlacaAñadirCarro.getText();
        String marca = txtMarcaAñadirCarro.getText();
        String modelo = txtModeloAñadirCarro.getText();
        
        if(placa.isEmpty() || marca.isEmpty() || modelo.isEmpty()){
            Notificacion.alertaAtencion("Alerta!!!", "Ingrese todos los datos");
            return;
        }
            
        if(!isNumeric(modelo)){
            Notificacion.alertaAtencion("Alerta!!!", "Debe ingresar un numero de modelo");
            return;
        }
        
        boolean val = competencia.agregarCarro(placa, marca, Integer.parseInt(modelo));
        if(val){
            Notificacion.alertaInformativo("Sistema", "Registro exitoso");
 //           llenarComboPlaca();
        }else
            Notificacion.alertaError("Error", "No se ha podido realizar el registro");
        
        txtPlacaAñadirCarro.setText("");
        txtMarcaAñadirCarro.setText("");
        txtModeloAñadirCarro.setText("");
    }//GEN-LAST:event_cmdAñadirCarroActionPerformed

    private void cmdAñadirPremioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAñadirPremioActionPerformed
        String placa = cmbCarroAñadirPremio.getSelectedItem().toString();
        String anio = txtAñoAñadirPremio.getText();
        String puesto = txtPuestoAñadirPremio.getText();
        String evento = txtEventoAñadirPremio.getText();
        
        if(anio.isEmpty() || puesto.isEmpty() || evento.isEmpty()){
            Notificacion.alertaAtencion("Alerta!!!", "Debe ingresar los datos");
            return;
        }
        
        if(!isNumeric(anio) || !isNumeric(puesto)){
            Notificacion.alertaAtencion("Alerta!!!", "Debe ingresar los números");
            return;
        }
        
        boolean val = competencia.agregarPremioCarro(placa, Integer.parseInt(anio),
                Integer.parseInt(puesto), evento);
        if(val)
            Notificacion.alertaInformativo("Sistema", "Premio agregado con exito");
        else
            Notificacion.alertaError("Error", "Ocurrio un error al realizar el registro");
    }//GEN-LAST:event_cmdAñadirPremioActionPerformed

    private void cmdMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMostrarActionPerformed
        String rango = cmbModeloMostrarCarro.getSelectedItem().toString();
        
        String mens = competencia.imprimirCarrosParaUnRango(rango);
        txtAInfo.setText("Carros de modelo entre "+rango+"\n"+mens);
    }//GEN-LAST:event_cmdMostrarActionPerformed

    private void cmdMostrarPremiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMostrarPremiosActionPerformed
        String placa = cmbPlacaMostrarPremio.getSelectedItem().toString();
        
//        txtAInfo.setText("Premios obtenidos por el carro - Placa: "+placa+"\n"
//                +competencia.imprimirPremiosCarro(placa));
    }//GEN-LAST:event_cmdMostrarPremiosActionPerformed

    public static boolean isNumeric(String num){
        try{
            int num1 = Integer.parseInt(num);
        }catch(NumberFormatException nfe){
            return false;
        }
        
        return true;
    }
    
//    public void llenarComboPlaca(){
//        String placa[] = competencia.concatenarPlacasCarros().split("~");
//        cmbCarroAñadirPremio.removeAllItems();
//        cmbPlacaMostrarPremio.removeAllItems();
//        for(String x: placa){
//            cmbCarroAñadirPremio.addItem(x);
//            cmbPlacaMostrarPremio.addItem(x);
//        }
//    }
    
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
            java.util.logging.Logger.getLogger(competenciaCarroForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(competenciaCarroForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(competenciaCarroForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(competenciaCarroForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new competenciaCarroForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbCarroAñadirPremio;
    private javax.swing.JComboBox cmbModeloMostrarCarro;
    private javax.swing.JComboBox cmbPlacaMostrarPremio;
    private javax.swing.JButton cmdAñadirCarro;
    private javax.swing.JButton cmdAñadirPremio;
    private javax.swing.JButton cmdMostrar;
    private javax.swing.JButton cmdMostrarPremios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea txtAInfo;
    private javax.swing.JTextField txtAñoAñadirPremio;
    private javax.swing.JTextField txtEventoAñadirPremio;
    private javax.swing.JTextField txtMarcaAñadirCarro;
    private javax.swing.JTextField txtModeloAñadirCarro;
    private javax.swing.JTextField txtPlacaAñadirCarro;
    private javax.swing.JTextField txtPuestoAñadirPremio;
    // End of variables declaration//GEN-END:variables
}
