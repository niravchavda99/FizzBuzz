import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class StringCalculatorShould {
    @Test
    public void calculate_0_as_answer_for_empty_string() {
        Assertions.assertThat(new Calculator().add("")).isEqualTo(0);
    }

    @Test
    public void calculate_addition_for_a_single_number() {
        Assertions.assertThat(new Calculator().add("34")).isEqualTo(34);
    }

    @Test
    public void calculate_addition_for_two_numbers() {
        Assertions.assertThat(new Calculator().add("3,4")).isEqualTo(7);
    }

    @Test
    public void calculate_addition_for_multiple_numbers() {
        Assertions.assertThat(new Calculator().add("3,4,3")).isEqualTo(10);
    }

    @Test
    public void calculate_addition_for_numbers_that_can_be_separated_by_newline_character() {
        Assertions.assertThat(new Calculator().add("1\n2")).isEqualTo(3);
        Assertions.assertThat(new Calculator().add("1\n2,7")).isEqualTo(10);
    }

    @Test
    public void calculate_addition_for_numbers_that_have_custom_delimiters() {
        Assertions.assertThat(new Calculator().add("//;\n1;2")).isEqualTo(3);
    }

    @Test
    public void throw_exception_for_negative_numbers() {
        assertThrows(IllegalArgumentException.class, ()-> new Calculator().add("-1,2"));
    }
}

