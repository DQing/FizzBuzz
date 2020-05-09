public class FizzBuzz {
    public String playing(int num) {
        var numString = String.valueOf(num);
        boolean isContain3 = numString.contains("3");
        boolean isContain5 = numString.contains("5");
        boolean isContain7 = numString.contains("7");
        var result = "";
        if ((isContain7 || !isContain5) && num % 3 == 0) {
            result += "Fizz";
        }
        if (!isContain7 && num % 5 == 0) {
            result += "Buzz";
        }
        if (num % 7 == 0) {
            result += "Whizz";
        }
        if (!isContain5 && isContain3) {
            return "Fizz";
        }

        return result.equals("") ? numString : result;
    }
}
