package Geometrie.Polygone;

import Geometrie.InterPoint;

public class Parallelogramme extends Quadrilatere {


    public Parallelogramme(InterPoint a, InterPoint b, InterPoint c, InterPoint d) {
        super(a, b, c, d);
    }

    public String propriete() {
        return "Un parallelogramme est quadrilatère particulier. Ses cotés sont paralleles deux à deux.";
    }

    public String type() {
        return "Je suis un parallelogramme.";
    }

    @Override
    public String toString() {
        return type() + " " + propriete() + " " + coordonees();
    }
}
