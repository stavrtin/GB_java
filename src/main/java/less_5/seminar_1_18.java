package less_5;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class seminar_1_18 {
    public static void main(String[] args) {
        System.out.println("Map");
        Map<Character,Integer> map1 = new HashMap<>();
        String text = "asdadadsas eewf dsfsdfsd ";
        for (int i = 0; i < text.length(); i++){
            char curChar = text.charAt(i);
            map1.putIfAbsent(curChar, 0);
            map1.put(curChar, map1.get(curChar) +1 );


        }
        System.out.println(map1);
        for (var mapp: map1.entrySet()) {
            System.out.println(mapp.getKey() + " : "+  mapp.getValue());

        }
        Set<Integer> set1 = new HashSet<>();
        set1.add(5);

        set1.remove(65);
        set1.add(35);
        set1.add(375);
        System.out.println(set1.contains(55));
        System.out.println(set1);
        int[] defw = new int[] {1,2,3,2};

        System.out.println(task217_ContainsDuplicate(defw));

    }
    public static boolean task217_ContainsDuplicate(int[] nums){

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++){
            if (set.contains(nums[i])) return true;
            set.add(nums[i]);
        }
        return false;
    }

}
