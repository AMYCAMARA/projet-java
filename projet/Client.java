public class Client {
    private String nci;
    private String nomComplet;
    private int tel;
    private String adresse;
    private String email;

    public String getNci() {
        return this.nci;
    }

    public void setNci(String nci) {
        this.nci = nci;
    }

    public String getNomComplet() {
        return this.nomComplet;
    }

    public void setNomComplet(String nomComplet) {
        this.nomComplet = nomComplet;
    }

    public int getTel() {
        return this.tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public String getAdresse() {
        return this.adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public Client() {
    }
    
    public Client(String nci) {
        this.nci = nci;
    }

    public Client(String nci, String nomComplet) {
        this.nci = nci;
        this.nomComplet = nomComplet;
    }

    public Client(String nci, String nomComplet, int tel) {
        this.nci = nci;
        this.nomComplet = nomComplet;
        this.tel = tel;
    }

    public Client(String nci, String nomComplet, int tel, String adresse) {
        this.nci = nci;
        this.nomComplet = nomComplet;
        this.tel = tel;
        this.adresse = adresse;
    }

    public Client(String nci, String nomComplet, int tel, String adresse, String email) {
        this.nci = nci;
        this.nomComplet = nomComplet;
        this.tel = tel;
        this.adresse = adresse;
        this.email = email;
    }

    public String toString() {
        return "Client [adresse=" + adresse + ", email=" + email + ", nci=" + nci + ", nomComplet=" + nomComplet
                + ", tel=" + tel + "]";
    }



}
