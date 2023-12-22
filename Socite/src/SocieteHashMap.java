import java.util.HashMap;
import java.util.Map;

public class SocieteHashMap implements InterfceSocite{

    private Map<Employe, Departements> employeDepartementMap = new HashMap<>();

    @Override
    public void ajouterEmployeDepartement(Employe e, Departements d) {
        employeDepartementMap.put(e, d);
    }

    @Override
    public void supprimerEmploye(Employe e) {
            employeDepartementMap.remove(e);
    }

    @Override
    public void afficherLesEmployesLeursDepartements() {
           for(Map.Entry<Employe,Departements> entry : employeDepartementMap.entrySet()){
               System.out.println(entry.getKey() + " travaille dans le département " + entry.getValue());
           }
    }

    @Override
    public void afficherLesEmployes() {
        for (Employe e : employeDepartementMap.keySet()) {
            System.out.println(e);
        }
    }

    @Override
    public void afficherLesDepartements() {
        for (Departements d : employeDepartementMap.values()) {
            System.out.println(d);
        }
    }

    @Override
    public void afficherDepartement(Employe e) {
        System.out.println("le deprtement de cet employee est  " + employeDepartementMap.get(e));

    }

    @Override
    public boolean rechercherEmploye(Employe e) {
        return employeDepartementMap.containsKey(e);
    }

    @Override
    public boolean rechercherDepartement(Departements e) {
        return employeDepartementMap.containsValue(e);
    }
}
