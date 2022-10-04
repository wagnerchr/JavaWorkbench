
package avaliativa01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Avaliativa01 implements Serializable {

   
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException, ParseException {
        
        ArrayList<Cadastro> cadastros = new ArrayList<Cadastro>();
             
        // JFRAME
            Tela tela = new Tela();
            tela.setResizable(false);
            tela.setVisible(true);
        
    

        try {
            // Escrever arquivos em bytes
                FileOutputStream writeData = new FileOutputStream("bd.txt");

                ObjectOutputStream writeStream = new ObjectOutputStream(writeData);

                writeStream.writeObject(cadastros);
                writeStream.flush();
                writeStream.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
       
    
    
        
    
}}
