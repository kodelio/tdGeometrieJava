package Geometrie;

/**
 * Created by laurent on 20/01/17.
 */

public class Point {
    private double abscisse;
    private double ordonnee;

    /**
     * Constructeur par défaut
     */

    public Point () {
        abscisse = 0.;
        ordonnee = 0.;
    }

    /**
     * Constructeur normal
     **/

    public Point (double uneAbs, double uneOrd) {
        abscisse = uneAbs;
        ordonnee = uneOrd;
    }

    /**
     * Accesseurs de consultation
     * @return Retourne la coordonnee correspondante
     **/

    public double getAbscisse() {return abscisse;}
    public double getOrdonnee() {return ordonnee;}

    /**
     * Methode standard toString
     * @return Retourne une forme externe de l'objet support
     **/

    @Override
    public String toString() {
        return "(" + abscisse + ", " + ordonnee + ")";
    }
}
