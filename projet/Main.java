import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {
        Service service = new Service();
        int choix;
        do {
            choix = menu();
            switch (choix) {
                case 1:
                    // AJOUTER UN LOCAL
                    System.out.println(" Ajout un local  : ");

                    // RECUPERATION DES DONNNEES AU CLAVIER :
                    String type;
                    int typeInt;
                    do {
                        System.out.println("Quel type local tu veux ajouter : " + "\n 1- Chambre " + "\n"
                                + "\n 2- Appartement" + "\n");
                        type = scanner.nextLine();
                        typeInt = Integer.parseInt(type);

                    } while (typeInt != 2 && typeInt != 1);
                    if (typeInt == 1) {
                        System.out.println("Entrer la localisation du local : ");
                        String localisation = scanner.nextLine();

                        System.out.println("Entrer le prix du local : ");
                        String prix = scanner.nextLine();

                        System.out.println("Entrer la taux location du local : ");
                        String tauxLoc = scanner.nextLine();

                        System.out.println("Entrer la dimension du local : ");
                        String dimension = scanner.nextLine();

                        Chambre chambre = new Chambre(localisation, type, Integer.parseInt(prix), Integer.parseInt(tauxLoc),
                                Integer.parseInt(dimension));

                        // ON AJOUTE CHAMBRE DANS LOCAL
                        service.ajouterLocal(chambre);

                    } else {
                        System.out.println("Entrer la localisation du local : ");
                        String localisation = scanner.nextLine();

                        System.out.println("Entrer le prix du local : ");
                        String prix = scanner.nextLine();

                        System.out.println("Entrer la taux location du local : ");
                        String tauxLoc = scanner.nextLine();

                        String nbrePiece;
                        do {
                            System.out.println("Veuillez saisir le nombre de piece ");
                            nbrePiece = scanner.nextLine();
                            System.out.println("Attention ! L'apartement doit avoir au moins 3 piéces : ");
                        }

                        while (Integer.parseInt(nbrePiece) < 3);

                        System.out.println("L'appartement de " + nbrePiece + " pieces a ete ajouter avec succes ");

                        Appartement appartement = new Appartement(localisation, Integer.parseInt(prix),
                                Integer.parseInt(tauxLoc), Integer.parseInt(nbrePiece), type);

                        // ON CREE APPARTEMENT DANS LOCAL
                        service.ajouterLocal(appartement);
                    }

                    break;
                case 2:
                    // LISTER LES LOCAUX PAR TYPE

                    System.out
                            .println("Lister les locaux par type chambre: ");
                    System.out.println("Saisir la reference de la chambre :");
                    // service.listerLocal();
                    String reference = scanner.nextLine();
                    Local local = new Local();
                    local.setRef(reference);
                    service.listerChambre(local);

                    System.out.println(
                            " Lister les locaux par type Appartement : ");
                    System.out.println("Saisir la reference de la chambre :");
                    // service.listerLocal();
                    String referencee = scanner.nextLine();
                    Local locale = new Local();
                    local.setRef(referencee);
                    service.listerAppartement(locale);
                    break;

                case 3:
                    System.out.println(" Lister les locaux reservé par un client  : ");
                    break;
                case 4:
                    System.out.println("Voir les détails d'un local : ");
                    break;
                case 5:
                    System.out.println(" Faire une reservation  : ");

                    System.out.print("Entrer le nci : ");
                    String nci = scanner.nextLine();

                    // SI LE CLIENT N'EXISTE PAS ON CREE UN COMPTE
                    Client client = service.rechercheClient(Integer.parseInt(nci));
                    if (client == null) {
                        System.out.print("Entrer le Nom Complet du client : ");
                        String nomComplet = scanner.nextLine();

                        System.out.print("Entrer le numero telephone : ");
                        String tel = scanner.nextLine();

                        System.out.print("Entrer votre adresse : ");
                        String adresse = scanner.nextLine();

                        System.out.print("Entrer votre email : ");
                        String email = scanner.nextLine();

                        // ON CREE UN CLIENT

                        client = new Client(Integer.parseInt(nci), nomComplet, Integer.parseInt(tel), adresse, email);

                        // ON AJOUTE LE CLIENT CREE

                        service.ajouterClient(client);
                    } else {
                    
                        int jour;
                        int mois;
                        int annee;
                        System.out.print("Entrer le jour de votre reservation ");
                        jour = scanner.nextInt();
                        System.out.print("Entrer le mois de votre reservation ");
                        mois = scanner.nextInt();
                        System.out.print("Entrer l'annee de votre reservation ");
                        annee = scanner.nextInt();

                        System.out.print(
                                "sasir la date du commande " + "jour:" + jour + "mois :" + mois + "annee :" + annee);

                        System.out.print("Entrer votre dure de sejour: ");

                        String dure = scanner.nextLine();
                        System.out.print("la dure du sejour est de: "+ dure +"jours");

                    }

                    // SI LE CLIENT EXISTE ON FAIT UNE RESERVATION

                    break;
                case 6:
                    System.out.println(" Annuler une reservation: ");
                case 7:
                    System.out.println(" Lister les locaux disponibles  : ");
                case 8:
                    System.out.println("Bye :() ");
                    break;
                default:
                    System.out.println("Mauvais choix :( )");
            }

        } while (choix != 8);

    }

    public static int menu() {
        int choix;
        System.out.println("Menu" + "\n 1-Ajouter un Local" + "\n 2-Lister Les locaux par Type"
                + "\n 3-Lister Les locaux reservés par un client" + "\n 4-Voir les détails d'un local"
                + "\n 5-Faire une reservation" + "\n 6-Annuler une reservation" + "\n 7-Lister les locaux disponibles"
                + "\n 8-Quitter");
        System.out.println("Faites votre choix : ");
        choix = Integer.parseInt(scanner.nextLine());
        return choix;
    }
}
