package imageeditor;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class TelaImageEditor extends javax.swing.JFrame {

    // Inicia com a imagem
    public TelaImageEditor() {
        initComponents();
        ImageIcon icon = new ImageIcon("dog.jpg");
        jLabel1.setIcon(icon);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jSlider1 = new javax.swing.JSlider();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1220, 460));
        setMinimumSize(new java.awt.Dimension(1220, 460));
        setPreferredSize(new java.awt.Dimension(1220, 460));

        jPanel1.setMaximumSize(new java.awt.Dimension(479, 359));
        jPanel1.setMinimumSize(new java.awt.Dimension(479, 359));
        jPanel1.setPreferredSize(new java.awt.Dimension(479, 359));

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 442, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 343, Short.MAX_VALUE))
        );

        jButton1.setText("Duplicar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel2.setMaximumSize(new java.awt.Dimension(479, 359));
        jPanel2.setMinimumSize(new java.awt.Dimension(479, 359));
        jPanel2.setPreferredSize(new java.awt.Dimension(479, 359));

        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 442, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 343, Short.MAX_VALUE))
        );

        jButton2.setText("Tons de Cinza");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Binarização");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTextField1.setText("127");
        jTextField1.setMaximumSize(new java.awt.Dimension(25, 20));
        jTextField1.setMinimumSize(new java.awt.Dimension(25, 20));

        jSlider1.setMaximum(255);
        jSlider1.setValue(127);
        jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                movimentoSlider(evt);
            }
        });
        jSlider1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                AtualizarBinarizacao(evt);
            }
        });

        jButton4.setText("Bin Inverter");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Cinza Inverter");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Sobel");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Sobel Inverter");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("R");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("G");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("B");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setText("Histo");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton11))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jButton2)
                        .addComponent(jButton5)
                        .addComponent(jButton6)
                        .addComponent(jButton7)
                        .addComponent(jButton3)
                        .addComponent(jButton4)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton8)
                        .addComponent(jButton9)
                        .addComponent(jButton10)
                        .addComponent(jButton11)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Adiciona imagem a label ao lado
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ImageIcon icon = new ImageIcon("dog.jpg");
        jLabel2.setIcon(icon);
    }//GEN-LAST:event_jButton1ActionPerformed

// PASSAR IMAGEM PARA CINZA
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Seleciona Imagem
            ImageIcon icon = new ImageIcon("dog.jpg");
        // Seleciona largura, altura, e cores
        BufferedImage imagem = new BufferedImage(icon.getIconWidth(), icon.getIconHeight(), BufferedImage.TYPE_INT_ARGB);
        
        Graphics graphics = imagem.createGraphics();
                
        icon.paintIcon(null, graphics, 0, 0);
        graphics.dispose();

       // Com a largura e altura da Imagem, converte para cinza
        for (int lin = 0; lin < imagem.getWidth(); lin++) {
            for (int col = 0; col < imagem.getHeight(); col++) {  
                // Seleciona o RGB do pixel da imagem
                Color mycolor = new Color(imagem.getRGB(lin, col)); 
                // Calcular a média dos três tons de cor do determinado pixel da imagem
                int media = (int) (mycolor.getRed() + mycolor.getGreen() + mycolor.getBlue()) / 3;

                
                // Pixel passado para cinza
                Color cor = new Color(media, media, media);
                // Adicionando o cinza para a localização do pixel
                imagem.setRGB(lin, col, cor.getRGB());

            } // Repete para cada pixel da imagem
        }

        // Nova imagem com cada pixel com a cor cinza
        ImageIcon icon2 = new ImageIcon(imagem);
        jLabel2.setIcon(icon2);
    }//GEN-LAST:event_jButton2ActionPerformed

