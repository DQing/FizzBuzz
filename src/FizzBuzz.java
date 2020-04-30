public class FizzBuzz {
    public String play(int num) {
        var numString = String.valueOf(num);
        if (num % 5 == 0) {
            return "Buzz";
        }
        if (num == 7) {
            return "Whizz";
        }
        if (numString.contains("3") || num % 3 == 0) {
            return "Fizz";
        }
        return String.valueOf(num);
    }
}
