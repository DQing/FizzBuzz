import org.junit.Assert;
import org.junit.Test;

public class fizzbuzz_specs {
    @Test
    public void should_return_1_when_play_given_number_1() {

        FizzBuzz fizzBuzz = new FizzBuzz();
        var result = fizzBuzz.play(1);

        Assert.assertEquals("", result);
    }

    @Test
    public void should_return_Fizz_when_play_given_number_3() {

        FizzBuzz fizzBuzz = new FizzBuzz();
        var result = fizzBuzz.play(3);

        Assert.assertEquals("Fizz", result);
    }
}
