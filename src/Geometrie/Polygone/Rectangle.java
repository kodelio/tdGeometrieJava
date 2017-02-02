/**
 * Laurent Toson & Raphael Haltz
 */

package Geometrie.Polygone;

import Geometrie.InterPoint;

/**
 * Classe Rectangle
 */
public class Rectangle extends Quadrilatere {

    /**
     * Constructeur
     * @param a
     * @param b
     * @param c
     * @param d
     * @param cT
     * @param cI
     */
    public Rectangle(InterPoint a, InterPoint b, InterPoint c, InterPoint d, String cT, String cI) {
        super(a, b, c, d, cT, cI);
    }

    /**
     * Méthode propriete
     * @return les propriétés d'un rectangle
     */
    public String propriete() {
        return "Un rectangle est un quadrilatère dont les quatre angles sont droits.";
    }

    /**
     * Méthode type
     * @return le type de quadrilatère
     */
    public String type() {
        return "Je suis un Rectangle avec un trait de couleur " + getCouleurTrait() + " et l'intérieur de couleur " + getCouleurInterieur() + ".";
    }

    /**
     * Méthode aire
     * @return l'aire d'un rectangle
     */
    public double aire() {
        double j = cote(getA(), getB());
        double h = cote(getB(), getC());
        return j * h;
    }

    @Override
    public String toString() {
        return type() + " " + propriete() + " " + coordonnees() + " Son aire est " + aire();
    }
}
