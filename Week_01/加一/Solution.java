import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class Solution {

    public static void main(String[] args) {

        int[] ints = new Solution().plusOne(new int[]{9,9,9});
        System.out.println(Arrays.toString(ints));
    }

    public int[] plusOne(int[] digits) {
        if (digits == null || digits.length <1) {
            return digits;
        }
        int carry = 1;
        for (int i = digits.length -1 ; i >=0 ; i--) {
            int digit = digits[i];
            digits[i] = (digit +carry) % 10;
            carry = (digit +carry) / 10;
            if( carry == 0){
                return digits;
            }
        }
        if (carry == 1) {
            int[] result = new int[digits.length +1];
            result[0] = carry;
            for (int i = 1; i < result.length; i++) {
                result[i] = digits[i-1];
            }
            return result;
        }
        return digits;
    }
}
