package com.mycompany.telacliente;

import com.mycompany.teladono.ListaRestaurantes;
import com.mycompany.teladono.RepoBebidas;
import com.mycompany.teladono.RepoComidas;
import com.mycompany.teladono.RepoRestaurantes;
import com.mycompany.teladono.Comida;
import com.mycompany.teladono.Bebida;

import javax.swing.table.DefaultTableModel;

public class EscolhaUsuario extends javax.swing.JFrame {

    private UsuarioCliente clienteLogado;

    public EscolhaUsuario() {
        initComponents();
        this.clienteLogado = clienteLogado;
        carregarRestaurantes();
        carregarComidas();
        carregarBebidas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        RestaurantesCadastrados = new javax.swing.JTable();
        txtRC = new javax.swing.JLabel();
        BotaoPedido = new javax.swing.JButton();
        painelescolhacomida = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ComidasCadastradas = new javax.swing.JTable();
        painelescolhabebida = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        BebidasCadastradas1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        RestaurantesCadastrados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Endereço"
            }
        ));
        RestaurantesCadastrados.setGridColor(new java.awt.Color(204, 204, 204));
        RestaurantesCadastrados.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jScrollPane1.setViewportView(RestaurantesCadastrados);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                .addContainerGap())
        );

        txtRC.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        txtRC.setText("Restaurantes Cadastrados");

        BotaoPedido.setText("Fazer Pedido");
        BotaoPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoPedidoActionPerformed(evt);
            }
        });

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
        jScrollPane2.setViewportView(ComidasCadastradas);

        javax.swing.GroupLayout painelescolhacomidaLayout = new javax.swing.GroupLayout(painelescolhacomida);
        painelescolhacomida.setLayout(painelescolhacomidaLayout);
        painelescolhacomidaLayout.setHorizontalGroup(
            painelescolhacomidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelescolhacomidaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        painelescolhacomidaLayout.setVerticalGroup(
            painelescolhacomidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelescolhacomidaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                .addContainerGap())
        );

        painelescolhabebida.setBackground(new java.awt.Color(255, 255, 255));
        painelescolhabebida.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        BebidasCadastradas1.setBackground(new java.awt.Color(242, 242, 242));
        BebidasCadastradas1.setModel(new javax.swing.table.DefaultTableModel(
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
        BebidasCadastradas1.setGridColor(new java.awt.Color(204, 204, 204));
        BebidasCadastradas1.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jScrollPane4.setViewportView(BebidasCadastradas1);

        javax.swing.GroupLayout painelescolhabebidaLayout = new javax.swing.GroupLayout(painelescolhabebida);
        painelescolhabebida.setLayout(painelescolhabebidaLayout);
        painelescolhabebidaLayout.setHorizontalGroup(
            painelescolhabebidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelescolhabebidaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4)
                .addContainerGap())
        );
        painelescolhabebidaLayout.setVerticalGroup(
            painelescolhabebidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelescolhabebidaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(txtRC)
                .addGap(0, 627, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BotaoPedido)
                        .addGap(8, 8, 8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(painelescolhacomida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(painelescolhabebida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(txtRC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(painelescolhacomida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(painelescolhabebida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(BotaoPedido)
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

    private void configurarTabela() {
        DefaultTableModel model = (DefaultTableModel) RestaurantesCadastrados.getModel();
        model.setColumnIdentifiers(new String[]{"Nome", "Endereço"});

        DefaultTableModel modelComida = (DefaultTableModel) ComidasCadastradas.getModel();
        modelComida.setColumnIdentifiers(new String[]{"Nome", "Descrição", "Preço", "Tipo Cozinha", "Vegano", "Vegetariano", "Tempo Preparo"});

        DefaultTableModel modelBebida = (DefaultTableModel) BebidasCadastradas1.getModel();
        modelBebida.setColumnIdentifiers(new String[]{"Nome", "Descrição", "Preço", "Tamanho (ml)", "Alcoólica", "Recipiente"});
    }

    private void carregarRestaurantes() {
        DefaultTableModel model = (DefaultTableModel) RestaurantesCadastrados.getModel();
        model.setRowCount(0); 

        for (ListaRestaurantes restaurante : RepoRestaurantes.getListaRestaurantes()) {
            model.addRow(new Object[]{restaurante.getNome(), restaurante.getEndereco()});
        }
    }

    private void carregarComidas() {
        DefaultTableModel model = (DefaultTableModel) ComidasCadastradas.getModel();
        model.setRowCount(0); 

        for (Comida comida : RepoComidas.getListaComidas()) {
            model.addRow(new Object[]{
                comida.getNome(),
                comida.getDescricao(),
                comida.getPreco(),
                comida.getTipoCozinha(),
                comida.isVegano() ? "Sim" : "Não",
                comida.isVegetariano() ? "Sim" : "Não",
                comida.getTempoPreparo()
            });
        }
    }

    private void carregarBebidas() {
        DefaultTableModel model = (DefaultTableModel) BebidasCadastradas1.getModel();
        model.setRowCount(0); 

        for (Bebida bebida : RepoBebidas.getListaBebidas()) {
            model.addRow(new Object[]{
                bebida.getNome(),
                bebida.getDescricao(),
                bebida.getPreco(),
                bebida.getTamanhoMl(),
                bebida.isAlcoolica() ? "Sim" : "Não",
                bebida.getRecipiente()
            });
        }
    }


    private void BotaoPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoPedidoActionPerformed

    }//GEN-LAST:event_BotaoPedidoActionPerformed

    public static void main(String args[]) {
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable BebidasCadastradas1;
    private javax.swing.JButton BotaoPedido;
    private javax.swing.JTable ComidasCadastradas;
    private javax.swing.JTable RestaurantesCadastrados;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPanel painelescolhabebida;
    private javax.swing.JPanel painelescolhacomida;
    private javax.swing.JLabel txtRC;
    // End of variables declaration//GEN-END:variables
}
