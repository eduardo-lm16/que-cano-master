package telas;

import classes.Usuario;
import conexoes.MySQL;
import javax.swing.JOptionPane;

public class CadastroLogin extends javax.swing.JFrame {
    MySQL conectar = new MySQL();
    Usuario novoUsuario= new Usuario ();

    public CadastroLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblLogin = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        lblSenha = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        btnLimpar = new javax.swing.JButton();
        btnCadastro = new javax.swing.JButton();
        txtNome = new javax.swing.JTextField();
        lblLogin1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblLogin.setText("Login");
        jPanel1.add(lblLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 119, 50, -1));
        jPanel1.add(txtLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 145, 200, -1));

        lblSenha.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblSenha.setText("Senha");
        jPanel1.add(lblSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 183, 50, -1));
        jPanel1.add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 209, 200, -1));

        btnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icone-limpar.png"))); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 253, 200, 34));

        btnCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icone-salvar.png"))); // NOI18N
        btnCadastro.setText("Cadastrar");
        btnCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroActionPerformed(evt);
            }
        });
        jPanel1.add(btnCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, -1, 34));
        jPanel1.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 81, 200, -1));

        lblLogin1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblLogin1.setText("Nome");
        jPanel1.add(lblLogin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 55, 50, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icone-voltar.png"))); // NOI18N
        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 98, 34));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cadastro.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 360));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void cadastrarUsuario (Usuario novo) {
        this.conectar.conectaBanco();
        
        novo.setNome(txtNome.getText());
        novo.setLogin(txtLogin.getText());
        novo.setSenha(txtSenha.getText());
        
        try {
            String cadastrarUsuario = "INSERT INTO usuario ("
                    + "nome,"
                    + "login,"
                    + "senha) values ("
                    + "'" + novo.getNome() + "',"
                    + "'" + novo.getLogin() + "',"
                    + "'" + novo.getSenha() + "'"
                    + ");"
                    ;
            
            this.conectar.insertSQL(cadastrarUsuario);
            
            JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso!!!");
        } catch (Exception e) {
            System.out.println("Erro ao cadastrar Usuario " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar Usuario");
             
        }finally {
            this.conectar.fechaBanco ();
        }
    }
    
    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
       novoUsuario.limparUsuario();
         this.txtNome.setText("");
         this.txtLogin.setText("");
         this.txtSenha.setText("");
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroActionPerformed
        cadastrarUsuario(novoUsuario);
        new Login().setVisible(true);
        CadastroLogin.this.dispose();
    }//GEN-LAST:event_btnCadastroActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       new Login().setVisible(true);
        CadastroLogin.this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastro;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblLogin1;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
