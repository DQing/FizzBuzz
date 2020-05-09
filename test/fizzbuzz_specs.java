import org.junit.Assert;
import org.junit.Test;

public class fizzbuzz_specs {

    @Test
    public void should_return_1_when_playing_given_number_is_1() {

        FizzBuzz fizzBuzz = new FizzBuzz();

        var result = fizzBuzz.playing(1);

        Assert.assertEquals("1", result);
    }

    @Test
    public void should_return_4_when_playing_given_number_is_4() {

        FizzBuzz fizzBuzz = new FizzBuzz();

        var result = fizzBuzz.playing(4);

        Assert.assertEquals("4", result);
    }
}
