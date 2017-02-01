//Laurent Toson & Raphael Haltz

package Geometrie;

import java.lang.reflect.InvocationTargetException;

import Geometrie.Polygone.*;

public class FabriqueQuadrilatere {

    public FabriqueQuadrilatere() {
        return;
    }

    public static Quadrilatere create(String s) {
        Quadrilatere p = null;
        try {
            p = (Quadrilatere) Class.forName(s).getConstructor().newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return p;
    }

    public static Quadrilatere create(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4, String s, String s2) {
        Quadrilatere p = null;
        try {
            new FabriquePoint();
            p = (Quadrilatere) Class.forName(s).getConstructor(InterPoint.class, InterPoint.class, InterPoint.class, InterPoint.class).newInstance(FabriquePoint.create(x1, y1, s2), FabriquePoint.create(x2, y2, s2), FabriquePoint.create(x3, y3, s2), FabriquePoint.create(x4, y4, s2));
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return p;
    }
}
