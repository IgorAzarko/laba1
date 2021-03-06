package tests;


import demo.parallel.Complex;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.testng.annotations.AfterTest;

public class Tests {

    @Test
    public void sub() {
        Complex complex1 = new Complex(15, 20);
        Complex complex2 = new Complex(5, 10);
        Complex complex3 = new Complex(10, 10);
        Assertions.assertEquals(complex1.sub(complex2), complex3);
    }

    @Test
    public void plus() {
        Complex complex1 = new Complex(15, 20);
        Complex complex2 = new Complex(5, 10);
        Complex complex3 = new Complex(20, 30);
        Assertions.assertEquals(complex1.plus(complex2), complex3);
    }

    @Test
    public void cos() {
        Complex complex1 = new Complex(12, 9);
        Complex complex2 = new Complex(3419, 0);
        Assertions.assertEquals(Math.round(complex1.cos().getRe()), complex2.getRe());
        Assertions.assertEquals(Math.round(complex1.cos().getIm()), complex2.getIm());
    }
}
