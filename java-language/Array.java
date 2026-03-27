
import java.util.Arrays;

public class Array{
    public static void main(String[] args) {
        System.out.println("***Array operations in java***");

        //1. Array creation
        // First way - declare an array and then add elements
        // Second way - delcare and initialyze. in a single shot
        int[] arrOdd = new int[3];
        arrOdd[0] = 1;
        arrOdd[1] = 3;
        arrOdd[2] = 5;
        System.out.println("Array creation two step process...");
        System.out.println(Arrays.toString(arrOdd));

        //second way
        String[] lang = {"java", "C++", "JS"};
        System.out.println("Array creation one shot process...");
        System.out.println(Arrays.toString(lang)); // print array

        //2. iteration through an array using traditional for loop
        System.out.print("Traditional for loop...");
        for(int i = 0; i < lang.length; i++){
            System.out.println(i);
        }
        //3.iteration through an array using enhnaced for loop
        System.out.println("Enhanced for loop...");
        for(String element: lang){
            System.out.println(element);
        }

        //4. Access an array element -> print elelment at index 0
        String elemAtIndex0 = lang[0];

        //5. length of an array
        int arrayLength = lang.length;

        //6. sort an array using sort() method
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        Arrays.sort(vowels);
        System.out.println("Sorted array...");
        for(char ch: vowels){
            System.out.print(ch + " "); 
        }

        //7. 2D array
        //first way to create 2D array
        int[][] nums = new int[2][3];
        nums[0][0] = 0; // row 0
        nums[0][1] = 1;
        nums[0][2] = 2;

        nums[1][0] = 7; // row 1
        nums[1][1] = 8;
        nums[1][2] = 9;

        System.out.println("2D array example...");
        // prints [[0, 1, 2], [7, 8, 9]]
        System.out.println(Arrays.deepToString(nums));

        //second way to create 2D array
        String[][] langs = {{"java", "js", "py"}, 
                            {"Spring", "Spring Boot 3", "Hibernate"}, 
                            {"JDBC", "JPA", "Spring Data JPA"}
                            };
        System.out.println("2D String array creation...");
        // prints [[java, js, py], [Spring, Spring Boot 3, Hibernate], [JDBC, JPA, Spring Data JPA]]
        System.out.println(Arrays.deepToString(langs));
        
        //8. equals() method to compare two arrays
        int odds[] = {1,2,3};
        int notEvens[] = {1,2,3};
        boolean result = Arrays.equals(odds, notEvens);
        System.out.println("equals() method output: " + result);
    }
}