public class FizzBuzz {
    public String playing(int number) {
        String stringNum = String.valueOf(number);
        boolean isContains5 = stringNum.contains("5");

        if (!isContains5 && stringNum.contains("3")) {
            return "Fizz";
        }
        String result = "";
        if (!isContains5 && number % 3 == 0) {
            result += "Fizz";
        }
        if (number % 5 == 0) {
            result += "Buzz";
        }
        if (number % 7 == 0) {
            result += "Whizz";
        }
        return result.isEmpty() ? stringNum : result;
    }
}
