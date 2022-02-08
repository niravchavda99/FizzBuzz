import java.io.PrintStream;

public class FizzBuzz {
    private final int number;
    private final PrintStream out;

    public FizzBuzz(int number, PrintStream printStream) {
        this.number = number;
        this.out = printStream;
    }

    public String give() {
        return toFizzBuzz(this.number);
    }

    private String toFizzBuzz(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else {
            return String.valueOf(number);
        }
    }

    public void printAll() {
        for (int i = 1; i <= this.number; i++) {
            out.println(toFizzBuzz(i));
        }
    }
}
