package com.vihar;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        List<String> fruits = Arrays.asList("a", "m", "b", "o", "g", "p", "r", "h");
        fruits.forEach(System.out::print);
        System.out.println();
        fruits.stream().parallel().forEach(System.out::print);
        System.out.println();
        fruits.stream().parallel().forEachOrdered(System.out::print);
        assertTrue( true );
    }
}
