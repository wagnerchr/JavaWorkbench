

public class Ex01 {
    public static void main(String[] args) {
        System.out.println("main file");

        GeraPastas geraPastas = new GeraPastas();
        // Gera Main Pasta
            geraPastas.mainPasta();
        // Gera Sub Pastas
            // Tem de passar o número de pastas que quer criar
            geraPastas.subPastas(5);
        

    }
  
}

// / CRIANDO ARQUIVOS DENTRO DAS SUB-PASTAS E INSERINDO
// int Nsub = 8;
// // Aqui insere a qnt de números aleatórios
// // int nAleatorios = 10;

// int min = 10;
// int max = 100;

// Random r = new Random();

// for(int i = 0; i < Nsub + 1; i++) {
// for(int j = 0; j < Nsub; j++) {
// try {
// File arquivo1 = new File("arquivo"+(i+1)+".txt");
// File arquivo2 = new File("Pasta/"+nomes[j]+"/"+arquivo1);
// if(arquivo2.createNewFile()) {
// FileWriter escreve = new FileWriter(arquivo2);
// System.out.println("Directory Created");
// escreve.write(r.nextInt(max - min)+min);
// escreve.close();
// } else {
// System.out.println("Directory is not created");
// }
// } catch(Exception e){
// e.printStackTrace();
// }
// }
// }

// }}
