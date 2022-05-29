package fila;

public class Fila {
    
    public static int N = 5;
    public static int vet[] = new int[N];
    public static int primeiro = -1; 
    public static int ultimo = -1;
    public static int total;
    
    public static void main(String[] args) {

        Enfileirar(1111);
        Enfileirar(57);
        Enfileirar(84);
        Enfileirar(252513123);
        Enfileirar(3);

        System.out.println(Tamanho());
        System.out.println(Cheia());
        System.out.println(Vazia());

    // Esvaziando todos, FIFO
        while(Vazia() != true) {
            System.out.println("Sequência da Fila: " + Desenfileirar());
        }

        Desenfileirar();

    }

    public static void Enfileirar(int x) {
        if(Cheia()) 
            System.out.println("A fila está cheia, não é possível Enfileirar mais");
        else {
        ultimo++;
        vet[ultimo] = x;
        if(ultimo == N) 
            ultimo = 0 ;
        total++;
        }
    }
    public static int Desenfileirar() {
        if(Vazia() == true) {
            System.out.println("A fila já está vazia, não é possível Desenfileirar mais");
            return 0;
        }
        else {
        primeiro++;
        int x = vet[primeiro];
        if(primeiro == N) 
            primeiro = 0;
        total--;
        return x;
        }
    }

    public static boolean Vazia() {
        if (total == 0) 
            return true;
        return false;
    }

    public static boolean Cheia() {
        if(total == N) 
            return true;
        return false;
    }

    public static int Tamanho() {
        System.out.print("O tamanho da fila é: ");
        return total;
    }
 }
