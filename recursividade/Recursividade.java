

public class Recursividade {
    public static void main(String[] args) {

        int N = 5;
        System.out.println(fat(N));

        int[] vet = new int[N]; // VETOR
        for (int i = 0; i < N; i++) { 
            vet[i] = i + 1; // ADICIONANDO VALORES AO VETOR
        }

    // Chamadas

        exibeVet(vet, N - 1);
        // 01
        System.out.println("Somando todos os números <= ao escolhido: " + soma(10));
        // 02
        System.out.println("Potência: " + pot(2, 2));
        //
        System.out.println("Crescente && Decrescente: ");
        // 03
        cresc(5);
        // 04
        decresc(5);
        // 05
        System.out.println("Somando todos os valores do vetor: " + somaVet(vet, N - 1));
        // 06
        System.out.println(menorValor(vet, N - 1)); 
        // 07
        System.out.println("Decimal para binário");
        DecBin(N);

    }

    // fatorial recursiva
    public static int fat(int x) {
        if (x > 1) {
            return x * fat(x - 1);
        }
        return 1;
    }

    //exibição de vetores recursiva
    public static void exibeVet(int vet[], int indice) {
        if (indice >= 0) {
            //infixo (comentar todas linhas)
            //exibeVet(vet,indice-1);
            //System.out.println(vet[indice]);

            //posfixo (comentar todas linhas)
            System.out.println(vet[indice]);
            exibeVet(vet, indice - 1);
        }
    }

    //FUNÇÃO SOMA 
    public static int soma(int x) {
        if (x == 1) 
            return 1; 
        else 
            return x + soma(x - 1); 
            
    }
    //FUNÇÃO POTÊNCIA
    public static int pot(int x, int y) {
        if (y == 0) 
            return 1;
        if (y < 0) 
            return 1 / pot(x, -y); 
        return x * pot(x, y - 1);
        }   
    //FUNÇÃO CRESCENTE
    public static void cresc(int x){
        if(x >= 0) {
            cresc(x-1); // É chamado e chamado antes de exibir, depois vai tudo ao contrário
            System.out.println(x);
        }
    }

    public static void decresc(int x){
        if(x >= 0) { 
            System.out.println(x); // Descrescente ao contrário
            cresc(x-1);
        }
    }

    public static int somaVet(int vet[], int N) {
        if (N > 0) {
            return vet[N] + somaVet(vet, N - 1);
        }
        return vet[N];
    }

    public static int menorValor(int vet[], int N) {
        
        if(N > 0) {
            int menor = menorValor(vet, N - 1);
        if(menor < vet[N]) 
            return menor;
        return vet[N];
        }

        return vet[N];
    }

    public static void DecBin(int N) {
        if(N > 0) {
            DecBin(N/2);
            System.out.println(N%2);
        } else {
            System.out.println(0);
        }
    }
}