package model;

import javax.persistence.*;
import java.awt.*;
import java.util.ArrayList;

@Entity
public class Authors {

    @Id
    @Column(unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer author_id;
    private String  name;
    private String  fname;
    
    
    
    
    public static final String ORDER_BY_NAME = "name";
    
    
    

    public Authors() {
    }

    public Integer getAuthorId() {
        return author_id;
    }

    public void setAuthorId(Integer authorId) {
        this.author_id = authorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getfName() {
        return fname;
    }

    public void setfName(String fName) {
        this.fname = fName;
    }

    public String getFullName() {
        return name.replaceAll(" ","") + " " + fname.replaceAll(" ","");
    }

    @Override
    public String toString() {
        return "Authors{" +
                "author_id=" + author_id +
                ", name='" + name + '\'' +
                ", fname='" + fname + '\'' +
                '}';
    }
}