// BINARIZAÇÃO     
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Seleciona Imagem
        ImageIcon icon = new ImageIcon("dog.jpg");

        BufferedImage imagem = new BufferedImage(icon.getIconWidth(), icon.getIconHeight(), BufferedImage.TYPE_INT_ARGB);
        // BufferedImage imagem_saida = imagem;
        Graphics graphics = imagem.createGraphics();
        icon.paintIcon(null, graphics, 0, 0);
        graphics.dispose();//from   w  ww.j a  va  2  s.  co m

        
        for (int lin = 0; lin < imagem.getWidth(); lin++) {
            for (int col = 0; col < imagem.getHeight(); col++) {
                // Seleciona o RGB do pixel da imagem
                Color mycolor = new Color(imagem.getRGB(lin, col));
                // Calcular a média dos três tons de cor do determinado pixel da imagem
                int media = (int) (mycolor.getRed() + mycolor.getGreen() + mycolor.getBlue()) / 3;

                // Cada pixel é comparado. 0 -> preto, 255 -> Branco
                if (media < Integer.parseInt(this.jTextField1.getText())) {
                    media = 0;
                } else {
                    media = 255;
                }

                // Pixel passado para preto ou branco
                Color cor = new Color(media, media, media);
                // Adicionando a cor para a localização do pixel
                imagem.setRGB(lin, col, cor.getRGB());

            } // Repete para cada pixel da imagem
        }

        ImageIcon icon2 = new ImageIcon(imagem);
        jLabel2.setIcon(icon2);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void movimentoSlider(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_movimentoSlider
        this.jTextField1.setText(String.valueOf(this.jSlider1.getValue()));
        /* ImageIcon icon = new ImageIcon("dog.jpg");

        BufferedImage imagem = new BufferedImage(icon.getIconWidth(), icon.getIconHeight(), BufferedImage.TYPE_INT_ARGB);
       // BufferedImage imagem_saida = imagem;
        Graphics graphics = imagem.createGraphics();
        icon.paintIcon(null, graphics, 0, 0);
        graphics.dispose();//from   w  ww.j a  va  2  s.  co m

        for (int lin = 0; lin < imagem.getWidth(); lin++) {
            for (int col = 0; col < imagem.getHeight(); col++) {
                Color mycolor = new Color(imagem.getRGB(lin, col));
                int media = (int) (mycolor.getRed() + mycolor.getGreen() + mycolor.getBlue()) / 3;
                
                if(media < Integer.parseInt(this.jTextField1.getText()))
                    media = 0;
                else
                    media = 255;
                             
                Color cor = new Color(media, media, media);
                imagem.setRGB(lin, col, cor.getRGB());
                
            }
        }

        ImageIcon icon2 = new ImageIcon(imagem);
        jLabel2.setIcon(icon2);*/
    }//GEN-LAST:event_movimentoSlider

    private void AtualizarBinarizacao(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AtualizarBinarizacao
        ImageIcon icon = new ImageIcon("dog.jpg");

        BufferedImage imagem = new BufferedImage(icon.getIconWidth(), icon.getIconHeight(), BufferedImage.TYPE_INT_ARGB);
        // BufferedImage imagem_saida = imagem;
        Graphics graphics = imagem.createGraphics();
        icon.paintIcon(null, graphics, 0, 0);
        graphics.dispose();//from   w  ww.j a  va  2  s.  co m

        for (int lin = 0; lin < imagem.getWidth(); lin++) {
            for (int col = 0; col < imagem.getHeight(); col++) {
                Color mycolor = new Color(imagem.getRGB(lin, col));
                int media = (int) (mycolor.getRed() + mycolor.getGreen() + mycolor.getBlue()) / 3;

                if (media < Integer.parseInt(this.jTextField1.getText())) {
                    media = 0;
                } else {
                    media = 255;
                }

                Color cor = new Color(media, media, media);
                imagem.setRGB(lin, col, cor.getRGB());

            }
        }

        ImageIcon icon2 = new ImageIcon(imagem);
        jLabel2.setIcon(icon2);
    }//GEN-LAST:event_AtualizarBinarizacao

// INVERTER BINARIZAÇAÕ
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // Seleciona Imagem
        ImageIcon icon = new ImageIcon("dog.jpg");

        BufferedImage imagem = new BufferedImage(icon.getIconWidth(), icon.getIconHeight(), BufferedImage.TYPE_INT_ARGB);
        // BufferedImage imagem_saida = imagem;
        Graphics graphics = imagem.createGraphics();
        icon.paintIcon(null, graphics, 0, 0);
        graphics.dispose();//from   w  ww.j a  va  2  s.  co m

        for (int lin = 0; lin < imagem.getWidth(); lin++) {
            for (int col = 0; col < imagem.getHeight(); col++) {
                // Seleciona o RGB do pixel da imagem
                Color mycolor = new Color(imagem.getRGB(lin, col));
                // Calcular a média dos três tons de cor do determinado pixel da imagem
                int media = (int) (mycolor.getRed() + mycolor.getGreen() + mycolor.getBlue()) / 3;

                // Cada pixel é comparado. 0 -> preto, 255 -> Branco
                // Mesma coisa da Binarização, só que ao contrário
                if (media < Integer.parseInt(this.jTextField1.getText())) {
                    media = 255;    // era 0, preto
                } else {
                    media = 0;      // era 255, branco
                }

                // Pixel passado para preto ou branco
                Color cor = new Color(media, media, media);
                // Adicionando a cor para a localização do pixel
                imagem.setRGB(lin, col, cor.getRGB());

            } // Repete para cada pixel da imagem
        }

        ImageIcon icon2 = new ImageIcon(imagem);
        jLabel2.setIcon(icon2);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

