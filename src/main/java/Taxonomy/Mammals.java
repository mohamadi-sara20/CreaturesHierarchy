package Taxonomy;

public abstract class Mammals extends Creatures {
    private Hair hair;

    public Mammals(String species, Reproduction reproduction, Respiration respiration, Language language, Hair hair){
        super(species, reproduction, respiration, language);
        this.hair = hair;
    }


    public Mammals(Mammals mammal){
        super(mammal);
        this.hair = mammal.getHair();
    }

    public void setHair(Hair hair) {
        this.hair = hair;
    }
    public Hair getHair(){return this.hair;}

    @Override
    public String toString(){
        final StringBuilder representation = new StringBuilder();
        return representation.append(super.toString()).append("    Hair: ").append(getHair()).toString();
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
    public Mammals clone() {
            return (Mammals) super.clone();
    }

    public int compareTo(Mammals mammal){
        int c = super.compareTo(mammal);
        if(c != 0)
            return c;
        else{
            if(this.getHair().compareTo(mammal.getHair()) > 0)     //not equal in hair
                return 1;
            if(this.getHair().compareTo(mammal.getHair()) < 0)     //not equal in hair
                return -1;
            return 0;                                               //hair also equal, so return 0.
        }
    }


    @Override
    public Mammals shallowCopy(){
        return (Mammals) super.shallowCopy();
    }

    @Override
    public void shallowCopyFrom(Creatures creature){
        super.shallowCopyFrom(creature);
        this.hair = ((Mammals)creature).getHair();
    }

    @Override
    public Mammals deepCopy(){
        return (Mammals)super.deepCopy();
    }

    @Override
    public void deepCopyFrom(Creatures creature){
        super.deepCopyFrom(creature);
        this.hair = ((Mammals)creature).getHair();
    }

}


