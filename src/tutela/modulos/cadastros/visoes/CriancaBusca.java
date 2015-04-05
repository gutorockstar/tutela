/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tutela.modulos.cadastros.visoes;

import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import tutela.modulos.cadastros.modelos.daos.CriancaDAO;
import tutela.modulos.cadastros.modelos.negocios.Crianca;

/**
 *
 * @author augusto
 */
public class CriancaBusca extends javax.swing.JInternalFrame {
    
    public static CriancaFormulario criancaFormulario;
    
    /**
     * Creates new form CriancaVisao
     */
    public CriancaBusca() {
        super();
        initComponents();
        
        botaoNovo.setIcon(new ImageIcon(CriancaBusca.this.getClass().getResource("/tutela/publico/imagens/novo.png")));
        botaoEditar.setIcon(new ImageIcon(CriancaBusca.this.getClass().getResource("/tutela/publico/imagens/editar.png")));
        botaoExcluir.setIcon(new ImageIcon(CriancaBusca.this.getClass().getResource("/tutela/publico/imagens/excluir.png")));
        botaoBuscar.setIcon(new ImageIcon(CriancaBusca.this.getClass().getResource("/tutela/publico/imagens/buscar.png")));
        botaoAtualizar.setIcon(new ImageIcon(CriancaBusca.this.getClass().getResource("/tutela/publico/imagens/atualizar.png")));
        
        this.desabilitaAcoesDeEdicaoEExclusao();
    
        tabelaCrianca.setRowHeight(20);
        tabelaCrianca.setPreferredSize(new Dimension(10000, 500));
        
        // Evento ao selecionar um item da tabela.
        tabelaCrianca.getSelectionModel().addListSelectionListener(new ListSelectionListener() {  
            @Override  
            public void valueChanged(ListSelectionEvent evt) {  
               if (evt.getValueIsAdjusting())  
               {
                   return;  
               }
               
               int selected = tabelaCrianca.getSelectedRow();
               
               if ( selected != -1 )
               {
                    abilitaAcoesDeEdicaoEExclusao();
               }
               else
               {
                   desabilitaAcoesDeEdicaoEExclusao();
               }
            }  
         });
        
        this.atualizarTabela(0);
    }
    
    private void abilitaAcoesDeEdicaoEExclusao()
    {
        botaoEditar.setEnabled(true);
        botaoExcluir.setEnabled(true);
    }
    
