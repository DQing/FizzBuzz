public class FizzBuzz {
    public String play(int num) {
        var numString = String.valueOf(num);
        boolean isContain3 = numString.contains("3");
        boolean isContain5 = numString.contains("5");
        var result = "";
        if (!isContain5 && num % 3 == 0) {
            result += "Fizz";
        }
        if (num % 5 == 0) {
            result += "Buzz";
        }
        if (num % 7 == 0) {
            result += "Whizz";
        }
        if (isContain3) {
            return "Fizz";
        }

        return result.equals("") ? numString : result;
    }
}
