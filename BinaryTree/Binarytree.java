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
    }   

public static void inserir(int x){
    NoB novo = new NoB(x);
    
    if(raiz == null)
        raiz = novo;
    
    else{
        
        NoB temp = raiz;
        boolean inseriu = false;
        
        while(!inseriu){
            if(novo.valor <= temp.valor){
                if(temp.esq == null){
                    temp.esq = novo;
                    inseriu = true;
                }else{
                    temp = temp.esq;
                }
            }else{
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
    if(temp != null){
        //TENTE MUDAR A ORDEM DAS 3 LINHAS ABAIXO 
        exibir(temp.esq);
        System.out.println(temp.valor);
        exibir(temp.dir);

    }
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
