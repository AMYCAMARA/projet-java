public class Appartement extends Local {
   
    private int nbrePiece;

    public Appartement(String ref, int prix, int tauxLoc, int nbrePiece, String localisation) {
        super(ref, localisation, prix, tauxLoc);
        this.nbrePiece = nbrePiece;
    
    }


    public int getNbrePiece() {
        return nbrePiece;
    }

    public void setNbrePiece(int nbrePiece) {
        this.nbrePiece = nbrePiece;
    } 
    private Local localAppartement;

    public Local getLocal() {
        return this.localAppartement;
    }

    public void setLocal(Local locale) {
        this.localAppartement = locale;
    }

    @Override
    public String toString() {
        String result = " reference = " + ref + " localisation = " + localisation + ", prix = " + prix
                + ", tauxloc = " + tauxLoc + ", nombre de piece = " + nbrePiece;
        return result;
    }
}
