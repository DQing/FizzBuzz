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
    public void should_return_Buzz_when_play_given_number_5() {

        FizzBuzz fizzBuzz = new FizzBuzz();
        var result = fizzBuzz.play(5);

        Assert.assertEquals("Buzz", result);
    }

    @Test
    public void should_return_Fizz_when_play_given_number_6() {

        FizzBuzz fizzBuzz = new FizzBuzz();
        var result = fizzBuzz.play(6);

        Assert.assertEquals("Fizz", result);
    }

    @Test
    public void should_return_Whizz_when_play_given_number_7() {

        FizzBuzz fizzBuzz = new FizzBuzz();
        var result = fizzBuzz.play(7);

        Assert.assertEquals("Whizz", result);
    }

    @Test
    public void should_return_Fizz_when_play_given_number_13() {

        FizzBuzz fizzBuzz = new FizzBuzz();
        var result = fizzBuzz.play(13);

        Assert.assertEquals("Fizz", result);
    }

    @Test
    public void should_return_Buzz_when_play_given_number_15() {

        FizzBuzz fizzBuzz = new FizzBuzz();
        var result = fizzBuzz.play(15);

        Assert.assertEquals("Buzz", result);
    }

    @Test
    public void should_return_17_when_play_given_number_17() {

        FizzBuzz fizzBuzz = new FizzBuzz();
        var result = fizzBuzz.play(17);

        Assert.assertEquals("17", result);
    }

    @Test
    public void should_return_FizzWhizz_when_play_given_number_21() {

        FizzBuzz fizzBuzz = new FizzBuzz();
        var result = fizzBuzz.play(21);

        Assert.assertEquals("FizzWhizz", result);
    }

    @Test
    public void should_return_Fizz_when_play_given_number_30() {

        FizzBuzz fizzBuzz = new FizzBuzz();
        var result = fizzBuzz.play(30);

        Assert.assertEquals("Fizz", result);
    }

    @Test
    public void should_return_BuzzWhizz_when_play_given_number_35() {

        FizzBuzz fizzBuzz = new FizzBuzz();
        var result = fizzBuzz.play(35);

        Assert.assertEquals("BuzzWhizz", result);
    }

    @Test
    public void should_return_Whizz_when_play_given_number_56() {

        FizzBuzz fizzBuzz = new FizzBuzz();
        var result = fizzBuzz.play(56);

        Assert.assertEquals("Whizz", result);
    }

    @Test
    public void should_return_FizzBuzz_when_play_given_number_60() {

        FizzBuzz fizzBuzz = new FizzBuzz();
        var result = fizzBuzz.play(60);

        Assert.assertEquals("FizzBuzz", result);
    }

    @Test
    public void should_return_Whizz_when_play_given_number_70() {

        FizzBuzz fizzBuzz = new FizzBuzz();
        var result = fizzBuzz.play(70);

        Assert.assertEquals("Whizz", result);
    }

    @Test
    public void should_return_Fizz_when_play_given_number_75() {

        FizzBuzz fizzBuzz = new FizzBuzz();
        var result = fizzBuzz.play(75);

        Assert.assertEquals("Fizz", result);
    }
}
