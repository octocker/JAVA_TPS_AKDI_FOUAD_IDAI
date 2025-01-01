import java.util.ArrayList;
import java.util.List;

//Creating the Figure class
class Figure {
    protected int Abcisse;
    protected int ordonnée;
    protected int Couleur; 


    private static List<Figure> instances = new ArrayList<>();


    public Figure(int x, int y, int Couleur) {
        this.Abcisse = x;
        this.ordonnée = y;
        this.Couleur = Couleur;
        instances.add(this); 
    }

    
    public static List<Figure> getInstances() {
        return instances;
    }

    
    public void display() {
        System.out.println("Figure: Position (" + Abcisse + ", " + ordonnée + "), Couleur: " + Couleur);
    }
}


class Carre extends Figure {
    private int sideLongueur; 

    public Carre(int x, int y, int Couleur, int sideLongueur) {
        super(x, y, Couleur); 
        this.sideLongueur = sideLongueur;
    }

    public void display() {
        System.out.println("Carre: Position (" + Abcisse + ", " + ordonnée + "), Couleur: " + Couleur + ", Side Longueur: " + sideLongueur);
    }


    public static List<Carre> getInstances() {
        List<Carre> CarreInstances = new ArrayList<>();
        for (Figure F : Figure.getInstances()) {
            if (F instanceof Carre) {
                CarreInstances.add((Carre) F);
            }
        }
        return CarreInstances;
    }
}


class Rectangle extends Figure {
    private int Longueur;  
    private int Largeur;   

    public Rectangle(int x, int y, int Couleur, int Longueur, int Largeur) {
        super(x, y, Couleur); 
        this.Longueur = Longueur;
        this.Largeur = Largeur;
    }

    public void display() {
        System.out.println("(" + Abcisse + ", " + ordonnée + "), Couleur: " + Couleur +
                           ", Longueur: " + Longueur + ", Largeur: " + Largeur);
    }

    
    public static List<Rectangle> getInstances() {
        List<Rectangle> RectangleInstances = new ArrayList<>();
        for (Figure F: Figure.getInstances()) {
            if (F instanceof Rectangle) {
                RectangleInstances.add((Rectangle) F);
            }
        }
        return RectangleInstances;
    }
}


public class Main {
    public static void main(String[] args) {
        Figure f1 = new Figure(3, 3, 255);
        Carre s1 = new Carre(4, 5, 128, 5);
        Rectangle r1 = new Rectangle(6, 6, 64, 9, 5);
        Carre s2 = new Carre(4, 4, 128, 6);
        Rectangle r2 = new Rectangle(8, 8, 64, 9, 7);

        
                  
        for (Figure F : Figure.getInstances()) {
            F.display();
        }

       
    
        for (Carre Ca : Carre.getInstances()) {
            Ca.display();
        }

        
  
        for (Rectangle Re : Rectangle.getInstances()) {
            Re.display();
        }
    }
}
