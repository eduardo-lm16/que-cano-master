package telas;

import classes.PrestadorServico;
import conexoes.MySQL;
import javax.swing.JOptionPane;

public class CadastroFuncionario extends javax.swing.JFrame {
    MySQL conectar = new MySQL();
    PrestadorServico novoFuncionario= new PrestadorServico ();
    int usuarioLogadoId;

    public CadastroFuncionario() {
        initComponents();
        getCargos();
    }
    
    public CadastroFuncionario(int usuarioId) {
        initComponents();
        getCargos();
        usuarioLogadoId = usuarioId;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel9 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        txtNome_fucionario = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        txtSexo2 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtEndereco = new javax.swing.JTextArea();
        jLabel44 = new javax.swing.JLabel();
        txtMatricula = new javax.swing.JTextField();
        btnBuscarBuscar = new javax.swing.JButton();
        bntBuscarLimpar = new javax.swing.JButton();
        cbxSexo = new javax.swing.JComboBox<>(getSexo());
        txtCpf = new javax.swing.JTextField();
        txtRg = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        txtnumeroFilhos = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        txtPis = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        cbxEstadoCivil = new javax.swing.JComboBox<>(getEstadoCivil());
        Cargo = new javax.swing.JLabel();
        cbxCargo = new javax.swing.JComboBox<>(getCargos());
        jLabel40 = new javax.swing.JLabel();
        txtDataNasc = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        jLabel39 = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        txtDataAdm = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel29.setText("Nome");
        jPanel9.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 60, -1));
        jPanel9.add(txtNome_fucionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 370, -1));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel30.setText("CPF");
        jPanel9.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 37, -1));

        txtSexo2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtSexo2.setText("Sexo");
        jPanel9.add(txtSexo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, -1, -1));

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel31.setText("Endereço");
        jPanel9.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        txtEndereco.setColumns(20);
        txtEndereco.setLineWrap(true);
        txtEndereco.setRows(5);
        jScrollPane5.setViewportView(txtEndereco);

        jPanel9.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 370, 80));

        jLabel44.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel44.setText("Numero de Matricula");
        jPanel9.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));
        jPanel9.add(txtMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 170, 30));

        btnBuscarBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS/Icone-buscar.png"))); // NOI18N
        btnBuscarBuscar.setText("Buscar");
        btnBuscarBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarBuscarActionPerformed(evt);
            }
        });
        jPanel9.add(btnBuscarBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, -1, 30));

        bntBuscarLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS/Icone-limpar.png"))); // NOI18N
        bntBuscarLimpar.setText("Limpar");
        bntBuscarLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntBuscarLimparActionPerformed(evt);
            }
        });
        jPanel9.add(bntBuscarLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, -1, 30));

        jPanel9.add(cbxSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 180, -1));
        jPanel9.add(txtCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 175, -1));
        jPanel9.add(txtRg, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 142, -1));

        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel34.setText("RG");
        jPanel9.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, 37, -1));
        jPanel9.add(txtnumeroFilhos, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 90, 161, -1));

        jLabel41.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel41.setText("Numero de Filhos");
        jPanel9.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 70, 120, -1));

        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel37.setText("NIS/PIS");
        jPanel9.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, 80, -1));
        jPanel9.add(txtPis, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, 142, -1));

        jLabel38.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel38.setText("Estado Civil");
        jPanel9.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 130, -1, -1));

        jPanel9.add(cbxEstadoCivil, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 150, 161, -1));

        Cargo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cargo.setText("Cargo");
        jPanel9.add(Cargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, 87, -1));

        cbxCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxCargoActionPerformed(evt);
            }
        });
        jPanel9.add(cbxCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, 146, -1));

        jLabel40.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel40.setText("Data de Nascimento");
        jPanel9.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 190, -1, -1));
        jPanel9.add(txtDataNasc, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 210, 161, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icone-voltar.png"))); // NOI18N
        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 330, 150, -1));

        btnDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icone-deletar.png"))); // NOI18N
        btnDeletar.setText("Deletar");
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });
        jPanel9.add(btnDeletar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 280, 160, -1));

        jLabel39.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel39.setText("Data de Admissão");
        jPanel9.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 260, -1, -1));

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS/Icone-salvar.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        jPanel9.add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 330, 160, -1));
        jPanel9.add(txtDataAdm, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 280, 150, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cadastrofuncionarios.png"))); // NOI18N
        jPanel9.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, -1, 430));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void deletarFuncionario (PrestadorServico novoFuncionario) {
        this.conectar.conectaBanco();
        String consultarMatricula = this.txtMatricula.getText();
        
        try{
            String deletarMatricula = "DELETE FROM prestador_servico WHERE numero_matricula = " + consultarMatricula;
            this.conectar.updateSQL(deletarMatricula);
            JOptionPane.showMessageDialog(null, "Deletado com Sucesso!!!");
            
        } catch (Exception e) {
            System.out.println("Erro ao Deletar Cliente"+ e.getMessage());
            JOptionPane.showMessageDialog (null, "Erro ao deletar Cliente");
            
        } finally {
            this.conectar.fechaBanco();
        }
    }
    
    public String[] getCargos(){
        this.conectar.conectaBanco();
        String[] listaCargos = new String[4];
        
        try {
            String buscarCargos = "SELECT "
                    + " nome_cargo "
                    + "FROM cargo";
            
            this.conectar.executarSQL(buscarCargos);
            
            int i = 0;
            while (this.conectar.getResultSet().next()) {
                listaCargos[i] = this.conectar.getResultSet().getString(1);
                i++;
            }
        } catch (Exception e) {
            System.out.println("Erro ao carregar cargos " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao carregar Cargos");
        } finally {
            this.conectar.fechaBanco();
        }
        return listaCargos;
    }
    
    public String[] getSexo(){
        this.conectar.conectaBanco();
        String consultaMatricula = this.txtMatricula.getText();
        String[] listaSexo = new String[3];
        
        try {
            String buscar = "SELECT "
                    + " descricao "
                    + "FROM sexo";
            
            this.conectar.executarSQL(buscar);
            
            int i = 0;
            while (this.conectar.getResultSet().next()) {
                listaSexo[i] = this.conectar.getResultSet().getString(1);
                i++;
            }
        } catch (Exception e) {
            System.out.println("Erro ao carregar sexos " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao carregar sexos");
        } finally {
            txtMatricula.setText(String.valueOf(novoFuncionario.getNumeroMatricula()));
            this.conectar.fechaBanco();
        }
        return listaSexo;
    }
    
    public String[] getEstadoCivil(){
        this.conectar.conectaBanco();
        String[] listaEstadoCivil = new String[3];
        
        try {
            String buscar = "SELECT "
                    + " descricao "
                    + "FROM estado_civil";
            
            this.conectar.executarSQL(buscar);
            
            int i = 0;
            while (this.conectar.getResultSet().next()) {
                listaEstadoCivil[i] = this.conectar.getResultSet().getString(1);
                i++;
            }
        } catch (Exception e) {
            System.out.println("Erro ao carregar estados civis " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao carregar estados civis");
        } finally {
            this.conectar.fechaBanco();
        }
        return listaEstadoCivil;
    }
    
    public void atualizaFuncionario () {
        this.conectar.conectaBanco();
        
        try{
            String query = "UPDATE prestador_servico SET "+
                "nome = '" + this.txtNome_fucionario.getText() + "', " +
                "data_admissao = '" + this.txtDataAdm.getText() + "', " +
                "cpf = '" + this.txtCpf.getText() + "', " +
                "rg = '" + this.txtRg.getText() + "', " +
                "pis = '" + this.txtPis.getText() + "', " +
                "sexo_id = " + (this.cbxSexo.getSelectedIndex()+1) + ", " +
                "estado_civil = " + (this.cbxEstadoCivil.getSelectedIndex()+1) + ", " +
                "numero_filhos = " + this.txtnumeroFilhos.getText() + ", " +
                "endereco = '" + this.txtEndereco.getText() + "', " +
                "data_nasc = '" + this.txtDataNasc.getText() + "', " +
                "cadastrado_por = " + usuarioLogadoId + ", "+
                "cargo_id = " + (this.cbxCargo.getSelectedIndex()+1) +
                " WHERE numero_matricula = " + novoFuncionario.getNumeroMatricula();

            this.conectar.updateSQL(query);
            
            if (novoFuncionario.getNumeroMatricula() == 0) {
                JOptionPane.showMessageDialog(null, "Erro não Buscar Funcionario");
            }
        } catch (Exception e) {
            System.out.println("Erro ao Atualizar Cliente"+ e.getMessage());
            JOptionPane.showMessageDialog (null, "Erro ao buscar Cliente");
        } finally {
            txtMatricula.setText(String.valueOf(novoFuncionario.getNumeroMatricula()));
            txtNome_fucionario.setText (novoFuncionario.getNome());
            txtDataAdm.setText(novoFuncionario.getDataAdmissao());
            txtCpf.setText(novoFuncionario.getCpf());
            txtRg.setText(novoFuncionario.getRg());
            txtPis.setText(String.valueOf(novoFuncionario.getPis()));
            cbxEstadoCivil.setSelectedIndex(novoFuncionario.getEstadoCivilId());
            txtnumeroFilhos.setText(String.valueOf(novoFuncionario.getNumeroFilhos()));
            txtEndereco.setText(novoFuncionario.getEndereco());
            txtDataNasc.setText(novoFuncionario.getDataNasc());
        }
        
    }
    
    public void buscarFuncionario() {
        this.conectar.conectaBanco();
        String consultaMatricula = this.txtMatricula.getText();
        
        try {
            String query = "SELECT "
                    + "numero_matricula, "
                    + "nome, "
                    + "data_admissao, "
                    + "cpf, "
                    + "rg, "
                    + "pis, "
                    + "sexo_id, "
                    + "estado_civil, "
                    + "numero_filhos, "
                    + "endereco, "
                    + "data_nasc, "
                    + "cargo_id "
                    + " FROM prestador_servico"
                    + " WHERE numero_matricula = " + consultaMatricula;
            
            this.conectar.executarSQL(query);
            
            while (this.conectar.getResultSet().next()) {
                novoFuncionario.setNumeroMatricula(Integer.parseInt(this.conectar.getResultSet().getString(1)));
                novoFuncionario.setNome(this.conectar.getResultSet().getString(2));
                novoFuncionario.setDataAdmissao(this.conectar.getResultSet().getString(3));
                novoFuncionario.setCpf(this.conectar.getResultSet().getString(4));
                novoFuncionario.setRg(this.conectar.getResultSet().getString(5));
                novoFuncionario.setPis(this.conectar.getResultSet().getString(6));
                novoFuncionario.setSexoId(Integer.parseInt(this.conectar.getResultSet().getString(7))-1);
                novoFuncionario.setEstadoCivilId(Integer.parseInt(this.conectar.getResultSet().getString(8))-1);
                novoFuncionario.setNumeroFilhos(Integer.parseInt(this.conectar.getResultSet().getString(9)));
                novoFuncionario.setEndereco(this.conectar.getResultSet().getString(10));
                novoFuncionario.setDataNasc(this.conectar.getResultSet().getString(11));
                novoFuncionario.setCargoId(Integer.parseInt(this.conectar.getResultSet().getString(12))-1);
            }
            if (novoFuncionario.getNumeroMatricula() == 0) {
                JOptionPane.showMessageDialog(null, "Prestador não encontrado!");
            }
        } catch (Exception e) {
            System.out.println("Erro ao consultar o Prestador de Servico" + e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao buscar Prestador");
        } finally {
            txtMatricula.setText(String.valueOf(novoFuncionario.getNumeroMatricula()));
            txtNome_fucionario.setText (novoFuncionario.getNome());
            txtDataAdm.setText(novoFuncionario.getDataAdmissao().toString());
            txtCpf.setText(novoFuncionario.getCpf());
            txtRg.setText(novoFuncionario.getRg());
            txtPis.setText(String.valueOf(novoFuncionario.getPis()));
            cbxEstadoCivil.setSelectedIndex(novoFuncionario.getEstadoCivilId());
            txtnumeroFilhos.setText(String.valueOf(novoFuncionario.getNumeroFilhos()));
            cbxCargo.setSelectedIndex(novoFuncionario.getCargoId());
            txtEndereco.setText(novoFuncionario.getEndereco());
            txtDataNasc.setText(novoFuncionario.getDataNasc().toString());
            this.conectar.fechaBanco();
        }
    }
    
    public void cadastrarPrestadorServico () {
            this.conectar.conectaBanco();             
            try{
                String query = "INSERT INTO prestador_servico values(null,"+
               this.txtMatricula.getText() + ", " +    
               " '" + this.txtNome_fucionario.getText() + "', " +
               " '" + this.txtDataAdm.getText() + "'," +
               " '" + this.txtCpf.getText() + "', " +
               " '" + this.txtRg.getText() + "', " +
               " '" + this.txtPis.getText() + "', " +
               (this.cbxSexo.getSelectedIndex()+1) + ", " +
               (this.cbxEstadoCivil.getSelectedIndex()+1) + ", " +
               this.txtnumeroFilhos.getText() + ", " +
               " '" + this.txtEndereco.getText() + "', " +
               " '" + this.txtDataNasc.getText() + "', " +
               this.usuarioLogadoId + ", " +
               (this.cbxCargo.getSelectedIndex()+ 1) + ");";
                this.conectar.insertSQL(query);
                JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso!!!");
            } catch (Exception e) {
               System.out.println("Erro ao cadastrar Funcionario " + e.getMessage());
               JOptionPane.showMessageDialog(null, "Erro ao cadastrar Funcionario");
            } finally {
                this.conectar.fechaBanco();
            }
}
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new Menu().setVisible(true);
        CadastroFuncionario.this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void bntBuscarLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntBuscarLimparActionPerformed
        novoFuncionario.limpaFuncionario();
        this.txtMatricula.setText ("");
        this.txtCpf.setText("");
        this.txtEndereco.setText("");
        this.txtDataAdm.setText("");
        this.txtRg.setText("");
        this.txtnumeroFilhos.setText("");
        this.txtPis.setText("");
        this.txtDataNasc.setText("");
        this.cbxCargo.setSelectedIndex(0);
        this.txtNome_fucionario.setText("");
    }//GEN-LAST:event_bntBuscarLimparActionPerformed

    private void btnBuscarBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarBuscarActionPerformed
        buscarFuncionario();
    }//GEN-LAST:event_btnBuscarBuscarActionPerformed

    private void cbxCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxCargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxCargoActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        deletarFuncionario(novoFuncionario);
        novoFuncionario.limpaFuncionario();
        this.txtNome_fucionario.setText("");
        this.txtCpf.setText("");
        this.txtEndereco.setText("");
        this.txtMatricula.setText("");
        this.txtDataAdm.setText("");
        this.txtRg.setText("");
        this.txtnumeroFilhos.setText("");
        this.txtPis.setText("");
        this.txtDataNasc.setText("");
        this.cbxCargo.setSelectedIndex(0);
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if(novoFuncionario.getNumeroMatricula() != 0){
            atualizaFuncionario();
        }
        else{
            cadastrarPrestadorServico();
        }

        novoFuncionario.limpaFuncionario();
        this.txtNome_fucionario.setText ("");
        this.txtCpf.setText("");
        this.txtEndereco.setText("");
        this.txtMatricula.setText("");
        this.txtDataAdm.setText("");
        this.txtRg.setText("");
        this.txtnumeroFilhos.setText("");
        this.txtPis.setText("");
        this.txtDataNasc.setText("");
        this.cbxCargo.setSelectedIndex(0);
    }//GEN-LAST:event_btnSalvarActionPerformed

    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cargo;
    private javax.swing.JButton bntBuscarLimpar;
    private javax.swing.JButton btnBuscarBuscar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cbxCargo;
    private javax.swing.JComboBox<String> cbxEstadoCivil;
    private javax.swing.JComboBox<String> cbxSexo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtDataAdm;
    private javax.swing.JTextField txtDataNasc;
    private javax.swing.JTextArea txtEndereco;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtNome_fucionario;
    private javax.swing.JTextField txtPis;
    private javax.swing.JTextField txtRg;
    private javax.swing.JLabel txtSexo2;
    private javax.swing.JTextField txtnumeroFilhos;
    // End of variables declaration//GEN-END:variables
}
