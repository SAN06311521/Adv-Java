import java.util.*;

public class Toys {
    String name;
    int id;
    List<String> color = new ArrayList<>();

    public Toys() {

    }
    
    public Toys(String name, int id, List<String> color) {
        this.name = name;
        this.id = id;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<String> getColor() {
        return color;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(List<String> color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return("Id - " + id + " : " + "Name - " + name + " : " + "color - " + color );
    }
}
