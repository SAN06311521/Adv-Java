public class Furniture {
    int id = 1;
    String name;
    String desc;

    void setName(String n){
        name = n;
    }
    void setDesc(String d){
        desc = d;
    }

    void setId(int no){
        id = no;
    }

    String getName(){
        return name;
    }

    String getDesc(){
        return desc;
    }

    int getId(){
        return id;
    }
}
