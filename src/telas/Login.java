
package telas;

import classes.Usuario;
import conexoes.MySQL;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
    MySQL conectar = new MySQL();
    Usuario novoUsuario = new Usuario();


    public Login() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        btnLimpar = new javax.swing.JButton();
        btnCadastro = new javax.swing.JToggleButton();
        btnEntrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Logo.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, -1, 210));
        jPanel1.add(txtLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 230, -1));

        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });
        jPanel1.add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 230, -1));

        btnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icone-limpar.png"))); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 110, -1));

        btnCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icone-salvar.png"))); // NOI18N
        btnCadastro.setText("Cadastro");
        btnCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroActionPerformed(evt);
            }
        });
        jPanel1.add(btnCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, -1, -1));

        btnEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icone-entrar.png"))); // NOI18N
        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 110, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/menulogin.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 320));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        novoUsuario.limparUsuario();
         this.txtLogin.setText("");
         this.txtSenha.setText("");
    
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
       if(Login()){
        new Menu(novoUsuario.getId()).setVisible(true);
        Login.this.dispose();    }//GEN-LAST:event_btnEntrarActionPerformed
       }

    public boolean Login(){
        this.conectar.conectaBanco();
        
        try {
            String query = "SELECT "
                    + "id, "
                    + "login, "
                    + "senha "
                    + " FROM usuario"
                    + " WHERE login = '" + this.txtLogin.getText() + "' " +
                    "AND senha = '" + this.txtSenha.getText() + "';";
            this.conectar.executarSQL(query);
            
            while (this.conectar.getResultSet().next()) {
                novoUsuario.setId(Integer.parseInt(this.conectar.getResultSet().getString(1)));
                novoUsuario.setLogin(this.conectar.getResultSet().getString(2));
                novoUsuario.setSenha(this.conectar.getResultSet().getString(3));
            }
            if (novoUsuario.getId() == 0) {
                JOptionPane.showMessageDialog(null, "Usuario não encontrado!");
            }
        } catch (Exception e) {
            System.out.println("Erro ao realizar login" + e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao realizar login");
        } finally {
            this.conectar.fechaBanco();
        }
        
        return novoUsuario.getId() != 0;
    }
    
    
    private void btnCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroActionPerformed
        new CadastroLogin().setVisible(true);
        Login.this.dispose();
    }//GEN-LAST:event_btnCadastroActionPerformed

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnCadastro;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
