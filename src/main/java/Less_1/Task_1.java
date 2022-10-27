package Less_1;

//---------------------tasl 27--------------------------
class Solution27 {
    public int removeElement(int[] nums, int val) {

        int copyIndex = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != val){
                nums[copyIndex] = nums[i];
                copyIndex++;
            }
        }
        return  copyIndex;
    }

}

//---------------------tasl 88--------------------------

class Solution88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        m--;
        n--;
        int writeIndex = nums1.length - 1;
        while (n >= 0 ){
            if (m >= 0){
                if (nums1[m] > nums2[n]){
                    nums1[writeIndex] = nums1[m];
                    m--;
                } else {
                    nums1[writeIndex] = nums2[n];
                    n--;
                }
                writeIndex--;
            } else{
                nums1[writeIndex--] = nums2[n];
                n--;
            }

        }



    }
}
//---------------------tasl 151--------------------------
class Solution151 {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int end = s.length() - 1;
        while (end >= 0){
            if (s.charAt(end) == ' '){
                end--;
                continue;
            }
            int start = end - 1;
            while (start >= 0 && s.charAt(start) != ' '){
                start--;
            }
            sb.append(" ");
            sb.append(s.substring(start + 1, end + 1));
            end = start - 1;
        }
        if (sb.length() > 0 ){
            sb.deleteCharAt(0);
        }
        return sb.toString();
    }
}
//---------------------tasl 125--------------------------
class Solution125 {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1 ;

        s = s.toLowerCase();
        while (left < right) {

            while (left < right && !Character.isLetterOrDigit(s.charAt(left))){
                left += 1;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))){
                right -= 1;
            }

            char left_char = s.charAt(left);
            char right_char = s.charAt(right);

            if (left_char != right_char){
                return false;

            }
            left += 1;
            right -= 1;
        }
        return true;
    }
}


