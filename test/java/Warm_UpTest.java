import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Scanner;

public class Warm_UpTest {
    Scanner scanner = new Scanner(System.in);
    
    /**
    * Метод используется для тестирования кода из класса Warm_Up,
    * а точнее его метода multiplication
    *
    * Тест проверяет:
    * <ul>
    *     <li>Проверка на ноль</li>
    *     <li>Положительные числа</li>
    *     <li>Отрицательные числа</li>
    * </ul>
    */
    @Test
    public void multiplication() {
        int a = 0;
        int b = 0;
        int multiplication , answer;

        multiplication = a * b;

        answer = Warm_Up.multiplication(a,b);

        assertEquals("Тест провален", answer, multiplication);

        for (int i = 1; i <= 100; i++) {

            a = -100 + (int) (Math.random() * 100);
            b = -100 + (int) (Math.random() * 100);

            multiplication = a * b;

            answer = Warm_Up.multiplication(a, b);

            assertEquals("Тест провален", answer, multiplication);
        }
        
    }
}
