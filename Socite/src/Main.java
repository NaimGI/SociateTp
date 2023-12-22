// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        InterfceSocite societeHashMap = new SocieteHashMap();
        InterfceSocite societeTreeMap = new SocieteTreeMap();

        Employe e1 = new Employe("123", "M001", "Doe", "John");
        Employe e2 = new Employe("456", "M002", "Smith", "Jane");
        Departements d1 = new Departements(1, "IT");
        Departements d2 = new Departements(2, "HR");

        societeHashMap.ajouterEmployeDepartement(e1, d1);
        societeHashMap.ajouterEmployeDepartement(e2, d2);

        societeTreeMap.ajouterEmployeDepartement(e1, d1);
        societeTreeMap.ajouterEmployeDepartement(e2, d2);

        societeHashMap.afficherLesEmployesLeursDepartements();
        System.out.println("------------");
        societeTreeMap.afficherLesEmployesLeursDepartements();
        }
    }
