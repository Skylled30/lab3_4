package human;

public abstract class Human {
    String name;
    Sex sex;

    Human(String name, Sex sex){
        this.name = name;
        this.sex = sex;
    }

    public Human() {
    }

    public boolean isNull(){
        if (name == null && sex == null){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                '}';
    }
}
