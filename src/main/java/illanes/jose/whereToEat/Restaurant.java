package illanes.jose.whereToEat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Restaurant {

    @Id
    @GeneratedValue
    private int id;

    private String name;

    public Restaurant(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Restaurant(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
