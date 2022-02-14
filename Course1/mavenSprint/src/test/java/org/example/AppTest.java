package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class AppTest
{
    Calculator test =new Calculator();
    fibonacci fibo= new fibonacci();
    @Test
    public void Addresult()
    {
        assertEquals(test.add(10,20), 30 );
        assertNotEquals(test.add(10,20),0);
    }
    @Test
    public void Subresult()
    {
        assertEquals(test.sub(10,20), -10 );
        assertNotEquals(test.sub(10,20),0);
    }
    @Test
    public void mulresult()
    {
        assertEquals(test.multiply(10,20), 200 );
        assertNotEquals(test.multiply(10,20),0);
    }
    @Test
    public void divresult()
    {
        assertEquals(test.divide(10,20), 2 );
        assertNotEquals(test.divide(10,20),0);
    }
    @Test
    public void Fibonacci(){
        assertNotEquals(fibo.fibo(2,3),0);
    }
}