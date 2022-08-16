public class Ex02 {
    
    public static void main(String[] args) {

    // Entrada de dados
        int quantidadeArquivos = 10; 
        int quantidadeNumeros = 10;
        int[] quantidadePastas = {100, 1000, 10000, 50000, 100000};

        GeraSequencias geraSeq = new GeraSequencias();
        OrdenaSequencia ordenaSeq = new OrdenaSequencia();

    // Cria Pastas com Sequências
        // (Número de arquivos .txt, Quantidade de Números aleatórios, Array(Quantidade Pastas))
        geraSeq.geraSequencias(quantidadeArquivos,  quantidadeNumeros, quantidadePastas);
        ordenaSeq.ordenaSequencias(quantidadeArquivos, quantidadeNumeros, quantidadePastas);
    }
}
