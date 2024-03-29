package DoublyLinkedList.Exercises;
import DoublyLinkedList.Node2.No;

class DoublyLinkedList {

    static No inicio = null;
    static No fim = null;

    public static void main(String[] args) {
        
        inserir(666);
        inserir(3);
        inserir(535423);
        inserir(666);
        inserir(666);
        
        inserir(542);
        inserir(666);
       
        // removeUltimo();
        // insereOrdenado(10);
        // insereOrdenado(2);
        // insereOrdenado(3);
        // insereOrdenado(5);
        // insereOrdenado(4);
        // insereOrdenado(1);

        // removePrimeiro();
        // removeUltimo();
        // removeValor(3);
        removeTodos(666);
        exibir();
    
        
    }

    public static void inserir(int x) {
        No novo = new No(x);
        if(inicio == null) {
            inicio = novo;
            fim = novo;
        } else {
            novo.ant = fim; // se possiciona a frente do fim, sendo o novo fim
            fim.prox = novo; // o próximo valor de fim é o novo valor 
            fim = fim.prox;
        }

    }

    public static void exibir() {
        if(inicio == null)
            System.out.println("Lista está vazia, não há nada para exibir :(");
       else {
        No temp = inicio;
        while(temp != null) {
            System.out.println(temp.valor);
            temp = temp.prox;
        }
        }
    }

    public static void removeUltimo() {
        if(inicio == null) {
            System.out.println("Lista está vazia, não há valor para remover");
        } else if (inicio == fim) {
            inicio = null;
            fim = null;
        } else {
            fim = fim.ant;  // Novo Fim
            fim.prox = null; // Remove antigo Fim
        }
    }
    
    public static void removePrimeiro() {
        if(inicio == null) {
            System.out.println("Lista está vazia, não há valor para remover");
        } else if(inicio == fim) {
            inicio = null;
            fim = null;
        } else {
            inicio = inicio.prox; // Novo Inicio
            inicio.ant = null;  // Remove antigo Inicio
        }
    }

    public static void insereOrdenado(int x) {
        No novo = new No(x);
        if (inicio == null) {
            inicio = novo;
            fim = novo;
        }
        else if (novo.valor <= inicio.valor) {
            novo.prox = inicio;
            inicio.ant = novo;
            inicio = inicio.ant;
        } else {
            No temp = inicio;
            while(temp != null && temp.valor < novo.valor) // loop corre enquanto estiver em ordem
                temp = temp.prox;
            if(temp == null)  {
                novo.ant = fim;
                fim.prox = novo;
                fim = fim.prox;
            }  
            else {
                novo.prox = temp;
                novo.ant = temp.ant;
                temp.ant.prox = novo;
                temp.ant = novo; 
            }
        }
    }

    public static boolean removeValor(int x) {
        boolean removido = false; // Variável para checar se removeValor removeu alguem

        if(inicio == null)
            System.out.println("Lista está vazia, não há nada para remover");
        else if(inicio.valor == x) {
            removido = true;
            removePrimeiro();
        }
        else {
            No temp = inicio;
            while(temp != null && temp.valor != x) // Loop até encontrar o valor
                temp = temp.prox;
            if(temp == null)
                System.out.println("Valor "+ x +" não encontrado ou já removido da Lista"); // Caso não encontre o valor
            else {
                removido = true;

                if (temp == fim) {
                    fim = fim.ant;
                    fim.prox = null;
                } else {
                    temp.prox.ant = temp.ant;
                    temp.ant.prox = temp.prox;
                }
            }
        }
    
        return removido;
    }

    public static void removeTodos(int x) {
        while(removeValor(x)){}  
    }

}
