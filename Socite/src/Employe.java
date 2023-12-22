import java.util.Objects;

public class Employe {
    private String cin;
    private  String Matricule;
    private String nom;

    private String prenom;

    public Employe(String cin,String Matricule,String nom,String prenom) {
        this.cin = cin;
    }

    public Employe(){

    }

    public String getMatricule() {
        return Matricule;
    }

    public void setMatricule(String matricule) {
        Matricule = matricule;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }
    @Override
    public boolean equals(Object obj){
        if(obj==this) return true;
        if(obj == null) return false;
        if(obj.getClass()!=this.getClass()) return false;
        Employe ob=(Employe) obj;
        return Objects.equals(ob.nom, this.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cin, Matricule, nom, prenom);
    }
}
