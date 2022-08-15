import java.io.File;
import java.util.Scanner;

public class GeraPastas {

    Scanner sc = new Scanner(System.in);

    // CRIANDO PASTA DE ARQUIVOS
    public void mainPasta() {
        File pasta = new File("Pasta");
        try {
            if(pasta.mkdir()) {
                System.out.println("Main Directory Created");
            } else {
                System.out.println("Main Directory is already created");
               
               /* System.out.println("Wanna delete it? [Y] [N]" );
                    char refazer = sc.nextLine().charAt(0);
                    while(refazer != 'Y' && refazer != 'N') {
                        System.out.println("Sorry, invalid answer...");
                        System.out.println("Wanna delete it? [Y] [N]" );
                        refazer = sc.nextLine().charAt(0);     
                    } if (refazer == 'Y') 
                        FileUtils.deleteDirectory(new File(destination));
                */
                
            }
        } catch(Exception e){
            e.printStackTrace();
        }}

    // CRIANDO PASTAS DENTRO DA PASTA DE ARQUIVOS
    public void subPastas(int N) {
        // int N = 5;
        String[] nomes = new String[N];

        for(int i = 0; i < N; i++) {
             if(i == 3) 
                nomes[i] = "50000";
            else {
            String yoo = "1".concat(zeros(i));
            nomes[i] = yoo;
            System.out.println("aqui");
        }}

        // String[] nomes = {"100", "1000", "10000", "50000", "100000"};

        for(int i = 0; i < N; i++) {
            
            File pastas = new File("Pasta\\"+nomes[i]);
            try {
                if(pastas.mkdir()) {
                    System.out.println("Directory \""+nomes[i]+"\" Created!");
                } else {
                    System.out.println("Directory \""+nomes[i]+"\" is already created");
                }
            } catch(Exception e){
                e.printStackTrace();
            }
        }}

    // Adicionando os 0's
        public String zeros(int z) {

            String voltaZeros = "";

            for(int i = 0; i < (z + 2); i++) {
                voltaZeros += "0"; 
                System.out.println("aqui 22222");
            }

            return voltaZeros;
        }

}
