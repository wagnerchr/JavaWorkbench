package Exercises;
import Node.No;

public class Josephus {

    static No inicio = null;

    public static void main(String[] args) {
        int N = 10;
        // int K = 3; // Salto 

        for (int i = 1; i <= N; i++) {
            inserir(i);
        }

        exibir();

        // josephus(K);
    }

    public static void inserir(int x) {
        No novo = new No(x);
        if(inicio == null) {
            inicio = novo;
        } else {
            No temp = inicio; 
            while(temp.prox != null) {
                temp = temp.prox;
            }
            temp.prox = novo;
        }
    }

    public static void exibir() {
        
        No temp = inicio;
        while(temp.prox != null) {
            System.out.println(temp.valor);
            temp = temp.prox;
        }
        System.out.println(temp.valor);
    }

    // private static void josephus(int k) {
     

    //     }
}