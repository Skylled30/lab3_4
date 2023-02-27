package Item;

public enum Counted {
    TWICE(" дважды");

    private final String count;

    Counted(String name){
        this.count = name;
    }
    @Override
    public String toString(){
        return this.count;
    }
}


