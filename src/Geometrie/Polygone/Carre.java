/**
 * Laurent Toson & Raphael Haltz
 */

package Geometrie.Polygone;

import Geometrie.InterPoint;

/**
 * Classe Carré
 */
public class Carre extends Quadrilatere {

    /**
     * Constructeur
     * @param a
     * @param b
     * @param c
     * @param d
     * @param cT
     * @param cI
     */
    public Carre(InterPoint a, InterPoint b, InterPoint c, InterPoint d, String cT, String cI) {
        super(a, b, c, d, cT, cI);
    }

    /**
     * Méthode propriete
     * @return les propriétés d'un carré
     */
    public String propriete() {
        return "Un carré est quadrilatère particulier à la fois rectangle et losange. Ses cotés sont parallèles deux à deux, de longueur égales et orthogonaux. Ses diagoinales sont orthogonales.";
    }

    /**
     * Méthode type
     * @return le type de quadrilatère
     */
    public String type() {
        return "Je suis un carré de " + cote(getA(), getB()) + "cm de coté avec un trait de couleur " + getCouleurTrait() + " et l'intérieur de couleur " + getCouleurInterieur() + ".";
    }

    /**
     * Méthode aire
     * @return l'aire du carré
     */
    private double aire() {
        double distAB = cote(getA(), getB());
        return Math.pow(distAB, 2);
    }

    @Override
    public String toString() {
        return type() + " " + propriete() + " " + coordonnees() + " Son aire est " + aire();
    }
}
