package avaliativa01;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.ImageIcon;

/**
 * @author cg3018466
 */
public class Cadastro implements Serializable {

    private String nome, endereco, cidade;
    private Date dataNasc;
    private float altura;
    private int numero;
    private ImageIcon foto;
    private Estado estado;

    
    public Cadastro(String nome){
        this.nome = nome;
    }
    
    public Cadastro(String nome, String endereco, String cidade, Date dataNasc, float altura, int numero, ImageIcon foto) {
        this.nome = nome;
        this.endereco = endereco;
        this.cidade = cidade;
        this.dataNasc = dataNasc;
        this.altura = altura;
        this.numero = numero;
        this.foto = foto;
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public ImageIcon getFoto() {
        return foto;
    }

    public void setFoto(ImageIcon foto) {
        this.foto = foto;
    }

    public Estado getEstado() {
        return this.estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Integer getIdade() {
        GregorianCalendar hoje = new GregorianCalendar();
        GregorianCalendar nascimento = new GregorianCalendar();
        if (this.dataNasc != null) {
            nascimento.setTime(this.dataNasc);
        }
        int anoHoje = hoje.get(Calendar.YEAR);
        int anoNascimento = nascimento.get(Calendar.YEAR);
        return (anoHoje - anoNascimento);
    }
}