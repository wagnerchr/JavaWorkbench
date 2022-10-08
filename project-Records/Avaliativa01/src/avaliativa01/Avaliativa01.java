
package avaliativa01;

import static avaliativa01.TelaAdd.cadastros;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
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
       int count;
            
        // JFRAME
            TelaExibe tela = new TelaExibe(cadastros, count);
            tela.setResizable(false);
            tela.setVisible(true);
           
   

}}
