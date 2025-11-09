import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SocieteArrayList implements IGestion<Employe>, IRechercheAvancee<Employe> {

    private final ArrayList<Employe> employes = new ArrayList<>();

    @Override
    public void ajouterEmploye(Employe t) {
        if (t != null) {
            employes.add(t);
        }
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        if (nom == null) return false;
        for (Employe e : employes) {
            if (nom.equalsIgnoreCase(e.getNom())) return true;
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe t) {
        if (t == null) return false;
        return employes.contains(t);
    }

    @Override
    public void supprimerEmploye(Employe t) {
        if (t == null) return;

        employes.remove(t);
    }

    @Override
    public void displayEmploye() {
        if (employes.isEmpty()) {
            System.out.println("aucun employe.");
            return;
        }
        for (Employe e : employes) {
            System.out.println(e);
        }
    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(employes); 
    }

    @Override
public void trierEmployeParNomDépartementEtGrade() {
    Collections.sort(employes, new Comparator<Employe>() {
        @Override
        public int compare(Employe e1, Employe e2) {
            int cmpDepartement = e1.getNomDepartement().compareToIgnoreCase(e2.getNomDepartement());
            if (cmpDepartement != 0) return cmpDepartement;

            int cmpGrade = Integer.compare(e1.getGrade(), e2.getGrade());
            if (cmpGrade != 0) return cmpGrade;

            return e1.getNom().compareToIgnoreCase(e2.getNom());
        }
    });
}


  @Override
public List<Employe> rechercherParDepartement(String nomDepartement) {
    List<Employe> resultat = new ArrayList<>();
    if (nomDepartement == null) {
        return resultat;
    }
    for (Employe e : employes) {
        if (e.getNomDepartement().equalsIgnoreCase(nomDepartement)) {
            resultat.add(e);
        }
    }
    return resultat;
}


    public List<Employe> getEmployes() {
        return new ArrayList<>(employes);
    }
}
