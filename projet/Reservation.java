import java.sql.Date;

public class Reservation {
    private Date date;
    private Date dure;
    private String etat;
    private int id;
    public static int idR;

    public Reservation() {
    }
    public Reservation(String etat) {
        setEtat(etat);
        id=++idR;
    }

    public Reservation(Date date, Date dure, String etat, int id) {
        this.date = date;
        this.dure = dure;
        this.etat = etat;
        this.id = id;
    }

    public Reservation(Date date, Date dure, String etat) {
        this.date = date;
        this.dure = dure;
        this.etat = etat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        }
    }


    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    

    public Date getDure() {
        return dure;
    }

    public void setDure(Date dure) {
        this.dure = dure;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Reservation [date=" + date + ", duree=" + dure + ", etat=" + etat + ", id=" + id + "]";
    }
    
}
