import java.time.Year;

public class Employe {
    private String Matricule;
    private String Nom;
    private String Prenom;
    private int AnneeNaissance;
    private int AnneeEmbauche;
    private float Salaire;


    public Employe(String Matricule, String Nom, String Prenom, int AnneeNaissance, int AnneeEmbauche, float Salaire) {
        this.Matricule = Matricule;
        this.Nom = Nom;
        this.Prenom = Prenom;
        this.AnneeNaissance = AnneeNaissance;
        this.AnneeEmbauche = AnneeEmbauche;
        this.Salaire = Salaire;
    }

    
    public String getMatricule() {
        return Matricule;
    }

    public void setMatricule(String Matricule) {
        //
        this.Matricule = Matricule;
    }

    public int getAnciennete() {
        return Year.now().getValue() - AnneeEmbauche;
    }

    public int getAge() {
        return Year.now().getValue() - AnneeNaissance;
    }


    public void displayEmploye() {
        System.out.println( Matricule);
        System.out.println(Nom);
        System.out.println(Prenom);
        System.out.println( getAnciennete() + " ans");
        System.out.println( getAge() + " ans");
        System.out.println(Salaire + " $");
    }
}


public class TestEmploye {
    public static void main(String[] args) {
        Employe employe = new Employe("B200", "Akdi", "Fouad", 1700, 1700, 200000000);

        employe.displayEmploye();
    }
}