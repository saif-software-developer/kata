package kata.kata02;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KataChopTest {

    @Test
    public void shouldFindTheElementIndexAsExpected(){

        Kata02 kata02 = new BinarySearch_V1();

        assertEquals(-1, kata02.chop(3, new int[]{}));
        assertEquals(-1, kata02.chop(3, new int[]{1}));
        assertEquals(0,  kata02.chop(1, new int[]{1}));
        assertEquals(0,  kata02.chop(1, new int[]{1, 3, 5}));
        assertEquals(1,  kata02.chop(3, new int[]{1, 3, 5}));
        assertEquals(2,  kata02.chop(5, new int[]{1, 3, 5}));
        assertEquals(-1, kata02.chop(0, new int[]{1, 3, 5}));
        assertEquals(-1, kata02.chop(2, new int[]{1, 3, 5}));
        assertEquals(-1, kata02.chop(4, new int[]{1, 3, 5}));
        assertEquals(-1, kata02.chop(6, new int[]{1, 3, 5}));
        assertEquals(0,  kata02.chop(1, new int[]{1, 3, 5, 7}));
        assertEquals(1,  kata02.chop(3, new int[]{1, 3, 5, 7}));
        assertEquals(2,  kata02.chop(5, new int[]{1, 3, 5, 7}));
        assertEquals(3,  kata02.chop(7, new int[]{1, 3, 5, 7}));
        assertEquals(-1, kata02.chop(0, new int[]{1, 3, 5, 7}));
        assertEquals(-1, kata02.chop(2, new int[]{1, 3, 5, 7}));
        assertEquals(-1, kata02.chop(4, new int[]{1, 3, 5, 7}));
        assertEquals(-1, kata02.chop(6, new int[]{1, 3, 5, 7}));
        assertEquals(-1, kata02.chop(8, new int[]{1, 3, 5, 7}));

    }
}
