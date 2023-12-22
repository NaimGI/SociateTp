import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

class SocieteTreeMap implements InterfceSocite {
    private TreeMap<Employe, Departements> employeDepartementTreeMap = new TreeMap<>(new Comparator<Employe>() {
        @Override
        public int compare(Employe e1, Employe e2) {
            return e1.getCin().compareTo(e2.getCin());
        }
    });



    @Override
    public void ajouterEmployeDepartement(Employe e, Departements d) {
        employeDepartementTreeMap.put(e, d);
    }

    @Override
    public void supprimerEmploye(Employe e) {
        employeDepartementTreeMap.remove(e);
    }

    @Override
    public void afficherLesEmployesLeursDepartements() {
        for (Map.Entry<Employe, Departements> entry : employeDepartementTreeMap.entrySet()) {
            System.out.println(entry.getKey() + " travaille dans le département " + entry.getValue());
        }
    }

    @Override
    public void afficherLesEmployes() {
        for (Employe e : employeDepartementTreeMap.keySet()) {
            System.out.println(e);
        }
    }

    @Override
    public void afficherLesDepartements() {
        for (Departements d : employeDepartementTreeMap.values()) {
            System.out.println(d);
        }
    }

    @Override
    public void afficherDepartement(Employe e) {
        Departements d = employeDepartementTreeMap.get(e);
        if (d != null) {
            System.out.println(e + " travaille dans le département " + d);
        } else {
            System.out.println(e + " ne travaille dans aucun département.");
        }
    }

    @Override
    public boolean rechercherEmploye(Employe e) {
        return employeDepartementTreeMap.containsKey(e);
    }



    @Override
    public boolean rechercherDepartement(Departements d) {
        return employeDepartementTreeMap.containsValue(d);
    }
}
