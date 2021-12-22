package lesson12;

import static lesson12.Matrix.*;

public class MatrixRunner {

    public static void main(String[] args) {
        Matrix matrix = new Matrix(n, m);
        matrix.print();
        System.out.println("Результат суммирования элементов матрицы равен " + matrix.sum());
    }
}
