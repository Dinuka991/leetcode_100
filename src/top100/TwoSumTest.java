package top100;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class TwoSumTest {

    @Test
    public void testTwoSum(){
        TwoSum  twoSum = new TwoSum();

        int[] nums = {0,9,3,4,8};
        int target = 9;
        int[] expected = {0,1};

        assertArrayEquals(expected, twoSum.twoSum(nums, target));

    }

}
