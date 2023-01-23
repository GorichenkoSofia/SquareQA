package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    public void calcTestWithFewMatches(){
        SQRService service = new SQRService();
        int actual = service.calc(200, 300);
        int expected = 3;

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void calcTestOne(){
        SQRService service = new SQRService();
        int actual = service.calc(0, 100);
        int expected = 1;

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void calcTestNegative(){
        SQRService service = new SQRService();
        int actual = service.calc(-10, 50);
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void calcTestPositive(){
        SQRService service = new SQRService();
        int actual = service.calc(100, 250);
        int expected = 6;

        Assertions.assertEquals(expected, actual);

    }
}