package com.example.user.olympics;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by user on 27/06/2017.
 */
import static org.junit.Assert.assertEquals;

public class GymnastTest {

    Gymnast Jia;
    Gymnast Colin;
    Gymnast Stuart;
    Gymnast Kieran;

    @Before
    public void before(){
         Jia = new Gymnast(10, 5);
         Colin = new Gymnast(3, 3);
         Stuart = new Gymnast(3, 3);
         Kieran = new Gymnast(0, 0);

    }

    @Test
    public void gymnastCanPrepare(){
        assertEquals("Gymnast stretches", Jia.prepare());
    }

    @Test
    public void canCompete(){
        assertEquals("Gymnast is competing in the under 10s", Colin.compete());
    }

    @Test
    public void canCalculatePoints(){
        assertEquals(6, Stuart.calculatePoints());
    }

    @Test
    public void awardMedal(){
        assertEquals("Gold", Jia.awardMedal());
    }

}
