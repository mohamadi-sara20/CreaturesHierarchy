package CreaturesHierarchy;

public class Creatures {
    public enum Reproduction {OVIOPAROUS, VIVIPAROUS}
    public enum LANGUAGE{NA, LIMITED, UNLIMITED};
    public enum RESPIRATION {LUNGS, INTEGUMENTARY, GILLS}

    private Reproduction reproduction;
    private RESPIRATION respiration;
    private LANGUAGE language;
    public Creatures(Reproduction reproduction, RESPIRATION respiration, LANGUAGE language){
        this.respiration = respiration;
        this.reproduction = reproduction;
        this.language = language;
    }

    @Override
    public String toString(){
        return String.format("%s: %s    %s: %s    %s: %s    ", "Reproduction", this.reproduction, "Respiration", this.respiration, "Language", this.language);

    }
}
