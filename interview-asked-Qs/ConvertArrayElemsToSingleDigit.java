
import java.util.Arrays;
import java.util.HashMap;

/*
Convert all array elements to a single digit inplace
Return a single digit number that appears most
Input: [123, 2462, 789], output: 6 b/c [6, 5, 6] 2462 = 2+4+6+2 = 14 => 5, 789 = 7+8+9=24=>6
 */

class Solution{
    public int calculateSumOfDigitsInNum(int num){
        int sumOfDigits = -1;
        String intToString = Integer.toString(num);
        int strLength = intToString.length();

         while(strLength > 1){
            int sum = 0;
            String updatedIntToString;
            for(int i = 0; i < intToString.length(); i++){
               // int numAtI = Character.getNumericValue(intToString.charAt(i)); //OR
                int numAtI = intToString.charAt(i) - '0';
                sum += numAtI;
                sumOfDigits = sum;
            }
            updatedIntToString = Integer.toString(sum);
            intToString = updatedIntToString;
            strLength = updatedIntToString.length();
        }
        return sumOfDigits;
    }

    public int mostAppearedSingleDigit(int[] nums){
        int modeElem = 0;
       
        for(int i = 0; i < nums.length; i++){
            //1. convert nums[i] into string
            //2. Parse char into int and then add
            //3. if sum < 10, update array value, else add again until it is less than
            // built-in methods: convert to a String with Integer.toString(nums[i]) and 
            // convert from string to an int using Integer.parseInt(stringValue) 
            int sumOfdigitsInElem = calculateSumOfDigitsInNum(nums[i]);
            nums[i] = sumOfdigitsInElem;
        }
        System.out.println("Updated array is " + Arrays.toString(nums));

        //create a hashmap and save elements to it
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(hm.containsKey(nums[i])){
                //increment the value
                hm.replace(nums[i], hm.getOrDefault(nums[i], 0) + 1);
            }else{
                hm.put(nums[i], 1);
            }
        }
        int count = 0;
        modeElem = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            int elemCount = 0;
            elemCount = hm.get(nums[i]);
            if(elemCount > count){
                count = elemCount;
                modeElem = nums[i];
            }
        }
        
        
        return modeElem;
    }
}

public class ConvertArrayElemsToSingleDigit{
    public static void main(String[] args) {
        System.out.println("*** Convert all array elements to single digit ***");

        Solution sol = new Solution();

        //calculate sum of digits
        int sum1 = sol.calculateSumOfDigitsInNum(2462);
        System.out.println("Final Sum: " + sum1);

        //find the mod element
        int[] arrOne = {123, 2462, 789};
        int modeElem = sol.mostAppearedSingleDigit(arrOne);
        System.out.println("Mode elem: " + modeElem);

    }
}