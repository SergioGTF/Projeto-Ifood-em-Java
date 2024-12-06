package com.mycompany.teladono;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class CadastroComidaRestaurante extends javax.swing.JFrame {
    
    private List<Comida> listaComidas = new ArrayList<>();
    private boolean comidacadastrada = false;

    public CadastroComidaRestaurante() {
        initComponents();
        listaComidas = new ArrayList<>();
        DefaultTableModel atl = (DefaultTableModel) ComidasCadastradas.getModel();
        ComidasCadastradas.setRowSorter(new TableRowSorter<>(atl));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtnome = new javax.swing.JLabel();
        txtdescrição = new javax.swing.JLabel();
        txtpreco = new javax.swing.JLabel();
        DescricaoComida = new javax.swing.JTextField();
        txttp = new javax.swing.JLabel();
        BotaoCadastrar = new javax.swing.JButton();
        BotaoExcluir = new javax.swing.JButton();
        BotaoAtualizar = new javax.swing.JButton();
        PrecoComida = new javax.swing.JFormattedTextField();
        TempPrepComida = new javax.swing.JFormattedTextField();
        NomeComida = new javax.swing.JTextField();
        txtttipocozinha = new javax.swing.JLabel();
        TipoCozinha = new javax.swing.JTextField();
        painelescolhacomida = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ComidasCadastradas = new javax.swing.JTable();
        BotaoProximo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " Cadastrar Comida", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 3, 18))); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtnome.setText("Nome");

        txtdescrição.setText("Descrição");

        txtpreco.setText("Preço");

        txttp.setText("Tempo preparo");

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

        txtttipocozinha.setText("Tipo de cozinha");

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
                            .addComponent(NomeComida))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtdescrição)
                                .addGap(286, 286, 286))
                            .addComponent(DescricaoComida)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtpreco, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PrecoComida, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txttp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TempPrepComida))
                        .addGap(65, 65, 65)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtttipocozinha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TipoCozinha))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addComponent(BotaoCadastrar)
                        .addGap(18, 18, 18)
                        .addComponent(BotaoExcluir)
                        .addGap(18, 18, 18)
                        .addComponent(BotaoAtualizar)))
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
                    .addComponent(NomeComida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DescricaoComida, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttp)
                    .addComponent(txtttipocozinha)
                    .addComponent(txtpreco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TempPrepComida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TipoCozinha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PrecoComida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoCadastrar)
                    .addComponent(BotaoAtualizar)
                    .addComponent(BotaoExcluir))
                .addContainerGap())
        );

        painelescolhacomida.setBackground(new java.awt.Color(255, 255, 255));
        painelescolhacomida.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ComidasCadastradas.setBackground(new java.awt.Color(242, 242, 242));
        ComidasCadastradas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Descrição", "Preço", "Tempo de Preparo", "Tipo de Cozinha", "Tipo de Comida"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ComidasCadastradas.setGridColor(new java.awt.Color(204, 204, 204));
        ComidasCadastradas.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jScrollPane1.setViewportView(ComidasCadastradas);

        javax.swing.GroupLayout painelescolhacomidaLayout = new javax.swing.GroupLayout(painelescolhacomida);
        painelescolhacomida.setLayout(painelescolhacomidaLayout);
        painelescolhacomidaLayout.setHorizontalGroup(
            painelescolhacomidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelescolhacomidaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 674, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelescolhacomidaLayout.setVerticalGroup(
            painelescolhacomidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelescolhacomidaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        BotaoProximo.setText("Próximo");
        BotaoProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoProximoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelescolhacomida, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BotaoProximo)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(painelescolhacomida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(BotaoProximo)
                .addContainerGap())
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

    private void imprimirListaComidas() {
        System.out.println("Lista de Comidas Cadastradas:");
        for (int i = 0; i < listaComidas.size(); i++) {
            Comida comida = listaComidas.get(i);
            System.out.printf(
                    "Item %d - Nome: %s, Preço: %.2f, Descrição: %s, Tempo de Preparo: %d minutos, Tipo de Cozinha: %s, Vegano: %s, Vegetariano: %s\n",
                    i + 1, comida.getNome(), comida.getPreco(), comida.getDescricao(), comida.getTempoPreparo(),
                    comida.getTipoCozinha(), comida.isVegano() ? "Sim" : "Não", comida.isVegetariano() ? "Sim" : "Não"
            );
        }
        if (listaComidas.isEmpty()) {
            System.out.println("A lista está vazia.");
        }
    }

    private void BotaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCadastrarActionPerformed
        String nome = NomeComida.getText().trim();
        String precoStr = PrecoComida.getText().trim();
        String descricao = DescricaoComida.getText().trim();
        String tempoPreparoStr = TempPrepComida.getText().trim();
        String tipoCozinha = TipoCozinha.getText().trim();
        boolean isVegano = JOptionPane.showConfirmDialog(this, "É vegano?") == JOptionPane.YES_OPTION;
        boolean isVegetariano = JOptionPane.showConfirmDialog(this, "É vegetariano?") == JOptionPane.YES_OPTION;

        if (nome.isEmpty() || precoStr.isEmpty() || descricao.isEmpty() || tempoPreparoStr.isEmpty() || tipoCozinha.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        double preco = Double.parseDouble(precoStr);
        int tempoPreparo = Integer.parseInt(tempoPreparoStr);

        Comida novaComida = new Comida(nome, descricao, preco, tipoCozinha, isVegano, isVegetariano, tempoPreparo);
        listaComidas.add(novaComida);

        DefaultTableModel dtmComida = (DefaultTableModel) ComidasCadastradas.getModel();
        Object[] dados = {nome, String.valueOf(preco), descricao, String.valueOf(tempoPreparo), tipoCozinha, isVegano ? "Sim" : "Não", isVegetariano ? "Sim" : "Não"};
        dtmComida.addRow(dados);

        NomeComida.setText("");
        PrecoComida.setText("");
        DescricaoComida.setText("");
        TempPrepComida.setText("");
        TipoCozinha.setText("");

        JOptionPane.showMessageDialog(this, "Produto cadastrado com sucesso!");

        imprimirListaComidas();

        comidacadastrada = true;
    }//GEN-LAST:event_BotaoCadastrarActionPerformed

    private void BotaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoExcluirActionPerformed
        int selectedRow = ComidasCadastradas.getSelectedRow();

        if (selectedRow != -1) {
            listaComidas.remove(selectedRow);

            DefaultTableModel dtmProdutos = (DefaultTableModel) ComidasCadastradas.getModel();
            dtmProdutos.removeRow(selectedRow);

            JOptionPane.showMessageDialog(this, "Produto excluído com sucesso!");

            imprimirListaComidas();

        } else {
            JOptionPane.showMessageDialog(this, "Selecione um produto para excluir");
        }
    }//GEN-LAST:event_BotaoExcluirActionPerformed

    private void BotaoAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoAtualizarActionPerformed
        int selectedRow = ComidasCadastradas.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Selecione um produto para atualizar!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String nome = NomeComida.getText().trim();
        String precoStr = PrecoComida.getText().trim();
        String descricao = DescricaoComida.getText().trim();
        String tempoPreparoStr = TempPrepComida.getText().trim();
        String tipoCozinha = TipoCozinha.getText().trim();
        boolean isVegano = JOptionPane.showConfirmDialog(this, "É vegano?") == JOptionPane.YES_OPTION;
        boolean isVegetariano = JOptionPane.showConfirmDialog(this, "É vegetariano?") == JOptionPane.YES_OPTION;
        if (nome.isEmpty() || precoStr.isEmpty() || descricao.isEmpty() || tempoPreparoStr.isEmpty() || tipoCozinha.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos para atualizar o produto!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        double preco = Double.parseDouble(precoStr);
        int tempoPreparo = Integer.parseInt(tempoPreparoStr);

        Comida comida = listaComidas.get(selectedRow);
        comida.setNome(nome);
        comida.setPreco(preco);
        comida.setDescricao(descricao);
        comida.setTempoPreparo(tempoPreparo);
        comida.setTipoCozinha(tipoCozinha);
        comida.setVegano(isVegano);
        comida.setVegetariano(isVegetariano);

        DefaultTableModel dtmComida = (DefaultTableModel) ComidasCadastradas.getModel();
        dtmComida.setValueAt(nome, selectedRow, 0);
        dtmComida.setValueAt(preco, selectedRow, 1);
        dtmComida.setValueAt(descricao, selectedRow, 2);
        dtmComida.setValueAt(tempoPreparo, selectedRow, 3);
        dtmComida.setValueAt(tipoCozinha, selectedRow, 4);
        dtmComida.setValueAt(isVegano ? "Sim" : "Não", selectedRow, 5);
        dtmComida.setValueAt(isVegetariano ? "Sim" : "Não", selectedRow, 6);

        JOptionPane.showMessageDialog(this, "Produto atualizado com sucesso!");

        imprimirListaComidas();
    }//GEN-LAST:event_BotaoAtualizarActionPerformed

    private void BotaoProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoProximoActionPerformed
        if (comidacadastrada) {
            CadastroBebidasRestaurante cadbebidarest = new CadastroBebidasRestaurante();
            cadbebidarest.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Cadastre um restaurante antes de prosseguir.");
        }
    }//GEN-LAST:event_BotaoProximoActionPerformed

    public static void main(String args[]) {
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoAtualizar;
    private javax.swing.JButton BotaoCadastrar;
    private javax.swing.JButton BotaoExcluir;
    private javax.swing.JButton BotaoProximo;
    private javax.swing.JTable ComidasCadastradas;
    private javax.swing.JTextField DescricaoComida;
    private javax.swing.JTextField NomeComida;
    private javax.swing.JFormattedTextField PrecoComida;
    private javax.swing.JFormattedTextField TempPrepComida;
    private javax.swing.JTextField TipoCozinha;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel painelescolhacomida;
    private javax.swing.JLabel txtdescrição;
    private javax.swing.JLabel txtnome;
    private javax.swing.JLabel txtpreco;
    private javax.swing.JLabel txttp;
    private javax.swing.JLabel txtttipocozinha;
    // End of variables declaration//GEN-END:variables
}
