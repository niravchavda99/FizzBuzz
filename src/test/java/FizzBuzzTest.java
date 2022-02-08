import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.PrintStream;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class FizzBuzzTest {

    @Test
    public void test_for_multiple_of_three() {
        FizzBuzz fizzbuzz = new FizzBuzz(3, printStream);
        Assertions.assertThat(fizzbuzz.give()).isEqualTo("Fizz");
    }

    @Test
    public void test_for_multiple_of_five() {
        FizzBuzz fizzbuzz = new FizzBuzz(5, printStream);
        Assertions.assertThat(fizzbuzz.give()).isEqualTo("Buzz");
    }

    @Test
    public void test_for_multiple_of_combine() {
        FizzBuzz fizzbuzz = new FizzBuzz(15, printStream);
        Assertions.assertThat(fizzbuzz.give()).isEqualTo("FizzBuzz");
    }

    @Test
    public void test_for_no_multiple() {
        FizzBuzz fizzbuzz = new FizzBuzz(7, printStream);
        Assertions.assertThat(fizzbuzz.give()).isEqualTo("7");
    }

    @Mock
    PrintStream printStream;

    @Test
    public void print_all_fizz_buzz_till_n() {
        FizzBuzz fizzBuzz = new FizzBuzz(15, printStream);
        fizzBuzz.printAll();
        verify(printStream, times(4)).println("Fizz");
        verify(printStream, times(2)).println("Buzz");
        verify(printStream, times(1)).println("FizzBuzz");
    }

}
