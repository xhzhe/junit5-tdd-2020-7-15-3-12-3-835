package junit5.tdd;

import javafx.scene.media.AudioClip;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
    @Test
    public void should_return_1_when_play_fizz_buzz_given_1() {
        //given
        int number = 1;
        //when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String res = fizzBuzz.play();
        //then
        Assertions.assertEquals("1", res);
    }
}
