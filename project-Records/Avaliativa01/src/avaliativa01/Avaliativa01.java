
package avaliativa01;

import static avaliativa01.TelaAdd.cadastros;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.ImageIcon;


public class Avaliativa01 implements Serializable {

   
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException, ParseException {
        
       ArrayList<Cadastro> cadastros = new ArrayList<Cadastro>();      
       System.out.println("lendoa arquivo...");
        
        try ( FileInputStream readData = new FileInputStream("bd.txt") ) {

                ObjectInputStream readStream = new ObjectInputStream(readData);

                cadastros = (ArrayList) readStream.readObject(); 
                if(cadastros == null) {
                    System.out.println("Nenhum cadastro encontrado");
                }
               
                readStream.close();   

            } catch (Exception e) {
                e.printStackTrace();
            }     
       
        // JFRAME
            TelaExibe tela = new TelaExibe(cadastros);
            // tela.setResizable(false);
            tela.setVisible(true);

}}
