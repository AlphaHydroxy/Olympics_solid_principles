package com.example.user.olympics;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * Created by user on 27/06/2017.
 */

public class BoxerTest {

    Boxer Rocky;

    @Before
    public void before(){
        Rocky = new Boxer(10, 5);
    }

    @Test
    public void boxerCanPrepare(){
        assertEquals("Does a bit of shadow boxing!", Rocky.prepare());
    }

    @Test
    public void canCompete(){
        assertEquals("I'm gonna bash you!", Rocky.compete());
    }

    @Test
    public void canCalculatePoints(){
        assertEquals(15, Rocky.calculatePoints());
    }

    @Test
    public void awardMedal(){
        assertEquals("Gold", Rocky.awardMedal());
    }

}
