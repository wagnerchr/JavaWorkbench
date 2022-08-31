package atv06;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        
        
    ArrayList<Cadastro> cadastros = new ArrayList<Cadastro>();
       
       
       File file = new File("dados_novos.csv");
       String path = file.getAbsolutePath();
       
    
       
    // Ler o arquivo passado
        criarArray(path, cadastros);
        cadastros.sort(null); // Ordena lista
        escreverArquivo(cadastros);

        Tela tela = new Tela(cadastros);
        tela.setVisible(true);
    }

    public static void criarArray(String file, ArrayList lista) {
        try( /*BufferedReader br = new BufferedReader(new FileReader(file)*/
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"))) {

            br.readLine(); // Pulando primeira linha do arquivo
            String linha;

            while((linha = br.readLine()) != null) {
            // Separar campos do cadastro 
                String[] vet = new String[7];
                vet = linha.split(","); 
            
            // Colocar no molde Cadastro
                Cadastro cadastro = new Cadastro(vet[0], (vet[1]), vet[2], vet[3], Integer.valueOf(vet[4]), vet[5], vet[6]);

                lista.add(cadastro); // Adicionando à lista 
            }
            br.close();

        } catch(IOException e) {
            e.printStackTrace();
        }  
    }

    public static void escreverArquivo(ArrayList lista) {
        
        File file = new File("dados_ordenados.csv");

        try(/*BufferedWriter bw = new BufferedWriter(new FileWriter(file))*/
            OutputStreamWriter bw =  new OutputStreamWriter(new FileOutputStream("C:\\Users\\Pichau\\Documents\\NetBeansProjects\\atv06\\src\\atv06\\" + file), "UTF-8")) {
            for(int i = 0; i < lista.size(); i++) {
                bw.append(lista.get(i).toString()+"\n");
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

}