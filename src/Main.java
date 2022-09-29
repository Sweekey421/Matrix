public class Main {
    public static void main(String[] args) {

        Matrix matrix1  = new Matrix (2,2);
        Matrix matrix2 = new Matrix (2,2);
        Matrix matrix3,matrix4,matrix5;

        System.out.println("Первая матрица");
        matrix1.out();
        System.out.println("Вторая матрица");
        matrix2.out();

        System.out.println("Сложение матриц");
        matrix3 = matrix1.Sl(matrix2);
        matrix3.out();

        System.out.println("Умножение первой матрицы на число 3");
        matrix4 = matrix1.UMN(4);
        matrix4.out();

        System.out.println("Умножение первой матрицы на вторую матрицу");
        matrix5 = matrix1.matUMNmatr(matrix2);
        matrix5.out();
    }
}