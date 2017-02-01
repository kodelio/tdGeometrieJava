//Laurent Toson & Raphael Haltz

package Geometrie.Polygone;

import Geometrie.InterPoint;

public class Rectangle extends Quadrilatere {
    public Rectangle(InterPoint a, InterPoint b, InterPoint c, InterPoint d) {
        super(a, b, c, d);
    }

    public String propriete() {
        return "un rectangle est un quadrilatère dont les quatre angles sont droits.";
    }

    public String type() {
        return "Je suis un Rectangle.";
    }

    public double aire() {
        double j = cote(getA(), getB());
        double h = cote(getB(), getC());
        return j * h;
    }

    @Override
    public String toString() {
        return type() + " " + propriete() + " " + coordonees() + " Son aire est " + aire();
    }
}
