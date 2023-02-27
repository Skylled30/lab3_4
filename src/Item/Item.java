package Item;

public class Item {
    String name;

    Size size;

    public Item(String name, Size size){
        this.name = name;
        this.size = size;
    }
    @Override
    public String toString(){
        return name;
    }
    @Override
    public int hashCode(){
        return this.name.hashCode() + this.size.hashCode();
    }
}