    private void desabilitaAcoesDeEdicaoEExclusao()
    {
        botaoEditar.setEnabled(false);
        botaoExcluir.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        painelAcoes = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        botaoNovo = new javax.swing.JButton();
        botaoEditar = new javax.swing.JButton();
        botaoExcluir = new javax.swing.JButton();
        botaoAtualizar = new javax.swing.JButton();
        painelConteudo = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaCrianca = new javax.swing.JTable();
        busca = new javax.swing.JTextField();
        botaoBuscar = new javax.swing.JButton();

        setBorder(null);
        setTitle("Crianças/Adolescentes");

        jPanel1.setBackground(java.awt.SystemColor.controlLtHighlight);

        painelAcoes.setBackground(java.awt.SystemColor.controlLtHighlight);
        painelAcoes.setBorder(null);

        jToolBar1.setRollover(true);

        botaoNovo.setText("    Novo    ");
        botaoNovo.setFocusable(false);
        botaoNovo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoNovo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botaoNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoNovoActionPerformed(evt);
            }
        });
        jToolBar1.add(botaoNovo);

        botaoEditar.setText("   Editar   ");
        botaoEditar.setFocusable(false);
        botaoEditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoEditar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botaoEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEditarActionPerformed(evt);
            }
        });
        jToolBar1.add(botaoEditar);

        botaoExcluir.setText("   Excluir  ");
        botaoExcluir.setFocusable(false);
        botaoExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoExcluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirActionPerformed(evt);
            }
        });
        jToolBar1.add(botaoExcluir);

        botaoAtualizar.setText(" Atualizar ");
        botaoAtualizar.setFocusable(false);
        botaoAtualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoAtualizar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botaoAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAtualizarActionPerformed(evt);
            }
        });
        jToolBar1.add(botaoAtualizar);

        painelConteudo.setBackground(java.awt.SystemColor.controlLtHighlight);
        painelConteudo.setBorder(null);

        tabelaCrianca.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        tabelaCrianca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Estado civil", "Data de nascimento", "Sexo", "Origem étnica", "Cidade", "Telefone celular", "Possui necessidade especial", "Nome da mãe", "Nome do pai", "Outro responsável"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaCrianca);
        tabelaCrianca.getColumnModel().getColumn(0).setPreferredWidth(30);
        tabelaCrianca.getColumnModel().getColumn(1).setPreferredWidth(200);

        busca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                buscaKeyPressed(evt);
            }
        });

        botaoBuscar.setText("Procurar");
        botaoBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelConteudoLayout = new javax.swing.GroupLayout(painelConteudo);
        painelConteudo.setLayout(painelConteudoLayout);
        painelConteudoLayout.setHorizontalGroup(
            painelConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelConteudoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 980, Short.MAX_VALUE)
                    .addGroup(painelConteudoLayout.createSequentialGroup()
                        .addComponent(busca, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painelConteudoLayout.setVerticalGroup(
            painelConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelConteudoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botaoBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(busca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout painelAcoesLayout = new javax.swing.GroupLayout(painelAcoes);
        painelAcoes.setLayout(painelAcoesLayout);
        painelAcoesLayout.setHorizontalGroup(
            painelAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(painelConteudo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        painelAcoesLayout.setVerticalGroup(
            painelAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAcoesLayout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelConteudo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelAcoes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelAcoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoNovoActionPerformed
        criancaFormulario = new CriancaFormulario(this, true);
        criancaFormulario.setLocationRelativeTo(null);  // centraliza a tela
        criancaFormulario.setVisible(true);
    }//GEN-LAST:event_botaoNovoActionPerformed

    private void botaoAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAtualizarActionPerformed
	this.atualizarTabela(0);
    }//GEN-LAST:event_botaoAtualizarActionPerformed

    private void botaoEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEditarActionPerformed
        int selected = tabelaCrianca.getSelectedRow();
        
        if ( selected != -1 )
        {
            Object registro = tabelaCrianca.getValueAt(selected, 0);
            int codCrianca = Integer.parseInt(registro.toString());
            
            Crianca crianca = new Crianca(codCrianca);
            
            criancaFormulario = new CriancaFormulario(this, true);
            criancaFormulario.populaForumlario(crianca);
            criancaFormulario.setLocationRelativeTo(null);
            criancaFormulario.setVisible(true);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Selecione um registro!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botaoEditarActionPerformed

    private void botaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirActionPerformed
        int selected = tabelaCrianca.getSelectedRow();
        
        if ( selected != -1 )
        {
            int reply = JOptionPane.showConfirmDialog(null, "Você têm certeza que deseja excluir este registro?", "Atenção!", JOptionPane.YES_NO_OPTION);
            
            if ( reply == JOptionPane.YES_OPTION ) 
            {
                Object registro = tabelaCrianca.getValueAt(selected, 0);
                int idPessoa = Integer.parseInt(registro.toString());
                
                CriancaDAO criancaDao = new CriancaDAO();
                
                if ( criancaDao.excluir(idPessoa) )
                {
                    JOptionPane.showMessageDialog(null, "Registro excluído com sucesso!");
                    this.atualizarTabela(0);
                }
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Selecione um registro!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botaoExcluirActionPerformed

    private void botaoBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoBuscarActionPerformed
        String buscar = this.busca.getText();
        Crianca crianca = new Crianca();
        CriancaDAO criancaDao = new CriancaDAO();
        ResultSet resultSet;
        resultSet = criancaDao.listar(0, buscar);
        crianca.populaRegistrosNaTabela(tabelaCrianca, resultSet, 0);
    }//GEN-LAST:event_botaoBuscarActionPerformed

    private void buscaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscaKeyPressed
        if ( evt.getKeyCode() == KeyEvent.VK_ENTER ) 
        {
            this.botaoBuscarActionPerformed(null);
        }
    }//GEN-LAST:event_buscaKeyPressed

    public final void atualizarTabela(int codigoRegistroASelecionar) {
	Crianca crianca = new Crianca();
        CriancaDAO criancaDao = new CriancaDAO();
        ResultSet resultSet;
        resultSet = criancaDao.listar(0, null);
        crianca.populaRegistrosNaTabela(tabelaCrianca, resultSet, codigoRegistroASelecionar);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAtualizar;
    private javax.swing.JButton botaoBuscar;
    private javax.swing.JButton botaoEditar;
    private javax.swing.JButton botaoExcluir;
    private javax.swing.JButton botaoNovo;
    private javax.swing.JTextField busca;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JPanel painelAcoes;
    private javax.swing.JPanel painelConteudo;
    private javax.swing.JTable tabelaCrianca;
    // End of variables declaration//GEN-END:variables
}
