public class ListaLigadaSimples {

    static No inicio = null;
    public static void main(String[] args) {
        
        // Insert(66);
        // Insert(45);
        // Insert(2);

        insereOrdenado(66);
        insereOrdenado(45);
        insereOrdenado(2);
        insereOrdenado(3);
        insereOrdenado(3);
        insereOrdenado(3);
        insereOrdenado(47);
        removeValor(66);
        removeTodos(3);
        exibeRec(inicio);
        // exibeRecInv(inicio);
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

    public static void exibeRec(No n) {
        if(inicio == null) 
            System.out.println("Lista vazia, nada a exibir :( ");
        else {
            if(n != null) {
            System.out.println(n.valor);
            exibeRec(n.prox);
        }}
    }

    public static void exibeRecInv(No n) {
        if(inicio == null)
            System.out.println("Lista vazia, nada a exibir");
        else {
            if(n != null) {
                exibeRecInv(n.prox);
                System.out.println(n.valor);
            }
        }
    }
    
    public static void insereOrdenado(int x) {
        No novo = new No(x);
        if(inicio == null)
            inicio = novo;
        else if (novo.valor < inicio.valor) {
            novo.prox = inicio;
            inicio = novo;
        } else {
            No temp = inicio;
            while(temp.prox != null && temp.prox.valor < novo.valor)  // Loop corre até achar x
                temp = temp.prox;
            if (temp.prox == null) {
                temp.prox = novo;
            } else {
                novo.prox = temp.prox;
                temp.prox = novo;
            }
        }   
    }

    public static void removeValor(int x) {
        if(inicio == null) 
            System.out.println("Lista vazia, nada para remover");
        else if (inicio.valor == x) {
            inicio = inicio.prox;
        } else {
            No temp = inicio;
            while(temp.prox != null && temp.prox.valor != x )  // Loop corre até achar x
                temp = temp.prox;
            if(temp.prox == null)  // Para quando o valor passado nem se quer estiver na lista
                System.out.println("Valor não encontrado, nada alterado na lista");
            else 
                temp.prox = temp.prox.prox; // x recebe próximo valor || null
        }
    }

    public static void removeTodos(int x) { // Para remover todas as ocorrências de x
        if(inicio == null) 
            System.out.println("Lista vazia, nada pra remover");
        else if(inicio.valor == x) // Caso no inicio tenha 2 ou mais x's um do lado do outro
            do {
                inicio = inicio.prox;
            } while (inicio.valor == x);
        else {
            No temp = inicio;
            while(temp.prox != null) {
                if (temp.prox == null) 
                    System.out.println("Valor não encontrado, nada alterado na lista");
                else if (temp.prox.valor == x) 
                    temp.prox = temp.prox.prox;
                else 
                    temp = temp.prox;
            }
        }
    }

}

