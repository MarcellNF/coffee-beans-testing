package de.neuefische;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    void factorial_expectOneWhenFactorialNumberIsOne(){
        // GIVEN
        int number = 1;
        int expected = 1;

        // WHEN
        int actual = Main.factorial(number);

        // THEN
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void factorial_expectTwoWhenFactorialNumberIsTwo(){
        // GIVEN
        int number = 2;
        int expected = 2;

        // WHEN
        int actual = Main.factorial(number);

        // THEN
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void factorial_expectSixWhenFactorialNumberIsThree(){
        // GIVEN
        int number = 3;
        int expected = 6;

        // WHEN
        int actual = Main.factorial(number);

        // THEN
        Assertions.assertEquals(expected, actual);
    }

}
