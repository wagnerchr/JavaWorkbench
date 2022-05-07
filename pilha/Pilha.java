public class Pilha {

    public static int N = 5;               // Tamanho Pilha
    public static int vet[] = new int[N]; // Pilha
    public static int indiceTopo = -1;   // -1 é a posição inválida do vetor
    
    public static void main(String[] args) {
        
        empilhar(5);
        empilhar(8);
        // empilhar(4);
        // empilhar(4444);
        empilhar(47);
        empilhar(20); // Já está cheio
        
        empilhar(57);

        // desempilhar();
      
       

        chutar();
        System.out.println(tamanho());
        System.out.println(cheio());
        System.out.println(vazio());
        System.out.println(
            //vet[indiceTopo]
            topo()
        );
    }
    
    // Função adicionar "bloco" a pilha
    public static void empilhar(int x) {
        
        if( //indiceTopo >= N - 1
            cheio() == true) 
            System.out.println("A pilha está cheia :( ");
        else {
            indiceTopo++;
            vet[indiceTopo] = x;   
        }   
    }

    // Função para desempilhar o "último bloco"
    public static void desempilhar(){
        
        if(//indiceTopo == -1
            vazio() == true) 
            System.out.println("Lista está vazia, não tem o que desempilhar :( ");
        else {
            vet[indiceTopo] = vet[indiceTopo--];
        }
    }

    // Função para dar uma bica na pilha e desempilhar ela toda
    public static void chutar() { 
        for(int i = 0; i < indiceTopo + 1;) {
            System.out.println("Desempilhando... " + vet[indiceTopo]); 
            indiceTopo--;
        }
        System.out.println("\n -- Tudo desempilhado -- \n");
     }

    // Função para ver o topo da pilha
    public static int topo() {
        if(vazio() == true) {
            System.out.print("A lista está vazia, não há topo: ");
            return 0;
        }
        else {
        System.out.print("O valor do topo é: ");
        return vet[indiceTopo];
        }
    }

    public static int tamanho() {

        if(vazio() == true) {
            System.out.print("A lista está vazia: ");
            return 0;
        }
        else {
            int count = 1;
            for(int i = 0; i < indiceTopo; i++) {
                count++;
            }
            System.out.print("O tamanho atual da pilha é de: ");
            return count;
        }   
    }
     

    public static boolean cheio() {
        if(indiceTopo >= N -1) 
            return true;
        else 
            return false;     
    }

    public static boolean vazio(){
        if( indiceTopo == -1) 
            return true;
        else
            return false;
    }
}

