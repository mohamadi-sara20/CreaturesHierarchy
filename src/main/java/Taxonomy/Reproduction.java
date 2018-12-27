package Taxonomy;

public enum Reproduction {

    OVIOPAROUS(1),
    VIVIPAROUS(2);

    public final int n;

    Reproduction(int n){
        this.n = n;
    }

    public int getN(){return this.n;}



}

