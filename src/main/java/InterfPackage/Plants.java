package InterfPackage;

public class Plants {
    String lifeArc; //young, adult, old
    String climaticBelts; // Temperate, Tropical, Mediterranean, Mountains (Tundra)
    boolean naturalSpecies; //or  bred species

    public Plants(String lifeArc, String climaticBelts, boolean naturalSpecies){
        this.lifeArc=lifeArc;
        this.climaticBelts=climaticBelts;
        this.naturalSpecies=naturalSpecies;
    }

    public Plants() {

    }

    public String getLifeArc(){return lifeArc;}
    public String getClimaticBelts(){return climaticBelts;}
    public boolean getnaturalSpecies(){return true;}
}
