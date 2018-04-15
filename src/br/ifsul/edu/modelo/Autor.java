package br.ifsul.edu.modelo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "autor")
public class Autor implements Serializable {
    
    @Id
    @SequenceGenerator(
            name = "seq_autor", 
            sequenceName = "seq_autor_id",
            allocationSize = 1)
    @GeneratedValue(
            generator = "seq_autor", 
            strategy = GenerationType.SEQUENCE)
    private Integer id;
        
    private String nome;
    private String bibliografia;

    public Autor() {}
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getBibliografia() {
        return bibliografia;
    }

    public void setBibliografia(String bibliografia) {
        this.bibliografia = bibliografia;
    }
}