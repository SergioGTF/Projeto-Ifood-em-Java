package com.mycompany.teladono;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class CadastroBebidasRestaurante extends javax.swing.JFrame {

    private ArrayList<Bebida> listaBebidas = new ArrayList<>();

    public CadastroBebidasRestaurante() {
        initComponents();
        listaBebidas = new ArrayList<>();
        DefaultTableModel atl = (DefaultTableModel) BebidasCadastradas.getModel();
        BebidasCadastradas.setRowSorter(new TableRowSorter<>(atl));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtnome = new javax.swing.JLabel();
        txtdescrição = new javax.swing.JLabel();
        txtpreco = new javax.swing.JLabel();
        DescricaoBebida = new javax.swing.JTextField();
        BotaoCadastrar = new javax.swing.JButton();
        BotaoExcluir = new javax.swing.JButton();
        BotaoAtualizar = new javax.swing.JButton();
        PrecoBebida = new javax.swing.JFormattedTextField();
        NomeBebida = new javax.swing.JTextField();
        txttamanhomlbebida = new javax.swing.JLabel();
        TamanhoMlBebida = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        RecipienteBebida = new javax.swing.JTextField();
        painelescolhacomida = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        BebidasCadastradas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " Cadastrar Bebida", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 3, 18))); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtnome.setText("Nome");

        txtdescrição.setText("Descrição");

        txtpreco.setText("Preço");

        BotaoCadastrar.setText("Cadastrar");
        BotaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCadastrarActionPerformed(evt);
            }
        });

        BotaoExcluir.setText("Excluir");
        BotaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoExcluirActionPerformed(evt);
            }
        });

        BotaoAtualizar.setText("Atualizar");
        BotaoAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoAtualizarActionPerformed(evt);
            }
        });

        txttamanhomlbebida.setText("Tamanho em ml");

        jLabel1.setText("Recipiente");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(NomeBebida))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtdescrição)
                                .addGap(286, 286, 286))
                            .addComponent(DescricaoBebida)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtpreco, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PrecoBebida, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BotaoCadastrar)
                                .addGap(18, 18, 18)
                                .addComponent(BotaoExcluir)
                                .addGap(18, 18, 18)
                                .addComponent(BotaoAtualizar))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txttamanhomlbebida)
                                    .addComponent(TamanhoMlBebida, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(42, 42, 42)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(RecipienteBebida, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnome)
                    .addComponent(txtdescrição))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomeBebida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DescricaoBebida, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtpreco)
                    .addComponent(txttamanhomlbebida)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PrecoBebida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TamanhoMlBebida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RecipienteBebida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoCadastrar)
                    .addComponent(BotaoAtualizar)
                    .addComponent(BotaoExcluir))
                .addContainerGap())
        );

        painelescolhacomida.setBackground(new java.awt.Color(255, 255, 255));
        painelescolhacomida.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        BebidasCadastradas.setBackground(new java.awt.Color(242, 242, 242));
        BebidasCadastradas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome Bebida", "Descrição Bebida", "Preço ", "Ml bebida", "Alcólica", "Recipiente"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        BebidasCadastradas.setGridColor(new java.awt.Color(204, 204, 204));
        BebidasCadastradas.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jScrollPane1.setViewportView(BebidasCadastradas);

        javax.swing.GroupLayout painelescolhacomidaLayout = new javax.swing.GroupLayout(painelescolhacomida);
        painelescolhacomida.setLayout(painelescolhacomidaLayout);
        painelescolhacomidaLayout.setHorizontalGroup(
            painelescolhacomidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelescolhacomidaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 663, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelescolhacomidaLayout.setVerticalGroup(
            painelescolhacomidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelescolhacomidaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelescolhacomida, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(painelescolhacomida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void imprimirListaBebidas() {
        System.out.println("Lista de Bebidas Cadastradas:");
        for (int i = 0; i < listaBebidas.size(); i++) {
            Bebida bebida = listaBebidas.get(i);
            System.out.printf(
                    "Item %d - Nome: %s, Preço: %.2f, Descrição: %s, Tamanho: %d ml, Alcoólica: %s, Recipiente: %s\n",
                    i + 1, bebida.getNome(), bebida.getPreco(), bebida.getDescricao(), bebida.getTamanhoMl(),
                    bebida.isAlcoolica() ? "Sim" : "Não", bebida.getRecipiente()
            );
        }
        if (listaBebidas.isEmpty()) {
            System.out.println("A lista está vazia.");
        }
    }

    private void BotaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCadastrarActionPerformed
        String nome = NomeBebida.getText().trim();
        String precoStr = PrecoBebida.getText().trim();
        String descricao = DescricaoBebida.getText().trim();
        String tamanhoMlStr = TamanhoMlBebida.getText().trim();
        String recipiente = RecipienteBebida.getText().trim();
        boolean isAlcoolica = JOptionPane.showConfirmDialog(this, "A bebida é alcoólica?") == JOptionPane.YES_OPTION;

        if (nome.isEmpty() || precoStr.isEmpty() || descricao.isEmpty() || tamanhoMlStr.isEmpty() || recipiente.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        double preco = Double.parseDouble(precoStr);
        int tamanhoMl = Integer.parseInt(tamanhoMlStr);

        Bebida novaBebida = new Bebida(nome, descricao, preco, tamanhoMl, isAlcoolica, recipiente);
        listaBebidas.add(novaBebida);

        DefaultTableModel dtmBebida = (DefaultTableModel) BebidasCadastradas.getModel();
        Object[] dados = {nome, String.format("%.2f", preco), descricao, tamanhoMl + " ml", isAlcoolica ? "Sim" : "Não", recipiente};
        dtmBebida.addRow(dados);

        NomeBebida.setText("");
        PrecoBebida.setText("");
        DescricaoBebida.setText("");
        TamanhoMlBebida.setText("");
        RecipienteBebida.setText("");

        JOptionPane.showMessageDialog(this, "Bebida cadastrada com sucesso!");

        imprimirListaBebidas();
    }//GEN-LAST:event_BotaoCadastrarActionPerformed

    private void BotaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoExcluirActionPerformed
        int selectedRow = BebidasCadastradas.getSelectedRow();

        if (selectedRow != -1) {
            listaBebidas.remove(selectedRow);

            DefaultTableModel dtmBebidas = (DefaultTableModel) BebidasCadastradas.getModel();
            dtmBebidas.removeRow(selectedRow);

            JOptionPane.showMessageDialog(this, "Bebida excluída com sucesso!");
            imprimirListaBebidas();
        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma bebida para excluir");
        }
    }//GEN-LAST:event_BotaoExcluirActionPerformed

    private void BotaoAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoAtualizarActionPerformed
        int selectedRow = BebidasCadastradas.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Selecione uma bebida para atualizar!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String nome = NomeBebida.getText().trim();
        String precoStr = PrecoBebida.getText().trim();
        String descricao = DescricaoBebida.getText().trim();
        String tamanhoMlStr = TamanhoMlBebida.getText().trim();
        String recipiente = RecipienteBebida.getText().trim();
        boolean isAlcoolica = JOptionPane.showConfirmDialog(this, "A bebida é alcoólica?") == JOptionPane.YES_OPTION;

        if (nome.isEmpty() || precoStr.isEmpty() || descricao.isEmpty() || tamanhoMlStr.isEmpty() || recipiente.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos para atualizar a bebida!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        double preco = Double.parseDouble(precoStr);
        int tamanhoMl = Integer.parseInt(tamanhoMlStr);

        Bebida bebida = listaBebidas.get(selectedRow);
        bebida.setNome(nome);
        bebida.setPreco(preco);
        bebida.setDescricao(descricao);
        bebida.setTamanhoMl(tamanhoMl);
        bebida.setAlcoolica(isAlcoolica);
        bebida.setRecipiente(recipiente);

        DefaultTableModel dtmBebida = (DefaultTableModel) BebidasCadastradas.getModel();
        dtmBebida.setValueAt(nome, selectedRow, 0);
        dtmBebida.setValueAt(descricao, selectedRow, 1);
        dtmBebida.setValueAt(String.format("%.2f", preco), selectedRow, 2);
        dtmBebida.setValueAt(tamanhoMl + " ml", selectedRow, 3);
        dtmBebida.setValueAt(isAlcoolica ? "Sim" : "Não", selectedRow, 4);
        dtmBebida.setValueAt(recipiente, selectedRow, 5);

        JOptionPane.showMessageDialog(this, "Bebida atualizada com sucesso!");
        imprimirListaBebidas();
    }//GEN-LAST:event_BotaoAtualizarActionPerformed

    public static void main(String args[]) {
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable BebidasCadastradas;
    private javax.swing.JButton BotaoAtualizar;
    private javax.swing.JButton BotaoCadastrar;
    private javax.swing.JButton BotaoExcluir;
    private javax.swing.JTextField DescricaoBebida;
    private javax.swing.JTextField NomeBebida;
    private javax.swing.JFormattedTextField PrecoBebida;
    private javax.swing.JTextField RecipienteBebida;
    private javax.swing.JFormattedTextField TamanhoMlBebida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel painelescolhacomida;
    private javax.swing.JLabel txtdescrição;
    private javax.swing.JLabel txtnome;
    private javax.swing.JLabel txtpreco;
    private javax.swing.JLabel txttamanhomlbebida;
    // End of variables declaration//GEN-END:variables
}
