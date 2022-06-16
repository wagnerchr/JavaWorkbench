package BinaryTree;

public class Binarytree {
    
    public static NoB raiz;
    public static void main(String[] args) {
        inserir(10);
        inserir(7);
        inserir(4);
        inserir(8);
        inserir(6);
        inserir(9);
        inserir(14);
        
        exibir(raiz);
        menor(raiz);
        maior(raiz);
        System.out.println("--------------");
        exibeFolhas(raiz);
        System.out.println("--------------");
        System.out.println(
        contaNos(raiz));
    }   

public static void inserir(int x){
    NoB novo = new NoB(x); 
    if(raiz == null)
        raiz = novo;
    else{
        NoB temp = raiz;
        boolean inseriu = false;
        while(!inseriu){
            if(novo.valor <= temp.valor) { // Valores menores esquerda
                if(temp.esq == null){
                    temp.esq = novo;
                    inseriu = true;
                }else{
                    temp = temp.esq;
                }
            }else{                       // Valores maiores direita
                if(temp.dir == null){
                    temp.dir = novo;
                    inseriu = true;
                }else{
                    temp = temp.dir;
                }
            }
        }
    }
}

 public static void exibir(NoB temp){
    if (raiz == null) 
        System.out.println("Árvore vazia, não há nada para exibir.");
    else {
        if(temp != null){
            exibir(temp.esq);
            System.out.println(temp.valor);
            exibir(temp.dir);
    }
}}

public static void exibeFolhas(NoB temp) {
    if (raiz == null) 
        System.out.println("Árvore vazia, não há nada para exibir.");
    else {
        if(temp != null) {
            exibeFolhas(temp.esq);
            if(temp.esq == null && temp.dir == null) // Ambos tem de ser null para ter acesso a folha
                System.out.println(temp.valor);
            exibeFolhas(temp.dir);
        }
        
    } 
}

public static int contaNos(NoB temp) {
    if(temp!=null){
        return 1+contaNos(temp.esq)+contaNos(temp.dir);
    }
    return 0;

}

public static void maior(NoB temp) {
    while(temp.dir != null)  // Até o último da direita
        temp = temp.dir;    // Próximo valor para direita 
    System.out.println("O maior valor da árvore é : "+temp.valor);
}

public static void menor(NoB temp) {
    while(temp.esq != null)  // Até o último da ESQUERDA
        temp = temp.esq;    // Próximo valor para ESQUERDA 
    System.out.println("O menor valor da árvore é : "+temp.valor);
}

}
