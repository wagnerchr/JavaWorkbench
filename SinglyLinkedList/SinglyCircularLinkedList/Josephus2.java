package  SinglyCircularLinkedList;
    import Node.No;

public class Josephus2 {
    static No inicio;

    public static void main(String[] args) {
        
        int N = 3; // Número de componentes
        int P = 1;   // My position, i'm into the cirle OMG :(
        int S = 1; // Salto

        // Inserir(4);
        // Inserir(5);
        // Inserir(6);

        // Exibir();

        DiscoverJosephus(N, P, S); // Discover dica reenserindo para testar até achar o salto que satisfaça a condição da posição P não rodar
    }

    public static void Inserir(int x) {
        No novo = new No(x);
        if(Vazio()) {
            inicio = novo;
            inicio.prox = inicio;
        } else {
            No temp = inicio;
            while(temp.prox != inicio) 
               temp = temp.prox;
            novo.prox = inicio;
            temp.prox = novo;
       }
}


    public static void Exibir() {
        if(Vazio())
            System.out.println("Lista vazia, não há nada para mostrar");
        else {
            No temp = inicio;
            while(temp.prox != inicio) {
                System.out.println(temp.valor);
                temp = temp.prox;
            }
            System.out.println(temp.valor); // Print last value
        }
    }

    public static void Josephus(int s) {
        if(Vazio())
            System.out.println("Lista vazia, não há como rolar um Josephus");
        else {
            while(inicio != inicio.prox) {
                for(int i = 1; i < s; i++)
                    inicio = inicio.prox;
                inicio.prox = inicio.prox.prox;
                inicio = inicio.prox;
        }   }
    }

    public static void DiscoverJosephus(int n, int p, int s) {
            do {
                inicio = null;
                for(int i = 1; i <= n; i++) 
                    Inserir(i);
                Josephus(s);
                s++;   
            } while(inicio.valor != p)   ; 
        System.out.print("Em um circulo de tamanho: "+ n + " ");
        System.out.print("o número de saltos para o sobrevivente na posição: " + p + " sobreviver ");
        System.out.print("seria: "+ s);

}

    public static boolean Vazio() {
        if(inicio == null) 
            return true;
        return false;
    }
}
