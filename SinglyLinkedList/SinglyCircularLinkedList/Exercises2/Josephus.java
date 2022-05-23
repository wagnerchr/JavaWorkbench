package Exercises;
import Node.No;

public class Josephus {

    static No inicio = null;

    public static void main(String[] args) {
        int N = 10;
        int K = 3; // Salto 

        for (int i = 1; i <= N; i++) {
            inserir(i);  
        }

        exibir();

        josephus(K);
        System.out.println("O sobrevivente foi o número: " + inicio.valor);

    }

    public static void inserir(int x) {
        No novo = new No(x);
        if(inicio == null) {
            inicio = novo;  
            inicio.prox = inicio; 
        } else {
            No temp = inicio; 
            while(temp.prox != inicio) {
                temp = temp.prox;
            }
            novo.prox = inicio;
            temp.prox = novo;
        }
    }
    

    public static void exibir() {
        if(inicio == null )
            System.out.println("Lista está vazia, não há o que exibir");
        else {
            No temp = inicio;
            while(temp.prox != inicio) {
                System.out.println(temp.valor);
                temp = temp.prox;
            }
        System.out.println(temp.valor);
        }
    }

    public static void josephus(int k) {
        
        while(inicio != inicio.prox) { // Para só restar um 
        for(int i = 1; i < k-1; i++)  // Contagem
                inicio = inicio.prox;
        inicio.prox = inicio.prox.prox; // mata
        inicio = inicio.prox; // reinicia contagem
        }
    }
}
