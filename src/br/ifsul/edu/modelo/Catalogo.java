package br.ifsul.edu.modelo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "catalogo")
public class Catalogo implements Serializable {

    @Id
    @SequenceGenerator(
            name = "seq_catalogo", 
            sequenceName = "seq_catalogo_id",
            allocationSize = 1)
    @GeneratedValue(
            generator = "seq_catalogo", 
            strategy = GenerationType.SEQUENCE)
    private Integer id;
    private String nome;
    private String descricao;

    public Catalogo() {}

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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}