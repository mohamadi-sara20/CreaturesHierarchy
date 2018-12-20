package Taxonomy;

public abstract class Mammals extends Creatures {
    private Hair hair;

    public Mammals(String species, Reproduction reproduction, Respiration respiration, Language language, Hair hair){
        super(species, reproduction, respiration, language);
        this.hair = hair;
    }

    public void setHair(Hair hair) {
        this.hair = hair;
    }
    public Hair getHair(){return this.hair;}

    @Override
    public String toString(){
        final StringBuilder representation = new StringBuilder();
        return representation.append(super.toString()).append("    Hair:").append(getHair()).toString();
    }

    public boolean equals(Creatures creature) {

        if(!(creature instanceof Mammals))
            return false;

        if(creature == this)
            return  true;

        return (super.equals(creature) && this.getHair() == ((Mammals) creature).getHair());

    }


    @Override
    public int hashCode(){
        int result = super.hashCode();
        result += 31 * result + (getHair() == null ? 0 : getHair().hashCode());
        return result;
    }

    @Override
    public Mammals clone() throws CloneNotSupportedException{
        return (Mammals) super.clone();
    }


}


