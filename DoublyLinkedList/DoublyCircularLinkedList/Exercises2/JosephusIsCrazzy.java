package DoublyCircularLinkedList.Exercises2;
    import DoublyCircularLinkedList.Node3.No;

class JosephusisCrazzy {
    static No inicio;
    static No fim;

    public static void main(String[] args) {
        int N = 7;   // Número de elementos da roda
        int S = 3;  // Saltos para frente
        int J = 2; // Saltos para trás após achar o nó pelos passos à frente

        // Josephus
        for(int i = 1; i < N + 1; i++) {
            Inserir(i);
        }
        Exibir();
        Josephus(S, J);
      
    }

    public static void Inserir(int x) {
        No novo = new No(x);
        if(Vazio()) {
            inicio = fim = novo;
            inicio.prox = fim;
            fim.prox = novo;
        } else {
            novo.prox = inicio;
            inicio.ant = novo;
            novo.ant = fim;
            fim.prox = novo;
            fim = fim.prox;        
        }
    }

    public static void Exibir() {
        if(Vazio()) {
            System.out.println("Lista vazia, nada para exibir");
        } else if(inicio == inicio.prox) 
            System.out.println(inicio.valor);
        else {

            No temp = inicio;
            while(temp != fim) {
                System.out.println(temp.valor);
                temp = temp.prox;
            }
                System.out.println(fim.valor);     
        }
    }

    public static void Josephus(int s, int j) {
        if(Vazio()) 
            System.out.println("Lista vazia, não há como realizar josephus :( ");
        else {
            No temp = inicio;
            while(temp != temp.prox) {
                for(int i = 0; i < s - 1; i++ )
                    temp = temp.prox;
                temp.ant.prox = temp.prox;
                temp.prox.ant = temp.ant; 
                temp = temp.ant;
                for(int i = 0; i < j -1; i++) // saltando para trás 
                    temp = temp.ant;
                temp.ant.prox = temp.prox;
                temp.prox.ant = temp.ant;
                temp = temp.prox;     
            }
            System.out.println("Sobrevivente: " + temp.valor);
        }
    }

    public static boolean Vazio() {
        if (inicio == null)
            return true;
        return false;
    }

}