public class Chocolates {
    int id;
    String name;

    public Chocolates(int id,String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return("Name : " + name + " : " + "id : " + id);
    }
}
