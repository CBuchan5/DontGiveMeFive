package dontgivemefive;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DontGiveMeFiveTest {
    @Test
    public void givenARangeBetween1And4DontGiveMeFiveCountToBe4(){
       DontGiveMeFive neverGiveMeFive = new DontGiveMeFive();
       assertEquals(4, neverGiveMeFive.dontGiveMeFive(1,4));
    }
    @Test
    public void givenARangeBetween1And9DontGiveMeFiveCountToBe8(){
        DontGiveMeFive neverGiveMeFive = new DontGiveMeFive();
        assertEquals(8, neverGiveMeFive.dontGiveMeFive(1,9));
    }
    @Test
    public void givenARangeBetween4And17DontGiveMeFiveCountToBe12(){
        DontGiveMeFive neverGiveMeFive = new DontGiveMeFive();
        assertEquals(12, neverGiveMeFive.dontGiveMeFive(4,17));
    }
    @Test
    public void givenARangeBetweenNegative1AndNegative10DontGiveMeFiveCountToBe7(){
        DontGiveMeFive neverGiveMeFive = new DontGiveMeFive();
        assertEquals(9, neverGiveMeFive.dontGiveMeFive(-10,-1));
    }
    @Test
    public void givenARangeBetweenNegative1AndNegative20DontGiveMeFiveCountToBe17(){
        DontGiveMeFive neverGiveMeFive = new DontGiveMeFive();
        assertEquals(17, neverGiveMeFive.dontGiveMeFive(-20,-1));
    }
}


