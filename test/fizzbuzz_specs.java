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

    @Test
    public void should_return_Fizz_when_playing_given_number_is_6() {

        FizzBuzz fizzBuzz = new FizzBuzz();

        var result = fizzBuzz.playing(6);

        Assert.assertEquals("Fizz", result);
    }

    @Test
    public void should_return_Buzz_when_playing_given_number_is_10() {

        FizzBuzz fizzBuzz = new FizzBuzz();

        var result = fizzBuzz.playing(10);

        Assert.assertEquals("Buzz", result);
    }

    @Test
    public void should_return_Whizz_when_playing_given_number_is_14() {

        FizzBuzz fizzBuzz = new FizzBuzz();

        var result = fizzBuzz.playing(14);

        Assert.assertEquals("Whizz", result);
    }

    @Test
    public void should_return_FizzBuzz_when_playing_given_number_is_60() {

        FizzBuzz fizzBuzz = new FizzBuzz();

        var result = fizzBuzz.playing(60);

        Assert.assertEquals("FizzBuzz", result);
    }

    @Test
    public void should_return_FizzWhizz_when_playing_given_number_is_21() {

        FizzBuzz fizzBuzz = new FizzBuzz();

        var result = fizzBuzz.playing(21);

        Assert.assertEquals("FizzWhizz", result);
    }

    @Test
    public void should_return_BuzzWhizz_when_playing_given_number_is_140() {

        FizzBuzz fizzBuzz = new FizzBuzz();

        var result = fizzBuzz.playing(140);

        Assert.assertEquals("BuzzWhizz", result);
    }

    @Test
    public void should_return_FizzBuzzWhizz_when_playing_given_number_is_210() {

        FizzBuzz fizzBuzz = new FizzBuzz();

        var result = fizzBuzz.playing(210);

        Assert.assertEquals("FizzBuzzWhizz", result);
    }
}
