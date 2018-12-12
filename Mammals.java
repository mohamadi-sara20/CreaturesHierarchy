package CreaturesHierarchy;

enum Hair{FUR, HAIR}

public abstract class Mammals extends Creatures {
    private Hair hair;

    public Mammals(Reproduction reproduction, Respiration respiration, Languge language, Hair hair){
        super(reproduction, respiration, language);
        this.hair = hair;
    }

    public void setHair(Hair hair) {
        this.hair = hair;
    }
    public Hair getHair(){return this.hair;}

    @Override
    public String toString(){
        return super.toString() + representation.append("    Hair:" + getHair()).toString();
    }

}

