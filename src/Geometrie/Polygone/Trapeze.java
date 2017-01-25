package Geometrie.Polygone;

import Geometrie.InterPoint;

public class Trapeze extends Quadrilatere {

    public Trapeze(InterPoint a, InterPoint b, InterPoint c, InterPoint d) {
        super(a, b, c, d);
    }

    public String propriete() {
        return "Un trapèze est un quadrilatère, possédant deux côtés opposés parallèles. Ces deux côtés parallèles sont appelés bases.";
    }

    public String type() {
        return "Je suis un trapèze.";
    }


    @Override
    public String toString() {
        return type() + " " + propriete() + " " + coordonees();
    }

}