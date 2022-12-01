
package telas;

import classes.Empresa;
import classes.PrestadorServico;
import conexoes.MySQL;
import javax.swing.JOptionPane;

public class CadastroEmpresa extends javax.swing.JFrame {
    MySQL conectar = new MySQL();
    Empresa novaEmpresa = new Empresa();
 
    public CadastroEmpresa() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtRazaoSocial = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtInscricao = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtEndereco = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        btnSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        txtCnpj = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("CNPJ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 37, -1));

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icone-buscar.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 50, 120, -1));

        btnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icone-limpar.png"))); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, 120, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Razão Social");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        txtRazaoSocial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRazaoSocialActionPerformed(evt);
            }
        });
        jPanel1.add(txtRazaoSocial, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 480, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Inscrição Estadual");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));
        jPanel1.add(txtInscricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 480, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Telefone");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        txtTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefoneActionPerformed(evt);
            }
        });
        jPanel1.add(txtTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 160, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("E-mail");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 50, -1));
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 310, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Endereço");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        txtEndereco.setColumns(20);
        txtEndereco.setLineWrap(true);
        txtEndereco.setRows(5);
        jScrollPane5.setViewportView(txtEndereco);

        jPanel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 480, 86));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icone-salvar.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icone-deletar.png"))); // NOI18N
        btnExcluir.setText("Deletar");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icone-voltar.png"))); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnExcluir)
                    .addComponent(btnVoltar))
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 480, -1));
        jPanel1.add(txtCnpj, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 50, 230, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cadastroempresa.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 450));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        buscarEmpresa();
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if(novaEmpresa.getCnpj() != ""){
            atualizaEmpresa();
        }
        else{
            cadastrarEmpresa();
        }
        
        novaEmpresa.limpaCnpj();
        this.txtCnpj.setText ("");
        this.txtRazaoSocial.setText("");
        this.txtEndereco.setText("");
        this.txtInscricao.setText("");
        this.txtTelefone.setText("");
        this.txtEmail.setText("");
                             
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        novaEmpresa.limpaCnpj();
        this.txtCnpj.setText ("");
        this.txtRazaoSocial.setText("");
        this.txtEndereco.setText("");
        this.txtInscricao.setText("");
        this.txtTelefone.setText("");
        this.txtEmail.setText("");
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        deletarEmpresa(novaEmpresa);
        novaEmpresa.limpaCnpj();
        this.txtCnpj.setText ("");
        this.txtRazaoSocial.setText("");
        this.txtEndereco.setText("");
        this.txtInscricao.setText("");
        this.txtTelefone.setText("");
        this.txtEmail.setText("");
                        
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        new Menu().setVisible(true);
        CadastroEmpresa.this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void txtTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefoneActionPerformed

    private void txtRazaoSocialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRazaoSocialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRazaoSocialActionPerformed

    public void deletarEmpresa (Empresa novoEmpresa) {
        this.conectar.conectaBanco();
        String cnpj = this.txtCnpj.getText();
        
        try{
            String query = "DELETE FROM empresa WHERE cnpj = " + cnpj;
            this.conectar.updateSQL(query);
            JOptionPane.showMessageDialog(null, "Empresa deletada com sucesso!");
            
        } catch (Exception e) {
            System.out.println("Erro ao deletar Empresa. \nErro: " + e.getMessage());
            JOptionPane.showMessageDialog (null, "Erro ao deletar Empresa");
        } finally {
            this.conectar.fechaBanco();
        }
    }
    
    public void atualizaEmpresa () {
        this.conectar.conectaBanco();
        
        try{
            String query = "UPDATE empresa SET " +
                "telefone = '" + this.txtTelefone.getText() +
                "', inscricaoEstadual = '" + this.txtInscricao.getText() + 
                "', razaoSocial = '" + this.txtRazaoSocial.getText() + 
                "', endereco = '" + this.txtEndereco.getText() +
                "', email = '" + this.txtEmail.getText() +
                "' WHERE cnpj = '" + this.novaEmpresa.getCnpj() + "';";

            if (novaEmpresa.getCnpj() == "") {
                JOptionPane.showMessageDialog(null, "Erro ao buscar empresa.");
            }
            
            this.conectar.updateSQL(query);
            
        } catch (Exception e) {
            System.out.println("Erro ao atualizar empresa"+ e.getMessage());
            JOptionPane.showMessageDialog (null, "Erro ao atualizar empresa!");
        } finally {
            this.conectar.fechaBanco();
        novaEmpresa.limpaCnpj();
        this.txtCnpj.setText ("");
        this.txtRazaoSocial.setText("");
        this.txtTelefone.setText("");
        this.txtEmail.setText("");
        this.txtEndereco.setText("");
        this.txtEmail.setText("");
        }
        
    }
    
    public void buscarEmpresa () {
        this.conectar.conectaBanco();
        
        try {
            String query = "SELECT cnpj, telefone, inscricaoEstadual, razaoSocial, endereco, email "
                + "FROM empresa "
                + "WHERE cnpj = '" + this.txtCnpj.getText() + "';";
            this.conectar.executarSQL(query);
            
            while (this.conectar.getResultSet().next()) {
                novaEmpresa.setCnpj(this.conectar.getResultSet().getString(1));
                novaEmpresa.setTelefone(this.conectar.getResultSet().getString(2));
                novaEmpresa.setInscricaoEstadual(this.conectar.getResultSet().getString(3));
                novaEmpresa.setRazaoSocial(this.conectar.getResultSet().getString(4));
                novaEmpresa.setEndereco(this.conectar.getResultSet().getString(5));
                novaEmpresa.setEmail(this.conectar.getResultSet().getString(6));
            }
            if ("".equals(novaEmpresa.getCnpj())) {
                JOptionPane.showMessageDialog(null, "Empresa não encontrado!");
            }
        } catch (Exception e) {
            System.out.println("Erro ao consultar empresa" + e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao buscar empresa");
        } finally {
            txtCnpj.setText(novaEmpresa.getCnpj());
            txtRazaoSocial.setText (novaEmpresa.getRazaoSocial());
            txtTelefone.setText(novaEmpresa.getTelefone());
            txtEmail.setText(novaEmpresa.getEmail());
            txtEndereco.setText(novaEmpresa.getEndereco());
            txtInscricao.setText(novaEmpresa.getInscricaoEstadual());
            this.conectar.fechaBanco();
        }
    }
    
    public void cadastrarEmpresa() {
        this.conectar.conectaBanco();             
        try{
            String query = "INSERT INTO empresa values(null,"+
           "'" + this.txtCnpj.getText() + "', " +
           "'" + this.txtTelefone.getText() + "', " +
           "'" + this.txtInscricao.getText() + "', " +
           "'" + this.txtRazaoSocial.getText() + "', " +          
           "'" + this.txtEndereco.getText() + "', " +
           "'" + this.txtEmail.getText() + "');";
            this.conectar.insertSQL(query);

            JOptionPane.showMessageDialog(null, "Empresa cadastrada com sucesso!");
        } catch (Exception e) {
           System.out.println("Erro ao cadastrar empresa: " + e.getMessage());
           JOptionPane.showMessageDialog(null, "Erro ao cadastrar empresa!");
        } finally {
            this.conectar.fechaBanco();
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
            java.util.logging.Logger.getLogger(CadastroEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroEmpresa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextField txtCnpj;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextArea txtEndereco;
    private javax.swing.JTextField txtInscricao;
    private javax.swing.JTextField txtRazaoSocial;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
