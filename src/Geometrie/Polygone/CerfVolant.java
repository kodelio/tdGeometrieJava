//Laurent Toson & Raphael Haltz

package Geometrie.Polygone;

import Geometrie.InterPoint;

public class CerfVolant extends Quadrilatere {
    public CerfVolant(InterPoint a, InterPoint b, InterPoint c, InterPoint d) {
        super(a, b, c, d);
    }

    public String propriete() {
        return "un cerf-volant est un quadrilatère dont une des diagonales est un axe de symétrie. Les diagonales peuvent se couper à l'intérieur ou à l'extérieur. Ceci contraste avec un parallélogramme, où les côtés égaux sont opposés.";
    }

    public String type() {
        return "Je suis un cerf-volant.";
    }

    @Override
    public String toString() {
        return type() + " " + propriete() + " " + coordonees();
    }
}