import org.junit.Assert;
import org.junit.Test;

public class fizzbuzz_specs {
    @Test
    public void should_return_1_when_playing_given_number_1() {

        FizzBuzz fizzBuzz = new FizzBuzz();
        var result = fizzBuzz.playing(1);

        Assert.assertEquals("1", result);
    }

    @Test
    public void should_return_4_when_playing_given_number_4() {

        FizzBuzz fizzBuzz = new FizzBuzz();
        var result = fizzBuzz.playing(4);

        Assert.assertEquals("4", result);
    }

    @Test
    public void should_return_Fizz_when_playing_given_number_6() {

        FizzBuzz fizzBuzz = new FizzBuzz();
        var result = fizzBuzz.playing(6);

        Assert.assertEquals("Fizz", result);
    }

    @Test
    public void should_return_Buzz_when_playing_given_number_10() {

        FizzBuzz fizzBuzz = new FizzBuzz();
        var result = fizzBuzz.playing(10);

        Assert.assertEquals("Buzz", result);
    }

    @Test
    public void should_return_Whizz_when_playing_given_number_14() {

        FizzBuzz fizzBuzz = new FizzBuzz();
        var result = fizzBuzz.playing(14);

        Assert.assertEquals("Whizz", result);
    }

    @Test
    public void should_return_FizzBuzz_when_playing_given_number_60() {

        FizzBuzz fizzBuzz = new FizzBuzz();
        var result = fizzBuzz.playing(60);

        Assert.assertEquals("FizzBuzz", result);
    }

    @Test
    public void should_return_FizzWhizz_when_playing_given_number_21() {

        FizzBuzz fizzBuzz = new FizzBuzz();
        var result = fizzBuzz.playing(21);

        Assert.assertEquals("FizzWhizz", result);
    }

    @Test
    public void should_return_BuzzWhizz_when_playing_given_number_140() {

        FizzBuzz fizzBuzz = new FizzBuzz();
        var result = fizzBuzz.playing(140);

        Assert.assertEquals("BuzzWhizz", result);
    }

    @Test
    public void should_return_FizzBuzzWhizz_when_playing_given_number_210() {

        FizzBuzz fizzBuzz = new FizzBuzz();
        var result = fizzBuzz.playing(210);

        Assert.assertEquals("FizzBuzzWhizz", result);
    }

    @Test
    public void should_return_Fizz_when_playing_given_number_13() {

        FizzBuzz fizzBuzz = new FizzBuzz();
        var result = fizzBuzz.playing(13);

        Assert.assertEquals("Fizz", result);
    }

    @Test
    public void should_return_Fizz_when_playing_given_number_3() {

        FizzBuzz fizzBuzz = new FizzBuzz();
        var result = fizzBuzz.playing(3);

        Assert.assertEquals("Fizz", result);
    }

    @Test
    public void should_return_Fizz_when_playing_given_number_30() {

        FizzBuzz fizzBuzz = new FizzBuzz();
        var result = fizzBuzz.playing(30);

        Assert.assertEquals("Fizz", result);
    }

    @Test
    public void should_return_Fizz_when_playing_given_number_133() {

        FizzBuzz fizzBuzz = new FizzBuzz();
        var result = fizzBuzz.playing(133);

        Assert.assertEquals("Fizz", result);
    }

    @Test
    public void should_return_Buzz_when_playing_given_number_5() {

        FizzBuzz fizzBuzz = new FizzBuzz();
        var result = fizzBuzz.playing(5);

        Assert.assertEquals("Buzz", result);
    }

    @Test
    public void should_return_BuzzWhizz_when_playing_given_number_35() {

        FizzBuzz fizzBuzz = new FizzBuzz();
        var result = fizzBuzz.playing(35);

        Assert.assertEquals("BuzzWhizz", result);
    }

    @Test
    public void should_return_Whizz_when_playing_given_number_56() {

        FizzBuzz fizzBuzz = new FizzBuzz();
        var result = fizzBuzz.playing(56);

        Assert.assertEquals("Whizz", result);
    }

    @Test
    public void should_return_17_when_playing_given_number_17() {

        FizzBuzz fizzBuzz = new FizzBuzz();
        var result = fizzBuzz.playing(17);

        Assert.assertEquals("17", result);
    }

    @Test
    public void should_return_Whizz_when_playing_given_number_70() {

        FizzBuzz fizzBuzz = new FizzBuzz();
        var result = fizzBuzz.playing(70);

        Assert.assertEquals("Whizz", result);
    }

    @Test
    public void should_return_Fizz_when_playing_given_number_75() {

        FizzBuzz fizzBuzz = new FizzBuzz();
        var result = fizzBuzz.playing(75);

        Assert.assertEquals("Fizz", result);
    }

    @Test
    public void should_return_FizzWhizz_when_playing_given_number_147() {

        FizzBuzz fizzBuzz = new FizzBuzz();
        var result = fizzBuzz.playing(147);

        Assert.assertEquals("FizzWhizz", result);
    }

    @Test
    public void should_return_FizzWhizz_when_playing_given_number_357() {

        FizzBuzz fizzBuzz = new FizzBuzz();
        var result = fizzBuzz.playing(357);

        Assert.assertEquals("FizzWhizz", result);
    }
}
