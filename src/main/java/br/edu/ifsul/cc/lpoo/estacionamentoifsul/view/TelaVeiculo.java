package br.edu.ifsul.cc.lpoo.estacionamentoifsul.view;

import br.edu.ifsul.cc.lpoo.estacionamentoifsul.lpoo_sistemaestacionamentoifsul.dao.PersistenciaJPA;
import java.util.List;
import javax.swing.DefaultListModel;
import model.Veiculo;
import model.VinculoPessoa;

public class TelaVeiculo extends javax.swing.JFrame {

    PersistenciaJPA jpa;

    public TelaVeiculo() {
        initComponents();

        jpa = new PersistenciaJPA();
        carregarVeiculosCadastrados();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        areaFiltros = new javax.swing.JPanel();
        lblBuscaPlaca = new javax.swing.JLabel();
        cmbVinculoOficial = new javax.swing.JComboBox<>();
        lblBuscaOficial = new javax.swing.JLabel();
        txtBuscaPlaca = new javax.swing.JTextField();
        areaListagem = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstVeiculos = new javax.swing.JList<>();
        areaBotoes = new javax.swing.JPanel();
        btnNovaPessoa = new javax.swing.JButton();
        btnEditarPessoa = new javax.swing.JButton();
        btnRemoverPessoa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblTitulo.setText("Veiculos Cadastrados");

        lblBuscaPlaca.setText("Placa:");

        cmbVinculoOficial.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbVinculoOficialItemStateChanged(evt);
            }
        });

        lblBuscaOficial.setText("Oficial:");

        txtBuscaPlaca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscaPlacaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscaPlacaKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout areaFiltrosLayout = new javax.swing.GroupLayout(areaFiltros);
        areaFiltros.setLayout(areaFiltrosLayout);
        areaFiltrosLayout.setHorizontalGroup(
            areaFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaFiltrosLayout.createSequentialGroup()
                .addComponent(lblBuscaPlaca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBuscaPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblBuscaOficial)
                .addGap(18, 18, 18)
                .addComponent(cmbVinculoOficial, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        areaFiltrosLayout.setVerticalGroup(
            areaFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaFiltrosLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(areaFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBuscaPlaca)
                    .addComponent(cmbVinculoOficial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBuscaPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBuscaOficial))
                .addContainerGap())
        );

        jScrollPane1.setViewportView(lstVeiculos);

        javax.swing.GroupLayout areaListagemLayout = new javax.swing.GroupLayout(areaListagem);
        areaListagem.setLayout(areaListagemLayout);
        areaListagemLayout.setHorizontalGroup(
            areaListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaListagemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        areaListagemLayout.setVerticalGroup(
            areaListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaListagemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        btnNovaPessoa.setText("Novo");
        btnNovaPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovaPessoaActionPerformed(evt);
            }
        });

        btnEditarPessoa.setText("Editar");
        btnEditarPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarPessoaActionPerformed(evt);
            }
        });

        btnRemoverPessoa.setText("Remover");
        btnRemoverPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverPessoaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout areaBotoesLayout = new javax.swing.GroupLayout(areaBotoes);
        areaBotoes.setLayout(areaBotoesLayout);
        areaBotoesLayout.setHorizontalGroup(
            areaBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaBotoesLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(btnNovaPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEditarPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRemoverPessoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        areaBotoesLayout.setVerticalGroup(
            areaBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaBotoesLayout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(areaBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovaPessoa)
                    .addComponent(btnEditarPessoa)
                    .addComponent(btnRemoverPessoa))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(areaFiltros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(areaListagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTitulo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(areaBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(areaFiltros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(areaListagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(areaBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovaPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovaPessoaActionPerformed

    }//GEN-LAST:event_btnNovaPessoaActionPerformed

    private void btnRemoverPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverPessoaActionPerformed

    }//GEN-LAST:event_btnRemoverPessoaActionPerformed

    private void cmbVinculoOficialItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbVinculoOficialItemStateChanged

    }//GEN-LAST:event_cmbVinculoOficialItemStateChanged

    private void txtBuscaPlacaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaPlacaKeyPressed

    }//GEN-LAST:event_txtBuscaPlacaKeyPressed

    private void txtBuscaPlacaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaPlacaKeyReleased
        if(txtBuscaPlaca.getText().trim().isEmpty()){
            carregarVeiculosCadastrados();
        } else{
            jpa.conexaoAberta();
            DefaultListModel modeloLista = new DefaultListModel();
            modeloLista.addAll(jpa.getVeiculos(txtBuscaPlaca.getText().trim()));
            System.out.println("Pessoas carregadas: "+jpa.getVeiculos(txtBuscaPlaca.getText().trim()));
            lstVeiculos.setModel(modeloLista);

            jpa.fecharConexao();
    }//GEN-LAST:event_txtBuscaPlacaKeyReleased

    private void btnEditarPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarPessoaActionPerformed

    }//GEN-LAST:event_btnEditarPessoaActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaVeiculo().setVisible(true);
            }
        });
    }

    public void carregarVeiculosCadastrados() {
        jpa.conexaoAberta();

        DefaultListModel modeloLista = new DefaultListModel();
        modeloLista.addAll(jpa.getVeiculos());
        lstVeiculos.setModel(modeloLista);

        jpa.fecharConexao();

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel areaBotoes;
    private javax.swing.JPanel areaFiltros;
    private javax.swing.JPanel areaListagem;
    private javax.swing.JButton btnEditarPessoa;
    private javax.swing.JButton btnNovaPessoa;
    private javax.swing.JButton btnRemoverPessoa;
    private javax.swing.JComboBox<VinculoPessoa> cmbVinculoOficial;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBuscaOficial;
    private javax.swing.JLabel lblBuscaPlaca;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JList<Veiculo> lstVeiculos;
    private javax.swing.JTextField txtBuscaPlaca;
    // End of variables declaration//GEN-END:variables

}
