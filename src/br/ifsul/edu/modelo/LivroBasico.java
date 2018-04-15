package br.ifsul.edu.modelo;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "livro_basico")
public class LivroBasico implements Serializable {
    
    @Id
    @SequenceGenerator(
            name = "seq_livro_basico", 
            sequenceName = "seq_livro_basico_id",
            allocationSize = 1)
    @GeneratedValue(
            generator = "seq_livro_basico", 
            strategy = GenerationType.SEQUENCE)
    private String ISBN;
    private String titulo;
    private String resumo;
    private String editora;
    private Calendar dataPublicacao;

    public LivroBasico() {}

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public Calendar getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(Calendar dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }
}
