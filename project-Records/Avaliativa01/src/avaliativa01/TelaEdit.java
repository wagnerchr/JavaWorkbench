
package avaliativa01;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

public class TelaEdit extends javax.swing.JFrame {

    public static ArrayList<Cadastro> cadastros = new ArrayList<Cadastro>();
    public static int count;
    
    public TelaEdit(ArrayList<Cadastro> cadastros, int count) {
        
        initComponents();
        
        this.setResizable(false);
        this.cadastros = cadastros;
        this.count = count;
     
        System.out.println(count);
        // Ler e Editar Cadastro
            ler_arquivo(cadastros, "bd.txt", count);
            verEstados();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cidadeText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        selecionado = new javax.swing.JLabel();
        lerBTN = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        numeroText = new javax.swing.JTextPane();
        jLabel5 = new javax.swing.JLabel();
        alturaText = new javax.swing.JTextField();
        nomeText = new javax.swing.JTextField();
        data_nascText = new javax.swing.JTextField();
        alertLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fotoLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        enderecoText = new javax.swing.JTextPane();
        jLabel7 = new javax.swing.JLabel();
        salvaCadastro = new javax.swing.JButton();
        estadoChooser = new javax.swing.JComboBox<>();
        cancelBtn = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setText("Cidade");

        jLabel9.setText("Número");

        selecionado.setText(".");

        lerBTN.setText("jButton1");
        lerBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lerBTNActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(numeroText);

        jLabel5.setText("Estado");

        alertLabel.setText(".");

        jLabel2.setText("Nome");

        jLabel8.setText("Endereço");

        jLabel3.setText("Data de Nascimento");

        fotoLabel.setText("                             Escolher Foto");

        jScrollPane1.setViewportView(enderecoText);

        jLabel7.setText("Altura");

        salvaCadastro.setText("Salvar edição!");
        salvaCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvaCadastroActionPerformed(evt);
            }
        });

        estadoChooser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {}));

        cancelBtn.setText("Cancelar Edição");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(alertLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lerBTN)
                                .addGap(0, 0, Short.MAX_VALUE))
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
                                                    .addGap(18, 18, 18)
                                                    .addComponent(estadoChooser, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                    .addComponent(jLabel4)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(cidadeText, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(0, 0, Short.MAX_VALUE)))))))
                .addGap(6, 6, 6))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(selecionado)
                        .addContainerGap(696, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(salvaCadastro)
                        .addGap(301, 301, 301))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cancelBtn)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(selecionado)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(fotoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lerBTN))
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
                .addGap(59, 59, 59)
                .addComponent(salvaCadastro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(alertLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancelBtn)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

// INSERIR FOTO   
    private void lerBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lerBTNActionPerformed
         
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
    }//GEN-LAST:event_lerBTNActionPerformed
//
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
            new TelaExibe(cadastros).setVisible(true);
            this.setVisible(false);
        }
         
    }    
       
// VER ESTADOS SIGLA
    public void verEstados() {
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

// VER NOME ESTADO    
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
// FIM ESTADOS // 
//    
    
// LER ARQUIVO, MANTER VALORES PARA EDITAR    
     public void ler_arquivo(ArrayList<Cadastro> cadastros, String arquivo, int count) {
    
        try ( FileInputStream readData = new FileInputStream(arquivo) ) {

            ObjectInputStream readStream = new ObjectInputStream(readData);
     
            cadastros = (ArrayList<Cadastro>) readStream.readObject();

            readStream.close();  
                                   
            this.nomeText.setText(cadastros.get(count).getNome());
            this.enderecoText.setText(cadastros.get(count).getEndereco());
            this.cidadeText.setText(cadastros.get(count).getCidade());
            
            /*
            Date date = new SimpleDateFormat("dd/MM/yyyy").parse(String.valueOf(cadastros.get(count).getDataNasc()) );                             
            this.data_nascText.setText(String.valueOf(date));
            */
            this.data_nascText.setText(String.valueOf(cadastros.get(count).getDataNasc()));
            this.alturaText.setText(String.valueOf(cadastros.get(count).getAltura()));
            this.numeroText.setText(String.valueOf(cadastros.get(count).getNumero()));  
            
            String estadoSelected = cadastros.get(count).getEstado().getSigla();
            System.out.println("AQUI AQUI AQUI" + arrEstados().get(4));
            this.estadoChooser.setSelectedItem(estadoSelected); 
            
            
            this.fotoLabel.setIcon(cadastros.get(count).getFoto());         
            System.out.println(cadastros.get(count).getEstado().getSigla());
                       
        } catch (Exception e) {
            e.printStackTrace();
        }      
    }
//
     
      public ArrayList<String> arrEstados() {
        
           ArrayList<String> estados = new ArrayList<>();
          
          try( BufferedReader br = new BufferedReader(new FileReader("estados.txt")) ) {

                String linha;    
               
                 
                while ( (linha = br.readLine() ) != null) {
           
                    String vet[] = linha.split("#");               
                    String sigla = vet[0];
   
                    estados.add(sigla);
                    estadoChooser.addItem(sigla);          
                }
                

                br.close();
                
                
            } catch(Exception e) {
                System.out.println(e);
            }   
          
          return estados;
    }
        
// INSERE NO BD ARQUIVO EDITADO
    private void salvaCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvaCadastroActionPerformed

        try{
        Date data = new SimpleDateFormat("dd/MM/yyyy").parse(this.data_nascText.getText());
                
        Estado novoEstado = new Estado();     

        novoEstado.setSigla(String.valueOf(this.estadoChooser.getSelectedItem()) );
        novoEstado.setNome(verNomeEstado(String.valueOf(this.estadoChooser.getSelectedItem())) );    
                     
        ImageIcon icon = (ImageIcon)this.fotoLabel.getIcon();
           
           
        
        cadastros.get(count).setNome(this.nomeText.getText());
        cadastros.get(count).setEndereco(this.enderecoText.getText());
        cadastros.get(count).setCidade(this.cidadeText.getText());
        cadastros.get(count).setDataNasc(data);
        cadastros.get(count).setAltura(Float.parseFloat(String.valueOf(this.alturaText.getText()) ));
        cadastros.get(count).setNumero(Integer.parseInt(String.valueOf(this.numeroText.getText()) ));
        cadastros.get(count).setEstado(novoEstado);
        cadastros.get(count).setFoto(icon);
    } catch(ParseException e) {
            System.out.println(e);
    }
       
      try {
            this.escrever_arquivo();
        } catch (IOException e) {
            System.out.println(e);
        }  
    }//GEN-LAST:event_salvaCadastroActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
       new TelaExibe(cadastros).setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_cancelBtnActionPerformed
//
    
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
            java.util.logging.Logger.getLogger(TelaEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEdit(cadastros, count).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alertLabel;
    private javax.swing.JTextField alturaText;
    private javax.swing.JToggleButton cancelBtn;
    private javax.swing.JTextField cidadeText;
    private javax.swing.JTextField data_nascText;
    private javax.swing.JTextPane enderecoText;
    private javax.swing.JComboBox<String> estadoChooser;
    private javax.swing.JLabel fotoLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton lerBTN;
    private javax.swing.JTextField nomeText;
    private javax.swing.JTextPane numeroText;
    private javax.swing.JButton salvaCadastro;
    private javax.swing.JLabel selecionado;
    // End of variables declaration//GEN-END:variables
}
