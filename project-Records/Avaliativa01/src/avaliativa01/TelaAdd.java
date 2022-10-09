package avaliativa01;


import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

public class TelaAdd extends javax.swing.JFrame {
    
   
    public static ArrayList<Cadastro> cadastros = new ArrayList<Cadastro>();
               
    public TelaAdd(ArrayList<Cadastro> cadastros) {
             
        this.setResizable(false);
        initComponents();
        
        this.cadastros = cadastros; 


        setDefaultImage();
            
    }
    
    public void setDefaultImage() {
        // Foto Padrão 
        System.out.println("Entrou!");
            ImageIcon iconDefault = new ImageIcon("default-image.jpg");
            Image imageDefault = iconDefault.getImage().getScaledInstance(fotoLabel.getWidth(), fotoLabel.getHeight(), java.awt.Image.SCALE_SMOOTH);
            ImageIcon photoDefault = new ImageIcon(imageDefault);
            fotoLabel.setIcon(photoDefault);
      
            
        try( BufferedReader br = new BufferedReader(new FileReader("estados.txt")) ) {
        
            String linha;     
            
            while ( (linha = br.readLine() ) != null) {
                
                
                String vet[] = linha.split("#");               
                String sigla = vet[0];
                       
                estadoChooser.addItem(sigla);
                
            }
            
            br.close();
        } catch(Exception e) {
            System.out.println(e);
        }      
    }
    
    
// ESCREVER ARQUIVO
    public void escrever_arquivo() throws IOException {
                   
        try {
            
            FileOutputStream writeData = new FileOutputStream("bd.txt");
            
            ObjectOutputStream writeStream = new ObjectOutputStream(writeData);

            writeStream.writeObject(cadastros);
            writeStream.flush();
            writeStream.close();

            System.out.println(cadastros.get(0).getEstado());         
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            TelaExibe telaexibe = new TelaExibe(cadastros);
            telaexibe.setLocation(this.getLocation());
            telaexibe.setVisible(true);
            this.setVisible(false);
        }
         
    }    
    
// MUCHO TEXTO 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        countLabel = new javax.swing.JLabel();
        nomeText = new javax.swing.JTextField();
        data_nascText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cidadeText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        alturaText = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        prevButton = new javax.swing.JButton();
        insereCadastro = new javax.swing.JButton();
        alertLabel = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        enderecoText = new javax.swing.JTextPane();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        numeroText = new javax.swing.JTextPane();
        fotoLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        estadoChooser = new javax.swing.JComboBox<>();

        jLabel1.setText("jLabel1");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Nome");

        jLabel3.setText("Data de Nascimento");

        jLabel4.setText("Cidade");

        jLabel5.setText("Estado");

        jLabel7.setText("Altura");

