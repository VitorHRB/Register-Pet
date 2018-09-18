/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import DAO.ClienteDAO;
import Model.Cliente;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Vitor Henrique
 */
public class CadastroUsuario extends javax.swing.JFrame {
    MaskFormatter mascaraTelefone;
    public void criarMascara(){
        try {
           mascaraTelefone = new MaskFormatter("(##)#####-####");
           mascaraTelefone.install(f_telefone);
        } catch(Exception ex){
            throw new RuntimeException(ex);
        }
    }
    /**
     * Creates new form CadastroUsuario
     */
    public CadastroUsuario() {
        initComponents();
        criarMascara();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        f_nome = new javax.swing.JTextField();
        nomeusuario = new javax.swing.JLabel();
        enderecousuario = new javax.swing.JLabel();
        telefoneusuario = new javax.swing.JLabel();
        emailusuario = new javax.swing.JLabel();
        f_email = new javax.swing.JTextField();
        f_endereco = new javax.swing.JTextField();
        jButtoncadastrousuario = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        f_telefone = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(677, 408));
        getContentPane().setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/CadastroCliente.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 11, 339, 370);

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 102));
        jLabel1.setText("     Cadastro Cliente");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(380, 10, 270, 30);

        f_nome.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        f_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f_nomeActionPerformed(evt);
            }
        });
        getContentPane().add(f_nome);
        f_nome.setBounds(370, 80, 290, 30);

        nomeusuario.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        nomeusuario.setForeground(new java.awt.Color(102, 0, 102));
        nomeusuario.setText("Nome: *");
        getContentPane().add(nomeusuario);
        nomeusuario.setBounds(370, 60, 60, 18);

        enderecousuario.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        enderecousuario.setForeground(new java.awt.Color(102, 0, 102));
        enderecousuario.setText("Endereço: *");
        getContentPane().add(enderecousuario);
        enderecousuario.setBounds(370, 110, 90, 18);

        telefoneusuario.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        telefoneusuario.setForeground(new java.awt.Color(102, 0, 102));
        telefoneusuario.setText("Telefone: *");
        getContentPane().add(telefoneusuario);
        telefoneusuario.setBounds(370, 160, 90, 18);

        emailusuario.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        emailusuario.setForeground(new java.awt.Color(102, 0, 102));
        emailusuario.setText("E-mail: *");
        getContentPane().add(emailusuario);
        emailusuario.setBounds(370, 210, 70, 18);

        f_email.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        getContentPane().add(f_email);
        f_email.setBounds(370, 240, 290, 30);

        f_endereco.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        getContentPane().add(f_endereco);
        f_endereco.setBounds(370, 130, 290, 30);

        jButtoncadastrousuario.setBackground(new java.awt.Color(102, 0, 102));
        jButtoncadastrousuario.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jButtoncadastrousuario.setForeground(new java.awt.Color(255, 255, 255));
        jButtoncadastrousuario.setText("Cadastrar");
        jButtoncadastrousuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtoncadastrousuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jButtoncadastrousuario);
        jButtoncadastrousuario.setBounds(370, 340, 110, 25);

        jButton2.setBackground(new java.awt.Color(102, 0, 102));
        jButton2.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Cancelar Cadastro");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(490, 340, 170, 25);

        f_telefone.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        getContentPane().add(f_telefone);
        f_telefone.setBounds(370, 180, 290, 30);

        setSize(new java.awt.Dimension(693, 447));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void f_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_f_nomeActionPerformed
    public boolean checaCampos(){
        if(f_nome.getText().length()>0 && f_endereco.getText().length()>0 && f_telefone.getText().length()>0) {
            if(validar(f_email.getText()) == false){
                JOptionPane.showMessageDialog(null, "Informe um e-mail válido!");
                return false;  
        }    
            return true;
           
        }

        return false;
    }
    
    public static boolean validar(String email)
    {
        boolean isEmailIdValid = false;
        if (email != null && email.length() > 0) {
            String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
            Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(email);
            if (matcher.matches()) {
                isEmailIdValid = true;
            }
        }
        return isEmailIdValid;
    }
    private void jButtoncadastrousuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoncadastrousuarioActionPerformed
      /*PerfilUsuario cadAni = new PerfilUsuario();
      cadAni.setVisible(true);
      dispose();*/
      if(checaCampos() == true){
            Cliente c = new Cliente();
            c.setNome(f_nome.getText());
            c.setEndereco(f_endereco.getText());
            c.setTelefone(f_telefone.getText());
            c.setEmail(f_email.getText());
            ClienteDAO clienteDAO = new ClienteDAO();
            clienteDAO.create(c);
            PerfilAdm perfil = new PerfilAdm();
            perfil.setVisible(true);
            dispose();
            setVisible(false);
        } else {
          JOptionPane.showMessageDialog(null, "Há campos não preenchidos!");
      }
        
    }//GEN-LAST:event_jButtoncadastrousuarioActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        PerfilAdm tela = new PerfilAdm();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel emailusuario;
    private javax.swing.JLabel enderecousuario;
    private javax.swing.JTextField f_email;
    private javax.swing.JTextField f_endereco;
    private javax.swing.JTextField f_nome;
    private javax.swing.JFormattedTextField f_telefone;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtoncadastrousuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel nomeusuario;
    private javax.swing.JLabel telefoneusuario;
    // End of variables declaration//GEN-END:variables
}
