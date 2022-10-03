public class hw1_Lesson1 {
    /*
    1) Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
     */
    public static void main(String[] args) {
        int[][] matrix = new int[][] {
                {1, 1, 1},
                {1, 0, 1},
                {0, 1, 0}}; // создание двумерного массива, в каждой ячейке может лежать только значение 0 или 1
        //int Number = new int[] {2};

        var sum = sumMatrix(matrix); //вызываем метод, а результат записываем в переменную
        var dif = differenceMatrix(matrix);
        System.out.println(sum); // выводим на экран
        System.out.println(dif);
        var incr = increaseTwo(matrix);
        System.out.println(incr);
    }

    public static int increaseTwo(int[][] matrix) {
        int inc = 0;
        for (int i = 0; i < matrix.length; i++) {
            int rowNumber = matrix.length; //кол-во строк
            int colNumber = matrix[i].length; // кол-во столбцов
            if (rowNumber != colNumber) {
                throw new RuntimeException("кол-во строк не равно кол-ву столбцов");
            }
            for (int j=0; j < matrix[i].length; j++) {
                if (matrix[i][j] != 0 && matrix[i][j] !=1){
                    throw new RuntimeException("Элемент ячейки не равен 0 или 1");
                }
                inc = (inc + matrix[i][j] * 2);
            }
        }
        return inc;
    }

    public static int sumMatrix(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            int rowNumber = matrix.length; //кол-во строк
            int colNumber = matrix[i].length; // кол-во столбцов
            if (rowNumber != colNumber) {
                throw new RuntimeException("кол-во строк не равно кол-ву столбцов");
            }
            for (int j=0; j < matrix[i].length; j++) {
                if (matrix[i][j] != 0 && matrix[i][j] !=1){
                    throw new RuntimeException("Элемент ячейки не равен 0 или 1");
                }
                sum = sum + matrix[i][j];
            }
        }
        return sum;
    }

    public static int differenceMatrix(int[][] matrix) {
        int differenceMatrix = 0;
        for (int i = 0; i < matrix.length; i++) {
            int rowNumber = matrix.length; //кол-во строк
            int colNumber = matrix[i].length; // кол-во столбцов
            if (rowNumber != colNumber) {
                throw new RuntimeException("кол-во строк не равно кол-ву столбцов");
            }
            for (int j=0; j < matrix[i].length; j++) {
                if (matrix[i][j] != 0 && matrix[i][j] !=1){
                    throw new RuntimeException("Элемент ячейки не равен 0 или 1");
                }
                differenceMatrix = differenceMatrix - matrix[i][j];
            }
        }
        return differenceMatrix;
    }
}
