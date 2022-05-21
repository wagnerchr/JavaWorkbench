package DoublyCircularLinkedList.Exercises2;
import Node2.No;

public class DoublyCircularLinkedList {

    static No inicio = null;
    static No fim = null;

    public static void main(String[] args) {
       
    //    inserir(2233332);
    //    inserir(222);
    //    inserir(67);
    //    inserir(5);
       insereOrdenado(7);
       insereOrdenado(2);
       insereOrdenado(1);
       insereOrdenado(10);
       insereOrdenado(8);
        removeValor(2);
       exibir();
       
        
    }

    public static void inserir(int x) {
        No novo = new No(x);
        if (inicio == null) {
            inicio = fim = novo;
            inicio.prox = fim;  // Por ser circular
            fim.prox = inicio;  // Por ser circular
        } else {
            novo.prox = inicio;     // Fica atrás de inicio
            inicio.ant = novo;          // Fica atrás de inicio 
            novo.ant = fim;         // Fica na frente do fim
            fim.prox = novo;            // Fica na frente do fim
            fim = fim.prox;         // Torna-se o novo fim
        }
    }

    public static void exibir() {
        if(Vazio()) 
            System.out.println("não há nada para exibir");
        else {
            No temp = inicio;
            while(temp != fim) {
                System.out.println(temp.valor);
                temp = temp.prox;
            }
            System.out.println(fim.valor);
        }
    }

    public static void removeUltimo() {
        if(Vazio())
            System.out.println("Lista vazia, não há nada para remover");
        else if(inicio == fim) 
            inicio = fim = null;
        else {
            fim = fim.ant;
            fim.prox = inicio;
            inicio.ant = fim;
        }
    }

    public static void removePrimeiro() {
        if(Vazio())
            System.out.println("Lista vazia, não há nada para remover");
        else if(inicio == fim) 
            inicio = fim = null;
        else {
            inicio = inicio.prox;
            inicio.ant = fim;
            fim.prox = inicio;
        }
    
    }

    public static void insereOrdenado(int x) {
        No novo = new No(x);
        if(Vazio())   // Caso não haja nenhum valor
            inserir(x);
        else if(novo.valor <= inicio.valor) {
            novo.prox = inicio;  // 
            novo.ant = fim;     //

            inicio.ant = novo;  // Entra como anterior de inicio
            fim.prox = novo;   // Entra como próximo de fim

            inicio = inicio.ant; // Vira o novo inicio
        } else if (novo.valor >= fim.valor) {
            novo.prox = inicio;  // 
            novo.ant = fim;     // 

            inicio.ant = novo;  // Entra como anterior de Inicio
            fim.prox = novo;   // Entra como próximo de fim    

            fim = fim.prox;  // Vira o novo fim
        } else {
            No temp = inicio;
            while(temp.valor < novo.valor) 
                temp = temp.prox;
            novo.prox = temp;
            novo.ant = temp.ant;
            temp.ant.prox = novo;
            temp.ant = novo;    
        }
    }

    public static void removeValor(int x) {
        if(Vazio())
            System.out.println("Lista vazia, não há valor para remover");
        else {
            No temp = inicio;
            while(temp != fim  && temp.valor != x) 
                temp = temp.prox;
            if(inicio == fim) 
                inicio = fim = null;
            else {
                if(temp == inicio) 
                    removePrimeiro();
                else {
                    if(temp == fim)
                        removeUltimo();
                    else {
                        temp.prox.ant = temp.ant;
                        temp.ant.prox = temp.prox;
                    }
                }
                
            }
        }  
    }
    public static boolean Vazio() {
        if(inicio == null) {
            return true;
        }
        else 
            return false;
    }
}
