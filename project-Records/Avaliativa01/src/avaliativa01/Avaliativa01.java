
package avaliativa01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class Avaliativa01 {

   
    public static void main(String[] args) {
        
    ArrayList<Cadastro> cadastros = new ArrayList<>();
        
        //lerArquivos("dados_novos.csv",cadastros);
        
       // cadastros.sort(null);
        
        Tela tela = new Tela();
        tela.setResizable(false);
        tela.setVisible(true);
        
        
    }
    /*
    public static void lerArquivos(String arquivo, ArrayList<Cadastro> cadastros) {
        
        try( BufferedReader buffRead = new BufferedReader(new FileReader(arquivo, StandardCharsets.ISO_8859_1)); ) {
            
         String linha = buffRead.readLine();
         while (linha != null) {
             
            String vet[] = linha.split(",");
            
            cadastros.add(new Cadastro(vet[0],  vet[1],  vet[2],  vet[3],  vet[4], vet[5],  String.valueOf(vet[6]), vet[7],));
            
        linha = buffRead.readLine();  
        }
        buffRead.close();
            
        } catch(IOException e) {
            e.printStackTrace();
        }
    }*/
    
}
