import java.util.Arrays;

public class Calculator {
    public int add(String numbers) {
        if(numbers.isEmpty()) {
            return 0;
        }
        String customDelimiter = "";
        if(numbers.startsWith("//")) {
            customDelimiter = numbers.charAt(2) + "";
            numbers = numbers.substring(3);
        }
        String[] splitNumbers = numbers.split("[/,\n" + customDelimiter + "]");

        int sum = 0;
        for (String splitNumber : splitNumbers) {
            if (splitNumber.startsWith("-"))
                throw new IllegalArgumentException();
            if (!splitNumber.isEmpty()) {
                int i = Integer.parseInt(splitNumber);
                sum += i;
            }
        }
        return sum;
    }
}
