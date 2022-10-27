package Less_2;

import static java.lang.Math.abs;
import static java.lang.Math.pow;

public class hw_2 {

    public static void main(String[] args) {
        System.out.println(myPow(2, -2));
        System.out.println(climbStairs(23));

    }

    //----------------------------------------task 50 ----------------------------------
    public static double myPow(double x, int n) {
        double res_pow = 1;
        if (n == 0) return 1;
        if (n == 1) return x;
        if (x == 0 || n == 1) return 1;
        if (n < 0) {
            return 1 / x * myPow(1 / x, -(n + 1));
        }
        double calc = myPow(x, n / 2);
        double res = calc * calc;
        if (n % 2 == 1) {
            res *= x;
        }
        return res;
    }


    //----------------------------------------task 70 ----------------------------------
    public static int climbStairs(int n) {
        int[] stack = new int[n + 1];
        stack[0] = 1;
        stack[1] = 1;

        helper (n, stack);
        return stack[n];

    }
    private static int helper(int n, int[] stack){
        if (stack[n] != 0){
            return stack[n];
        }
        stack[n] = helper(n - 1, stack) + helper(n - 2, stack);
        return stack[n];
    }
//----------------------- task 695 --------------------------------------------------------
    public static int maxAreaOfIsland(int[][] grid) {
        int island = 0;
        for (int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid[0].length; j++){
                if (grid[i][j] == 1) {
                    int countArea = calcArea(i, j, grid);
                    if (island < countArea){
                        island = countArea;
                    }
                }
            }
        }
        return island;
    }
    public static int calcArea(int i, int j, int[][] grid){
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length  || grid[i][j] == 0) return 0;
        grid[i][j] = 0;
        return 1 + calcArea(i - 1, j, grid) + calcArea(i, j - 1, grid) + calcArea(i + 1, j, grid) + calcArea(i, j + 1, grid);
    }


}

























