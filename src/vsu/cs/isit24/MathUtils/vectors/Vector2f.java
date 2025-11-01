package vsu.cs.isit24.MathUtils.vectors;

import vsu.cs.isit24.MathUtils.interfaces.Vector;

public class Vector2f implements Vector {

    private float x;
    private float y;

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public Vector2f(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public void plus(Vector2f v) {
        this.x += v.getX();
        this.y += v.getY();
    }

    public void minus(Vector2f v) {
        this.x -= v.getX();
        this.y -= v.getY();
    }

    @Override
    public float len() {
        return (float) Math.sqrt(x * x + y * y);
    }

    @Override
    public void normalize() {
        x = x / len();
        y = y / len();
    }


    public float scalarMultiply(Vector2f v) {
        return x * v.getX() + y * v.getY();
    }

    @Override
    public float[][] toMatrix() {
        return new float[][] {
                {x, 0},
                {0, y}
        };
    }

    @Override
    public void multiplyByScalar(float number) {
        x *= number;
        y *= number;
    }

    @Override
    public void divideByScalar(float number) {
        x /= number;
        y /= number;
    }
}
