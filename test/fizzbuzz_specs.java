import org.junit.Assert;
import org.junit.Test;

public class fizzbuzz_specs {
    @Test
    public void should_return_1_when_play_given_number_1() {

        FizzBuzz fizzBuzz = new FizzBuzz();
        var result = fizzBuzz.play(1);

        Assert.assertEquals("1", result);
    }

    @Test
    public void should_return_Fizz_when_play_given_number_3() {

        FizzBuzz fizzBuzz = new FizzBuzz();
        var result = fizzBuzz.play(3);

        Assert.assertEquals("Fizz", result);
    }

    @Test
    public void should_return_4_when_play_given_number_4() {

        FizzBuzz fizzBuzz = new FizzBuzz();
        var result = fizzBuzz.play(4);

        Assert.assertEquals("4", result);
    }

    @Test
    public void should_return_buzz_when_play_given_number_5() {

        FizzBuzz fizzBuzz = new FizzBuzz();
        var result = fizzBuzz.play(5);

        Assert.assertEquals("Buzz", result);
    }
}
