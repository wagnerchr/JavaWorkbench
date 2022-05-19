package Exercises;
    import Node.No;

public class PrimeNumbers {
    
    public static No inicio = null;

    public static void main(String[] args) {
      
        int N = 100; // Parâmetro fornecido pelo usuário 

        for(int i = 0; i < N + 1; i++) // Inserindo valores
            Insert(i);

        // exibir();
        exibirPrimos();
    }

   

    public static void Insert(int x) {
        No novo = new No(x);
        if(inicio == null) 
            inicio = novo;
        else {
            No temp = inicio;
            while(temp.prox != null)
                temp = temp.prox;
            temp.prox = novo;
        }
    }

    public static void exibir() {
        if (Vazio())
             System.out.println("Lista vazia, nada para exibir");
        else {
            No temp = inicio;
            while(temp.prox != null) {
                System.out.println(temp.valor);
                temp = temp.prox;
            }
            System.out.println(temp.valor);
        }
    }

    public static void exibirPrimos() {
        if(Vazio())
            System.out.println("Lista vazia, nada para exibir");
        else {
            No temp = inicio;
            while(temp.prox != null) {
                if(Prime(temp.valor)) {
                    System.out.println(temp.valor);
                    temp = temp.prox;
                } else
                    temp = temp.prox;
            }
            if(Prime(temp.valor))   // Último valor da lista
                System.out.println(temp.valor);
        }
    }

    public static boolean Prime(int x) {
        for(int divisor = 2; divisor < x; divisor ++) {
            if(x % divisor == 0) 
                return false;
        } if (x == 0 || x == 1)
            return false;
        return true;
    }

    public static boolean Vazio() {
        if(inicio == null)
            return true;
        else
            return false;
    }
}