// INVERTER O CINZA DA IMAGEM
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // Seleciona imagem
        ImageIcon icon = new ImageIcon("dog.jpg");

        BufferedImage imagem = new BufferedImage(icon.getIconWidth(), icon.getIconHeight(), BufferedImage.TYPE_INT_ARGB);
        // BufferedImage imagem_saida = imagem;
        Graphics graphics = imagem.createGraphics();
        icon.paintIcon(null, graphics, 0, 0);
        graphics.dispose();//from   w  ww.j a  va  2  s.  co m

        
        for (int lin = 0; lin < imagem.getWidth(); lin++) {
            for (int col = 0; col < imagem.getHeight(); col++) {
                // Seleciona o RGB do pixel da imagem
                Color mycolor = new Color(imagem.getRGB(lin, col));
                 // Calcular a média dos três tons de cor do determinado pixel da imagem
                int media = (int) (mycolor.getRed() + mycolor.getGreen() + mycolor.getBlue()) / 3;

                // Para inverter, são 255 - a média
                media = 255 - media;

                // Pixel passado para o cinza invertido
                Color cor = new Color(media, media, media);
                // Adicionando o cinza para a localização do pixel
                imagem.setRGB(lin, col, cor.getRGB());

            } // Repete para cada pixel da imagem
        }

        ImageIcon icon2 = new ImageIcon(imagem);
        jLabel2.setIcon(icon2);
    }//GEN-LAST:event_jButton5ActionPerformed

