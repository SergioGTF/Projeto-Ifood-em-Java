package com.mycompany.teladono;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.List;

public class TelaLoginDono extends javax.swing.JFrame {

    private List<UsuarioDono> listaDonos;

    public TelaLoginDono() {
        initComponents();
        this.listaDonos = new ArrayList<>();  
    }

    public TelaLoginDono(List<UsuarioDono> listaDonos) {
        initComponents();
        this.listaDonos = listaDonos;  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jColorChooser1 = new javax.swing.JColorChooser();
        jColorChooser2 = new javax.swing.JColorChooser();
        JPanelLogin = new javax.swing.JPanel();
        txtSenha = new javax.swing.JLabel();
        BotaoEntrar = new javax.swing.JButton();
        txtNome = new javax.swing.JLabel();
        txtEmail = new javax.swing.JLabel();
        LoginID = new javax.swing.JTextField();
        txtCPF = new javax.swing.JLabel();
        LoginCPF = new javax.swing.JFormattedTextField();
        txtID1 = new javax.swing.JLabel();
        LoginNome = new javax.swing.JTextField();
        LoginSenha = new javax.swing.JPasswordField();
        LoginEmail = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("AcessoTeste");
        setResizable(false);

        JPanelLogin.setBackground(new java.awt.Color(255, 0, 0));
        JPanelLogin.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Login Dono", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 3, 36))); // NOI18N

        txtSenha.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        txtSenha.setText("Senha");

        BotaoEntrar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        BotaoEntrar.setText("Entrar");
        BotaoEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoEntrarActionPerformed(evt);
            }
        });

        txtNome.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        txtNome.setText("Nome");

        txtEmail.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        txtEmail.setText("Email");

        txtCPF.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        txtCPF.setText("CPF");

        try {
            LoginCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###.##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        txtID1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        txtID1.setText("ID");

        javax.swing.GroupLayout JPanelLoginLayout = new javax.swing.GroupLayout(JPanelLogin);
        JPanelLogin.setLayout(JPanelLoginLayout);
        JPanelLoginLayout.setHorizontalGroup(
            JPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelLoginLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotaoEntrar)
                .addContainerGap())
            .addGroup(JPanelLoginLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(JPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEmail)
                    .addGroup(JPanelLoginLayout.createSequentialGroup()
                        .addGroup(JPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(LoginEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
                            .addComponent(txtSenha, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNome, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LoginNome, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LoginSenha, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(71, 71, 71)
                        .addGroup(JPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCPF)
                            .addComponent(txtID1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LoginCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LoginID, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        JPanelLoginLayout.setVerticalGroup(
            JPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelLoginLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(JPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome)
                    .addComponent(txtCPF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LoginCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LoginNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(JPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelLoginLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(txtSenha))
                    .addGroup(JPanelLoginLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(txtID1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LoginID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LoginSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(txtEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LoginEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addComponent(BotaoEntrar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public boolean checkLogin(String login, String senha) {
        if (listaDonos == null || listaDonos.isEmpty()) {  
            return false;
        }

        UsuarioDono dono = listaDonos.stream()
                .filter(d -> d.getEmail().equals(login))
                .findFirst()
                .orElse(null);

        if (dono == null) {
            return false;
        }
        return dono.getSenha().equals(senha);
    }

    private void BotaoEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoEntrarActionPerformed
        String email = LoginEmail.getText().trim();
        String senha = new String(LoginSenha.getPassword()).trim();

        if (this.checkLogin(email, senha)) {
            UsuarioDono dono = listaDonos.stream()
                    .filter(d -> d.getEmail().equals(email))
                    .findFirst()
                    .orElse(null);

            if (dono != null) {
                JOptionPane.showMessageDialog(null, "Bem-vindo, " + dono.getNome());
                System.out.println("Informações do Dono:");
                dono.exibirdetalhesUsuario();
                new CadastroRestaurante().setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Dono não encontrado", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Dados inválidos", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BotaoEntrarActionPerformed

    public static void main(String args[]) {
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoEntrar;
    private javax.swing.JPanel JPanelLogin;
    private javax.swing.JFormattedTextField LoginCPF;
    private javax.swing.JTextField LoginEmail;
    private javax.swing.JTextField LoginID;
    private javax.swing.JTextField LoginNome;
    private javax.swing.JPasswordField LoginSenha;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JColorChooser jColorChooser2;
    private javax.swing.JLabel txtCPF;
    private javax.swing.JLabel txtEmail;
    private javax.swing.JLabel txtID1;
    private javax.swing.JLabel txtNome;
    private javax.swing.JLabel txtSenha;
    // End of variables declaration//GEN-END:variables
}
