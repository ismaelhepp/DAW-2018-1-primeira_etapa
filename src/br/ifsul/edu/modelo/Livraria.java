package br.ifsul.edu.modelo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "livraria")
public class Livraria implements Serializable {
    
    @Id
    @SequenceGenerator(
            name = "seq_livraria", 
            sequenceName = "seq_livraria_id",
            allocationSize = 1)
    @GeneratedValue(
            generator = "seq_livraria", 
            strategy = GenerationType.SEQUENCE)
    private Integer id;
    private String nome;
    private String site;

    public Livraria() {}

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

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }
}
