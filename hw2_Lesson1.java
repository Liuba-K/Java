public class hw2_Lesson1 {
    /*
Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?
     */
    public static void main(String[] args) {//двумерный массив
        // объявление двумерного массива строк
        String[][] arr = {
                {"10", "12", "45", "67","56"},
                {"2", "1", "45", "33", null},
                {"2", "1", "45", "33","56"}};

        var sum = sum2d(arr); //вызываем метод, а результат записываем в переменную
        System.out.println(sum); // выводим на экран        sum2d(arr);
    }

    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < 5; j++) {
                if (arr[i].length < 5){
                   throw new RuntimeException("столбцов меньше 5");
                }
                if (arr[i].length > 5){
                    throw new RuntimeException("столбцов больше 5");
                }
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
        return sum;
    }
}
/*
1) К строке "for (int j = 0; j < 5; j++)" нужно сделать исключение, что j<6 , так как for будет пробегаться до j=4,
если меньше, то падает Index 2 out of bounds for length 2
2) К этой же строке, если больше, то тоже указать исключение
3) К строке "int val = Integer.parseInt(arr[i][j])" могут быть исключения, что нельзя спарсить в число или
4)Невозможно проанализировать нулевую строку
 */