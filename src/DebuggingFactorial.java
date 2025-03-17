//TODO: Программа предполагает, что метод computeFactorial должен вычислить факториал числа n.
// Однако метод содержит ошибку. Ваша задача - найти и исправить эту ошибку с помощью отладки.

public class DebuggingFactorial {
    public static void main(String[] args) {
        int n = 5;
        int result = computeFactorial(n);
        System.out.println(n + "! = " + result);
    }

    public static int computeFactorial(int n) {
        if (n == 0 || n == 1) {  // Ошибка в базовом случае, в условии, когда рекурсия останавливается.
            return 1;            // Условие до исправления: if (n == 2)
        } else {
            return n * computeFactorial(n - 1);
        }
    }
}
