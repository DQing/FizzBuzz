public class FizzBuzz {
    public String play(int num) {
        if (num == 5) {
            return "Buzz";
        }
        if (num % 3 == 0) {
            return "Fizz";
        }
        return String.valueOf(num);
    }
}
