package human;

public enum Time {
    NEVER(" никогда"), THEN(" только тогда, "), WAS_TIME(" пора было");
    private final String time;

    Time(String name){
        this.time = name;
    }
    @Override
    public String toString(){
        return this.time;
    }
}


