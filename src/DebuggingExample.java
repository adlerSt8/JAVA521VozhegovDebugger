//TODO: Программа предполагает, что она должна вычислить сумму чисел в массиве numbers, но она содержит ошибку.
// Ваша задача - найти и исправить эту ошибку с помощью отладки.

public class DebuggingExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) { //Ошибка во втором параметре цикла(выход за пределы массива).
            sum += numbers[i];                     // параметр до исправления ошибки:
                                                   // for (int i = 0; i <= numbers.length; i++)
        }

        System.out.println("Сумма чисел: " + sum);
    }
}

