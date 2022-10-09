package avaliativa01;

import java.awt.Button;
import java.awt.Image;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import static javax.swing.JOptionPane.showMessageDialog;



public class TelaExibe extends javax.swing.JFrame {

    // VARIÁVEIS STATICAS 
    public static  ArrayList<Cadastro> cadastros = new ArrayList<Cadastro>();
    public static String arquivo =  "bd.txt";
    public static int count;

    public TelaExibe(ArrayList<Cadastro> cadastros) {
        
        initComponents();
      
        this.setResizable(false);
        System.out.println(count);
        this.cadastros = cadastros;
        
        ler_arquivo(cadastros, arquivo);
      
        Atualiza(count);
        
        // Desabilitar Edição e Exclusão caso não haja nenhum Cadastro
        if(cadastros.size() <= 0) {
            editaCadastro.setEnabled(false);
            excluiCadastro.setEnabled(false);
        }
        
    }
    
    
    // ATUALIZA DADOS de cadastros
    public void Atualiza(int count) {
    
    // Sem cadastros
        if(cadastros.size() <= 0){
            
            ImageIcon iconDefault = new ImageIcon("default-image.jpg");
            Image imageDefault = iconDefault.getImage().getScaledInstance(fotoLabel.getWidth(), fotoLabel.getHeight(), java.awt.Image.SCALE_SMOOTH);
            ImageIcon photoDefault = new ImageIcon(imageDefault);
               
            this.nomeText.setText("Nada a exibir");
            this.enderecoText.setText("Nada a exibir");
            this.cidadeText.setText("Nada a exibir");
            this.data_nascText.setText("Nada a exibir");
            this.alturaText.setText("Nada a exibir");
            this.numeroText.setText("Nada a exibir");
            this.estadoText.setText("Nada a exibir");
            
            this.fotoLabel.setIcon(photoDefault);
            
        } else{
        
            if(count > cadastros.size()-1)
                count = cadastros.size()-1;
            
            this.nomeText.setText(this.cadastros.get(count).getNome());
            this.enderecoText.setText(this.cadastros.get(count).getEndereco());
            this.cidadeText.setText(this.cadastros.get(count).getCidade());
            this.data_nascText.setText(String.valueOf(this.cadastros.get(count).getIdade()));
            this.alturaText.setText(String.valueOf(this.cadastros.get(count).getAltura()));
            this.numeroText.setText(String.valueOf(this.cadastros.get(count).getNumero()));
            this.estadoText.setText(String.valueOf(this.cadastros.get(count).getEstado().getNome() ));
            this.fotoLabel.setIcon(this.cadastros.get(count).getFoto());
            
                
            selecionado.setText("Cadastros " + (cadastros.indexOf(cadastros.get(count)) + 1) + "/" + ((cadastros.size() -1) + 1));
        }
    }
   
     
    public void ler_arquivo(ArrayList<Cadastro> cadastros, String arquivo) {
    
        try ( FileInputStream readData = new FileInputStream("bd.txt") ) {

            ObjectInputStream readStream = new ObjectInputStream(readData);

            cadastros = (ArrayList<Cadastro>) readStream.readObject();

            readStream.close();   

        } catch (Exception e) {
            e.printStackTrace();
        }  
       
    }
    
// MUITO TEXTO AQUI          
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nomeText = new javax.swing.JTextField();
        insereCadastro = new javax.swing.JButton();
        data_nascText = new javax.swing.JTextField();
        alertLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        enderecoText = new javax.swing.JTextPane();
        cidadeText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        estadoText = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        numeroText = new javax.swing.JTextPane();
        jLabel5 = new javax.swing.JLabel();
        alturaText = new javax.swing.JTextField();
        fotoLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        excluiCadastro = new javax.swing.JButton();
        selecionado = new javax.swing.JLabel();
        editaCadastro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        insereCadastro.setText("Inserir novo Cadastro");
        insereCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insereCadastroActionPerformed(evt);
            }
        });

        data_nascText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                data_nascTextActionPerformed(evt);
            }
        });

        alertLabel.setText(".");

        jLabel2.setText("Nome");

        jLabel8.setText("Endereço");

        jLabel3.setText("Idade");

        jScrollPane1.setViewportView(enderecoText);
        enderecoText.setEnabled(false);

        jLabel4.setText("Cidade");

        jLabel9.setText("Número");

        jScrollPane2.setViewportView(numeroText);
        numeroText.setEnabled(false);

        jLabel5.setText("Estado");

        fotoLabel.setText("                             Escolher Foto");

        jLabel7.setText("Altura");

        jButton2.setText("Cadastro Anterior");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Próximo Cadastro");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        excluiCadastro.setText("Excluir esta Cadastro");
        excluiCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluiCadastroActionPerformed(evt);
            }
        });

        selecionado.setText(".");

        editaCadastro.setText("Editar este Cadastro");
        editaCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editaCadastroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(fotoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(alturaText)
                                    .addComponent(data_nascText)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(estadoText, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(nomeText, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(cidadeText, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(alertLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)))
                .addGap(6, 6, 6))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(insereCadastro)
                        .addGap(18, 18, 18)
                        .addComponent(excluiCadastro))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(selecionado))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(editaCadastro)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(selecionado)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(nomeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(data_nascText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(alturaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(cidadeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(estadoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(fotoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(editaCadastro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insereCadastro)
                    .addComponent(excluiCadastro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(alertLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2)
                        .addComponent(jButton3)))
                .addGap(7, 7, 7))
        );

        nomeText.setEnabled(false);
        data_nascText.setEnabled(false);
        cidadeText.setEnabled(false);
        estadoText.setEnabled(false);
        alturaText.setEnabled(false);

        pack();
    }// </editor-fold>//GEN-END:initComponents

// ABRIR TELA INSERE CADASTRO
    private void insereCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insereCadastroActionPerformed
        TelaAdd telaadd = new TelaAdd(cadastros);
        telaadd.setLocation(this.getLocation()); 
        telaadd.setVisible(true);
        this.setVisible(false);            
    }//GEN-LAST:event_insereCadastroActionPerformed
//
 

   
// ABRIR TELA EDITA CADASTRO 
    private void editaCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editaCadastroActionPerformed
        TelaEdit telaedit = new TelaEdit(cadastros, count);
        telaedit.setLocation(this.getLocation());
        telaedit.setVisible(true);
        this.setVisible(false);      
    }//GEN-LAST:event_editaCadastroActionPerformed

    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        count++;
       if(count > cadastros.size() - 1)
           count = 0;
        Atualiza(count);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         count--;
       if(count < 0)
           count = cadastros.size() - 1;
       
        Atualiza(count);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void excluiCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluiCadastroActionPerformed
         TelaAlert telaalert = new TelaAlert(cadastros, count);
         telaalert.setVisible(true);
        
    }//GEN-LAST:event_excluiCadastroActionPerformed

    private void data_nascTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_data_nascTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_data_nascTextActionPerformed
//
   
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
            java.util.logging.Logger.getLogger(TelaExibe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaExibe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaExibe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaExibe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaExibe(cadastros).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alertLabel;
    private javax.swing.JTextField alturaText;
    private javax.swing.JTextField cidadeText;
    private javax.swing.JTextField data_nascText;
    private javax.swing.JButton editaCadastro;
    private javax.swing.JTextPane enderecoText;
    private javax.swing.JTextField estadoText;
    private javax.swing.JButton excluiCadastro;
    private javax.swing.JLabel fotoLabel;
    private javax.swing.JButton insereCadastro;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nomeText;
    private javax.swing.JTextPane numeroText;
    private javax.swing.JLabel selecionado;
    // End of variables declaration//GEN-END:variables
}
