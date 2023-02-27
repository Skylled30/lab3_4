import Item.*;
import human.*;

public class Main {
    public static void main(String[] args) {
        Malysh malysh = new Malysh("Малыш", Sex.MAN);
        Carlson carlson = new Carlson("Карлсон", Sex.MAN);
        Item houseOnRoof = new Item(" домик на крыше", Size.MIDDLE);
        Item table = new Item("стол.", Size.BIG);

        try {
            if (malysh.isNull()){
                throw new EmptyObjectException("Объект класса Malysh пустой");
            }
            if (carlson.isNull()){
                throw new EmptyObjectException("Объект класса Carlson пустой");
            }

            System.out.println(malysh.think() + ", что" + Time.NEVER + malysh.disagree() + " Но " + How.HARD + malysh.standHimGround());
            System.out.println(carlson.angry() + " и" + carlson.flyAway() + houseOnRoof + " и" + carlson.flewBack() + "когда " + malysh.beeped(Counted.TWICE));
            System.out.println('"' + malysh.phraseComeSoon() + '"' + ", потому что" + malysh.sit() + " за " + table);
        } catch (EmptyObjectException e) {
            System.out.println(e.getMessage());
        }

    }
}