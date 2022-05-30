package pilha;
class Pilha {

    public static int N = 5;               // Tamanho Pilha
    public static int vet[] = new int[N]; // Pilha
    public static int indiceTopo = -1;   // -1 é a posição inválida do vetor
    
    public static void main(String[] args) {
        
        empilhar(57);
        empilhar(49);
        desempilhar();
        desempilhar();
        empilhar(5);
        empilhar(67);
        chutar();
        empilhar(9);
       

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
            System.out.println("Pilha está vazia, não tem o que desempilhar :( ");
        else {
            vet[indiceTopo] = vet[indiceTopo--];
        }
    }

    // Função para dar uma bica na pilha e desempilhar ela toda
    public static void chutar() { 
        if(vazio() == true) {
            System.out.println("Pilha está vazia, não tem o que chutar :( ");
        } else {
        for(int i = 0; i < indiceTopo + 1;) {
            System.out.println("Desempilhando... " + vet[indiceTopo]); 
            indiceTopo--;
        }
        System.out.println("\n -- Tudo desempilhado -- \n");
     }}

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

