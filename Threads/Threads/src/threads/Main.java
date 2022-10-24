package threads;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe seu palpite ( Cara ou Coroa ): ");
        System.out.println("(Não se esqueça: ENTER para o LOOP)");
        
        String palpite = sc.nextLine();
        
       
        
    // Moeda é Lançada, seu valor vai sendo alterado pelas threads
        LadoMoeda moeda = new LadoMoeda();
       
        Lancamento cara = new Lancamento(moeda, "Cara");
        Lancamento coroa = new Lancamento(moeda, "Coroa");

        cara.start();
        coroa.start();
       
    // ---------------
    
        String parada = sc.nextLine();
        sc.close();
        
        cara.stop();
        coroa.stop();
       
        System.out.println("\n\nValor moeda final: " + moeda.getFace());

        if (palpite.equals(moeda.getFace())) {
            System.out.println("Acertou! você colocou  " + palpite + " era isso mesmo! :)\n\n");
        } else {
            System.out.println("Erraste :(\n\n");
        };

    }

}