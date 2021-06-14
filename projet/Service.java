
public class Service {
    private final int TAILLE = 10;
    private int nombreClientReelle;
    private int tailleReelle;
    private int nbChambre=0;
     private Chambre[] tableChambre;
     private int nbAppartement=0;
    private Appartement[] tableAppartement;

    

    int nombreClient = 0;
    Client[]  tableClient= new Client[TAILLE];

    public void  ajouterClient(Client client)
    {
        if(nombreClient < TAILLE)
        {
            tableClient[nombreClientReelle] = client; 
            nombreClientReelle++;
        }else
        {
            System.out.println("le tableau de client est plein :");
        }
        
    }

    public Client rechercheClient(int nci)
        {
        for (Client client : tableClient) 
            {
            if (client != null)
            {
                if (client.getNci() == nci) 
                {
                    return client;
                }
            }
            }
        return null;
        }
    private Local tableLocal[]=new Local [TAILLE];
    public void ajouterLocal(Local local )
    {
        if(tailleReelle < TAILLE)
        {
            tableLocal[tailleReelle] = local;
            tailleReelle ++;
        }
        else 
        {
            System.out.println("Le tableau est plein");
        }
    
    }

    public void listerLocal()
    {
        for (Local piece : tableLocal) 
        {
            if (piece != null)
            {
                System.out.println(piece.toString());
                System.out.println("");
            }
    
        }
    }
        
    public void ajouterChambre(Chambre  chambre)
    {
            tableChambre[nbChambre] = chambre;
            nbChambre++;
    }


    public void listerChambre(Local local) {
        for (int i = 0; i < nbChambre; i++) {
            if (tableChambre[i] instanceof Chambre) {
                if (((Chambre) tableChambre[i]).getLocal().getRef() == local.getRef()) {
                    System.out.println(tableChambre[i].toString());
                }
            }

        }

    }  

    public void ajouterAppartement(Appartement appartement) {
        tableAppartement[nbAppartement] = appartement;
        nbAppartement++;

    }

    public void listerAppartement(Local locale) 
    {
        for (int i = 0; i < nbAppartement; i++)
        {
            if (tableAppartement[i] instanceof Appartement)
            {
                if (((Appartement) tableAppartement[i]).getLocal().getRef() == locale.getRef()) 
                {
                    System.out.println(tableChambre[i].toString());
                }
            }

        }

    }


    
        
   
    public void reservation(){

    }
    public void annulerResrvation(){

    }
    public void locauxDisponible(){
        
    }
 
    
    
}
    
