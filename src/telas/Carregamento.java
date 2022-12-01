
package telas;

import java.sql.Date;


public class Carregamento extends javax.swing.JFrame {

    Date data;
    public Carregamento() {
        initComponents();
        Login login = new Login();
        new Thread(){
            public void run (){
                try {
                    for(int i=0; i<101; i++){
                    Thread.sleep(60);
                    ProgressBar.setValue(i);
                    if(ProgressBar.getValue() <=25){
                        lblStatus.setText("Iniciando o sistema...");
                    
                    }
                    else if (ProgressBar.getValue()<=50){
                        lblStatus.setText("Carregando banco de dados...");
                    }
                }
                    dispose();
             login.setVisible(true);
            }catch(InterruptedException ex){
               
            }
        }
    }.start();
 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ProgressBar = new javax.swing.JProgressBar();
        lblStatus = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        ProgressBar.setStringPainted(true);
        jPanel1.add(ProgressBar);
        ProgressBar.setBounds(130, 270, 146, 14);

        lblStatus.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lblStatus);
        lblStatus.setBounds(120, 290, 180, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Logo.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(100, 50, 180, 190);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 420, 330);

        setSize(new java.awt.Dimension(408, 329));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Carregamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar ProgressBar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblStatus;
    // End of variables declaration//GEN-END:variables
}
