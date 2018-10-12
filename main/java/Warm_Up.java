import java.util.Scanner;

/**
 * Задача : Написать программу умножения, без знака "*"
 *          Выполнить любым доступным способом
 *
 * Выполнил : @author Nikita Gorshkov 16IT18k
 */
public class Warm_Up {
    static Scanner scanner = new Scanner(System.in);
    public static void main (String args[]){

        int a , b ;

        System.out.print("Введите число которое вы хотите умножить : ");
        a = scanner.nextInt();

        System.out.print("Введите число на которое вы хотите умножить : ");
        b = scanner.nextInt();

        System.out.println("Ответ = " + multiplication(a,b));
    }

    /**
     * Метод который выполняет функцию произведения двух множителей
     *
     * Проверка на ноль, на отрицательные числа и положительные.
     *
     * @param a - первый множитель (умножаемое число).
     * @param b - второй множитель (число на которое умножают).
     * @return result - возвращает произведение двух множителей.
     */
    public static int multiplication(int a , int b){
        int result = 0;

        if (a == 0 || b == 0){
            return 0;
        }
        while((a < 0 && b < 0) || (b < 0)){
            b++;
            result -= a;
        }
        while((a > 0 || a < 0 ) && b > 0){
            b--;
            result += a;
        }
        return result;
    }
}
