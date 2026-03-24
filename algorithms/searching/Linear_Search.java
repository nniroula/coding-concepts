public class Linear_Search {
    public static void main(String[]args){
        int [] arr = {2, 4, 6, 8, 10};
        int target = 6;

        //instantiate the Linear_Search_Implementation class
        Linear_Search_Implementation linearSearch = new Linear_Search_Implementation();
        int index = linearSearch.returnIndex(arr, target);
        if(index == -1){
            System.out.println("Target element not found in the array.");
        }else{
            System.out.println("Index of target element: " + index);
        }
    }
}

class Linear_Search_Implementation{
    //Time Complexity: O(n) in the worst case, O(1) in the best case when the target is found at the first index.
    public int returnIndex(int[] arr, int target){
        int resultantIndex = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                resultantIndex = i;
                return resultantIndex;  
            }
        }
        return resultantIndex;
    }
}
