package DoublyLinkedList.DoublyCircularLinkedList.Exercises2;
    import DoublyLinkedList.Node2.No;

public class Center {

    static No inicio = null;
    static No fim = null;
    
    public static void main(String[] args) {

        int N = 11;

        for(int i = 1; i < N + 1; i++) 
            Inserir(i);
        Exibir();
        if(N %2 == 0)
            System.out.println("Lista Ímpar \nO meio da lista é: "+ GetCentro());
        else
            System.out.println("Lista Par \nA média dos dois valores do meio da lista é: "+ GetCentro());
        GetCentro();

    }

    public static void Inserir(int x) {
        No novo = new No(x);
        if(inicio == null) {
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
        if(Vazio())
            System.out.println("Lista vazia, nada para exibir");
        else {
            No temp = inicio;
            while(temp != fim) {
                System.out.println(temp.valor);
                temp = temp.prox;
            }
            System.out.println(temp.valor);
        }
    }

    public static int GetCentro() {
        if(Vazio()) {
            System.out.println("Lista vazia, não há como mostrar o seu centro");
            return 0;
        }
        else {
            No tempI = inicio;
            No tempF = fim;
            while(tempI != tempF && tempI.prox != tempF) {
                tempI = tempI.prox;
                tempF = tempF.ant;
            }
            if(tempI == tempF)
                return tempI.valor;
            else
                return (tempI.valor + tempF.valor)/2; // Caso a lista seja par, é retornado a média dos dois valores do centro
        }
    }

    public static boolean Vazio() {
        if(inicio == null)
            return true;
        return false;
    }
}
