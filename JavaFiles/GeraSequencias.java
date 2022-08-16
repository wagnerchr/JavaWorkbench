import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

// Classe para criar N pastas com N arquivos .txt com N números aleatórios
public class GeraSequencias {


    public void geraSequencias(int qntArquivos,int qntNumeros, int... qntPastas) {

        Random r = new Random();

        // CRIA MAIN PASTA
        File Pasta = new File("Pasta");
        if(!Pasta.exists())
            Pasta.mkdir();

        // LOOP CRIA SUBPASTAS
        for(int i = 0; i < qntPastas.length; i++) {

            // cria pasta[i] do array qntPastas
            String pasta = geraPastas(qntPastas[i], Pasta);

            int intervalo = qntPastas[i];
            int min = 0;
            int max = intervalo;

            // LOOP CRIA ARQUIVOS
            for(int j = 1; j <= qntArquivos; j++) {

                String arquivo = "arq" + j + ".txt";
                try(BufferedWriter buffWrite = new BufferedWriter(new FileWriter(pasta + "\\" + arquivo, true));) {
                
                    // LOOP CRIA SEQUÊNCIA
                    for (int k = 0; k <= qntNumeros; k++) {
                        buffWrite.append(r.nextInt(max - min) + min + "\n");
                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    // CRIA SUBPASTAS
    private static String geraPastas(int x, File Pasta) {

        File pasta = new File(Pasta + "\\" + String.valueOf(x));
        if (!pasta.exists()) {
            pasta.mkdir();
        }
        return pasta.getAbsolutePath();
    }
}
