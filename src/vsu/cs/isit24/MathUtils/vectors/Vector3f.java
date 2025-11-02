package vsu.cs.isit24.MathUtils.vectors;

import vsu.cs.isit24.MathUtils.interfaces.Vector;
import vsu.cs.isit24.MathUtils.matrixs.Matrix3x3;

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
        float l = len();
        if (l != 0) {
            x = x / l;
            y = y / l;
            z = z / l;
        }
    }

    public void plus(Vector3f v) {
        x += v.getX();
        y += v.getY();
        z += v.getZ();
    }

    public void minus(Vector3f v) {
        x -= v.getX();
        y -= v.getY();
        z -= v.getZ();
    }

    public float scalarMultiply(Vector3f v) {
        return x * v.getX() + y * v.getY() + z * v.getZ();
    }

    public Vector3f vectorMultiply(Vector3f v) {
        return new Vector3f(
                y * v.getZ() - z * v.getY(),
                z * v.getX() - x * v.getZ(),
                x * v.getY() - y * v.getX()
        );
    }

    /* @Override
    public float[][] toMatrix() {
        return new float[][] {
                {x, 0, 0},
                {0, y, 0},
                {0, 0, z}};
    } */


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

    public boolean equals(Vector3f o) {
        float EPS = 10e-6F;
        return  -EPS <= x - o.getX() && x - o.getX() <= EPS &&
                -EPS <= y - o.getY() && y - o.getY() <= EPS &&
                -EPS <= z - o.getZ() && z - o.getZ() <= EPS;
    }


/*  public int compareTo(Vector3f o) {
        float EPS = 10e-6F;
        if (-EPS <= x - o.getX() && x - o.getX() <= EPS &&
                -EPS <= y - o.getY() && y - o.getY() <= EPS &&
                -EPS <= z - o.getZ() && z - o.getZ() <= EPS) {
            return 0;
        };
        if (x > o.getX() && y > o.getY() && z > o.getX()) {
            return 1;
        }
        return -1;
    } */
}


