package ufps.is.poo.presentacion;

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
        cmdAñadirPremio.setEnabled(false);
        cmdAñadirPropietario.setEnabled(false);
        cmdConnsultarPropietario.setEnabled(false);
        cmdMostrarPremios.setEnabled(false);
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
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        cmbPlacaAñadirPropietario = new javax.swing.JComboBox();
        txtNombreAñadirPropietario = new javax.swing.JTextField();
        txtDireccionAñadirPropietario = new javax.swing.JTextField();
        txtCiudadAñadirPropietario = new javax.swing.JTextField();
        txtTelefonoAñadirPropietario = new javax.swing.JTextField();
        cmdAñadirPropietario = new javax.swing.JButton();
        txtCCAñadirPropietario = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        cmbAñoAñadirPropietario = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAInfo = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        cmbAñoMostrarPropietario = new javax.swing.JComboBox();
        cmdConnsultarPropietario = new javax.swing.JButton();
        cmbPlacaMostrarPremio = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cmbModeloMostrarCarro = new javax.swing.JComboBox();
        cmdMostrar = new javax.swing.JButton();
        cmdMostrarPremios = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        cmbPlacaMostrarPropietario = new javax.swing.JComboBox();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Competencia de Carros");
        setResizable(false);

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
                .addContainerGap(82, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
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
                .addContainerGap(90, Short.MAX_VALUE))
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
                .addGap(26, 26, 26)
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
                .addContainerGap(74, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
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
                .addGap(38, 38, 38))
        );

        jTabbedPane1.addTab("Añadir premios", jPanel2);

        jLabel10.setText("Placa: ");

        jLabel11.setText("Nombre: ");

        jLabel12.setText("CC: ");

        jLabel13.setText("Dirección: ");

        jLabel14.setText("Ciudad: ");

        jLabel15.setText("Telefono: ");

        cmdAñadirPropietario.setText("Añadir");
        cmdAñadirPropietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAñadirPropietarioActionPerformed(evt);
            }
        });

        jLabel16.setText("Año: ");

        cmbAñoAñadirPropietario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cmdAñadirPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtDireccionAñadirPropietario, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbPlacaAñadirPropietario, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNombreAñadirPropietario, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCiudadAñadirPropietario)
                            .addComponent(txtTelefonoAñadirPropietario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                            .addComponent(txtCCAñadirPropietario, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbAñoAñadirPropietario, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(29, 29, 29))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cmbPlacaAñadirPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtNombreAñadirPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtCCAñadirPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtDireccionAñadirPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtCiudadAñadirPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtTelefonoAñadirPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(cmbAñoAñadirPropietario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cmdAñadirPropietario)
                .addGap(39, 39, 39))
        );

        jTabbedPane1.addTab("Añadir propietario", jPanel3);

        txtAInfo.setColumns(20);
        txtAInfo.setRows(5);
        txtAInfo.setEnabled(false);
        jScrollPane1.setViewportView(txtAInfo);

        jLabel17.setText("Placa: ");

        jLabel18.setText("Año: ");

        cmbAñoMostrarPropietario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015" }));

        cmdConnsultarPropietario.setText("Consultar");
        cmdConnsultarPropietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdConnsultarPropietarioActionPerformed(evt);
            }
        });

        jLabel9.setText("Placa: ");

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

        jLabel19.setText("Consultar propietario");

        jLabel20.setText("Mostrar premios del carro");

        jLabel21.setText("Mostrar carros por modelo");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbPlacaMostrarPremio, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(cmdMostrarPremios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmbAñoMostrarPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmdConnsultarPropietario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbModeloMostrarCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmdMostrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel20))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cmbPlacaMostrarPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel21)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cmbModeloMostrarCarro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdMostrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdMostrarPremios)
                    .addComponent(jLabel9)
                    .addComponent(cmbPlacaMostrarPremio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(cmbPlacaMostrarPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(cmbAñoMostrarPropietario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdConnsultarPropietario))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 11, Short.MAX_VALUE))
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
            llenarComboPlaca();
            habilitarBotones();
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
        
        boolean val;
        try{
            val = competencia.registrarPremioACarro(placa, Integer.parseInt(anio),
                    Integer.parseInt(puesto), evento);
        }catch(Exception ex) {
            Notificacion.alertaError("Error", "Ya existe un premio de ese evento con esa misma fecha");
            return;
        }
        
        if(val)
            Notificacion.alertaInformativo("Sistema", "Premio agregado con exito");
        else
            Notificacion.alertaError("Error", "Ocurrio un error al realizar el registro");
        
        txtAñoAñadirPremio.setText("");
        txtEventoAñadirPremio.setText("");
        txtPuestoAñadirPremio.setText("");
    }//GEN-LAST:event_cmdAñadirPremioActionPerformed

    private void cmdMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMostrarActionPerformed
        String rango = cmbModeloMostrarCarro.getSelectedItem().toString();
        
        String mens = competencia.imprimirCarrosParaUnRango(rango);
        txtAInfo.setText("Carros de modelo entre "+rango+"\n"+mens);
    }//GEN-LAST:event_cmdMostrarActionPerformed

    private void cmdMostrarPremiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMostrarPremiosActionPerformed
        String placa = cmbPlacaMostrarPremio.getSelectedItem().toString();
        
        String mens = competencia.imprimirPremiosCarro(placa);
        txtAInfo.setText("Premios obtenidos por el carro - Placa: "+placa+"\n"+mens);
    }//GEN-LAST:event_cmdMostrarPremiosActionPerformed

    private void cmdAñadirPropietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAñadirPropietarioActionPerformed
        String placa = cmbPlacaAñadirPropietario.getSelectedItem().toString();
        String nombre = txtNombreAñadirPropietario.getText();
        String cc = txtCCAñadirPropietario.getText();
        String direccion = txtDireccionAñadirPropietario.getText();
        String ciudad = txtCiudadAñadirPropietario.getText();
        String telefono = txtTelefonoAñadirPropietario.getText();
        String año = cmbAñoAñadirPropietario.getSelectedItem().toString();
        
        if(nombre.isEmpty() || cc.isEmpty() || direccion.isEmpty() || ciudad.isEmpty()
                || telefono.isEmpty()){
            Notificacion.alertaAtencion("Atención", "Debe ingresar los datos");
            return;
        }
        
        if(!isNumeric(cc) || !isNumeric(telefono)){
            Notificacion.alertaError("Error", "Debe ingresar números en cc y telefono");
            return;
        }
        
        boolean value;
        try {
            value = competencia.agregarPropietario(placa, Integer.parseInt(año),
                    nombre, cc, direccion, ciudad, telefono);
        } catch (Exception ex) {
            Notificacion.alertaError("Error", "Ya existe un propietario con ese CC");
            return;
        }
        
        if(value)
            Notificacion.alertaInformativo("Sistema", "Propietario añadido con exito");
        else
            Notificacion.alertaError("Error", "Error en el registro");
        
        txtNombreAñadirPropietario.setText("");
        txtCCAñadirPropietario.setText("");
        txtDireccionAñadirPropietario.setText("");
        txtCiudadAñadirPropietario.setText("");
        txtTelefonoAñadirPropietario.setText("");
    }//GEN-LAST:event_cmdAñadirPropietarioActionPerformed

    private void cmdConnsultarPropietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdConnsultarPropietarioActionPerformed
        String placa = cmbPlacaMostrarPropietario.getSelectedItem().toString();
        String año = cmbAñoMostrarPropietario.getSelectedItem().toString();
        
        String men = competencia.imprimirPropietarios(placa, Integer.parseInt(año));
        
        txtAInfo.setText("Propietarios del año "+año+"\n"+men);
    }//GEN-LAST:event_cmdConnsultarPropietarioActionPerformed

    public static boolean isNumeric(String num){
        try{
            Long.parseLong(num);
        }catch(NumberFormatException nfe){
            return false;
        }
        
        return true;
    }
    
    public void habilitarBotones(){
        cmdAñadirPremio.setEnabled(true);
        cmdAñadirPropietario.setEnabled(true);
        cmdConnsultarPropietario.setEnabled(true);
        cmdMostrarPremios.setEnabled(true);
    }
    
    public void llenarComboPlaca(){
        String placa[] = competencia.concatenarplacas().split("~");
        cmbCarroAñadirPremio.removeAllItems();
        cmbPlacaMostrarPremio.removeAllItems();
        cmbPlacaAñadirPropietario.removeAllItems();
        cmbPlacaMostrarPropietario.removeAllItems();
        for(String x: placa){
            cmbCarroAñadirPremio.addItem(x);
            cmbPlacaMostrarPremio.addItem(x);
            cmbPlacaAñadirPropietario.addItem(x);
            cmbPlacaMostrarPropietario.addItem(x);
        }
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
    private javax.swing.JComboBox cmbAñoAñadirPropietario;
    private javax.swing.JComboBox cmbAñoMostrarPropietario;
    private javax.swing.JComboBox cmbCarroAñadirPremio;
    private javax.swing.JComboBox cmbModeloMostrarCarro;
    private javax.swing.JComboBox cmbPlacaAñadirPropietario;
    private javax.swing.JComboBox cmbPlacaMostrarPremio;
    private javax.swing.JComboBox cmbPlacaMostrarPropietario;
    private javax.swing.JButton cmdAñadirCarro;
    private javax.swing.JButton cmdAñadirPremio;
    private javax.swing.JButton cmdAñadirPropietario;
    private javax.swing.JButton cmdConnsultarPropietario;
    private javax.swing.JButton cmdMostrar;
    private javax.swing.JButton cmdMostrarPremios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea txtAInfo;
    private javax.swing.JTextField txtAñoAñadirPremio;
    private javax.swing.JTextField txtCCAñadirPropietario;
    private javax.swing.JTextField txtCiudadAñadirPropietario;
    private javax.swing.JTextField txtDireccionAñadirPropietario;
    private javax.swing.JTextField txtEventoAñadirPremio;
    private javax.swing.JTextField txtMarcaAñadirCarro;
    private javax.swing.JTextField txtModeloAñadirCarro;
    private javax.swing.JTextField txtNombreAñadirPropietario;
    private javax.swing.JTextField txtPlacaAñadirCarro;
    private javax.swing.JTextField txtPuestoAñadirPremio;
    private javax.swing.JTextField txtTelefonoAñadirPropietario;
    // End of variables declaration//GEN-END:variables
}
