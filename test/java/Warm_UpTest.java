import org.junit.Test;

import static org.junit.Assert.*;

public class Warm_UpTest {

    @Test
    public void multiplication() {


        for(int i = 1 ; i<= 100 ; i++) {

            int a = -100 + (int) (Math.random() * 100);
            int b = -100 + (int) (Math.random() * 100);

            int multiplication = a * b;

            int answer = Warm_Up.multiplication(a, b);

            assertEquals("Тест провален" , answer, multiplication);
        }
    }
}