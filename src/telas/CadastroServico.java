package telas;

import classes.ServicoPrestado;
import conexoes.MySQL;
import javax.swing.JOptionPane;

public class CadastroServico extends javax.swing.JFrame {
    ServicoPrestado servico = new ServicoPrestado();
    MySQL conectar = new MySQL();
    
    public CadastroServico() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel9 = new javax.swing.JPanel();
        lblPrestadorServico = new javax.swing.JLabel();
        lblEmpresa = new javax.swing.JLabel();
        lblServicoPrestado = new javax.swing.JLabel();
        lblQtdHoras = new javax.swing.JLabel();
        pnlBotoes = new javax.swing.JPanel();
        btnSalvar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnBuscarBuscar = new javax.swing.JButton();
        bntBuscarLimpar = new javax.swing.JButton();
        cbxPrestadorServico = new javax.swing.JComboBox<>(getPrestadoresServico());
        cbxEmpresa = new javax.swing.JComboBox<>(getEmpresas());
        txtQuantidadeHoras = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtObservacoes = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        txtServicoPrestado = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPrestadorServico.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPrestadorServico.setText("Prestador de Serviço");
        jPanel9.add(lblPrestadorServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        lblEmpresa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEmpresa.setText("Empresa");
        jPanel9.add(lblEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        lblServicoPrestado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblServicoPrestado.setText("Serviço Prestado");
        jPanel9.add(lblServicoPrestado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        lblQtdHoras.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblQtdHoras.setText("Quantidade de Horas");
        jPanel9.add(lblQtdHoras, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        pnlBotoes.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS/Icone-salvar.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icone-deletar.png"))); // NOI18N
        btnDeletar.setText("Deletar");
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icone-voltar.png"))); // NOI18N
        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBotoesLayout = new javax.swing.GroupLayout(pnlBotoes);
        pnlBotoes.setLayout(pnlBotoesLayout);
        pnlBotoesLayout.setHorizontalGroup(
            pnlBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotoesLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        pnlBotoesLayout.setVerticalGroup(
            pnlBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBotoesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnDeletar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        jPanel9.add(pnlBotoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 480, -1));

        btnBuscarBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS/Icone-buscar.png"))); // NOI18N
        btnBuscarBuscar.setText("Buscar");
        btnBuscarBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarBuscarActionPerformed(evt);
            }
        });
        jPanel9.add(btnBuscarBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 130, -1));

        bntBuscarLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS/Icone-limpar.png"))); // NOI18N
        bntBuscarLimpar.setText("Limpar");
        bntBuscarLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntBuscarLimparActionPerformed(evt);
            }
        });
        jPanel9.add(bntBuscarLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 50, 130, -1));

        jPanel9.add(cbxPrestadorServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 480, -1));

        jPanel9.add(cbxEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 480, -1));
        jPanel9.add(txtQuantidadeHoras, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 150, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Observações");
        jPanel9.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, -1, -1));
        jPanel9.add(txtObservacoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 320, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Descrição detalhada de serviço prestado");
        jPanel9.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));
        jPanel9.add(txtDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 480, 85));
        jPanel9.add(txtServicoPrestado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 218, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cadastroserviço.png"))); // NOI18N
        jPanel9.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 450));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new Menu().setVisible(true);
        CadastroServico.this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void bntBuscarLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntBuscarLimparActionPerformed
        limparForm();
    }//GEN-LAST:event_bntBuscarLimparActionPerformed

    private void btnBuscarBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarBuscarActionPerformed
        buscarServico();
    }//GEN-LAST:event_btnBuscarBuscarActionPerformed

    private String[] getPrestadoresServico(){
        this.conectar.conectaBanco();
        String[] listaPrestadores = new String[3];
        
        try {
            String buscar = "SELECT "
                    + " nome "
                    + "FROM prestador_servico;";
            
            this.conectar.executarSQL(buscar);
            
            int i = 0;
            while (this.conectar.getResultSet().next()) {
                listaPrestadores[i] = this.conectar.getResultSet().getString(1);
                i++;
            }
        } catch (Exception e) {
            System.out.println("Erro ao carregar prestadores " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao carregar prestadores!");
        } finally {
            this.conectar.fechaBanco();
        }
        return listaPrestadores;
    }
    
    private String[] getEmpresas(){
        this.conectar.conectaBanco();
        String[] listaEmpresas = new String[3];
        
        try {
            String buscar = "SELECT "
                    + " razaoSocial "
                    + "FROM empresa;";
            
            this.conectar.executarSQL(buscar);
            
            int i = 0;
            while (this.conectar.getResultSet().next()) {
                listaEmpresas[i] = this.conectar.getResultSet().getString(1);
                i++;
            }
        } catch (Exception e) {
            System.out.println("Erro ao carregar empresas " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao carregar empresas!");
        } finally {
            this.conectar.fechaBanco();
        }
        return listaEmpresas;
    }
    
    private void buscarServico(){
        this.conectar.conectaBanco();
        
        try {
            String query = "SELECT "
                    + "id, "
                    + "quantidade_horas, "
                    + "observacoes, "
                    + "descricao_servico, "
                    + "servico_prestado, "
                    + "prestador_servico_id, "
                    + "cnpj_id"
                    + " FROM servico_prestado"
                    + " WHERE servico_prestado = '" + this.txtServicoPrestado.getText() + "';";
            
            this.conectar.executarSQL(query);
            
            while (this.conectar.getResultSet().next()) {
                servico.setId(this.conectar.getResultSet().getInt(1));
                servico.setQuantidadeHoras(this.conectar.getResultSet().getInt(2));
                servico.setObservacoes(this.conectar.getResultSet().getString(3));
                servico.setDescricaoServico(this.conectar.getResultSet().getString(4));
                servico.setServicoPrestado(this.conectar.getResultSet().getString(5));
                servico.setPrestadorServicoId(this.conectar.getResultSet().getInt(6));
                servico.setCnpjId(this.conectar.getResultSet().getInt(7));
            }
            if (servico.getId() == 0) {
                JOptionPane.showMessageDialog(null, "Serviço não encontrado!");
            }
        } catch (Exception e) {
            System.out.println("Erro ao consultar o Serviço Prestado: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao buscar Serviço Prestado!");
        } finally {
            setarForm();
            this.conectar.fechaBanco();
        }
    }
    
    private void setarForm(){
        this.cbxEmpresa.setSelectedIndex(servico.getCnpjId()-1);
        this.cbxPrestadorServico.setSelectedIndex(servico.getPrestadorServicoId()-1);
        this.txtServicoPrestado.setText(servico.getServicoPrestado());
        this.txtQuantidadeHoras.setText(String.valueOf(servico.getQuantidadeHoras()));
        this.txtObservacoes.setText(servico.getObservacoes());
        this.txtDescricao.setText(servico.getDescricaoServico());
    }
    
    private void limparForm(){
        servico.limpaDados();
        this.cbxEmpresa.setSelectedIndex(0);
        this.cbxPrestadorServico.setSelectedIndex(0);
        this.txtServicoPrestado.setText("");
        this.txtQuantidadeHoras.setText("");
        this.txtObservacoes.setText("");
        this.txtDescricao.setText("");
    }
    
    private void cadastrarServico(){
        this.conectar.conectaBanco();
        
        servico.setCnpjId(cbxEmpresa.getSelectedIndex()+1);
        servico.setPrestadorServicoId(cbxPrestadorServico.getSelectedIndex()+1);
        servico.setServicoPrestado(this.txtServicoPrestado.getText());
        servico.setQuantidadeHoras(Integer.parseInt(txtQuantidadeHoras.getText()));
        servico.setObservacoes(txtObservacoes.getText());
        servico.setDescricaoServico(txtDescricao.getText());
        
        try {
            String cadastrarUsuario = "INSERT INTO servico_prestado values (null, " + 
                    this.txtQuantidadeHoras.getText() + "," +
                    "'" + this.txtObservacoes.getText() + "', " +
                    "'" + this.txtDescricao.getText() + "', " +
                    "'" + this.txtServicoPrestado.getText() + "', " +
                    (this.cbxPrestadorServico.getSelectedIndex()+1) + "," +
                    (this.cbxEmpresa.getSelectedIndex()+1) + ");";
            
            this.conectar.insertSQL(cadastrarUsuario);
            
            JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso!");
            limparForm();
        } catch (Exception e) {
            System.out.println("Erro ao cadastrar serviço " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar serviço!");
        } finally {
            this.conectar.fechaBanco();
        }
    }
    
    private void atualizarServico(){
        this.conectar.conectaBanco();
        
        try {
            String query = "UPDATE servico_prestado SET " + 
                    "quantidade_horas = " + this.txtQuantidadeHoras.getText() + ", " +
                    "observacoes = '" + this.txtObservacoes.getText() + "', " +
                    "descricao_servico = '" + this.txtDescricao.getText() + "', " +
                    "servico_prestado = '" + this.txtServicoPrestado.getText() + "', " +
                    "prestador_servico_id = " + (this.cbxPrestadorServico.getSelectedIndex() +1)+ ", " +
                    "cnpj_id = " + (this.cbxEmpresa.getSelectedIndex() +1) +
                    " WHERE servico_prestado = '" + servico.getServicoPrestado() + "';";
            
            this.conectar.updateSQL(query);
            
            JOptionPane.showMessageDialog(null, "Atualizado com Sucesso!");
            limparForm();
            buscarServico();
        } catch (Exception e) {
            System.out.println("Erro ao atualizar serviço " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao atualizar serviço!");
        } finally {
            this.conectar.fechaBanco();
        }
    }
    
    private void deletarServico(){
        if(servico.getId() == 0){
            JOptionPane.showMessageDialog(null, "É preciso buscar o serviço antes de apagar!");
            return;
        }
        
        this.conectar.conectaBanco();
        
        try{
            String query = "DELETE FROM servico_prestado WHERE id = " + servico.getId()+";";
            this.conectar.updateSQL(query);
            JOptionPane.showMessageDialog(null, "Deletado com Sucesso!");
            
        } catch (Exception e) {
            System.out.println("Erro ao deletar serviço: "+ e.getMessage());
            JOptionPane.showMessageDialog (null, "Erro ao deletar serviço!");
            
        } finally {
            this.conectar.fechaBanco();
        }
    }
    
    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        deletarServico();
        servico.limpaDados();
        limparForm();
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if(servico.getId() != 0){
            atualizarServico();
        }
        else{
            cadastrarServico();
        }
        
        limparForm();
    }//GEN-LAST:event_btnSalvarActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroServico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntBuscarLimpar;
    private javax.swing.JButton btnBuscarBuscar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cbxEmpresa;
    private javax.swing.JComboBox<String> cbxPrestadorServico;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblEmpresa;
    private javax.swing.JLabel lblPrestadorServico;
    private javax.swing.JLabel lblQtdHoras;
    private javax.swing.JLabel lblServicoPrestado;
    private javax.swing.JPanel pnlBotoes;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtObservacoes;
    private javax.swing.JTextField txtQuantidadeHoras;
    private javax.swing.JTextField txtServicoPrestado;
    // End of variables declaration//GEN-END:variables
}
