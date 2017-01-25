package Geometrie.Polygone;

import Geometrie.*;

public class Quadrilatere {
    private InterPoint a, b, c, d;

    public Quadrilatere(InterPoint a, InterPoint b, InterPoint c, InterPoint d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public Quadrilatere() {
        new FabriquePoint();
        a = FabriquePoint.create("Point");
        new FabriquePoint();
        b = FabriquePoint.create("Point2");
        new FabriquePoint();
        c = FabriquePoint.create("Point");
        new FabriquePoint();
        d = FabriquePoint.create("Point");
    }

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

    protected double cote(InterPoint A, InterPoint B) {
        return Math.sqrt(Math.pow(B.getX() - A.getX(), 2) + Math.pow(B.getY() - A.getY(), 2));
    }

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


    public String coordonees() {
        return "Mes sommets ont pour coordonées " + a.toString() + ", " + b.toString() + ", " + c.toString() + ", " + d.toString() + ". Son périmètre est " + perimetre() + ".";
    }


    public String type() {
        return "Je suis un Quadrilatère quelconque.";
    }

    @Override
    public String toString() {
        return type() + " " + coordonees();
    }
}