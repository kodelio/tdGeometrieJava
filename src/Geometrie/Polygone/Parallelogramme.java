/**
 * Laurent Toson & Raphael Haltz
 */

package Geometrie.Polygone;

import Geometrie.InterPoint;

/**
 * Classe Parallélogramme
 */
public class Parallelogramme extends Quadrilatere {

    /**
     * Constructeur
     * @param a
     * @param b
     * @param c
     * @param d
     * @param cT
     * @param cI
     */
    public Parallelogramme(InterPoint a, InterPoint b, InterPoint c, InterPoint d, String cT, String cI) {
        super(a, b, c, d, cT, cI);
    }

    /**
     * Méthode propriete
     * @return les propriétés d'un parallélogramme
     */
    public String propriete() {
        return "Un parallelogramme est quadrilatère particulier. Ses cotés sont paralleles deux à deux.";
    }

    /**
     * Méthode type
     * @return le type de quadrilatère
     */
    public String type() {
        return "Je suis un parallelogramme avec un trait de couleur " + getCouleurTrait() + " et l'intérieur de couleur " + getCouleurInterieur() + ".";
    }

    @Override
    public String toString() {
        return type() + " " + propriete() + " " + coordonnees();
    }
}
