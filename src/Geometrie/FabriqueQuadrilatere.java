/**
 * Laurent Toson & Raphael Haltz
 */

package Geometrie;

import java.lang.reflect.InvocationTargetException;

import Geometrie.Polygone.*;

/**
 * Classe FabriqueQuadrilatere
 */
public class FabriqueQuadrilatere {

    /**
     * Constructeur
     */
    public FabriqueQuadrilatere() {
        return;
    }

    /**
     * Création d'un quadrilatère par défaut
     * @param s
     * @return un quadrilatère
     */
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

    /**
     * Création d'un quadrilatère
     * @param x1
     * @param y1
     * @param x2
     * @param y2
     * @param x3
     * @param y3
     * @param x4
     * @param y4
     * @param s
     * @param s2
     * @param cT
     * @param cI
     * @return un quadrilatère
     */
    public static Quadrilatere create(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4, String s, String s2, String cT, String cI) {
        Quadrilatere p = null;
        try {
            new FabriquePoint();
            p = (Quadrilatere) Class.forName(s).getConstructor(InterPoint.class, InterPoint.class, InterPoint.class, InterPoint.class, String.class, String.class).newInstance(FabriquePoint.create(x1, y1, s2), FabriquePoint.create(x2, y2, s2), FabriquePoint.create(x3, y3, s2), FabriquePoint.create(x4, y4, s2), cT, cI);
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
