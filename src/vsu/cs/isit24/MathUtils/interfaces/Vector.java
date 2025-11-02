package vsu.cs.isit24.MathUtils.interfaces;

import vsu.cs.isit24.MathUtils.vectors.Vector2f;

public interface Vector {

    /*public default float[][] toMatrix() {
        return new float[0];
    }*/

    default void divideByScalar(float number) {
        return;
    }

    default void multiplyByScalar(float number) {
        return;
    }

    /* default void plus(Vector v) {
        return;
    }

    default void minus(Vector v) {
        return;
    } */

    default float len() {
        return 0;
    }

    default void normalize() {
        return;
    }

}
