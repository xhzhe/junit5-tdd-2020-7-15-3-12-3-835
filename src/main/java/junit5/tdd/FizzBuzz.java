package junit5.tdd;

import com.google.common.base.Strings;

public class FizzBuzz {
    public String play(int number) {
        String res = "";
        if (number % 3 == 0) {
            res += "fizz";
        }
        if (number % 5 == 0) {
            res += "buzz";
        }
        if (Strings.isNullOrEmpty(res)) {
            res = String.valueOf(number);
        }
        return res;
    }
}
