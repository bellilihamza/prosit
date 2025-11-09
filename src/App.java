public class App {
    public static void main(String[] args) throws Exception {
        SocieteArrayList societe = new SocieteArrayList();

        Employe e1 = new Employe(3, "BenAli", "Sami", "IT", 2);
        Employe e2 = new Employe(1, "Ayari", "Leila", "RH", 1);
        Employe e3 = new Employe(2, "Khlifi", "Mourad", "IT", 3);
        Employe e4 = new Employe(4, "Zouari", "Nour", "Compta", 2);
        Employe e5 = new Employe(5, "BenAli", "Alaa", "IT", 1);

        // Ajouter
        societe.ajouterEmploye(e1);
        societe.ajouterEmploye(e2);
        societe.ajouterEmploye(e3);
        societe.ajouterEmploye(e4);
        societe.ajouterEmploye(e5);

        System.out.println("== Tous les employés (ordre d'insertion) ==");
        societe.displayEmploye();

        // Recherches
        System.out.println("\nRecherche par nom 'BenAli' : " + societe.rechercherEmploye("BenAli"));
        System.out.println("Recherche par objet e3 : " + societe.rechercherEmploye(e3));

        // Suppression
        System.out.println("\nSuppression de e4 (Zouari)");
        societe.supprimerEmploye(e4);
        societe.displayEmploye();

        // Tri naturel par id
        System.out.println("\nTri naturel par id :");
        societe.trierEmployeParId();
        societe.displayEmploye();

        // Tri personnalisé par département, puis grade, puis nom
        System.out.println("\nTri personnalisé (département, grade, nom) :");
        societe.trierEmployeParNomDépartementEtGrade();
        societe.displayEmploye();

        // Recherche avancée par département
        System.out.println("\nRecherche avancée: employés du département 'IT' :");
        for (Employe itEmp : societe.rechercherParDepartement("IT")) {
            System.out.println(itEmp);
        }
    }
}
