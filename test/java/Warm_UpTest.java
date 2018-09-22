import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Scanner;

public class Warm_UpTest {
    Scanner scanner = new Scanner(System.in);

    @Test
    public void multiplication() {
        int a = 0;
        int b = 0;
        int multiplication , answer;

        for (int j = 1 ; j <= 2 ; j++) {

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
}
