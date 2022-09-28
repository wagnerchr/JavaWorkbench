
package avaliativa01;

import java.util.Date;


public class Cadastro {
    public String nome, 
                    cpf,
                    endereco,
                    cidade,
                    estado,
                    foto;
    public int numero;
    public float altura;
    public Date dataNasc;

    public Cadastro(String nome, String cpf, String endereco, String cidade, String estado, String foto, int numero, float altura) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
        this.foto = foto;
        this.numero = numero;
        this.altura = altura;
       
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }
    
    
}
