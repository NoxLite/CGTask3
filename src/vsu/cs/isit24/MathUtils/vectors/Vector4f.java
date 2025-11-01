package vsu.cs.isit24.MathUtils.vectors;

import vsu.cs.isit24.MathUtils.interfaces.Vector;

public class Vector4f implements Vector {
    private float x;
    private float y;
    private float z;
    private float w;

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getZ() {
        return z;
    }

    public float getW() {
        return w;
    }

    public Vector4f(float x, float y, float z, float w) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;
    }

    @Override
    public float len() {
        return (float) Math.sqrt(x * x + y * y + z * z + w * w);
    }

    @Override
    public void normalize() {
        x /= len();
        y /= len();
        z /= len();
        w /= len();
    }

    public void plus(Vector4f v) {
        x += v.getX();
        y += v.getY();
        z += v.getZ();
        w += v.getW();
    }

    public void minus(Vector4f v) {
        x -= v.getX();
        y -= v.getY();
        z -= v.getZ();
        w -= v.getW();
    }

    public float scalarMultiply(Vector4f v) {
        return x * v.getX() + y * v.getY() + z * v.getZ() + w * v.getW();
    }

    @Override
    public float[][] toMatrix() {
        return Vector.super.toMatrix();
    }

    @Override
    public void divideByScalar(float number) {
        x /= number;
        y /= number;
        z /= number;
        w /= number;
    }

    @Override
    public void multiplyByScalar(float number) {
        x *= number;
        y *= number;
        z *= number;
        w *= number;
    }
}
