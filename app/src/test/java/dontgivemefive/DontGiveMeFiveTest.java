package dontgivemefive;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DontGiveMeFiveTest {
    @Test
    public void givenARangeBetween1And4DontGiveMeFiveCountToBe4(){
       DontGiveMeFive neverGiveMeFive = new DontGiveMeFive();
       assertEquals(4, neverGiveMeFive.dontGiveMeFive(1,4));
    }
}

//(1,9)  8
