/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_tdb;

import java.awt.Color;

/**
 *
 * @author milton
 */
public class principal extends javax.swing.JFrame {

    /**
     * Creates new form principal
     */
    public principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_elegirTipo = new javax.swing.JDialog();
        cb_elegirUsuario = new javax.swing.JComboBox<>();
        bt_elegir = new javax.swing.JButton();
        jd_clienteRegistro = new javax.swing.JDialog();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jt_IDClienteRegistro = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jt_ClienteNombreRegistro = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        sp_cantidadTelefonosCliente = new javax.swing.JSpinner();
        bt_ingresarTelefonosCliente = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jt_clienteDireccionRegistro = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jt_ClienteEmailRegistro = new javax.swing.JTextField();
        bt_registrarCliente = new javax.swing.JButton();
        jd_AsesorMecanicoRegistro = new javax.swing.JDialog();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jt_tipoAMRegistro = new javax.swing.JTextField();
        jt_idAMRegistro = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        bt_registrarCliente1 = new javax.swing.JButton();
        jt_nombreAMRegistro = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jt_telefonoAMRegistro = new javax.swing.JTextField();
        tf_usuarioLogin = new javax.swing.JTextField();
        pass_contraseñaLogin = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jl_registrar = new javax.swing.JLabel();
        bt_login = new javax.swing.JButton();

        cb_elegirUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cliente", "Asesor", "Mecánico" }));

