/*
Given an array of integers, find how many elements have odd number of zeros
 */

class Solution{
    public int findElementsWithOddNumOfZeros(int[] arr){
        int totalNumsWithOddZeros = 0;
        //1. convert each arr element into a string
        for(int num: arr){
            String stringNum = Integer.toString(num);
            //2. count zeros in each string
            int countZero = 0;
            for(int j = 1; j < stringNum.length(); j++){
                if(stringNum.charAt(j) == '0'){ // use '0' b/c it's char
                    countZero++;
                }
            }
            if(countZero % 2 == 1){
                totalNumsWithOddZeros++;
            }
        } 
        return totalNumsWithOddZeros;
    }
}

public class NumsWithOddZeros{
    public static void main(String[] args) {
        System.out.println("**** ODD ZEROS ****");
        Solution sol = new Solution();
        int[] arrOne = {10, 4, 100, 20070};
        int resultOne = sol.findElementsWithOddNumOfZeros(arrOne);
        System.out.println("result 1: " + resultOne);

        // Empty array => returns 0
        System.out.println(sol.findElementsWithOddNumOfZeros(new int[]{}));

        // even zeros in element => returns 0
        System.out.println(sol.findElementsWithOddNumOfZeros(new int[]{100, 10000, 200, 1010}));
    }
}