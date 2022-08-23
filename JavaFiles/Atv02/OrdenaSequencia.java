import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// Classe para ordenar os arquivos .txt criados pela Classe GeraSequencia
public class OrdenaSequencia {

    public void ordenaSequencias(int qntArquivos, int qntNumeros, int[] qntPastas) {
        
        // CRIA MAIN PASTONA ORDENADA
        File pastaOrd = new File("Pasta_Ord");
            if(!pastaOrd.exists())
                pastaOrd.mkdir();
        
        // LOOP PARA CADA PASTA
            for(int i = 0; i < qntPastas.length; i++) {
                
                // LOOP PARA CADA ARQUIVO .TXT 
                for(int j = 1; j <= qntArquivos; j++) {

                   // Criar Array dos numeros do arquivo

                   String lerArquivo = "Pasta\\"+qntPastas[i]+"\\arq"+(j)+".txt";

                   try(BufferedReader buffRead = new BufferedReader(
                        new FileReader(lerArquivo))) {
                            // Variables
                                String linha;
                                int[] arr = new int[qntNumeros + 1];
                                int x = 0;
                            // While Loop to read the entire .txt
                            while((linha = buffRead.readLine()) != null) {
                                arr[x] = Integer.parseInt(linha);
                                x++;
                            }
                            // Organiza Array e o Cria
                            // Pastas
                                File pasta =  new File(pastaOrd+"\\"+qntPastas[i]);
                                    if(!pasta.exists())
                                        pasta.mkdir();
                            // Arquivos
                                String arquivo = "arq"+ j + "_ord.txt";

                            int[] arrOrganizado = organizeArray(arr);

                            try(BufferedWriter buffWrite = new BufferedWriter(
                            new FileWriter(pasta+"\\"+arquivo))) {
                                for(int a : arrOrganizado) {
                                
                                        buffWrite.append(a + "\n");
                                }}catch(IOException e) {
                                    e.printStackTrace();
                                }
                        } catch(IOException e) {
                            e.printStackTrace();
                        }
                   
                }
            }
}

    private static int[] organizeArray(int[] arr) {

        for(int i = 0; i < arr.length; i++) {
            for(int j = (i+1); j < arr.length; j++) {
                
                int temp = 0;
                if(arr[i] > arr[j]) {
                    
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    } 

}
    
