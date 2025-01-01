public class Livre {
    private String Titre;
    private String Auteur;
    private float Prix;


    public Livre() {
    }

   
    public Livre(String Titre, String Auteur, float Prix) {
        this.Titre= Titre;
        this.Auteur = Auteur;
        this.Prix = Prix;
    }

    public String getTitre() {
        return Titre;
    }

    public void setTitre(String Titre) {
        this.Titre = Titre;
    }

    public String getAuteur() {
        return Auteur;
    }

    public void setAuteur(String Auteur) {
        this.Auteur = Auteur;
    }

    public float getPrix() {
        return Prix;
    }

    public void setPrix(float Prix) {
        this.Prix = Prix;
    }


    public void Afficher() {
        System.out.println("Titre : " + Titre);
        System.out.println("Auteur : " + Auteur);
        System.out.println("Prix : " + Prix + " $");
    }
}


public class TestLivre {
    public static void main(String[] args) {
        Livre livre = new Livre("Harry Potter", "Unknown", 40.00);
        livre.Afficher();
    }
}