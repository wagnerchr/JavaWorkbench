package Exercises;
import Node.No;

public class ListaLigadaSimplesPilha {

    static No inicio = null;

    public static void main(String[] args) {

        // for (int i = 0; i < 5 - 1; i++) {
        //     int x = (int) (Math.random() * 100);

        //     empilhar(x);
        // // }
    
    empilhar(32);
    empilhar(67);
    empilhar(45);
    // tamanho(inicio);
    desempilhar();
    System.out.println("Exibindo topo da pilha: " + exibeTopo());
    

       
    }

    // Stack up
    public static void empilhar(int x) {
        No novo = new No(x); // New space to new value 

        if (inicio == null) {
            inicio = novo;  // If null, that value will be the start
        } else {
            No temp = inicio;
            while (temp.prox != null) {
                temp = temp.prox;
            }
            temp.prox = novo;
        }
    }

    // Recursive Show size
    public static void tamanho(No temp) {
        
        if (vazio() == true) {
            System.out.println("Lista vazia, nada a exibir...");
        } else {
            if(temp.prox != null) { 
                tamanho(temp.prox);
            }
            System.out.println(temp.valor);
        }
    }

    // Show top
    public static int exibeTopo() {
        if (vazio() == true) {
            System.out.println("Nada a exibir, Lista Vazia...");
            return 0;
        } else {
            No temp = inicio;
            while (temp.prox != null) // chegar no último elemento
            {
                temp = temp.prox;
            }
            return(temp.valor);
        }
    }

    // Unstack
    public static void desempilhar() {
        if (inicio == null) {
            System.out.println("Lista vazia, impossível remover o último");
        } else {
            if (inicio.prox == null) {
                inicio = null; // Caso haja só um valor
            } else {
                No temp = inicio;
                while (temp.prox.prox != null) {
                    temp = temp.prox;
                }
                temp.prox = null;
            }
        }
    }

    // Is empty
    public static boolean vazio() {
        if(inicio == null) 
            return true;
        else 
            return false;      
    }
}