//Laurent Toson & Raphael Haltz

package Geometrie.Polygone;

import Geometrie.InterPoint;

public class Losange extends Parallelogramme {
    public Losange(InterPoint a, InterPoint b, InterPoint c, InterPoint d) {
        super(a, b, c, d);
    }

    public String propriete() {
        return "Un losange est un parallélogramme ayant deux côtés consécutifs de même longueur.";
    }

    public String type() {
        return "Je suis un Losange.";
    }

    public double aire() {
        double j = cote(getA(), getC());
        double h = cote(getB(), getD());
        return (j * h) / 2;
    }

    @Override
    public String toString() {
        return type() + " " + propriete() + " " + coordonees() + " Son aire est " + aire();
    }
}