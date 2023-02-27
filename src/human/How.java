package human;

public enum How {
    HARD(" упорно"), SOON(" скорее");
    private final String how;

    How(String name){
        this.how = name;
    }
    @Override
    public String toString(){
        return this.how;
    }
}
