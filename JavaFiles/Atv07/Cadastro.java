package atv06;

import java.lang.reflect.Field;

public class Cadastro implements Comparable<Cadastro> {

// nome,idade,cpf,rg,data_nasc,sexo,signo,mae,pai,email,senha,cep,endereco,numero,bairro,cidade,estado,telefone_fixo,celular,altura,peso,tipo_sanguineo,cor

//  //Deixar dados em private
    // String nome, cpf, data_nasc, endereco, cidade, estado;
    // int numero;   
    private String nome, cpf, data_nasc, endereco, cidade, estado;
    private int numero;
    
    Cadastro(String nome, String cpf, String data_nasc, String endereco, int numero, String cidade, String estado) {
    this.nome = nome;
    this.cpf = cpf;
    this.data_nasc = data_nasc;
    this.endereco = endereco;
    this.numero = numero;
    this.cidade = cidade;
    this.estado = estado;
    
    
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
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getCPF() {
        return this.cpf;
    }
    
    public void setCPF(String cpf) {
        this.cpf = cpf;
    }
    
    public String getData_nasc() {
        return this.data_nasc;
    }
    
    public void setData_nasc(String data_nasc) {
        this.data_nasc = data_nasc;
    }
    
    public String getEndereco() {
        return this.endereco;
    }
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public int getNumero() {
        return this.numero;
    } 
    
    public void setNumero(int numero) {
        this.numero = numero;
    }
     
    public String getCidade() {
        return this.cidade;
    }
    
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
}