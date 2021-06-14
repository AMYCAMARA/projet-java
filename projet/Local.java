public class Local {
    protected String ref;
    protected String localisation;
    protected int prix;
    protected int tauxLoc;
    private int FORMAT = 4;
    

    public Local(String ref,String localisation,int prix,int tauxLoc ) {
        this.ref = generatRef();
        this.localisation = localisation;
        this.prix = prix;
        this.tauxLoc = tauxLoc;
    }


  
    
    
    public Local() {
    }





    public double cout() {
        return this.prix + (this.tauxLoc * this.prix);
    }


    public static int nombreCompte;

    private String generatRef() {
        String firstPart = "REF";
        String nombreZero = "";
        String nombreCompteString = String.valueOf(++nombreCompte);
        while (nombreZero.length() + nombreCompteString.length() != FORMAT) {
            nombreZero += "0";
        }
        return firstPart + nombreZero + nombreCompteString;
    }
    
    

    public int getPrix() {
        return this.prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public String getLocalisation() {
        return this.localisation;
    }

    public void setLocalisation(String localisation) {
        this.localisation = localisation;
    }

   

    

    public String getRef() {
        return this.ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    @Override
    public String toString() {
        return "Local [FORMAT=" + FORMAT + ", localisation=" + localisation + ", prix=" + prix + ", reference="
                + ref + ", tauxloc=" + tauxLoc + "]";
    }
    
}
