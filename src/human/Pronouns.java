package human;

public enum Pronouns {
    ON_MINE(" свой"), HIM(" ему ");
    private final String pronoun;

    Pronouns(String name){
        this.pronoun = name;
    }


    @Override
    public String toString() {
        return this.pronoun;
    }
}


