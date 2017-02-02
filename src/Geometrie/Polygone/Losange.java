/**
 * Laurent Toson & Raphael Haltz
 */

package Geometrie.Polygone;

import Geometrie.InterPoint;

/**
 * Classe Losange
 */
public class Losange extends Parallelogramme {
    /**
     * Constructeur
     * @param a
     * @param b
     * @param c
     * @param d
     * @param cT
     * @param cI
     */
    public Losange(InterPoint a, InterPoint b, InterPoint c, InterPoint d, String cT, String cI) {
        super(a, b, c, d, cT, cI);
    }

    /**
     * Méthode propriete
     * @return les propriétés d'un losange
     */
    public String propriete() {
        return "Un losange est un parallélogramme ayant deux côtés consécutifs de même longueur.";
    }

    /**
     * Méthode type
     * @return le type de quadrilatère
     */
    public String type() {
        return "Je suis un Losange avec un trait de couleur " + getCouleurTrait() + " et l'intérieur de couleur " + getCouleurInterieur() + ".";
    }

    /**
     * Méthode aire
     * @return l'air d'un losange
     */
    public double aire() {
        double j = cote(getA(), getC());
        double h = cote(getB(), getD());
        return (j * h) / 2;
    }

    @Override
    public String toString() {
        return type() + " " + propriete() + " " + coordonnees() + " Son aire est " + aire();
    }
}