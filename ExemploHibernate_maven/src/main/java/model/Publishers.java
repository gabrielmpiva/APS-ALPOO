package model;

import javax.persistence.*;

@Entity
public class Publishers {

    @Id
    @Column(unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer publisher_Id;
    private String  name;
    private String  url;
    
    public static final String ORDER_BY_NAME = "name";
    
    public Publishers() {
    }
    
    public Publishers(Integer publisherId, String name, String url) {
		super();
		this.publisher_Id = publisherId;
		this.name = name;
		this.url = url;
	}

	public Integer getPublisherId() {
        return publisher_Id;
    }

    public void setPublisherId(Integer publisherId) {
        this.publisher_Id = publisherId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
