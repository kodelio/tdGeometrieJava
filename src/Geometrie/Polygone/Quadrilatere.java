/**
 * Laurent Toson & Raphael Haltz
 */

package Geometrie.Polygone;

import Geometrie.*;

/**
 * Classe Quadrilatère
 */
public class Quadrilatere {
    private InterPoint a, b, c, d;
    private String couleurTrait, couleurInterieur;

    /**
     * Constructeur
     * @param a
     * @param b
     * @param c
     * @param d
     * @param couleurTrait
     * @param couleurInterieur
     */
    public Quadrilatere(InterPoint a, InterPoint b, InterPoint c, InterPoint d, String couleurTrait, String couleurInterieur) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.couleurTrait = couleurTrait;
        this.couleurInterieur = couleurInterieur;
    }

    /**
     * Constructeur par défaut
     */
    public Quadrilatere() {
        new FabriquePoint();
        a = FabriquePoint.create("Point");
        new FabriquePoint();
        b = FabriquePoint.create("Point2");
        new FabriquePoint();
        c = FabriquePoint.create("Point");
        new FabriquePoint();
        d = FabriquePoint.create("Point");
        setCouleurInterieur("rouge");
        setCouleurTrait("noir");
    }

    /**
     * Get et set des points et des couleurs
     */

    public InterPoint getA() {
        return a;
    }

    public void setA(InterPoint a) {
        this.a = a;
    }

    public InterPoint getB() {
        return b;
    }

    public void setB(InterPoint b) {
        this.b = b;
    }

    public InterPoint getC() {
        return c;
    }

    public void setC(InterPoint c) {
        this.c = c;
    }

    public InterPoint getD() {
        return d;
    }

    public void setD(InterPoint d) {
        this.d = d;
    }

    public String getCouleurTrait() {
        return couleurTrait;
    }

    public void setCouleurTrait(String couleurTrait) {
        this.couleurTrait = couleurTrait;
    }

    public String getCouleurInterieur() {
        return couleurInterieur;
    }

    public void setCouleurInterieur(String couleurInterieur) {
        this.couleurInterieur = couleurInterieur;
    }

    /**
     * Méthode cote
     * @param A
     * @param B
     * @return la longueur entre deux points
     */
    protected double cote(InterPoint A, InterPoint B) {
        return Math.sqrt(Math.pow(B.getX() - A.getX(), 2) + Math.pow(B.getY() - A.getY(), 2));
    }

    /**
     * Méthode perimetre
     * @return le périmètre d'un quadrilatère
     */
    public double perimetre() {
        double p = 0;
        double distAB;
        double distBC, distCD, distAD;
        distAB = cote(a, b);
        distBC = cote(b, c);
        distCD = cote(c, d);
        distAD = cote(a, d);
        p = distBC + distCD + distAD + distAB;
        return p;
    }

    /**
     * Méthode coordonnees
     * @return les coordonnées d'un quadrilatère
     */
    public String coordonnees() {
        return "Mes sommets ont pour coordonnées " + a.toString() + ", " + b.toString() + ", " + c.toString() + ", " + d.toString() + ". Son périmètre est " + perimetre() + ".";
    }

    /**
     * Méthode type
     * @return le type de quadrilatère
     */
    public String type() {
        return "Je suis un Quadrilatère quelconque avec un trait de couleur " + getCouleurTrait() + " et l'intérieur de couleur " + getCouleurInterieur() + ".";
    }

    @Override
    public String toString() {
        return type() + " " + coordonnees();
    }
}