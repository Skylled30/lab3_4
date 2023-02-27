package human;

import Item.Item;

public class Carlson extends Human implements Flyable,Sitting{
    public Carlson(String name, Sex sex){
        super(name, sex);
    }

    public Carlson() {
    }

    @Override
    public String toString(){
        return super.name;
    }
    @Override
    public String flewBack(){
        return " прилетел назад" + Time.THEN;
    }
    @Override
    public String flyAway(){
        return " улетел" + " в" + Pronouns.ON_MINE;
    }
    @Override
    public String sit(){
        return " садиться";
    }
    public String angry(){
        return name + " разозлился";
    }
    @Override
    public int hashCode(){
        return this.name.hashCode() + this.sex.hashCode();
    }
}