// SOBEL
    /* Descrição breve. O operador Sobel realiza uma medição de gradiente 
    espacial 2-D em uma imagem e assim enfatiza regiões de alta frequência 
    espacial que correspondem a bordas. */
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // Seleciona Imagem
        String filename = "dog.jpg";

        File file = new File(filename);
        BufferedImage image;
        try {
            image = ImageIO.read(file);

            int x = image.getWidth();
            int y = image.getHeight();

            int maxGval = 0;
            int[][] edgeColors = new int[x][y];
            int maxGradient = -1;

            for (int i = 1; i < x - 1; i++) {
                for (int j = 1; j < y - 1; j++) {

                    int val00 = getGrayScale(image.getRGB(i - 1, j - 1));
                    int val01 = getGrayScale(image.getRGB(i - 1, j));
                    int val02 = getGrayScale(image.getRGB(i - 1, j + 1));

                    int val10 = getGrayScale(image.getRGB(i, j - 1));
                    int val11 = getGrayScale(image.getRGB(i, j));
                    int val12 = getGrayScale(image.getRGB(i, j + 1));

                    int val20 = getGrayScale(image.getRGB(i + 1, j - 1));
                    int val21 = getGrayScale(image.getRGB(i + 1, j));
                    int val22 = getGrayScale(image.getRGB(i + 1, j + 1));

                    int gx = ((-1 * val00) + (0 * val01) + (1 * val02))
                            + ((-2 * val10) + (0 * val11) + (2 * val12))
                            + ((-1 * val20) + (0 * val21) + (1 * val22));

                    int gy = ((-1 * val00) + (-2 * val01) + (-1 * val02))
                            + ((0 * val10) + (0 * val11) + (0 * val12))
                            + ((1 * val20) + (2 * val21) + (1 * val22));

                    double gval = Math.sqrt((gx * gx) + (gy * gy));
                    int g = (int) gval;

                    if (maxGradient < g) {
                        maxGradient = g;
                    }

                    edgeColors[i][j] = g;
                }
            }

            double scale = 255.0 / maxGradient;

            for (int i = 1; i < x - 1; i++) {
                for (int j = 1; j < y - 1; j++) {
                    int edgeColor = edgeColors[i][j];
                    edgeColor = (int) (edgeColor * scale);
                    edgeColor = 0xff000000 | (edgeColor << 16) | (edgeColor << 8) | edgeColor;
                    image.setRGB(i, j, edgeColor);
                }
            }

            File outputfile = new File("sobel.png");

            ImageIO.write(image, "png", outputfile);

            System.out.println("max : " + maxGradient);
            System.out.println("Finished");

            ImageIcon icon2 = new ImageIcon(image);
            jLabel2.setIcon(icon2);
        } catch (IOException ex) {
            Logger.getLogger(TelaImageEditor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        String filename = "dog.jpg";

        File file = new File(filename);
        BufferedImage image;
        try {
            image = ImageIO.read(file);

            int x = image.getWidth();
            int y = image.getHeight();

            int maxGval = 0;
            int[][] edgeColors = new int[x][y];
            int maxGradient = -1;

            for (int i = 1; i < x - 1; i++) {
                for (int j = 1; j < y - 1; j++) {

                    int val00 = getGrayScale(image.getRGB(i - 1, j - 1));
                    int val01 = getGrayScale(image.getRGB(i - 1, j));
                    int val02 = getGrayScale(image.getRGB(i - 1, j + 1));

                    int val10 = getGrayScale(image.getRGB(i, j - 1));
                    int val11 = getGrayScale(image.getRGB(i, j));
                    int val12 = getGrayScale(image.getRGB(i, j + 1));

                    int val20 = getGrayScale(image.getRGB(i + 1, j - 1));
                    int val21 = getGrayScale(image.getRGB(i + 1, j));
                    int val22 = getGrayScale(image.getRGB(i + 1, j + 1));

                    int gx = ((-1 * val00) + (0 * val01) + (1 * val02))
                            + ((-2 * val10) + (0 * val11) + (2 * val12))
                            + ((-1 * val20) + (0 * val21) + (1 * val22));

                    int gy = ((-1 * val00) + (-2 * val01) + (-1 * val02))
                            + ((0 * val10) + (0 * val11) + (0 * val12))
                            + ((1 * val20) + (2 * val21) + (1 * val22));

                    double gval = Math.sqrt((gx * gx) + (gy * gy));
                    int g = (int) gval;

                    if (maxGradient < g) {
                        maxGradient = g;
                    }

                    edgeColors[i][j] = g;
                }
            }

            double scale = 255.0 / maxGradient;

            for (int i = 1; i < x - 1; i++) {
                for (int j = 1; j < y - 1; j++) {
                    int edgeColor = edgeColors[i][j];
                    edgeColor = (int) (edgeColor * scale);
                    edgeColor = 0xff000000 | (edgeColor << 16) | (edgeColor << 8) | edgeColor;

                    image.setRGB(i, j, edgeColor);

                    Color mycolor = new Color(image.getRGB(i, j));
                    int media = (int) (mycolor.getRed() + mycolor.getGreen() + mycolor.getBlue()) / 3;

                    media = 255 - media;

                    Color cor = new Color(media, media, media);
                    image.setRGB(i, j, cor.getRGB());

                }
            }

            File outputfile = new File("sobel.png");

            ImageIO.write(image, "png", outputfile);

            System.out.println("max : " + maxGradient);
            System.out.println("Finished");

            ImageIcon icon2 = new ImageIcon(image);
            jLabel2.setIcon(icon2);
        } catch (IOException ex) {
            Logger.getLogger(TelaImageEditor.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        ImageIcon icon = new ImageIcon("dog.jpg");

        BufferedImage imagem = new BufferedImage(icon.getIconWidth(), icon.getIconHeight(), BufferedImage.TYPE_INT_ARGB);
        // BufferedImage imagem_saida = imagem;
        Graphics graphics = imagem.createGraphics();
        icon.paintIcon(null, graphics, 0, 0);
        graphics.dispose();//from   w  ww.j a  va  2  s.  co m

        for (int lin = 0; lin < imagem.getWidth(); lin++) {
            for (int col = 0; col < imagem.getHeight(); col++) {
                Color mycolor = new Color(imagem.getRGB(lin, col));
                // int media = (int) (mycolor.getRed() + mycolor.getGreen() + mycolor.getBlue()) / 3;

                Color cor = new Color(mycolor.getRed(), 0, 0);
                imagem.setRGB(lin, col, cor.getRGB());

            }
        }

        ImageIcon icon2 = new ImageIcon(imagem);
        jLabel2.setIcon(icon2);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        ImageIcon icon = new ImageIcon("dog.jpg");

        BufferedImage imagem = new BufferedImage(icon.getIconWidth(), icon.getIconHeight(), BufferedImage.TYPE_INT_ARGB);
        // BufferedImage imagem_saida = imagem;
        Graphics graphics = imagem.createGraphics();
        icon.paintIcon(null, graphics, 0, 0);
        graphics.dispose();//from   w  ww.j a  va  2  s.  co m

        for (int lin = 0; lin < imagem.getWidth(); lin++) {
            for (int col = 0; col < imagem.getHeight(); col++) {
                Color mycolor = new Color(imagem.getRGB(lin, col));
                // int media = (int) (mycolor.getRed() + mycolor.getGreen() + mycolor.getBlue()) / 3;

                Color cor = new Color(0, mycolor.getGreen(), 0);
                imagem.setRGB(lin, col, cor.getRGB());

            }
        }

        ImageIcon icon2 = new ImageIcon(imagem);
        jLabel2.setIcon(icon2);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        ImageIcon icon = new ImageIcon("dog.jpg");

        BufferedImage imagem = new BufferedImage(icon.getIconWidth(), icon.getIconHeight(), BufferedImage.TYPE_INT_ARGB);
        // BufferedImage imagem_saida = imagem;
        Graphics graphics = imagem.createGraphics();
        icon.paintIcon(null, graphics, 0, 0);
        graphics.dispose();//from   w  ww.j a  va  2  s.  co m

        for (int lin = 0; lin < imagem.getWidth(); lin++) {
            for (int col = 0; col < imagem.getHeight(); col++) {
                Color mycolor = new Color(imagem.getRGB(lin, col));
                // int media = (int) (mycolor.getRed() + mycolor.getGreen() + mycolor.getBlue()) / 3;

                Color cor = new Color(0, 0, mycolor.getBlue());
                imagem.setRGB(lin, col, cor.getRGB());

            }
        }

        ImageIcon icon2 = new ImageIcon(imagem);
        jLabel2.setIcon(icon2);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        ImageIcon icon = new ImageIcon("dog.jpg");

        BufferedImage imagem = new BufferedImage(icon.getIconWidth(), icon.getIconHeight(), BufferedImage.TYPE_INT_ARGB);
        // BufferedImage imagem_saida = imagem;
        Graphics graphics = imagem.createGraphics();
        icon.paintIcon(null, graphics, 0, 0);
        graphics.dispose();//from   w  ww.j a  va  2  s.  co m

        int vet[] = new int[255];

        for (int lin = 0; lin < imagem.getWidth(); lin++) {
            for (int col = 0; col < imagem.getHeight(); col++) {
                Color mycolor = new Color(imagem.getRGB(lin, col));
                int media = (int) (mycolor.getRed() + mycolor.getGreen() + mycolor.getBlue()) / 3;

                //Color cor = new Color(media, media, media);
                //imagem.setRGB(lin, col, cor.getRGB());
                vet[media]++;

            }
        }

        int maior = vet[0];
        for (int i = 1; i < vet.length; i++) {
            if (vet[i] > maior) {
                maior = vet[i];
            }
        }

        System.out.println(maior);

        int histograma[][] = new int[255][maior];
        for (int i = 0; i < 255; i++) {
            for (int j = 0; j < maior; j++) {
                histograma[i][j] = 255;
            }
        }

        for (int largura = 0; largura < vet.length; largura++) {
            for (int altura = 0; altura < vet[largura]; altura++) {
                histograma[largura][maior - altura - 1] = 0;
            }
        }

        BufferedImage imgHist = new BufferedImage(255, maior, BufferedImage.TYPE_INT_ARGB);
        Graphics graphicsHist = imagem.createGraphics();
        icon.paintIcon(null, graphicsHist, 0, 0);
        graphicsHist.dispose();//

        for (int lin = 0; lin < imgHist.getWidth(); lin++) {
            for (int col = 0; col < imgHist.getHeight(); col++) {
                int md = histograma[lin][col];
                Color cor = new Color(md, md, md);
                imgHist.setRGB(lin, col, cor.getRGB());
            }
        }

        // Toolkit toolkit = Toolkit.getDefaultToolkit();
        // Image image = toolkit.getImage("histograma.png");
        Image scaledImage = imgHist.getScaledInstance(icon.getIconWidth(), icon.getIconHeight(), Image.SCALE_DEFAULT);
//        ImageIcon icon=new ImageIcon(scaledImage);

        ImageIcon icon2 = new ImageIcon(scaledImage);
        jLabel2.setIcon(icon2);


    }//GEN-LAST:event_jButton11ActionPerformed

    public static int getGrayScale(int rgb) {
        int r = (rgb >> 16) & 0xff;
        int g = (rgb >> 8) & 0xff;
        int b = (rgb) & 0xff;

        //from https://en.wikipedia.org/wiki/Grayscale, calculating luminance
        int gray = (int) (0.2126 * r + 0.7152 * g + 0.0722 * b);
        //int gray = (r + g + b) / 3;

        return gray;
    }

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
            java.util.logging.Logger.getLogger(TelaImageEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaImageEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaImageEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaImageEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaImageEditor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
