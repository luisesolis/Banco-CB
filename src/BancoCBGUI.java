

/**
 *
 * @author Luis
 */
public class BancoCBGUI extends javax.swing.JFrame {

    /**
     * Creates new form BancoCBGUI
     */
    public BancoCBGUI() {
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

        btnGroup_Cta1 = new javax.swing.ButtonGroup();
        btnGroup_Cta2 = new javax.swing.ButtonGroup();
        pUsuario1 = new javax.swing.JPanel();
        lblCLABE_Cta1 = new javax.swing.JLabel();
        lblTitular_Cta1 = new javax.swing.JLabel();
        lblSaldo_Cta1 = new javax.swing.JLabel();
        pOperaciones1 = new javax.swing.JPanel();
        rbTransferencia_1 = new javax.swing.JRadioButton();
        rbCompra_1 = new javax.swing.JRadioButton();
        lblCuentaD1 = new javax.swing.JLabel();
        txtCtaDestino_1 = new javax.swing.JTextField();
        lblMonto_1 = new javax.swing.JLabel();
        txtMonto_1 = new javax.swing.JTextField();
        btnAceptar_1 = new javax.swing.JButton();
        clabe1 = new javax.swing.JLabel();
        nombre1 = new javax.swing.JLabel();
        saldo1 = new javax.swing.JLabel();
        pUsuario2 = new javax.swing.JPanel();
        lblCLABE_Cta2 = new javax.swing.JLabel();
        lblTitular_Cta2 = new javax.swing.JLabel();
        lblSaldo_Cta2 = new javax.swing.JLabel();
        pOperaciones2 = new javax.swing.JPanel();
        lblCuentaD2 = new javax.swing.JLabel();
        txtCtaDestino_2 = new javax.swing.JTextField();
        rbCompra_2 = new javax.swing.JRadioButton();
        lblMonto_2 = new javax.swing.JLabel();
        rbTransferencia_2 = new javax.swing.JRadioButton();
        txtMonto_2 = new javax.swing.JTextField();
        btnAceptar_2 = new javax.swing.JButton();
        clabe2 = new javax.swing.JLabel();
        nombre2 = new javax.swing.JLabel();
        saldo2 = new javax.swing.JLabel();
        btnExportaTxt = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMensaje_Cta1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtMensaje_Cta2 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BIENVENIDOS A BANCO CB");
        setBackground(new java.awt.Color(243, 243, 243));
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);

        pUsuario1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblCLABE_Cta1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblCLABE_Cta1.setText("$CLABE USUARIO 1");

        lblTitular_Cta1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblTitular_Cta1.setText("$NOMBRE USUARIO 1");

        lblSaldo_Cta1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblSaldo_Cta1.setText("$SALDO USUARIO 1");

        pOperaciones1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "OPERACIONES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 11))); // NOI18N

        btnGroup_Cta1.add(rbTransferencia_1);
        rbTransferencia_1.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        rbTransferencia_1.setSelected(true);
        rbTransferencia_1.setText("TRANSFERENCIA");

        btnGroup_Cta1.add(rbCompra_1);
        rbCompra_1.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        rbCompra_1.setText("COMPRA");

        lblCuentaD1.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        lblCuentaD1.setText("CUENTA DESTINO");

        txtCtaDestino_1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        lblMonto_1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblMonto_1.setText("MONTO");

        txtMonto_1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        btnAceptar_1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnAceptar_1.setText("ACEPTAR");

