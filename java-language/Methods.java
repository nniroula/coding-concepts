
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ListOfList {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> listOflist = new ArrayList<>();
        //how to initialize this list
        /*
        List<List<Integer>> list = new ArrayList<>(
        Arrays.asList(new ArrayList<>(Arrays.asList(1, 2, 3)),
                        new ArrayList<>(Arrays.asList(4, 5, 6))
                    )
        );

        */


        Arrays.sort(nums); // Step 1: sort the array
        
        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicates for i
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            
            int left = i + 1;
            int right = nums.length - 1;
            
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                
                if (sum == 0) {
                    listOflist.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    
                    // Skip duplicates for left and right
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;
                    
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++; // Need a bigger sum
                } else {
                    right--; // Need a smaller sum
                }
            }
        }
        
        //return result;

        return listOflist;
    }


    //initilaize and return a  list of list
    public List<List<Integer>> initializeListOfList() {
        List<List<Integer>> listOfList = new ArrayList<>();
        // create two ArrayLists and pass them as arguments
        List<Integer> alOne = new ArrayList<>(Arrays.asList(2, 4, 6));
        ArrayList<Integer> alTwo = new ArrayList<>();
        alTwo.add(8);
        alTwo.add(10);

        listOfList.add(alOne);
        listOfList.add(alTwo);
        listOfList.add(Arrays.asList(0,0,0));

        return listOfList;
    }

}

public class Methods{
    public static void main(String[] args) {
        System.out.println("Methods in Java...");

        //ListOfList class
        ListOfList listOflist = new ListOfList();
        // Input: nums = [-1,0,1,2,-1,-4] and Output: [[-1,-1,2],[-1,0,1]]
       //List<List<Integer>> listOfnums = new ArrayList<>(Arrays.asList(-1,0,1,2,-1,-4), [2, 4,5]);

       // listOflist.threeSum(listOfnums);

       List<List<Integer>> listOne = listOflist.initializeListOfList();
       System.out.println("List of List initialize method... " + listOne);
    }

}