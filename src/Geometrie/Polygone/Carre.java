package Geometrie.Polygone;

import Geometrie.InterPoint;

public class Carre extends Quadrilatere {

    public Carre(InterPoint a, InterPoint b, InterPoint c, InterPoint d) {
        super(a, b, c, d);
    }

    public String propriete() {
        return "Un carré est quadrilatère particulier à la fois rectangle et losange. Ses cotés sont parallèles deux à deux, de longueur égales et orthogonaux. Ses diagoinales sont orthogonales.";
    }

    public String type() {
        return "Je suis un carré de " + cote(getA(), getB()) + "cm de coté.";
    }


    private double aire() {
        double distAB = cote(getA(), getB());
        return Math.pow(distAB, 2);
    }

    @Override
    public String toString() {
        return type() + " " + propriete() + " " + coordonees() + " Son aire est " + aire();
    }
}
