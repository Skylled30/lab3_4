package human;

import Item.Counted;

public class Malysh extends Human implements Sitting{
    public Malysh(String name, Sex sex){
        super(name, sex);
    }

    public Malysh() {
    }

    @Override
    public String sit(){
        return Time.WAS_TIME + " садиться";
    }

    public String think(){
        return name + " считал";
    }
    public String disagree() {
        return " не согласится.";
    }
    public String standHimGround() {
        return name + " стоял на своём";
    }
    public String beeped(Counted count){
        return name + count + "" + Pronouns.HIM +  "просигналил";
    }
    public String phraseComeSoon(){
        return "прилетай" + How.SOON + "!";
    }
    @Override
    public int hashCode(){
        return this.name.hashCode() + this.sex.hashCode();
    }
}

