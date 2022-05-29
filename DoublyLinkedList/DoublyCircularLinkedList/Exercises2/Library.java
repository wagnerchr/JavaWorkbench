package DoublyLinkedList.DoublyCircularLinkedList.Exercises2;
import java.util.Scanner;
import DoublyLinkedList.Node2.NoLivro;

class AtividadeLivros {

    static NoLivro inicio = null;
    static NoLivro fim = null;
    
    public static void main(String[] args) {
        cadastrarLivro("LORENZI, F.; MATTOS, P. N.; CARVALHO, T. P."," Estruturas de dados","1ª edição","São Paulo","Thomson Learning",2007);
        cadastrarLivro("PEREIRA, S. L.","Estrutura de dados fundamentais: conceitos e aplicações","12ª edição","São Paulo","Érica",2008);
        cadastrarLivro("LAFORE, R.","Estrutura de dados & algoritmos em java","1ª edição","Rio de Janeiro","Ciência Moderna",2004);
        cadastrarLivro("SZWARCFITER, J. L.; MARKENZON, L.","Estruturas de dados e seus algoritmos","3ª edição","Rio de Janeiro","LTC",2010);
        cadastrarLivro("PREISS, B. R.","Estruturas de dados e algoritmos: pradrões de projetos orientados a objeto com java","1ª edição","Rio de Janeiro","Elsevier",2000);
        cadastrarLivro("WIRTH, N.","Algoritmos e estruturas de dados","1ª edição","Rio de Janeiro","LTC",2008);
        cadastrarLivro("CELES, W. ; CERQUEIRA, R.; RANGEL, J. L.","Introdução a estruturas de dados com técnicas de programação em C","1ª edição","Rio de Janeiro","Elsevier",2004);
        cadastrarLivro("GUIMARÃES, Â. M.; LAGES, N. A. C.","Algoritmos e estruturas de dados","1ª edição","Rio de Janeiro","LTC",2008);
        
        Scanner teclado = new Scanner(System.in);
        String opcao;
        NoLivro temp = inicio;
        mostrarLivro(temp);
        // detalharLivro(temp);
        
        do{
            System.out.print("\n INFORME A OPÇÃO DESEJADA\n"
                    + "\"a\" para avançar\n"
                    + "\"r\" para retroceder\n"
                    + "\"d\" para detalhar\n"
                    + "\"s\" para sair\n"
                    + "ESCOLHA:");
            
        opcao = teclado.nextLine(); 
        if(opcao.equals("a")) { // Avançar para o próximo livro
            temp = temp.prox;
            mostrarLivro(temp);
        }
        else if(opcao.equals("r")) {  // Voltar para o livro anterior
            temp = temp.ant;
            mostrarLivro(temp);
        }else if(opcao.equals("d")){    // Detalhar Livro
            detalharLivro(temp);
        }
        }while(!opcao.equals("s")); // Sair
        teclado.close();    // Encerra Scanner
        System.out.println("Volte sempre :)");
    }

    public static void cadastrarLivro(String autor,String titulo,String edicao,String local,String editora, int anoPubli) {
        NoLivro novo = new NoLivro(autor, titulo, edicao, local, editora, anoPubli);
        if(Vazio()) {
            inicio = fim = novo;
            inicio.ant = novo;
            fim.prox = novo;
        } else {
            novo.prox = inicio;
            inicio.ant = novo;
            novo.ant = fim;
            fim.prox = novo;
            fim = fim.prox;
        }
    }

    public static void mostrarLivro(NoLivro l) {
        if(Vazio())
            System.out.println("Não há livros cadastrados para mostrar");
        else {
            System.out.println("============================");
            System.out.println("LIVRO ATUAL: ");
            System.out.println("Autor: " + l.autor);
            System.out.println("TITULO: " + l.titulo);
        }
    }

    public static void detalharLivro(NoLivro l) {
        if(Vazio())
            System.out.println("Não há livros cadastrados para detalhar");
        else {
            System.out.println("\n============================");
            System.out.println("LIVRO: " + l.titulo);
            System.out.println("AUTOR: " + l.autor);
            System.out.println("EDIÇÃO: " + l.edicao);
            System.out.println("LOCAL: " + l.local);
            System.out.println("EDITORA: " + l.editora);
            System.out.println("ANO PUBLICADO: " + l.anoPubli);
        }
    }

    public static boolean Vazio() {
        if(inicio == null) 
            return true;
        return false;
    }
    
}