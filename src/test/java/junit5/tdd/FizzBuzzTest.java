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
    public void should_return_fizz_when_play_fizz_buzz_given_3() {
        //given
        int number = 3;
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String res = fizzBuzz.play(number);
        //then
        Assertions.assertEquals("fizz", res);
    }
}
