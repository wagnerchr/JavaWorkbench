package Atv05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        
    ArrayList<Cadastro> cadastros = new ArrayList<Cadastro>();
       File file = new File("dados.csv");
       String path = file.getAbsolutePath();
    
    // Ler o arquivo passado
        criarArray(path, cadastros);
        cadastros.sort(null); // Ordena lista
        escreverArquivo(cadastros);
    
    }

    public static void criarArray(String file, ArrayList lista) {
        try(BufferedReader br = new BufferedReader(new FileReader(file))) {

            br.readLine(); // Pulando primeira linha do arquivo
            String linha;

            while((linha = br.readLine()) != null) {
            // Separar campos do cadastro 
                String[] vet = new String[22];
                vet = linha.split(","); 
            
            // Colocar no molde Cadastro
                Cadastro cadastro = new Cadastro(vet[0], Integer.valueOf(vet[1]), vet[2], vet[3], vet[4], vet[5], vet[6], vet[7], vet[8], vet[9], vet[10], vet[11], vet[12], Integer.valueOf(vet[13]), vet[14], vet[15], vet[16], vet[17], vet[18], Float.valueOf(vet[19]), Float.valueOf(vet[20]), vet[21], vet[22]);

                lista.add(cadastro); // Adicionando à lista 
            }
            br.close();

        } catch(IOException e) {
            e.printStackTrace();
        }  
    }

    public static void escreverArquivo(ArrayList lista) {
        
        File file = new File("dados_ordenados.txt");

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            for(int i = 0; i < lista.size(); i++) {
                bw.append(lista.get(i).toString()+"\n");
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

}
