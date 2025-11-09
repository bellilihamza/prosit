public class App {
    public static void main(String[] args) throws Exception {
        SocieteArrayList societe = new SocieteArrayList();

        Employe e1 = new Employe(3, "BenAli", "Sami", "IT", 2);
        Employe e2 = new Employe(1, "Ayari", "Leila", "RH", 1);
        Employe e3 = new Employe(2, "Khlifi", "Mourad", "IT", 3);
       
        societe.ajouterEmploye(e1);
        societe.ajouterEmploye(e2);
        societe.ajouterEmploye(e3);
     
        societe.displayEmploye();

        System.out.println("\nRecherche par nom  : " + societe.rechercherEmploye("BenAli"));
        System.out.println("Recherche par objet e3 : " + societe.rechercherEmploye(e3));

        System.out.println("\nSuppression ");
        societe.supprimerEmploye(e3);
        societe.displayEmploye();

            societe.trierEmployeParId();
        societe.displayEmploye();

        societe.trierEmployeParNomDépartementEtGrade();
        societe.displayEmploye();

        for (Employe itEmp : societe.rechercherParDepartement("IT")) {
            System.out.println(itEmp);
        }
    }
}
