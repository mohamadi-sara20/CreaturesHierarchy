package CreaturesHierarchy;

enum Reproduction {OVIOPAROUS, VIVIPAROUS}
enum Languge{NA, LIMITED, UNLIMITED}
enum Respiration {LUNGS, INTEGUMENTARY, GILLS}


public abstract class Creatures {

    private Reproduction reproduction;
    private Respiration respiration;
    private Languge language;
    public Creatures(Reproduction reproduction, Respiration respiration, Languge language){
        this.respiration = respiration;
        this.reproduction = reproduction;
        this.language = language;
    }

    public void setReproduction(Reproduction reproduction){this.reproduction = reproduction;}
    public void setRespiration(Respiration respiration){this.respiration = respiration;}
    public void setLanguage(Languge language){this.language = language;}

    public Reproduction getReproduction(){return this.reproduction;}
    public Respiration getRespiration(){return  this.respiration;}
    public Languge getLanguage(){return this.language;}


    @Override
    public String toString(){
        return String.format("%10s: %10s    %10s: %10s    %10s: %10s    ", "Reproduction", this.getReproduction(), "Respiration", this.getRespiration(), "Language", this.getLanguage());

    }
}
