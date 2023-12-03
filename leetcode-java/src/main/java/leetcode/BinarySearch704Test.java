package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearch704Test {
    private BinarySearch704 binarySearch704 = new BinarySearch704();

    @Test
    void t1() {
        var nums = new int[] {-1,0,3,5,9,12};
        var target = 9;

        var result = binarySearch704.search(nums, target);

        assertEquals(4, result);

    }

    @Test
    void t2() {
        var nums = new int[] {-1,0,3,5,9,12};
        var target = 0;

        var result = binarySearch704.search(nums, target);

        assertEquals(1, result);

    }
    @Test
    void t3() {
        var nums = new int[] {-1,0,3,5,9,12};
        var target = 2;

        var result = binarySearch704.search(nums, target);

        assertEquals(-1, result);

    }

    @Test
    void t4() {
        var nums = new int[] {5};
        var target = 5;

        var result = binarySearch704.search(nums, target);

        assertEquals(0, result);

    }

    @Test
    void t5() {
        var nums = new int[] {2, 5};
        var target = 5;

        var result = binarySearch704.search(nums, target);

        assertEquals(1, result);

    }
}
