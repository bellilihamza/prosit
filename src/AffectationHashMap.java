import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class AffectationHashMap {
    private final HashMap<Employe, Departement> map = new HashMap<>();

    public void ajouterEmployeDepartement(Employe e, Departement d) {
        if (e == null || d == null) return;
        if (map.containsKey(e)) {
            Departement existing = map.get(e);
            if (existing.equals(d)) {
                System.out.println("Employe deja affecte au même departement : " + e);
            } else {
                System.out.println("Impossible : " + e + ", déjà dans : " + existing + ", tentative : " + d);
            }
            return;
        }
        map.put(e, d);
    }

    public void afficherEmployesEtDepartements() {
        if (map.isEmpty()) {
            System.out.println("Aucune affectation.");
            return;
        }
        for (Map.Entry<Employe, Departement> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    public void supprimerEmploye(Employe e) {
        if (e == null) return;
        map.remove(e);
    }

    public void supprimerEmployeEtDepartement(Employe e, Departement d) {
        if (e == null || d == null) return;
        if (map.containsKey(e) && map.get(e).equals(d)) {
            map.remove(e);
        }
    }

    public void afficherEmployes() {
        if (map.isEmpty()) {
            System.out.println("Aucun employé.");
            return;
        }
        for (Employe e : map.keySet()) {
            System.out.println(e);
        }
    }

    public void afficherDepartements() {
        if (map.isEmpty()) {
            System.out.println("Aucun departement.");
            return;
        }
        Set<Departement> deps = new HashSet<>(map.values());
        for (Departement d : deps) {
            System.out.println(d);
        }
    }

    public boolean rechercherEmploye(Employe e) {
        if (e == null) return false;
        return map.containsKey(e);
    }

    public boolean rechercherDepartement(Departement d) {
        if (d == null) return false;
        return map.containsValue(d);
    }

    public TreeMap<Employe, Departement> trierMap() {
        TreeMap<Employe, Departement> sorted = new TreeMap<>();
        sorted.putAll(map);
        return sorted;
    }
}
