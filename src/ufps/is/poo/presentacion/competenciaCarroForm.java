package ufps.is.poo.presentacion;

import ufps.is.poo.util.Notificacion;
import ufps.is.poo.negocio.Competencia;

/**
 * Esta clase es la interfaz grafica principal del proyecto, aquí se encuentran
 * todas las funciones de la aplicacion.
 * @author Emanuel Martínez Pinzón
 * @version 1.0 16-07-15
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
        cmdBorrarCarro.setEnabled(false);
        cmdBorrarPremio.setEnabled(false);
        cmdBorrarPropietario.setEnabled(false);
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
        txtMarcaAñadirCarro = new javax.swing.JTextField();
        cmdAñadirCarro = new javax.swing.JButton();
        cmbModeloCarro = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtPuestoAñadirPremio = new javax.swing.JTextField();
        txtEventoAñadirPremio = new javax.swing.JTextField();
        cmbCarroAñadirPremio = new javax.swing.JComboBox();
        cmdAñadirPremio = new javax.swing.JButton();
        cmbAñoPremio = new javax.swing.JComboBox();
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
        jTabbedPane2 = new javax.swing.JTabbedPane();
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
        jPanel5 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        cmdMostrarPropietariosParaunEvento = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        cmdPremiosPropietario = new javax.swing.JButton();
        txtEvento = new javax.swing.JTextField();
        txtPropietario = new javax.swing.JTextField();
        cmdMostrarTodo = new javax.swing.JButton();
        cmbAñoPropietariosGanadoresdeEvento = new javax.swing.JComboBox();
        jPanel6 = new javax.swing.JPanel();
        tbpBorrarOpciones = new javax.swing.JTabbedPane();
        jPanel7 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        cmbPlacaBorrarCarro = new javax.swing.JComboBox();
        cmdBorrarCarro = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        cmbPlacaBorrarPremio = new javax.swing.JComboBox();
        jLabel29 = new javax.swing.JLabel();
        cmbPremioBorrarPremio = new javax.swing.JComboBox();
        cmdBorrarPremio = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        cmbPlacaBorrarPropietario = new javax.swing.JComboBox();
        cmbPropietarioBorrarPropietario = new javax.swing.JComboBox();
        jLabel31 = new javax.swing.JLabel();
        cmdBorrarPropietario = new javax.swing.JButton();
        cmdBorrarTodo = new javax.swing.JButton();

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

        cmbModeloCarro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015" }));

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
                            .addComponent(txtMarcaAñadirCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbModeloCarro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(101, Short.MAX_VALUE))
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
                    .addComponent(cmbModeloCarro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdAñadirCarro)
                .addContainerGap(92, Short.MAX_VALUE))
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

        cmbAñoPremio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015" }));

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
                            .addComponent(txtPuestoAñadirPremio)
                            .addComponent(txtEventoAñadirPremio)
                            .addComponent(cmbCarroAñadirPremio, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbAñoPremio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbCarroAñadirPremio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cmbAñoPremio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addContainerGap(84, Short.MAX_VALUE)
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
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Consultas", jPanel4);

        jLabel22.setText("Propietarios en un evento ganador");

        jLabel23.setText("Evento: ");

        jLabel24.setText("Año: ");

        cmdMostrarPropietariosParaunEvento.setText("Mostrar");
        cmdMostrarPropietariosParaunEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMostrarPropietariosParaunEventoActionPerformed(evt);
            }
        });

        jLabel25.setText("Premios de un propietario");

        jLabel26.setText("Propietario: ");

        cmdPremiosPropietario.setText("Mostrar");
        cmdPremiosPropietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdPremiosPropietarioActionPerformed(evt);
            }
        });

        cmdMostrarTodo.setText("Mostrar todo");
        cmdMostrarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMostrarTodoActionPerformed(evt);
            }
        });

        cmbAñoPropietariosGanadoresdeEvento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015" }));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEvento, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                            .addComponent(cmbAñoPropietariosGanadoresdeEvento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmdMostrarTodo)
                            .addComponent(txtPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmdPremiosPropietario, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                    .addComponent(cmdMostrarPropietariosParaunEvento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(txtEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(cmdMostrarPropietariosParaunEvento)
                    .addComponent(cmbAñoPropietariosGanadoresdeEvento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(cmdPremiosPropietario)
                    .addComponent(txtPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmdMostrarTodo)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Examen", jPanel5);

        jLabel27.setText("Placa: ");

        cmdBorrarCarro.setText("Eliminar");
        cmdBorrarCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBorrarCarroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cmdBorrarCarro)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbPlacaBorrarCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(cmbPlacaBorrarCarro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdBorrarCarro)
                .addGap(34, 34, 34))
        );

        tbpBorrarOpciones.addTab("Carro", jPanel7);

        jLabel28.setText("Placa: ");

        jLabel29.setText("Premio: ");

        cmdBorrarPremio.setText("Eliminar");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cmdBorrarPremio)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(cmbPlacaBorrarPremio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(1, 1, 1))
                            .addComponent(cmbPremioBorrarPremio, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(cmbPlacaBorrarPremio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(cmbPremioBorrarPremio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdBorrarPremio)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        tbpBorrarOpciones.addTab("Premio", jPanel8);

        jLabel30.setText("Placa: ");

        cmbPlacaBorrarPropietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPlacaBorrarPropietarioActionPerformed(evt);
            }
        });

        jLabel31.setText("Propietario: ");

        cmdBorrarPropietario.setText("Eliminar");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cmdBorrarPropietario)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbPlacaBorrarPropietario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbPropietarioBorrarPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(52, 52, 52))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbPlacaBorrarPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(cmbPropietarioBorrarPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdBorrarPropietario)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        tbpBorrarOpciones.addTab("Propietario", jPanel9);

        cmdBorrarTodo.setText("Borrar todo");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tbpBorrarOpciones)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cmdBorrarTodo)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tbpBorrarOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(cmdBorrarTodo)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Eliminar", jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTabbedPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdAñadirCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAñadirCarroActionPerformed
        String placa = txtPlacaAñadirCarro.getText();
        String marca = txtMarcaAñadirCarro.getText();
        String modelo = cmbModeloCarro.getSelectedItem().toString();
        
        if(placa.isEmpty() || marca.isEmpty()){
            Notificacion.alertaAtencion("Alerta!!!", "Ingrese todos los datos");
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
    }//GEN-LAST:event_cmdAñadirCarroActionPerformed

    private void cmdAñadirPremioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAñadirPremioActionPerformed
        String placa = cmbCarroAñadirPremio.getSelectedItem().toString();
        String anio = cmbAñoPremio.getSelectedItem().toString();
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
        
        txtEventoAñadirPremio.setText("");
        txtPuestoAñadirPremio.setText("");
    }//GEN-LAST:event_cmdAñadirPremioActionPerformed

    private void cmdMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMostrarActionPerformed
        String rango = cmbModeloMostrarCarro.getSelectedItem().toString();
        
        txtAInfo.setText("Carros de modelo entre "+rango+"\n"
                +competencia.imprimirCarrosParaUnRango(rango));
    }//GEN-LAST:event_cmdMostrarActionPerformed

    private void cmdMostrarPremiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMostrarPremiosActionPerformed
        String placa = cmbPlacaMostrarPremio.getSelectedItem().toString();
        
        txtAInfo.setText("Premios obtenidos por el carro - Placa: "+placa+"\n"
                +competencia.imprimirPremiosCarro(placa));
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
                
        txtAInfo.setText("Propietarios del año "+año+"\n"
                +competencia.imprimirPropietarios(placa, Integer.parseInt(año)));
    }//GEN-LAST:event_cmdConnsultarPropietarioActionPerformed

    private void cmdMostrarPropietariosParaunEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMostrarPropietariosParaunEventoActionPerformed
        String evento = txtEvento.getText();
        String año = cmbAñoPropietariosGanadoresdeEvento.getSelectedItem().toString();
        
        if(evento.isEmpty()){
            Notificacion.alertaError("Sistema", "Debe ingresar todos los datos");
            return;
        }
        
        txtAInfo.setText("Propietarios para el evento "+evento+"\n"
                +competencia.propietarioParaUnaVictoria(evento, Integer.parseInt(año)));
        
        txtEvento.setText("");
    }//GEN-LAST:event_cmdMostrarPropietariosParaunEventoActionPerformed

    private void cmdMostrarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMostrarTodoActionPerformed
        txtAInfo.setText(competencia.recorrerPremios());
    }//GEN-LAST:event_cmdMostrarTodoActionPerformed

    private void cmdPremiosPropietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdPremiosPropietarioActionPerformed
        String cc = txtPropietario.getText();
        
        if(cc.isEmpty()){
            Notificacion.alertaError("Sistema", "Debe ingresar todos los datos");
            return;
        }
        
        txtAInfo.setText("Premios del propietario con CC "+cc+"\n"
                +competencia.premiosdePropietario(cc));
        
        txtPropietario.setText("");
    }//GEN-LAST:event_cmdPremiosPropietarioActionPerformed

    private void cmbPlacaBorrarPropietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPlacaBorrarPropietarioActionPerformed
        
    }//GEN-LAST:event_cmbPlacaBorrarPropietarioActionPerformed

    private void cmdBorrarCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBorrarCarroActionPerformed
        String placa = cmbPlacaBorrarCarro.getSelectedItem().toString();
        if(competencia.borrarCarro(placa))
            Notificacion.alertaInformativo("Sistema", "Carro eliminado con exito");
        
        llenarComboPlaca();
        
        try{
            System.out.println(cmbPlacaBorrarCarro.getSelectedIndex());
        }catch(java.lang.NullPointerException npe){
            System.out.println(cmbPlacaBorrarCarro.getSelectedIndex());
        }
    }//GEN-LAST:event_cmdBorrarCarroActionPerformed

    /**
     * Comprueba si el String que recibe contiene puros nuemros en Long
     * @param num Un numero en tipo de dato String
     * @return Si contiene puros numeros retorna true
     */
    public static boolean isNumeric(String num){
        try{
            Long.parseLong(num);
        }catch(NumberFormatException nfe){
            return false;
        }
        
        return true;
    }
    
    /**
     * Habilita algunos botones de la interfaz que no pueden ser usados sin la
     * existencia de al menos un carro
     */
    public void habilitarBotones(){
        cmdAñadirPremio.setEnabled(true);
        cmdAñadirPropietario.setEnabled(true);
        cmdConnsultarPropietario.setEnabled(true);
        cmdMostrarPremios.setEnabled(true);
        cmdBorrarCarro.setEnabled(true);
    }
    
    /**
     * Llena con las placas de los carros los combos necesarios en la interfaz
     */
    public void llenarComboPlaca(){
        String placa[] = competencia.concatenarplacas().split("~");
        cmbCarroAñadirPremio.removeAllItems();
        cmbPlacaMostrarPremio.removeAllItems();
        cmbPlacaAñadirPropietario.removeAllItems();
        cmbPlacaMostrarPropietario.removeAllItems();
        cmbPlacaBorrarCarro.removeAllItems();
        cmbPlacaBorrarPremio.removeAllItems();
        cmbPlacaBorrarPropietario.removeAllItems();
        for(String x: placa){
            cmbCarroAñadirPremio.addItem(x);
            cmbPlacaMostrarPremio.addItem(x);
            cmbPlacaAñadirPropietario.addItem(x);
            cmbPlacaMostrarPropietario.addItem(x);
            cmbPlacaBorrarCarro.addItem(x);
            cmbPlacaBorrarPremio.addItem(x);
            cmbPlacaBorrarPropietario.addItem(x);
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
    private javax.swing.JComboBox cmbAñoPremio;
    private javax.swing.JComboBox cmbAñoPropietariosGanadoresdeEvento;
    private javax.swing.JComboBox cmbCarroAñadirPremio;
    private javax.swing.JComboBox cmbModeloCarro;
    private javax.swing.JComboBox cmbModeloMostrarCarro;
    private javax.swing.JComboBox cmbPlacaAñadirPropietario;
    private javax.swing.JComboBox cmbPlacaBorrarCarro;
    private javax.swing.JComboBox cmbPlacaBorrarPremio;
    private javax.swing.JComboBox cmbPlacaBorrarPropietario;
    private javax.swing.JComboBox cmbPlacaMostrarPremio;
    private javax.swing.JComboBox cmbPlacaMostrarPropietario;
    private javax.swing.JComboBox cmbPremioBorrarPremio;
    private javax.swing.JComboBox cmbPropietarioBorrarPropietario;
    private javax.swing.JButton cmdAñadirCarro;
    private javax.swing.JButton cmdAñadirPremio;
    private javax.swing.JButton cmdAñadirPropietario;
    private javax.swing.JButton cmdBorrarCarro;
    private javax.swing.JButton cmdBorrarPremio;
    private javax.swing.JButton cmdBorrarPropietario;
    private javax.swing.JButton cmdBorrarTodo;
    private javax.swing.JButton cmdConnsultarPropietario;
    private javax.swing.JButton cmdMostrar;
    private javax.swing.JButton cmdMostrarPremios;
    private javax.swing.JButton cmdMostrarPropietariosParaunEvento;
    private javax.swing.JButton cmdMostrarTodo;
    private javax.swing.JButton cmdPremiosPropietario;
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
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
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
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane tbpBorrarOpciones;
    private javax.swing.JTextArea txtAInfo;
    private javax.swing.JTextField txtCCAñadirPropietario;
    private javax.swing.JTextField txtCiudadAñadirPropietario;
    private javax.swing.JTextField txtDireccionAñadirPropietario;
    private javax.swing.JTextField txtEvento;
    private javax.swing.JTextField txtEventoAñadirPremio;
    private javax.swing.JTextField txtMarcaAñadirCarro;
    private javax.swing.JTextField txtNombreAñadirPropietario;
    private javax.swing.JTextField txtPlacaAñadirCarro;
    private javax.swing.JTextField txtPropietario;
    private javax.swing.JTextField txtPuestoAñadirPremio;
    private javax.swing.JTextField txtTelefonoAñadirPropietario;
    // End of variables declaration//GEN-END:variables
}
