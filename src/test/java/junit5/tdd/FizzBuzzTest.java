package junit5.tdd;

import javafx.scene.media.AudioClip;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
    @Test
    public void should_return_1_when_play_fizz_buzz_given_1() {
        //given
        int number = 1;
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String res = fizzBuzz.play(number);
        //then
        Assertions.assertEquals("1", res);
    }

    @Test
    public void should_return_Fizz_when_play_fizz_buzz_given_3() {
        //given
        int number = 3;
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String res = fizzBuzz.play(number);
        //then
        Assertions.assertEquals("Fizz", res);
    }

    @Test
    public void should_return_Buzz_when_play_fizz_buzz_given_5() {
        //given
        int number = 5;
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String res = fizzBuzz.play(number);
        //then
        Assertions.assertEquals("Buzz", res);
    }

    @Test
    public void should_return_Whizz_when_play_fizz_buzz_given_7() {
        //given
        int number = 7;
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String res = fizzBuzz.play(number);
        //then
        Assertions.assertEquals("Whizz", res);
    }

    @Test
    public void should_return_FizzBuzz_when_play_fizz_buzz_given_15() {
        //given
        int number = 15;
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String res = fizzBuzz.play(number);
        //then
        Assertions.assertEquals("FizzBuzz", res);
    }

    @Test
    public void should_return_FizzBuzzWhizz_when_play_fizz_buzz_given_105() {
        //given
        int number = 105;
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String res = fizzBuzz.play(number);
        //then
        Assertions.assertEquals("FizzBuzzWhizz", res);
    }

    @Test
    public void should_return_FizzWhizz_when_play_fizz_buzz_given_21() {
        //given
        int number = 21;
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String res = fizzBuzz.play(number);
        //then
        Assertions.assertEquals("FizzWhizz", res);
    }

    @Test
    public void should_return_BuzzWhizz_when_play_fizz_buzz_given_35() {
        //given
        int number = 35;
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String res = fizzBuzz.play(number);
        //then
        Assertions.assertEquals("BuzzWhizz", res);
    }
}
