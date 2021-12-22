package lesson12;

import lesson12.exception.MyArraySizeException;
import lesson12.exception.MyArrayDataException;
import lesson12.exception.myArrayNullElementException;

import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.ArrayList;


public class Matrix {

    //Число строк массива, который будем генерировать
    public static final int ROWS = 4;
    //Число столбцов массива, который будем генерировать
    public static final int COLUMNS = 4;

    //Число столбцов массива, который будем проверять
    public static final int n = 4;
    //Число столбцов массива, который будем проверять
    public static final int m = 4;

    //Список, из которого будем генерировать элементы для массива. В нём необходимо изменять элементы для проверок
    // исключений
    private static final List <String> SYMBOLS = List.of("25", "-1", "5", "54", "16", "-4", "48", "-6",
            "45", "8", "23", "-15", "10", "64", "47", "-70");

    private List<List<String>> values;


    public Matrix(int n, int m) {
        if (n != ROWS || m != COLUMNS) {
            throw new MyArraySizeException(ROWS, COLUMNS, "Произошла ошибка во время инициализации матрицы");
        } else {
            System.out.println("Введен массив " + ROWS + " на "+ COLUMNS);
        }
        this.values = new ArrayList<>(n);
        fillUp(n,m);
    }

    public void fillUp(int n, int m) {
        for (int i = 0; i < n; i++) {
            List<String> lines = new ArrayList<>(m);
            this.values.add(lines);
            for (int j = 0; j < m; j++) {
                int randomIndex = new Random().nextInt(SYMBOLS.size());
                lines.add(SYMBOLS.get(randomIndex));
            }
        }
    }

    public int sum() {
        int result =0;
        for (int i = 0; i < this.values.size(); i++) {
            List<String> row = this.values.get(i);
            for (int j = 0; j < row.size(); j++) {
                String value = row.get(j);
                if (Objects.isNull(value) || value.isEmpty()) {
                    throw new myArrayNullElementException("Не допустимы null-значения или пустые строки");
                }
                if (!value.matches("^(-*(\\d)+)$")) {
                    throw new MyArrayDataException(i+1, j+1, "Некорректное значение в качестве элемента");
                }
                result += Integer.parseInt(value);
            }
        }
        return result;
    }

    public void print() {
        for (List<String> lines : this.values) {
            System.out.println(lines);
        }
    }
}


