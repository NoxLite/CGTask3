package vsu.cs.isit24.MathUtils.matrixs;

import vsu.cs.isit24.MathUtils.interfaces.Matrix;
import vsu.cs.isit24.MathUtils.vectors.Vector4f;

public class Matrix4x4 implements Matrix {
    private float[][] matrix;

    public Matrix4x4(float[][] matrix) {
        this.matrix = matrix;
    }

    public Matrix4x4() {
        this.matrix = new float[][] {
                {1, 0, 0, 0},
                {0, 1, 0, 0},
                {0, 0, 1, 0},
                {0, 0, 0, 1}
        };
    }

    public float[][] getMatrix() {
        return matrix;
    }

    public void setValue(int row, int column, float value) {
        matrix[row][column] = value;
    }

    public float getValue(int row, int column) {
        return matrix[row][column];
    }

    public void plus(Matrix4x4 matrix4x4) {
        for (int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                matrix[i][j] += matrix4x4.getValue(i, j);
            }
        }
    }

    public void minus(Matrix4x4 matrix4x4) {
        for (int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                matrix[i][j] -= matrix4x4.getValue(i, j);
            }
        }
    }

    public Vector4f multiplyOnVector(Vector4f vector) {
        float x = matrix[0][0] * vector.getX() + matrix[0][1] * vector.getY() + matrix[0][2] * vector.getZ() + matrix[0][3] * vector.getW();
        float y = matrix[1][0] * vector.getX() + matrix[1][1] * vector.getY() + matrix[1][2] * vector.getZ() + matrix[1][3] * vector.getW();
        float z = matrix[2][0] * vector.getX() + matrix[2][1] * vector.getY() + matrix[2][2] * vector.getZ() + matrix[2][3] * vector.getW();
        float w = matrix[3][0] * vector.getX() + matrix[3][1] * vector.getY() + matrix[3][2] * vector.getZ() + matrix[3][3] * vector.getW();
        return new Vector4f(x, y, z, w);
    }

    public Matrix4x4 multiplyOnMatrix(Matrix4x4 matrix4x4) {
        Matrix4x4 result = new Matrix4x4();
        for (int i = 0; i < 4; i++) {
            float value = 0;
            for (int j = 0; j < 4; j++) {
                for (int a = 0; a < 4; a++) {
                    value = matrix[j][a] * matrix4x4.getValue(a, j);
                }
                result.setValue(i, j, value);
            }

        }
        return result;
    }

    @Override
    public void transposition() {
        Matrix3x3 result = new Matrix3x3();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                result.setValue(i, j, matrix[j][i]);
            }
        }
        matrix = result.getMatrix();
    }
}
