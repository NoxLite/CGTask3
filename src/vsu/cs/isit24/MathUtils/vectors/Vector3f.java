package vsu.cs.isit24.MathUtils.vectors;

import vsu.cs.isit24.MathUtils.interfaces.Vector;

public class Vector3f implements Vector {
    private float x;
    private float y;
    private float z;

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getZ() {
        return z;
    }

    public Vector3f(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public float len() {
        return (float) Math.sqrt(x * x + y * y + z * z);
    }

    @Override
    public void normalize() {
        x = x / len();
        y = y / len();
        z = z / len();
    }

    public void plus(Vector3f v) {

    }

    public void minus(Vector3f v) {
        x -= v.getX();
        y -= v.getY();
        z -= v.getZ();
    }

    public float scalarMultiply(Vector3f v) {
        return x * v.getX() + y * v.getY() + z * getZ();
    }

    public Vector3f vectorMultiply(Vector3f v) {
        return new Vector3f(
                y * v.getZ() - z * v.getY(),
                z * v.getX() - x * v.getZ(),
                x * v.getY() - y * v.getX()
        );
    }

    @Override
    public float[][] toMatrix() {
        return new float[][] {
                {x, 0, 0},
                {0, y, 0},
                {0, 0, z}};
    }


    @Override
    public void divideByScalar(float number) {
        x /= number;
        y /= number;
        z /= number;
    }

    @Override
    public void multiplyByScalar(float number) {
        x *= number;
        y *= number;
        z *= number;
    }
}

