package Exercises;
    import Node2.No;
public class StartEnd {
    
    static No inicio = null;
    static No fim = null;

    public static void main(String[] args) {
        
    int N = 10;  // Colocando a quantidade de números

    // Começo fim 
        for(int i = 1; i < N + 1; i++) {
            Insert(i);
        }

        // Exibir();
        RecExibir(inicio, fim);
    }

    public static void Insert(int x) {
        No novo = new No(x);
        if(inicio == null) {
            inicio = novo;
            fim = novo;
        } else {
            novo.ant = fim;
            fim.prox = novo;
            fim = fim.prox;
        } 
    }

    public static void Exibir() {
        if(Vazio())
            System.out.println("Lista vazia, nada para exibir");
        else {
            No temp = inicio;
            while(temp != null) {
                System.out.println(temp.valor);
                temp = temp.prox;
            }
        }
    }

    // Método Recursivo Exibir começo e fim
    public static void RecExibir(No inicio, No fim) {
        if(Vazio())
            System.out.println("Lista vazia, nada para exibir");
        else {
            if(inicio == fim)
                System.out.println(inicio.valor);
            else {
                if (inicio.ant != fim) {
                System.out.println(inicio.valor + " " + fim.valor);
                RecExibir(inicio.prox, fim.ant);
            }}
    }}
        

    public static boolean Vazio() {
        if(inicio == null)
            return true;
        return false;
    }
}
