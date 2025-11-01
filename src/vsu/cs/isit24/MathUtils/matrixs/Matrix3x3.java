package vsu.cs.isit24.MathUtils.matrixs;

import vsu.cs.isit24.MathUtils.interfaces.Matrix;
import vsu.cs.isit24.MathUtils.vectors.Vector3f;

public class Matrix3x3 implements Matrix {
    private float[][] matrix;

    public Matrix3x3(float[][] matrix) {
        this.matrix = matrix;
    }

    public Matrix3x3() {
        this.matrix = new float[][] {
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}
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

    public void plus(Matrix3x3 matrix3x3) {
        for (int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                matrix[i][j] += matrix3x3.getValue(i, j);
            }
        }
    }

    public void minus(Matrix3x3 matrix3x3) {
        for (int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                matrix[i][j] -= matrix3x3.getValue(i, j);
            }
        }
    }

    public Vector3f multiplyOnVector(Vector3f vector) {
        float x = matrix[0][0] * vector.getX() + matrix[0][1] * vector.getY() + matrix[0][2];
        float y = matrix[1][0] * vector.getX() + matrix[1][1] * vector.getY() + matrix[1][2];
        float z = matrix[2][0] * vector.getX() + matrix[2][1] * vector.getY() + matrix[2][2];

        return new Vector3f(x, y, z);
    }

    public Matrix3x3 multiplyOnMatrix(Matrix3x3 matrix3x3) {
        Matrix3x3 result = new Matrix3x3();
        for (int i = 0; i < 3; i++) {
            float value = 0;
            for (int j = 0; j < 3; j++) {
                for (int a = 0; a < 3; a++) {
                    value = matrix[j][a] * matrix3x3.getValue(a, j);
                }
                result.setValue(i, j, value);
            }

        }
        return result;
    }

    @Override
    public void transposition() {
        Matrix3x3 result = new Matrix3x3();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result.setValue(i, j, matrix[j][i]);
            }
        }
        matrix = result.getMatrix();
    }
}
