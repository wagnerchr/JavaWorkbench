import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// Classe para ordenar os arquivos .txt criados pela Classe GeraSequencia
public class OrdenaSequencia {

    int x;

    



    public void ordenaSequencias(int qntArquivos, int qntNumeros, int[] qntPastas) {
        
        // CRIA MAIN PASTONA ORDENADA
        File pastaOrd = new File("Pasta_Ord");
            if(!pastaOrd.exists())
            pastaOrd.mkdir();

        // Ler Pastas
        for(int i = 0; i < 1; i++) {
        // Ler Arquivos 
            for(int j = 1; j <= 1; j++) {
                // Array para cada arquivo
                    int[] aray = new int[qntNumeros + 1];

                File arquivo = new File("Pasta\\"+qntPastas[i]+"\\arq"+j+".txt");

                try(BufferedReader buffRead = new BufferedReader(new FileReader(arquivo))) {
                    String linha; 
                    while((linha = buffRead.readLine()) != null ) {
                        aray[x] = Integer.parseInt(linha);
                        x++;
                    }

                    organizaArray(aray, qntPastas[i], i);

                } catch(IOException e) {
                    e.printStackTrace();
                } 
               
            }


        } 
    }

    private void organizaArray(int[] arr, int qntPastas, int i) {

        for(int j = 0; j < arr.length; j++) {
            for(int k = 0; k < j; k++) {
                if(arr[j] < arr[k]) {
                    int temp = arr[j];
                    arr[j] = arr[k];
                    arr[k] = temp;
                }
            }
        }
        criaArquivo(arr, qntPastas, i);
    }

    private void criaArquivo(int[] arr, int qntPastas, int i) {
        // Cria Pasta
            File subPastaOrd = new File("Pasta_Ord\\"+qntPastas);
                if(!subPastaOrd.exists())
                    subPastaOrd.mkdir();
        // Arquivo foda
            String arquivoOrd = ("arq" + (i+1) + "_ord.txt");
        try (BufferedWriter buffWrite = new BufferedWriter(new FileWriter(subPastaOrd + "\\" + arquivoOrd, false));) {    
         
        // // Buffered Feliz
            for(int j = 0; j < arr.length; j++) {
                buffWrite.append(arr[j]+"\n");
            }
            buffWrite.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
