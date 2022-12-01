
package telas;


public class Menu extends javax.swing.JFrame {


    public Menu() {
        initComponents();
    }
    
    public Menu(int usuarioId) {
        initComponents();
        usuarioLogadoId = usuarioId;
    }
    
    int usuarioLogadoId;


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btnServicos = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS/Icone-cadastrar.png"))); // NOI18N
        jButton3.setText("Cadastro de Funcionário");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 210, -1));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS/Icone-cadastrar.png"))); // NOI18N
        jButton4.setText("Cadastro de CNPJ");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 210, -1));

        btnServicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS/Icone-cadastrar.png"))); // NOI18N
        btnServicos.setText("Controle de Serviços");
        btnServicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnServicosActionPerformed(evt);
            }
        });
        jPanel2.add(btnServicos, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 210, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Logo.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, -1, 210));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/menucadastro.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 310));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Logo.png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, -1, 210));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Logo.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, -1, 210));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 310));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 741, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnServicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnServicosActionPerformed
        new CadastroServico().setVisible(true);
        Menu.this.dispose();
    }//GEN-LAST:event_btnServicosActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new CadastroEmpresa().setVisible(true);
        Menu.this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new CadastroFuncionario(usuarioLogadoId).setVisible(true);
        Menu.this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnServicos;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
