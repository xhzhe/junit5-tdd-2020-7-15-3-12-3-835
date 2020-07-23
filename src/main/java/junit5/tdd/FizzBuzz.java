package junit5.tdd;

import com.google.common.base.Strings;

public class FizzBuzz {
    public String play(int number) {
        String res = "";
        if (number % 3 == 0) {
            res += "Fizz";
        }
        if (number % 5 == 0) {
            res += "Buzz";
        }
        if(number % 7==0){
            res+="Whizz";
        }
        if (Strings.isNullOrEmpty(res)) {
            res = String.valueOf(number);
        }
        return res;
    }
}
