package CreaturesHierarchy;

public class Mammals extends Creatures {
    public enum Hair{FUR, HAIR}
    private Hair hair;

    public Mammals(Reproduction reproduction, RESPIRATION respiration, LANGUAGE language, Hair hair){
        super(reproduction, respiration, language);
        this.hair = hair;
    }


    @Override
    public String toString(){
        return super.toString() + String.format("%s%s    ", "Hair Type: ", this.hair);
    }

}

