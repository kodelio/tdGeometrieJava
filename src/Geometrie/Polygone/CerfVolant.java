/**
 * Laurent Toson & Raphael Haltz
 */

package Geometrie.Polygone;

import Geometrie.InterPoint;

/**
 * Classe CerfVolant
 */
public class CerfVolant extends Quadrilatere {

    /**
     * Constructeur
     * @param a
     * @param b
     * @param c
     * @param d
     * @param cT
     * @param cI
     */
    public CerfVolant(InterPoint a, InterPoint b, InterPoint c, InterPoint d, String cT, String cI) {
        super(a, b, c, d, cT, cI);
    }

    /**
     * Méthode propriete
     * @return les propriétés d'un cerf-volant
     */
    public String propriete() {
        return "Un cerf-volant est un quadrilatère dont une des diagonales est un axe de symétrie. Les diagonales peuvent se couper à l'intérieur ou à l'extérieur. Ceci contraste avec un parallélogramme, où les côtés égaux sont opposés.";
    }

    /**
     * Méthode type
     * @return le type de quadrilatère
     */
    public String type() {
        return "Je suis un cerf-volant avec un trait de couleur " + getCouleurTrait() + " et l'intérieur de couleur " + getCouleurInterieur() + ".";
    }

    @Override
    public String toString() {
        return type() + " " + propriete() + " " + coordonnees();
    }
}