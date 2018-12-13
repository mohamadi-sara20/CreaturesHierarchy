package Taxonomy;

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
        final StringBuilder representation = new StringBuilder();
        return super.toString() + representation.append("    Hair:" + getHair()).toString();
    }

    @Override
    public boolean equals(Object object) {
        if (object == this && object instanceof Mammals)
            return (super.equals(object) && this.getHair() == ((Mammals) object).getHair());
        return false;
    }


    @Override
    public int hashCode(){
        int result = 17;
        result += 31 * result + (getHair() == null ? 0 : getHair().hashCode());
        return result;

    }



}