        prevButton.setText("Cancelar");
        prevButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevButtonActionPerformed(evt);
            }
        });

        insereCadastro.setText("Inserir novo Cadastro");
        insereCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insereCadastroActionPerformed(evt);
            }
        });

        alertLabel.setText(".");

        jLabel8.setText("Endereço");

        jScrollPane1.setViewportView(enderecoText);

        jLabel9.setText("Número");

        jScrollPane2.setViewportView(numeroText);

        fotoLabel.setText("                             Escolher Foto");

        jButton1.setText("Escolher Foto");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        estadoChooser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {}));
        estadoChooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estadoChooserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(prevButton)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(alertLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(149, 149, 149)
                                .addComponent(insereCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 154, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(countLabel)
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
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
                                                .addComponent(jLabel2)
                                                .addGap(18, 18, 18)
                                                .addComponent(nomeText, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel9)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                    .addComponent(jLabel5)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(estadoChooser, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                    .addComponent(jLabel4)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(cidadeText, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(countLabel)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(fotoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
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
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(estadoChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(insereCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(alertLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(prevButton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

// CANCELA INSERÇÃO
    private void prevButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevButtonActionPerformed
        new TelaExibe(cadastros).setVisible(true);
        this.setVisible(false);       
    }//GEN-LAST:event_prevButtonActionPerformed
//
    
// INSERE NOVO CADASTRO
    private void insereCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insereCadastroActionPerformed

        try {
            
            Date date = new SimpleDateFormat("dd/MM/yyyy").parse(this.data_nascText.getText());
            
            ImageIcon icon = (ImageIcon)this.fotoLabel.getIcon();
           
            Cadastro novo = new Cadastro( 
                                        this.nomeText.getText(),
                                        this.enderecoText.getText(),
                                        this.cidadeText.getText(), 
                                        date,
                                        Float.parseFloat(String.valueOf(this.alturaText.getText())),                                  
                                        Integer.parseInt(String.valueOf(this.numeroText.getText())), 
                                        icon
                                        );
            
            Estado novoEstado = new Estado();     
            
            novoEstado.setSigla(String.valueOf(this.estadoChooser.getSelectedItem()) );
            novoEstado.setNome(verNomeEstado(String.valueOf(this.estadoChooser.getSelectedItem())) );
                        
            cadastros.add(novo);
            cadastros.get(cadastros.size() - 1).setEstado(novoEstado);
                     
            System.out.println("Adicionado!");      

  
        } catch( Exception e) { 
            System.out.println("deu erro " + e);       
        }  
        
        // Escrever arquivo
            try {

                this.escrever_arquivo(); 
                System.out.println("INSERIU"); 

            } catch(Exception e) {
                System.out.println("deu erro try-escrever-arquivo ");

            }   
    }//GEN-LAST:event_insereCadastroActionPerformed
//
    
// VER NOME ESTADO PELA SIGLA    
    public String verNomeEstado(String x) {
 
        System.out.println(x);
           
       try( BufferedReader br = new BufferedReader(new FileReader("estados.txt")) ) {
                
        String linha; 
 
        while ( (linha = br.readLine() ) != null) {
 
                String vet[] = linha.split("#");               
                String sigla = vet[0];
                String estado = vet[1];
                
                if(sigla.equals(x)) {                  
                    return estado;               
            }          
        }
        
        br.close();

       } catch(Exception e) {
           System.out.println(e);
       }
        
       return "Não achou";
    }
//    
      
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        // Escolher arquivo
            JFileChooser chooser = new JFileChooser();
            
            File file;
            
        // Evitando erros caso não selecione uma imagem*
            int result = chooser.showOpenDialog(this);
            if (result == JFileChooser.APPROVE_OPTION) {
                file = chooser.getSelectedFile();
            
        try {
            // Abre selecionar Imagem
            
                BufferedImage img = ImageIO.read(file);
                ImageIcon icon = new ImageIcon(img); // Adicionou
           
            // Encaixar Imagem na Label
                Image imagem = icon.getImage().getScaledInstance(fotoLabel.getWidth(), fotoLabel.getHeight(), java.awt.Image.SCALE_SMOOTH);
                ImageIcon foto = new ImageIcon(imagem);
                fotoLabel.setIcon(foto);
        }
        catch(IOException e) {
            e.printStackTrace();
        }}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void estadoChooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estadoChooserActionPerformed
        
    }//GEN-LAST:event_estadoChooserActionPerformed

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
            java.util.logging.Logger.getLogger(TelaAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                System.out.println(cadastros);
                new TelaAdd(cadastros).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alertLabel;
    private javax.swing.JTextField alturaText;
    private javax.swing.JTextField cidadeText;
    private javax.swing.JLabel countLabel;
    private javax.swing.JTextField data_nascText;
    private javax.swing.JTextPane enderecoText;
    private javax.swing.JComboBox<String> estadoChooser;
    private javax.swing.JLabel fotoLabel;
    private javax.swing.JButton insereCadastro;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nomeText;
    private javax.swing.JTextPane numeroText;
    private javax.swing.JButton prevButton;
    // End of variables declaration//GEN-END:variables
}
