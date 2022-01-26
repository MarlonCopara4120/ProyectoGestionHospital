package Registros;

import Metodos_SQL.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Frm_registro_paciente_internado extends javax.swing.JFrame {

    ConexionBD cc = new ConexionBD();
    Connection con = cc.conectar();

    /**
     * Creates new form Frm_registro_paciente_internado
     */
    public Frm_registro_paciente_internado() {
        initComponents();
        this.setLocationRelativeTo(null);
        mostrarDatos();
    }

    public void bloquear() {
        txtCedula.setEnabled(false);
        txtNombre.setEnabled(false);
        txtApellido.setEnabled(false);
    }

    public void desbloquear() {
        txtCedula.setEnabled(true);
        txtNombre.setEnabled(true);
        txtApellido.setEnabled(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtMotivoIngreso = new javax.swing.JTextField();
        txtNumeroCama = new javax.swing.JTextField();
        txtMedicoAsignado = new javax.swing.JTextField();
        txtArea = new javax.swing.JTextField();
        txtNumeroSala = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTablaInternado = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MenuModificar = new javax.swing.JMenuItem();
        MenuEliminar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(182, 28, 28));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel3.setText("Cédula: ");

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel4.setText("Nombre:");

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel5.setText("Apellido: ");

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel6.setText("Número de Sala: ");

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel7.setText("Área: ");

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel8.setText("Número de Cama:");

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel9.setText("Motivo de Ingreso:");

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel10.setText("Médico Asignado:");

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Paciente Internado");

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Registro");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel11))
                .addContainerGap(129, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(21, 21, 21))
        );

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        tblTablaInternado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblTablaInternado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTablaInternadoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblTablaInternado);

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Buscar: ");

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 41, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(266, 266, 266)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRegistrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(btnRegresar)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel3))
                                    .addGap(60, 60, 60)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNumeroSala, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel7))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMedicoAsignado, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMotivoIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumeroCama, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtArea, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNumeroSala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNumeroCama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMotivoIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtMedicoAsignado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jMenu1.setText("Menu");

        MenuModificar.setText("Modificar");
        MenuModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuModificarActionPerformed(evt);
            }
        });
        jMenu1.add(MenuModificar);

        MenuEliminar.setText("Eliminar");
        MenuEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuEliminarActionPerformed(evt);
            }
        });
        jMenu1.add(MenuEliminar);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
        insertarDatos();
        desbloquear();
        limpiarCajas();
        mostrarDatos();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void tblTablaInternadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTablaInternadoMouseClicked
        // TODO add your handling code here:
        int filaSeleccionada = tblTablaInternado.rowAtPoint(evt.getPoint());
        bloquear();
        txtCedula.setText(tblTablaInternado.getValueAt(filaSeleccionada, 0).toString());
        txtNombre.setText(tblTablaInternado.getValueAt(filaSeleccionada, 1).toString());
        txtApellido.setText(tblTablaInternado.getValueAt(filaSeleccionada, 2).toString());


    }//GEN-LAST:event_tblTablaInternadoMouseClicked

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        Frm_registro_historial_clinico ventana = new Frm_registro_historial_clinico();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        filtrarDatos(txtBuscar.getText());
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void MenuModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuModificarActionPerformed

        Frm_registro_paciente_internado_modificar ventanaModificar = new Frm_registro_paciente_internado_modificar();
        ventanaModificar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MenuModificarActionPerformed

    private void MenuEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuEliminarActionPerformed
        Frm_registro_paciente_internado_eliminar ventanaModificar = new Frm_registro_paciente_internado_eliminar();
        ventanaModificar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MenuEliminarActionPerformed

    public void mostrarDatos() {

        String[] titulos = {"Cédula", "Nombre", "Apellido", "FechaNacimiento", "Nacionalidad", "Sexo", "Dirección"};
        String[] registros = new String[7];

        //HERE!!!!!
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);

        String SQL = "select * from registro_paciente";

        try {

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);

            while (rs.next()) {
                registros[0] = rs.getString("Cédula");
                registros[1] = rs.getString("Nombre");
                registros[2] = rs.getString("Apellido");
                registros[3] = rs.getString("FechaNacimiento");
                registros[4] = rs.getString("Nacionalidad");
                registros[5] = rs.getString("Sexo");
                registros[6] = rs.getString("Dirección");

                //  registros[7] = rs.getString("Especialidad");
                //  registros[8] = rs.getString("ExperienciaLaboral");
                modelo.addRow(registros);

            }
            tblTablaInternado.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al Mostrar Datos" + e);
        }

    }

    public void filtrarDatos(String valor) {

        String[] titulos = {"Cédula", "Nombre", "Apellido", "FechaNacimiento", "Nacionalidad", "Sexo", "Dirección"};
        String[] registros = new String[7];

        //HERE!!!!!
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);

        String SQL = "select * from registro_paciente where Cédula like '%" + valor + "%'";

        try {

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);

            while (rs.next()) {
                registros[0] = rs.getString("Cédula");
                registros[1] = rs.getString("Nombre");
                registros[2] = rs.getString("Apellido");
                registros[3] = rs.getString("FechaNacimiento");
                registros[4] = rs.getString("Nacionalidad");
                registros[5] = rs.getString("Sexo");
                registros[6] = rs.getString("Dirección");

                //  registros[7] = rs.getString("Especialidad");
                //  registros[8] = rs.getString("ExperienciaLaboral");
                modelo.addRow(registros);

            }
            tblTablaInternado.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al Mostrar Datos" + e);
        }

    }

    public void insertarDatos() {

        try {
            String SQL = " update registro_paciente set Nombre=?,Apellido=?,NúmeroSala=?,Área=?,NúmeroCama=?,MotivoIngreso=?,MédicoAsignado=? where Cédula=? ";
            int filaSeleccionada = tblTablaInternado.getSelectedRow();
            String dao = (String) tblTablaInternado.getValueAt(filaSeleccionada, 0);
            PreparedStatement pst = con.prepareStatement(SQL);

            pst.setString(1, txtNombre.getText());
            pst.setString(2, txtApellido.getText());
            pst.setString(3, txtNumeroSala.getText());
            pst.setString(4, txtArea.getText());
            pst.setString(5, txtNumeroCama.getText());
            pst.setString(6, txtMotivoIngreso.getText());
            pst.setString(7, txtMedicoAsignado.getText());

            pst.setString(8, dao);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Exitoso");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de Registro" + e.getMessage());
        }
    }

    public void limpiarCajas() {

        txtCedula.setText("");
        txtNombre.setText("");
        txtApellido.setText("");

        txtNumeroSala.setText("");
        txtArea.setText("");
        txtNumeroCama.setText("");
        txtMotivoIngreso.setText("");
        txtMedicoAsignado.setText("");

    }

    public void ActualizarDatos() {

        try {
            String SQL = " update registro_paciente set Nombre=?,Apellido=?,NúmeroSala=?,Área=?,NúmeroCama=?,MotivoIngreso=?,MédicoAsignado=? where Cédula=? ";
            int filaSeleccionada = tblTablaInternado.getSelectedRow();
            String dao = (String) tblTablaInternado.getValueAt(filaSeleccionada, 0);
            PreparedStatement pst = con.prepareStatement(SQL);

            pst.setString(1, txtNombre.getText());
            pst.setString(2, txtApellido.getText());
            pst.setString(3, txtNumeroSala.getText());
            pst.setString(4, txtArea.getText());
            pst.setString(5, txtNumeroCama.getText());
            pst.setString(6, txtMotivoIngreso.getText());
            pst.setString(7, txtMedicoAsignado.getText());

            pst.setString(8, dao);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Actualizado Exitoso");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de Actualiación" + e.getMessage());
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(Frm_registro_paciente_internado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_registro_paciente_internado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_registro_paciente_internado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_registro_paciente_internado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_registro_paciente_internado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuEliminar;
    private javax.swing.JMenuItem MenuModificar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTablaInternado;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtArea;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtMedicoAsignado;
    private javax.swing.JTextField txtMotivoIngreso;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumeroCama;
    private javax.swing.JTextField txtNumeroSala;
    // End of variables declaration//GEN-END:variables
}
