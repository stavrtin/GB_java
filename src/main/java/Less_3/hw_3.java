package Less_3;

import java.util.ArrayList;
import java.util.List;

public class hw_3 {
    private static char[] text;

    private static List<Integer> questionSingIndexGlobal;

    public static void main(String[] args) {
        System.out.println("asdasdasdasd");
        outputData("2?  + 3? = 69");
    }

    public static void outputData(String formula) {

        List<Integer> questionSingIndex = new ArrayList(); // ---- создаем пустой динамический массив индек вопросв ---
        char[] charArray = formula.replace(" ", "").toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == '+' || charArray[i] == '=') {
                charArray[i] = '_';
            }
            if (charArray[i] == '?') questionSingIndex.add(i);
        }
        text = charArray;
        questionSingIndexGlobal = questionSingIndex;

        genereteData(new int[questionSingIndex.size()], 0, 10);
    }

    private static void genereteData(int[] comb, int index, int k) {
        if (index == comb.length) {
            checkComb(comb);
            return;
        }
        
        for (int i = 0; i < k; i++){
            comb[index] = i;
            genereteData(comb, index + 1, k);
    }
}

    private static void checkComb(int[] comb) {
        for (int i = 0; i < comb.length; i++){
            text[questionSingIndexGlobal.get(i)] = Character.forDigit(comb[i], 10);
        }
        String[] numbers = String.valueOf(text).split("_");
        int a = Integer.parseInt(numbers[0]);
        int b = Integer.parseInt(numbers[1]);
        int c = Integer.parseInt(numbers[2]);

        if (a + b == c){
            System.out.printf("%d + %d = %d \n", a, b, c);
        }

    }


}

































