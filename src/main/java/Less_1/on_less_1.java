package Less_1;

import java.lang.reflect.Array;

public class on_less_1 {
    public static void main(String[] args) {
        int res_1 = prod(234);
//        System.out.println(res_1);
//        System.out.println(leed_code_1768("1234", "klmnopr"));
        System.out.println(leed_code_283(new int[]{0, 1, 0, 3, 65}));

    }

    public static int prod(int n) {
        //int n = 256;
        int res_mul = 1;
        int res_sum = 0;

        while (n > 0) {
            res_mul *= (n % 10);
            res_sum += (n % 10);
            n /= 10;
        }
        return res_mul - res_sum;

    }

    public static int[] leed_code_1480(int nums[]) {
        int[] ans = new int[nums.length];
        ans[0] = nums[0];
        for (int i = 1; i < nums.length; i++){
            ans[i] = ans[i - 1] + nums[i];

        }
        return ans;
    }

    public static String leed_code_1768(String word1, String word2) {
        StringBuilder w3 = new StringBuilder(); //word1 + word2;
        String word3 = "";
        if (word1.length() <= word2.length()){
            for (int i = 0; i < word1.length(); i++) {
                w3.append(word1.charAt(i));
                w3.append(word2.charAt(i));
            }

            word3 = w3.toString() + word2.substring(word1.length(), word2.length());

        } else {
                for (int i = 0; i < word2.length(); i++) {
                    w3.append(word1.charAt(i));
                    w3.append(word2.charAt(i));
                }

                word3 = w3.toString() + word1.substring(word2.length(), word1.length());
        }
        return word3;
    }

    public static int leed_code_283(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0){
                nums[count] = nums[i];
                count ++;

            }
        }
        while (count < nums.length){
            nums[count] = 0;
            count++;
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        return nums.length;
    }



}

