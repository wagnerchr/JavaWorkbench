package avaliativa01;


import java.util.ArrayList;

public class Tela extends javax.swing.JFrame {
    
    // Vetor com cadastros
        public static ArrayList<Cadastro> cadastros = new ArrayList<Cadastro>();
        public static int count = 0;
              
    Cadastro c = new Cadastro("Wagner", "123456", "Av.Perna", "Caraguas", "Sp", "foto", 1, 177);
    Cadastro c2 = new Cadastro("Christos", "123456", "Av.Perna", "Caraguas", "Sp", "foto", 1, 177);
        
    public Tela() {
        
            
        
        
        initComponents();
       
      // cadastros.add(c);
        //cadastros.add(c2);
        
        for(Cadastro a : cadastros ){
            System.out.println(a);
        }
        
        Atualiza();
    }

    
    public void Atualiza() {
    // Caso não haja nenhum cadastro
         if(cadastros.size() <= 0){
             
            this.nomeText.setText("Nada a exibir");
            this.cpfText.setText("Nada a exibir");
            this.dataNascText.setText("Nada a exibir");
            this.alturaText.setText("Nada a exibir");
            this.cidadeText.setText("Nada a exibir");
            this.estadoText.setText("Nada a exibir");
        } else {
    
            this.nomeText.setText(this.cadastros.get(count).getNome());
            this.cpfText.setText(this.cadastros.get(count).getCpf());
            this.dataNascText.setText(String.valueOf(this.cadastros.get(count).getDataNasc()));
            this.alturaText.setText(String.valueOf(this.cadastros.get(count).getAltura()));
            this.cidadeText.setText(this.cadastros.get(count).getCidade());
            this.estadoText.setText(this.cadastros.get(count).getEstado());
            
            countLabel.setText((String.valueOf(count)) + " / " + (cadastros.size() - 1));
        }
        
        Editar(false);
    }
    
    public void Editar(boolean editar) {
        
        if(editar) {
            
            nomeText.setEditable(true);
            cpfText.setEditable(true);
            dataNascText.setEditable(true);
            alturaText.setEditable(true);
            cidadeText.setEditable(true);
            estadoText.setEditable(true);
        } else {
            
            nomeText.setEditable(false);
            cpfText.setEditable(false);
            dataNascText.setEditable(false);
            alturaText.setEditable(false);
            cidadeText.setEditable(false);
            estadoText.setEditable(false);
        }
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        fotoPanel = new javax.swing.JPanel();
        fotoLabel = new javax.swing.JLabel();
        countLabel = new javax.swing.JLabel();
        nomeText = new javax.swing.JTextField();
        cpfText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cidadeText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        estadoText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        dataNascText = new javax.swing.JTextField();
        alturaText = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        nextButton = new javax.swing.JButton();
        prevButton = new javax.swing.JButton();
        editarCadastro = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        insereCadastro = new javax.swing.JButton();
        alertLabel = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fotoLabel.setText("jLabel1");

        javax.swing.GroupLayout fotoPanelLayout = new javax.swing.GroupLayout(fotoPanel);
        fotoPanel.setLayout(fotoPanelLayout);
        fotoPanelLayout.setHorizontalGroup(
            fotoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fotoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fotoLabel)
                .addContainerGap(237, Short.MAX_VALUE))
        );
        fotoPanelLayout.setVerticalGroup(
            fotoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fotoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fotoLabel)
                .addContainerGap(232, Short.MAX_VALUE))
        );

        countLabel.setText("jLabel2");

        nomeText.setText("jTextField3");

        cpfText.setText("jTextField4");

        jLabel2.setText("Nome");

        jLabel3.setText("CPF");

        cidadeText.setText("jTextField2");

        jLabel4.setText("Cidade");

        estadoText.setText("jTextField5");

        jLabel5.setText("Estado");

        jLabel6.setText("Data de Nascimento");

        dataNascText.setText("jTextField6");

        alturaText.setText("jTextField7");

        jLabel7.setText("Altura");

        nextButton.setText("Próx. Cadastro");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        prevButton.setText("Cadastro Ant.");
        prevButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevButtonActionPerformed(evt);
            }
        });

        editarCadastro.setText("Editar");
        editarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarCadastroActionPerformed(evt);
            }
        });

        jButton4.setText("Deletar");

        insereCadastro.setText("Inserir novo Cadastro");
        insereCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insereCadastroActionPerformed(evt);
            }
        });

        alertLabel.setText(".");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(fotoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(prevButton)
                                .addGap(143, 143, 143)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(editarCadastro)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton4))
                                    .addComponent(insereCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(dataNascText))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel7))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(alturaText)
                                            .addComponent(estadoText)
                                            .addComponent(cidadeText)
                                            .addComponent(cpfText)
                                            .addComponent(nomeText))))
                                .addGap(19, 19, 19))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(nextButton)
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(countLabel)
                        .addContainerGap(626, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(alertLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(countLabel)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fotoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(nomeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cpfText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(dataNascText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(alturaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cidadeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(estadoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 168, Short.MAX_VALUE)
                .addComponent(alertLabel)
                .addGap(37, 37, 37)
                .addComponent(insereCadastro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nextButton)
                    .addComponent(prevButton)
                    .addComponent(editarCadastro)
                    .addComponent(jButton4))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

// Navegando entre os cadastros
    private void prevButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevButtonActionPerformed
        count--;
        if(count < 0) {
            count = cadastros.size() - 1;
        }
        
        Atualiza();
        
    }//GEN-LAST:event_prevButtonActionPerformed

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        count++;    
        if(count > cadastros.size() - 1) {
            count = 0;
        }
       
        Atualiza();
   
    }//GEN-LAST:event_nextButtonActionPerformed

    private void insereCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insereCadastroActionPerformed
        
    }//GEN-LAST:event_insereCadastroActionPerformed

// BOTÃO EDITAR
    private void editarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarCadastroActionPerformed
         
        if(editarCadastro.getText().equals("Salvar")) {
            
            cadastros.get(count).setNome(this.nomeText.getText());
            this.cadastros.get(count).setCpf(this.cpfText.getText());
            // cadastros.get(count).setDataNasc(String.valueOf(this.dataNascText.getText()));
            // cadastros.get(count).setAltura(String.valueOf(this.alturaText.getText()));
            cadastros.get(count).setCidade(this.cidadeText.getText());
            cadastros.get(count).setEstado(this.estadoText.getText());
            
            alertLabel.setText("Salvou!");
            Editar(false);
            editarCadastro.setText("Editar");    
            Atualiza();
        } else {
             alertLabel.setText("Liberada a Edição deste Cadastro.");
             Editar(true);
             editarCadastro.setText("Salvar");
        }
        
        
       
    }//GEN-LAST:event_editarCadastroActionPerformed

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
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alertLabel;
    private javax.swing.JTextField alturaText;
    private javax.swing.JTextField cidadeText;
    private javax.swing.JLabel countLabel;
    private javax.swing.JTextField cpfText;
    private javax.swing.JTextField dataNascText;
    private javax.swing.JButton editarCadastro;
    private javax.swing.JTextField estadoText;
    private javax.swing.JLabel fotoLabel;
    private javax.swing.JPanel fotoPanel;
    private javax.swing.JButton insereCadastro;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton nextButton;
    private javax.swing.JTextField nomeText;
    private javax.swing.JButton prevButton;
    // End of variables declaration//GEN-END:variables
}
