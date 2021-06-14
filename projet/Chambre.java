
public class Chambre extends Local {

    private int dimension;

    

    public Chambre() {

    }

    public Chambre(int dimension) {
        this.dimension = dimension;
    }

    public Chambre(int typeLocal, String localisation, int prix, double tauxloc, int dimension) {
        super(typeLocal, localisation, prix, tauxloc);
        this.dimension = dimension;
    }

    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }

    @Override
    public String toString() {
        String result = "Reference = " + reference + ", Type local = " + typeLocal + ", Localisation = " + localisation
                + ", Prix = " + prix + ", Taux local = " + tauxloc + ", Dimension = " + dimension;

        return result;
    }

    // Propri�t� navigationnelle
    private Local localChambre;

    public Local getLocal() {
        return this.localChambre;
    }

    public void setLocal(Local local) {
        this.localChambre = local;
    }

}
