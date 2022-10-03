import java.util.Arrays;

public class hw3_Lesson1 {
    /*
3) Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке. Если длины массивов не равны,
необходимо как-то оповестить пользователя.
     */
    public static void main(String[] args) {
        int[] arr1 = new int[] {1, 2, 3, 7};
        int[] arr2 = new int[] {5, 6, 7, 8};
        int[] result = arrayDifference(arr1, arr2);
        String resultAsString = Arrays.toString(result); //привести массив к строке
        System.out.println(resultAsString);
    }

    public static int[] arrayDifference(int[] arr1, int[] arr2){
        if (arr1.length != arr2.length) {
            throw new RuntimeException("длины массивов не равны");
        }
        int[] result =  new int[arr1.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = arr1[i] - arr2[i];
        }
        return result;
    }
}
