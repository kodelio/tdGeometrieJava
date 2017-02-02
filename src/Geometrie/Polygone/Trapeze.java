/**
 * Laurent Toson & Raphael Haltz
 */

package Geometrie.Polygone;

import Geometrie.InterPoint;

/**
 * Classe Trapèze
 */
public class Trapeze extends Quadrilatere {

    /**
     * Constructeur
     * @param a
     * @param b
     * @param c
     * @param d
     * @param cT
     * @param cI
     */
    public Trapeze(InterPoint a, InterPoint b, InterPoint c, InterPoint d, String cT, String cI) {
        super(a, b, c, d, cT, cI);
    }

    /**
     * Méthode propriete
     * @return les propriétés d'un trapèze
     */
    public String propriete() {
        return "Un trapèze est un quadrilatère, possédant deux côtés opposés parallèles. Ces deux côtés parallèles sont appelés bases.";
    }

    /**
     * Méthode type
     * @return le type de quadrilatère
     */
    public String type() {
        return "Je suis un trapèze avec un trait de couleur " + getCouleurTrait() + " et l'intérieur de couleur " + getCouleurInterieur() + ".";
    }


    @Override
    public String toString() {
        return type() + " " + propriete() + " " + coordonnees();
    }

}