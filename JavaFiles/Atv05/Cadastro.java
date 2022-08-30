package Atv05;

import java.io.IOException;
import java.lang.reflect.Field;

public class Cadastro implements Comparable<Cadastro> {

// nome,idade,cpf,rg,data_nasc,sexo,signo,mae,pai,email,senha,cep,endereco,numero,bairro,cidade,estado,telefone_fixo,celular,altura,peso,tipo_sanguineo,cor

    String nome, cpf, rg, data_nasc, sexo, signo, mae, pai, email, senha,
    cep, endereco, bairro, cidade, estado,
    telefone_fixo, celular, tipo_sanguineo, cor;
    int idade, numero;   
    float altura, peso;
    

    Cadastro(String nome,    
    int idade,
    String cpf,
    String rg,
    String data_nasc,
    String sexo,
    String signo,
    String mae,
    String pai,
    String email,
    String senha,
    String cep,
    String endereco,
    int numero,
    String bairro,
    String cidade,
    String estado,
    String telefone_fixo,
    String celular,
    float altura,
    float peso,
    String tipo_sanguineo,
    String cor) {

    this.nome = nome;
    this.idade = idade;
    this.cpf = cpf;
    this.rg = rg;
    this.data_nasc = data_nasc;
    this.sexo = sexo;
    this.signo = signo;
    this.mae = mae;
    this.pai = pai;
    this.email = email;
    this.senha = senha;
    this.cep = cep;
    this.endereco = endereco;
    this.numero = numero;
    this.bairro = bairro;
    this.cidade = cidade;
    this.estado = estado;
    this.telefone_fixo = telefone_fixo;
    this.celular = celular;
    this.altura = altura;
    this.peso = peso;
    this.tipo_sanguineo = tipo_sanguineo;
    this.cor = cor;
    }

    public int compareTo(Cadastro outroCadastro) {
        if(this.nome.compareTo(outroCadastro.nome) > 0) 
            return 1;
        if(this.nome.compareTo(outroCadastro.nome) < 0)
            return -1;
        return 0; // Strings Idênticas
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
    
        // Valores de Cadastro
        Field[] fields = this.getClass().getDeclaredFields();

        // Printando os valores
        for (Field field : fields ) {
            result.append(" ");
            try {
                // result.append(field.getName() ); // Nome dos campos
                result.append(field.get(this) );
            } catch(IllegalAccessException e) {
                e.printStackTrace();
            }
            result.append(" "); // espaço entre cada dado
        }

        result.append("\n"); // pula uma linha para cada Cadastro
        
        return result.toString();
    }
}


