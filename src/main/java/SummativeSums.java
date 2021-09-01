/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author me
 */
public class SummativeSums {
    public static int sum(int[] nums){
      int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    };
    public static void main(String[] args) {
        int[] a = {1, 90, -33, -55, 67, -16, 28, -55, 15};
        int[] b = {999, -60, -77, 14, 160, 301};
        int[] c = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130,
            140, 150, 160, 170, 180, 190, 200, -99};
        
        System.out.println("#1 Array sum " + sum(a));
        System.out.println("#2 Array sum " + sum(b));
        System.out.println("#3 Array sum " + sum(c));

    }

}