        javax.swing.GroupLayout pOperaciones1Layout = new javax.swing.GroupLayout(pOperaciones1);
        pOperaciones1.setLayout(pOperaciones1Layout);
        pOperaciones1Layout.setHorizontalGroup(
            pOperaciones1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pOperaciones1Layout.createSequentialGroup()
                .addGroup(pOperaciones1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pOperaciones1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(pOperaciones1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pOperaciones1Layout.createSequentialGroup()
                                .addGroup(pOperaciones1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbCompra_1)
                                    .addComponent(rbTransferencia_1))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(pOperaciones1Layout.createSequentialGroup()
                                .addComponent(lblMonto_1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtMonto_1))))
                    .addGroup(pOperaciones1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(lblCuentaD1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCtaDestino_1, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(pOperaciones1Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(btnAceptar_1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pOperaciones1Layout.setVerticalGroup(
            pOperaciones1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pOperaciones1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbTransferencia_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pOperaciones1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCuentaD1)
                    .addComponent(txtCtaDestino_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(rbCompra_1)
                .addGap(18, 18, 18)
                .addGroup(pOperaciones1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMonto_1)
                    .addComponent(txtMonto_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAceptar_1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        clabe1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        clabe1.setText("CLABE:");

        nombre1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        nombre1.setText("NOMBRE:");

        saldo1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        saldo1.setText("SALDO:");

        javax.swing.GroupLayout pUsuario1Layout = new javax.swing.GroupLayout(pUsuario1);
        pUsuario1.setLayout(pUsuario1Layout);
        pUsuario1Layout.setHorizontalGroup(
            pUsuario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pUsuario1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pUsuario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pOperaciones1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pUsuario1Layout.createSequentialGroup()
                        .addGroup(pUsuario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(clabe1)
                            .addComponent(nombre1)
                            .addComponent(saldo1))
                        .addGap(21, 21, 21)
                        .addGroup(pUsuario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTitular_Cta1)
                            .addComponent(lblCLABE_Cta1)
                            .addComponent(lblSaldo_Cta1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pUsuario1Layout.setVerticalGroup(
            pUsuario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pUsuario1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pUsuario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCLABE_Cta1)
                    .addComponent(clabe1))
                .addGap(18, 18, 18)
                .addGroup(pUsuario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre1)
                    .addComponent(lblTitular_Cta1))
                .addGap(18, 18, 18)
                .addGroup(pUsuario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSaldo_Cta1)
                    .addComponent(saldo1))
                .addGap(22, 22, 22)
                .addComponent(pOperaciones1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pUsuario2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblCLABE_Cta2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblCLABE_Cta2.setText("$CLABE USUARIO 2");

        lblTitular_Cta2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblTitular_Cta2.setText("$NOMBRE USUARIO 2");

        lblSaldo_Cta2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblSaldo_Cta2.setText("$SALDO USUARIO 2");

        pOperaciones2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "OPERACIONES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 11))); // NOI18N

        lblCuentaD2.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        lblCuentaD2.setText("CUENTA DESTINO");

        txtCtaDestino_2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        btnGroup_Cta2.add(rbCompra_2);
        rbCompra_2.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        rbCompra_2.setText("COMPRA");

        lblMonto_2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblMonto_2.setText("MONTO");

        btnGroup_Cta2.add(rbTransferencia_2);
        rbTransferencia_2.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        rbTransferencia_2.setSelected(true);
        rbTransferencia_2.setText("TRANSFERENCIA");

        txtMonto_2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        btnAceptar_2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnAceptar_2.setText("ACEPTAR");

        javax.swing.GroupLayout pOperaciones2Layout = new javax.swing.GroupLayout(pOperaciones2);
        pOperaciones2.setLayout(pOperaciones2Layout);
        pOperaciones2Layout.setHorizontalGroup(
            pOperaciones2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pOperaciones2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pOperaciones2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pOperaciones2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pOperaciones2Layout.createSequentialGroup()
                            .addGroup(pOperaciones2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(rbCompra_2)
                                .addComponent(rbTransferencia_2))
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(pOperaciones2Layout.createSequentialGroup()
                            .addComponent(lblMonto_2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtMonto_2))
                        .addGroup(pOperaciones2Layout.createSequentialGroup()
                            .addGap(42, 42, 42)
                            .addComponent(lblCuentaD2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtCtaDestino_2, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)))
                    .addGroup(pOperaciones2Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(btnAceptar_2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8))
        );
        pOperaciones2Layout.setVerticalGroup(
            pOperaciones2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pOperaciones2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rbTransferencia_2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pOperaciones2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCuentaD2)
                    .addComponent(txtCtaDestino_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(rbCompra_2)
                .addGap(18, 18, 18)
                .addGroup(pOperaciones2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMonto_2)
                    .addComponent(txtMonto_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAceptar_2)
                .addContainerGap())
        );

        clabe2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        clabe2.setText("CLABE:");

        nombre2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        nombre2.setText("NOMBRE:");

        saldo2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        saldo2.setText("SALDO:");

        javax.swing.GroupLayout pUsuario2Layout = new javax.swing.GroupLayout(pUsuario2);
        pUsuario2.setLayout(pUsuario2Layout);
        pUsuario2Layout.setHorizontalGroup(
            pUsuario2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pUsuario2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pUsuario2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pOperaciones2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pUsuario2Layout.createSequentialGroup()
                        .addGroup(pUsuario2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombre2)
                            .addComponent(clabe2)
                            .addComponent(saldo2))
                        .addGap(38, 38, 38)
                        .addGroup(pUsuario2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSaldo_Cta2)
                            .addComponent(lblCLABE_Cta2)
                            .addComponent(lblTitular_Cta2))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pUsuario2Layout.setVerticalGroup(
            pUsuario2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pUsuario2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pUsuario2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pUsuario2Layout.createSequentialGroup()
                        .addComponent(lblTitular_Cta2)
                        .addGap(41, 41, 41))
                    .addGroup(pUsuario2Layout.createSequentialGroup()
                        .addGroup(pUsuario2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(clabe2)
                            .addComponent(lblCLABE_Cta2))
                        .addGap(18, 18, 18)
                        .addComponent(nombre2)
                        .addGap(18, 18, 18)
                        .addGroup(pUsuario2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(saldo2)
                            .addComponent(lblSaldo_Cta2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pOperaciones2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnExportaTxt.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnExportaTxt.setText("EXPORTAR TXT");

        txtMensaje_Cta1.setColumns(20);
        txtMensaje_Cta1.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        txtMensaje_Cta1.setRows(5);
        jScrollPane1.setViewportView(txtMensaje_Cta1);

        txtMensaje_Cta2.setColumns(20);
        txtMensaje_Cta2.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        txtMensaje_Cta2.setRows(5);
        jScrollPane2.setViewportView(txtMensaje_Cta2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(pUsuario1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pUsuario2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExportaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pUsuario1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pUsuario2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addGap(18, 18, 18)
                .addComponent(btnExportaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(BancoCBGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BancoCBGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BancoCBGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BancoCBGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BancoCBGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAceptar_1;
    public javax.swing.JButton btnAceptar_2;
    public javax.swing.JButton btnExportaTxt;
    public javax.swing.ButtonGroup btnGroup_Cta1;
    public javax.swing.ButtonGroup btnGroup_Cta2;
    public javax.swing.JLabel clabe1;
    public javax.swing.JLabel clabe2;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JLabel lblCLABE_Cta1;
    public javax.swing.JLabel lblCLABE_Cta2;
    public javax.swing.JLabel lblCuentaD1;
    public javax.swing.JLabel lblCuentaD2;
    public javax.swing.JLabel lblMonto_1;
    public javax.swing.JLabel lblMonto_2;
    public javax.swing.JLabel lblSaldo_Cta1;
    public javax.swing.JLabel lblSaldo_Cta2;
    public javax.swing.JLabel lblTitular_Cta1;
    public javax.swing.JLabel lblTitular_Cta2;
    public javax.swing.JLabel nombre1;
    public javax.swing.JLabel nombre2;
    public javax.swing.JPanel pOperaciones1;
    public javax.swing.JPanel pOperaciones2;
    public javax.swing.JPanel pUsuario1;
    public javax.swing.JPanel pUsuario2;
    public javax.swing.JRadioButton rbCompra_1;
    public javax.swing.JRadioButton rbCompra_2;
    public javax.swing.JRadioButton rbTransferencia_1;
    public javax.swing.JRadioButton rbTransferencia_2;
    public javax.swing.JLabel saldo1;
    public javax.swing.JLabel saldo2;
    public javax.swing.JTextField txtCtaDestino_1;
    public javax.swing.JTextField txtCtaDestino_2;
    public javax.swing.JTextArea txtMensaje_Cta1;
    public javax.swing.JTextArea txtMensaje_Cta2;
    public javax.swing.JTextField txtMonto_1;
    public javax.swing.JTextField txtMonto_2;
    // End of variables declaration//GEN-END:variables
}
