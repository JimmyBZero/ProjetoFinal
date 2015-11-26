/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import derby.FilmeDerby;
import derby.PessoaDerby;
import filme.Filme;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import pessoa.Pessoa;

/**
 *
 * @author Jamex
 */
public class Admin extends javax.swing.JFrame {

    PessoaDerby pderby;
    FilmeDerby fderby;
    Statement stmt;
    
    
    
    /**
     * Creates new form Admin
     */
    public Admin() {
        initComponents();
        pderby = new PessoaDerby();
        fderby = new FilmeDerby();
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
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        addcliente = new javax.swing.JLabel();
        nome = new javax.swing.JLabel();
        jcNome = new javax.swing.JTextField();
        sobrenome = new javax.swing.JLabel();
        jcSobrenome = new javax.swing.JTextField();
        idade = new javax.swing.JLabel();
        jcIdade = new javax.swing.JTextField();
        id = new javax.swing.JLabel();
        jcId = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jfNome = new javax.swing.JTextField();
        jcSalvar = new javax.swing.JButton();
        jcListar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jfGenero = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jfNum = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jfExemplares = new javax.swing.JTextField();
        jfSalvar = new javax.swing.JButton();
        jfListar = new javax.swing.JButton();
        jcRemover = new javax.swing.JButton();
        jfRemover = new javax.swing.JButton();
        jInstrucoes = new javax.swing.JButton();
        jcBuscarNome = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        addcliente.setText("CLIENTE:");

        nome.setText("Nome:");

        jcNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcNomeActionPerformed(evt);
            }
        });

        sobrenome.setText("Sobrenome:");

        idade.setText("Idade:");

        id.setText("Numero de Identificação:");

        jLabel1.setText("FILME:");

        jLabel2.setText("Nome:");

        jcSalvar.setText("SALVAR");
        jcSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcSalvarActionPerformed(evt);
            }
        });

        jcListar.setText("LISTAR");
        jcListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcListarActionPerformed(evt);
            }
        });

        jLabel3.setText("Genero:");

        jLabel4.setText("Numero de Identificação:");

        jLabel5.setText("Numero de Exemplares:");

        jfSalvar.setText("SALVAR");
        jfSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jfSalvarActionPerformed(evt);
            }
        });

        jfListar.setText("LISTAR");
        jfListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jfListarActionPerformed(evt);
            }
        });

        jcRemover.setText("REMOVER");
        jcRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcRemoverActionPerformed(evt);
            }
        });

        jfRemover.setText("REMOVER");
        jfRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jfRemoverActionPerformed(evt);
            }
        });

        jInstrucoes.setText("INSTRUÇÕES");
        jInstrucoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jInstrucoesActionPerformed(evt);
            }
        });

        jcBuscarNome.setText("BUSCAR");
        jcBuscarNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcBuscarNomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jcNome)
                    .addComponent(jcSobrenome, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcIdade, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcId, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jfSalvar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jfListar, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                            .addComponent(addcliente)
                            .addComponent(nome)
                            .addComponent(sobrenome)
                            .addComponent(idade)
                            .addComponent(id)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jcSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcListar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jcRemover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jfRemover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jfNome, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jfGenero, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jfNum, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jfExemplares, javax.swing.GroupLayout.Alignment.LEADING))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addComponent(jInstrucoes, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcBuscarNome)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addcliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nome))
                    .addComponent(jInstrucoes, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jcBuscarNome, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jcNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sobrenome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(idade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(id)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcSalvar)
                    .addComponent(jcListar)
                    .addComponent(jcRemover))
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jfGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jfNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jfExemplares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jfSalvar)
                    .addComponent(jfListar)
                    .addComponent(jfRemover))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcSalvarActionPerformed
        
        int check = 0;
        /*String instrucao = "SELECT * FROM PESSOA";
        try{
            ResultSet rs = stmt.executeQuery(instrucao);
            while (rs.next()){
                if(jcId.getText() == rs.getString("ID")){
                    check = 1;                
                }
            }
        }catch(SQLException se){
            System.out.println("Mensagem: " + se.getMessage());
        }*/
        
        if( check == 0 ){       
            Pessoa p = new Pessoa(jcNome.getText(), jcSobrenome.getText(), Integer.parseInt(jcIdade.getText()), Integer.parseInt(jcId.getText()));
        pderby.adicionar(p);
        }else{
            System.out.println("Ja existe um cliente com este codigo, favor escolher outro codigo!");
        }
    }//GEN-LAST:event_jcSalvarActionPerformed

    private void jcNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcNomeActionPerformed

    private void jfSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jfSalvarActionPerformed
        Filme f = new Filme(jfNome.getText(), jfGenero.getText(), Integer.parseInt(jfNum.getText()), Integer.parseInt(jfExemplares.getText()));
        fderby.adicionar(f);
    }//GEN-LAST:event_jfSalvarActionPerformed

    private void jcListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcListarActionPerformed
        pderby.listarTudo();
    }//GEN-LAST:event_jcListarActionPerformed

    private void jfListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jfListarActionPerformed
        fderby.listarTudo();
    }//GEN-LAST:event_jfListarActionPerformed

    private void jfRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jfRemoverActionPerformed
        String codigo = jfNum.getText();
        fderby.remover(Integer.parseInt(codigo));
    }//GEN-LAST:event_jfRemoverActionPerformed

    private void jcRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcRemoverActionPerformed
        String codigo = jcId.getText();
        pderby.remover(Integer.parseInt(codigo));
    }//GEN-LAST:event_jcRemoverActionPerformed

    private void jInstrucoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jInstrucoesActionPerformed
        System.out.println("PARA ADICIONAR UM CLIENTE, PREENCHA TODOS OS CAMPOS DE CLIENTE E PRESSIONE SALVAR.");
        System.out.println("PARA ADICIONAR UM FILME, PREENCHA TODOS OS CAMPOS DE FILME E PRESSIONE SALVAR.\n");
        System.out.println("PARA REMOVER UM CLIENTE, PREENCHA O CAMPO NUMERO DE IDENTIFICAÇÃO EM CLIETE E PRESSIONE REMOVER.");
        System.out.println("PARA REMOVER UM FILME, PREENCHA O CAMPO NUMERO DE IDENTIFICAÇÃO EM FILME E PRESSIONE REMOVER.\n");
        System.out.println("PARA LISTAR TODOS OS FILMES OU CLIENTES, PRESSIONE LISTAR NO SEU DEVIDO CAMPO.\n");
        System.out.println("PARA ALUGAR UM FILME, PREENCHA AMBOS OS CAMPOS NUMERO DE IDENTIFICAÇÃO E PRESSIONE ALUGAR.");
        System.out.println("CASO EXISTA UM EXEMPLAR DISPONÍVEL, O SISTEMA SEMPRE IRÁ ALUGAR O EXEMPLAR COM O NUMERO MAIOR.");
        System.out.println("POR EXEMPLO, SE O EXEMPLAR DE NUMERO 3 É O EXEMPLAR DE MAIOR NÚMERO, O NUMERO 3 SERÁ ALUGADO, E ENTÃO O EXEMPLAR NUMERO 2 FICARÁ DISPONÍVEL PARA LOCAÇÃO.\n");
        System.out.println("PARA RECEBER UM EXEMPLAR QUE UM CLIENTE ALUGOU, PREENCHA O CAMPO NUMERO DE IDENTIFICAÇÃO EM FILME E PRESSIONE DEVOVER.\n");
        System.out.println("A FUNÇÃO CHECAR CLIENTE VERIFICA SE UM DETERMINADO CLIENTE ESTÁ COM ALGUM FILME ALUGADO.");    
        System.out.println("A FUNÇÃO CHECAR FILME VERIFICA SE UM DETERMINADO FILME ESTÁ COM ALGUM EXEMPLAR EMPRESTADO PARA ALGUM CLIENTE.");
        System.out.println("PARA CHECAR, PREENCHA O CAMPO NUMERO DE IDENTIFICAÇÃO EM CLIENTE OU FILME, DEPOIS PRESSIONE CHECAR CLIENTE OU CHECAR FILME.\n"); 
        
    }//GEN-LAST:event_jInstrucoesActionPerformed

    private void jcBuscarNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcBuscarNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcBuscarNomeActionPerformed

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addcliente;
    private javax.swing.JLabel id;
    private javax.swing.JLabel idade;
    private javax.swing.JButton jInstrucoes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton jcBuscarNome;
    private javax.swing.JTextField jcId;
    private javax.swing.JTextField jcIdade;
    private javax.swing.JButton jcListar;
    private javax.swing.JTextField jcNome;
    private javax.swing.JButton jcRemover;
    private javax.swing.JButton jcSalvar;
    private javax.swing.JTextField jcSobrenome;
    private javax.swing.JTextField jfExemplares;
    private javax.swing.JTextField jfGenero;
    private javax.swing.JButton jfListar;
    private javax.swing.JTextField jfNome;
    private javax.swing.JTextField jfNum;
    private javax.swing.JButton jfRemover;
    private javax.swing.JButton jfSalvar;
    private javax.swing.JLabel nome;
    private javax.swing.JLabel sobrenome;
    // End of variables declaration//GEN-END:variables
}
