package less_5;

import java.util.*;

public class hw_5_task_219_13_350 {

    public static void main(String[] args) {

        int[] defw = new int[] {1,2,3,1,2,3};
        int k = 2;
        System.out.println(task219_containsNearbyDuplicate(defw, k));
        int[] defw1 = new int[]{4,9,5};
        int[] defw2 = new int[] {9,4,9,8,4};
        System.out.println(task_350_intersection(defw1, defw2));

        String data = "VII";
        System.out.println(task_19_romanToInt(data));


    }

    public static boolean task219_containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++){

            list.add(nums[i]);
            if (set.contains(nums[i])){
                for (int j = 0; j <list.size() - 1; j++){
                    //-- надем индекс элемента, который равен текущему элементу ---
                    if (list.get(j) == nums[i] && i - j <= k) return true;
                }
            }
            set.add(nums[i]);
        }
        System.out.println(list);
        System.out.println(list.get(2));
        return false;
    }

    public static int[] task_350_intersection(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return task_350_intersection(nums2, nums1);
        }

        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int num: nums1   ) {
            if (map.containsKey(num)) count++;
            map.putIfAbsent(num, 0);
            map.put(num, map.get(num) + 1);

        }

        List<Integer> interList = new ArrayList<>();
        for (int num: nums2   ){
            if (map.containsKey(num) && map.get(num) > 0 ) {

                interList.add(num);
                map.put(num, map.get(num) - 1);
            }
        }
        //------- перевод массива ArrayList в простой массив фиксированной длины ----
        int[] interResult = new int[interList.size()];
        for (int i = 0; i < interResult.length; i++) {
            interResult[i] = interList.get(i);
            System.out.println(map);
        }

        return interResult;
    }

    public static int task_19_romanToInt(String s) {
        int result = 0;
        Map<Character,Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

       for (int i = 0; i < s.length() - 1 ; i++){
           if (map.get(s.charAt(i)) >= map.get(s.charAt(i + 1))){
               result += map.get(s.charAt(i));
           } else {
               result -= map.get(s.charAt(i));
           }
        }
        result += map.get(s.charAt(s.length() - 1));


        return result;
    }


}



