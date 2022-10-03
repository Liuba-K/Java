import java.util.Arrays;

public class hw4_lesson1 {
    /*
    4) Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
    каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке. Если длины массивов не равны,
     необходимо как-то оповестить пользователя. Важно: При выполнении метода единственное исключение,
     которое пользователь может увидеть - RuntimeException, т.е. ваше
     */

    public static void main(String[] args) {
        int[] arr1 = new int[] {10, 2, 35, 71};
        int[] arr2 = new int[] {5, 1, 7, 8};
        int[] result = arrayDivision(arr1, arr2);
        String resultAsString = Arrays.toString(result); //привести массив к строке
        System.out.println(resultAsString);
    }

    public static int[] arrayDivision(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            throw new RuntimeException("длины массивов не равны");
        }
        int[] result =  new int[arr1.length];
        for (int i = 0; i < result.length; i++) {
            if (arr2[i] == 0) {
                throw new RuntimeException("На ноль делить нельзя, замените элемент во втором массиве");
            }

            result[i] = arr1[i] / arr2[i];
        }
        return result;
    }
}
/*
Примечание, в результаты получаем только целые числа, без округления
 */
