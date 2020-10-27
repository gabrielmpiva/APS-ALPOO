package model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Departamento implements Serializable {
    /*
        No pacote  model crie a classe Departamento, com um construtor padrão (vazio)
        e osseguintes atributos encapsulados:

          id (Integer)
          nome (String)
          area (String)
     */
    @Id
    @Column(unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String area;

    public Departamento() { }

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

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append("Departamento: ").append(getNome())
                .append(" - ").append(getArea()).toString();
    }
}
