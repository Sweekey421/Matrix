import java.util.Random;

import static java.lang.reflect.Array.set;

public class Matrix {

    private final int matrixStolb, matrixStroka;
    private final int[][] matrix;

    public Matrix(int matrixStolb, int matrixStroka) {

        Random random = new Random();
        matrix = new int[matrixStolb][matrixStroka];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                set(i, j, random.nextInt(10));
            }
        }
        this.matrixStolb = matrixStolb;
        this.matrixStroka = matrixStroka;

    }
    public int get(int matrixStolb, int matrixStroka) {
        return matrix[matrixStolb][matrixStroka];
    }
    public void set(int matrixStolb, int matrixStroka, int mxSet) {
        matrix[matrixStolb][matrixStroka] = mxSet;
    }
    void out() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(get(i, j) + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    Matrix Sl(Matrix mx) {
        Matrix matrixSl = new Matrix(matrixStolb, matrixStroka);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrixSl.set(i, j, get(i, j) + mx.get(i, j));
            }
        }
        return matrixSl;
    }
    Matrix UMN(int num) {
        Matrix matrixUMN = new Matrix(matrixStolb, matrixStroka);

        for (int i = 0; i < matrixUMN.matrixStolb; i++) {
            for (int j = 0; j < matrixUMN.matrixStroka; j++) {
                matrixUMN.set(i, j, get(i, j) * num);
            }
        }
        return matrixUMN;
    }
    Matrix matUMNmatr(Matrix z) {
        Matrix matUMNmatr = new Matrix(matrixStolb, matrixStroka);
        int calc = 0;

        for (int i = 0; i < matUMNmatr.matrixStolb; i++) {
            for (int j = 0; j < matUMNmatr.matrixStroka; j++) {
                if (matUMNmatr.matrixStolb < matUMNmatr.matrixStroka) {
                    for (int k = 0; k < matUMNmatr.matrixStolb; k++) {
                        calc = calc + (get(i, k) * get(k,j));
                    }
                }
                else {
                    for (int k = 0; k < matUMNmatr.matrixStroka; k++) {
                        calc = calc + (get(i, k) * z.get(k,j));
                    }
                }

                matUMNmatr.set(i,j,calc);
                calc = 0;
            }
        }

        return matUMNmatr;
    }
}