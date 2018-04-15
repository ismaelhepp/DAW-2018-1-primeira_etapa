package br.ifsul.edu.modelo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "formato")
public class Formato implements Serializable {

    @Id
    @SequenceGenerator(
            name = "seq_formato", 
            sequenceName = "seq_formato_id",
            allocationSize = 1)
    @GeneratedValue(
            generator = "seq_formato", 
            strategy = GenerationType.SEQUENCE)
    private Integer id;
    private String nome;

    public Formato() {}

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
}
