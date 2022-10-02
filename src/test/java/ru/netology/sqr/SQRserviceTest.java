package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRserviceTest {
    @Test
    public void shouldCalculateValid() {
        SQRservice service = new SQRservice();

        int actual = service.calculate(300, 400);
        int expected = 3;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldCalculateBoundariesUnder() {
        SQRservice service = new SQRservice();

        int actual = service.calculate(99, 200);
        int expected = 5;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldCalculateBoundariesOver() {
        SQRservice service = new SQRservice();

        int actual = service.calculate(9604, 9802);
        int expected = 2;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldCalculateInvalid() {
        SQRservice service = new SQRservice();

        int actual = service.calculate(0, 99);
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }


}