        bt_elegir.setText("ELEGIR");
        bt_elegir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_elegirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_elegirTipoLayout = new javax.swing.GroupLayout(jd_elegirTipo.getContentPane());
        jd_elegirTipo.getContentPane().setLayout(jd_elegirTipoLayout);
        jd_elegirTipoLayout.setHorizontalGroup(
            jd_elegirTipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_elegirTipoLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jd_elegirTipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bt_elegir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cb_elegirUsuario, 0, 330, Short.MAX_VALUE))
                .addGap(23, 23, 23))
        );
        jd_elegirTipoLayout.setVerticalGroup(
            jd_elegirTipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_elegirTipoLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(cb_elegirUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_elegir, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        jLabel4.setText("REGISTRO DE CLIENTE");

        jLabel5.setText("Identificación:");

        jLabel6.setText("Nombre Completo:");

        jLabel7.setText("N° de Telefonos:");

        sp_cantidadTelefonosCliente.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));

        bt_ingresarTelefonosCliente.setText("Ingresar telefonos");

        jLabel8.setText("Dirección:");

        jLabel9.setText("Email:");

        bt_registrarCliente.setText("Registrar");
        bt_registrarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_registrarClienteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_clienteRegistroLayout = new javax.swing.GroupLayout(jd_clienteRegistro.getContentPane());
        jd_clienteRegistro.getContentPane().setLayout(jd_clienteRegistroLayout);
        jd_clienteRegistroLayout.setHorizontalGroup(
            jd_clienteRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_clienteRegistroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_clienteRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jd_clienteRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_clienteRegistroLayout.createSequentialGroup()
                        .addGroup(jd_clienteRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jt_IDClienteRegistro)
                            .addComponent(jt_ClienteNombreRegistro)
                            .addComponent(sp_cantidadTelefonosCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_ingresarTelefonosCliente))
                    .addGroup(jd_clienteRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jt_clienteDireccionRegistro, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jt_ClienteEmailRegistro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE))
                    .addComponent(bt_registrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_clienteRegistroLayout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );
        jd_clienteRegistroLayout.setVerticalGroup(
            jd_clienteRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_clienteRegistroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jd_clienteRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addGroup(jd_clienteRegistroLayout.createSequentialGroup()
                        .addGroup(jd_clienteRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jt_IDClienteRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jd_clienteRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jt_ClienteNombreRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jd_clienteRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jd_clienteRegistroLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7))
                            .addGroup(jd_clienteRegistroLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jd_clienteRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(sp_cantidadTelefonosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bt_ingresarTelefonosCliente))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jd_clienteRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jt_clienteDireccionRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jt_ClienteEmailRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_registrarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel10.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        jLabel10.setText("REGISTRO DE MECANICO-ASESOR");

        jLabel11.setText("Tipo:");

        jLabel12.setText("Identificación:");

        jt_tipoAMRegistro.setEditable(false);

        jLabel14.setText("Nombre Completo:");

        bt_registrarCliente1.setText("Registrar");
        bt_registrarCliente1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_registrarCliente1MouseClicked(evt);
            }
        });

        jLabel15.setText("N° de Telefono:");

        javax.swing.GroupLayout jd_AsesorMecanicoRegistroLayout = new javax.swing.GroupLayout(jd_AsesorMecanicoRegistro.getContentPane());
        jd_AsesorMecanicoRegistro.getContentPane().setLayout(jd_AsesorMecanicoRegistroLayout);
        jd_AsesorMecanicoRegistroLayout.setHorizontalGroup(
            jd_AsesorMecanicoRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_AsesorMecanicoRegistroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_AsesorMecanicoRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel15)
                    .addComponent(jLabel14)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jd_AsesorMecanicoRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jt_tipoAMRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                    .addComponent(jt_telefonoAMRegistro)
                    .addComponent(jt_nombreAMRegistro)
                    .addComponent(jt_idAMRegistro)
                    .addComponent(bt_registrarCliente1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_AsesorMecanicoRegistroLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        jd_AsesorMecanicoRegistroLayout.setVerticalGroup(
            jd_AsesorMecanicoRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_AsesorMecanicoRegistroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jd_AsesorMecanicoRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jt_idAMRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jd_AsesorMecanicoRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14)
                    .addComponent(jt_nombreAMRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jd_AsesorMecanicoRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15)
                    .addComponent(jt_telefonoAMRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jd_AsesorMecanicoRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jt_tipoAMRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_registrarCliente1, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        jLabel1.setText("MANTENIMIENTO Y REPARACIÓN DE AUTOS");

        jLabel2.setText("Usuario:");

        jLabel3.setText("Contraseña:");

        jl_registrar.setText("ó click aqui para Registrarse!");
        jl_registrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jl_registrarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jl_registrarMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_registrarMouseClicked(evt);
            }
        });

        bt_login.setText("INICIAR SESION");
        bt_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_loginMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jl_registrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tf_usuarioLogin)
                    .addComponent(pass_contraseñaLogin))
                .addGap(142, 142, 142))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_usuarioLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pass_contraseñaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jl_registrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_login, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_loginMouseClicked

    }//GEN-LAST:event_bt_loginMouseClicked

    private void bt_elegirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_elegirMouseClicked
        String usuarioSelected = this.cb_elegirUsuario.getSelectedItem().toString();
        switch (usuarioSelected) {
            case "Cliente":
                this.jd_clienteRegistro.pack();
                this.jd_clienteRegistro.setResizable(false);
                this.jd_clienteRegistro.setLocationRelativeTo(this);
                this.jd_clienteRegistro.setVisible(true);
                this.jd_elegirTipo.hide();
                break;
            case "Asesor":
                this.jt_tipoAMRegistro.setText(usuarioSelected);
                this.jd_AsesorMecanicoRegistro.pack();
                this.jd_AsesorMecanicoRegistro.setResizable(false);
                this.jd_AsesorMecanicoRegistro.setLocationRelativeTo(this);
                this.jd_AsesorMecanicoRegistro.setVisible(true);
                this.jd_elegirTipo.hide();
                break;
            case "Mecánico":
                this.jt_tipoAMRegistro.setText(usuarioSelected);
                this.jt_tipoAMRegistro.setText(usuarioSelected);
                this.jd_AsesorMecanicoRegistro.pack();
                this.jd_AsesorMecanicoRegistro.setResizable(false);
                this.jd_AsesorMecanicoRegistro.setLocationRelativeTo(this);
                this.jd_AsesorMecanicoRegistro.setVisible(true);
                this.jd_elegirTipo.hide();
                break;
        }
    }//GEN-LAST:event_bt_elegirMouseClicked

    private void bt_registrarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_registrarClienteMouseClicked
        this.jd_clienteRegistro.setVisible(false);
        this.show();
    }//GEN-LAST:event_bt_registrarClienteMouseClicked

    private void bt_registrarCliente1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_registrarCliente1MouseClicked
        this.jd_AsesorMecanicoRegistro.setVisible(false);
        this.show();
    }//GEN-LAST:event_bt_registrarCliente1MouseClicked

    private void jl_registrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_registrarMouseClicked
        this.jd_elegirTipo.pack();
        this.jd_elegirTipo.setResizable(false);
        this.jd_elegirTipo.setLocationRelativeTo(this);
        this.jd_elegirTipo.setVisible(true);
        this.hide();
    }//GEN-LAST:event_jl_registrarMouseClicked

    private void jl_registrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_registrarMousePressed
        this.jl_registrar.setForeground(Color.BLUE);
    }//GEN-LAST:event_jl_registrarMousePressed

    private void jl_registrarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_registrarMouseReleased
        this.jl_registrar.setForeground(Color.BLACK);
    }//GEN-LAST:event_jl_registrarMouseReleased

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
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_elegir;
    private javax.swing.JButton bt_ingresarTelefonosCliente;
    private javax.swing.JButton bt_login;
    private javax.swing.JButton bt_registrarCliente;
    private javax.swing.JButton bt_registrarCliente1;
    private javax.swing.JComboBox<String> cb_elegirUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JDialog jd_AsesorMecanicoRegistro;
    private javax.swing.JDialog jd_clienteRegistro;
    private javax.swing.JDialog jd_elegirTipo;
    private javax.swing.JLabel jl_registrar;
    private javax.swing.JTextField jt_ClienteEmailRegistro;
    private javax.swing.JTextField jt_ClienteNombreRegistro;
    private javax.swing.JTextField jt_IDClienteRegistro;
    private javax.swing.JTextField jt_clienteDireccionRegistro;
    private javax.swing.JTextField jt_idAMRegistro;
    private javax.swing.JTextField jt_nombreAMRegistro;
    private javax.swing.JTextField jt_telefonoAMRegistro;
    private javax.swing.JTextField jt_tipoAMRegistro;
    private javax.swing.JPasswordField pass_contraseñaLogin;
    private javax.swing.JSpinner sp_cantidadTelefonosCliente;
    private javax.swing.JTextField tf_usuarioLogin;
    // End of variables declaration//GEN-END:variables
}
