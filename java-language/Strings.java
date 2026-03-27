
import java.util.Arrays;
import java.util.List;
import javax.print.CancelablePrintJob;

//Common String methods and concepts in Java
class JavaString{
    public void createString(){
        String language = "JAVA"; // String literal
        System.out.println(language);

        String newLanguage = new String("Java"); // String object/constructor call
        System.out.println(newLanguage);
    }

    public void stringBuiltInMethods(){
        //1. length()
        String str1 = "Java Programming";
        int str1Length = str1.length();
        System.out.println("length is " + str1Length);

        //2. isEmpty() - checks if a string is empty and returns boolean value
        boolean emptyString = str1.isEmpty();
        System.out.println("String is empry or not: " + emptyString);

        //3. split() - to split string based on regular expression
        // returns an array of string
        String myLang = "Java Programming";
        String[] splittedStrArr = myLang.split(" ");
        System.out.println("split() method output...");
        System.out.println(splittedStrArr); // prints [Ljava.lang.String;@58644d46
        for(String element: splittedStrArr){ // to print elements in an array
            System.out.println(element);
        }

        // Arrays.toString(array) helps to print an array to the console
        // example 1
       System.out.println(Arrays.toString(splittedStrArr));

       //example 2
       String[] strs2 = {"java", "c++", "c#"};
       System.out.println("Array of Strings display...");
       System.out.println(Arrays.toString(strs2));

       //4. join() method - helps to join multiple strings or iterables into
       // a single string. Uses delimeter(separator) to do the joining
       //example 1
       String firstStr = "Java";
       String secondStr = "C#";
       String thirdStr = "Python";
       // joint them with a separator(delimeter) comma.
       String concatenatedStr = String.join(", ", firstStr, secondStr, thirdStr);
       System.out.println("join() mehtod combines multiple strings into one...");
       System.out.println(concatenatedStr);

       // example 2 of join method using a list
       List<String> list = Arrays.asList("Spring 6", "Spring Boot 3", "ReactJS");
       //join them together using - as a separator
        String concatenatedStr2 = String.join(" - ", list);
        System.out.println(concatenatedStr2);

        //example 3 of join(). Join strings without any separator
        String one = "j";
        String two = "a";
        String three = "v";
        String four = "a";
        //combine them without a separator
        String singleStr = String.join("", one, two, three, four);
        System.out.println(singleStr);

        //5. toUppperCase() method
        String name = "nabin";
        String inCapitalLetters = name.toUpperCase();
        System.out.println("In upper case: " + inCapitalLetters);

        //6. toLowerCase() method
        String job = "SWE II";
        String inSmallLetters = job.toLowerCase();
        System.out.println("In lower case letters: " + inSmallLetters);
    
        //7. comapare strings with equals() method
        String code1 = "javaScript";
        String code2 = "JavaScript";
        //should return false when compared
        boolean resultOne = code1.equals(code2);
        System.out.println("equals() method output:" + resultOne);

        //8. compare string with equalsIgonreCase() method
        //should return true
        boolean resultTwo = code1.equalsIgnoreCase(code2);
        System.out.println("equalsIgnoreCase() output: " + resultTwo);

        //9. == checks if two strings are stored in the same memory location - that is reference check
        String langOne = "java";
        String langTwo = "java";
        // should return true with ==
        boolean resultThree = langOne == langTwo;
        System.out.println("== checks if two strings are stored in same location: " + resultThree);

        //9. replace(oldVal, newVal) method - to replace characters or substrings
        String wrongSpelling = "Yava";
        String correctedSpelling = wrongSpelling.replace("Y", "J");
        System.out.println("repalce() method output: " + correctedSpelling);

        //10 replaceAll(regex, chars) method to replace all occurences of some characters
        String encodedText = "Sp123ri###n@g";
        // remove all non-text/non-characters from the string
        // use negated characters = [^a-zA-Z] means not a-z and not A-Z
        String newStr = encodedText.replaceAll("[^a-zA-Z]", "");
        System.out.println("repalceAll() method output: " + newStr);

        //11. conatains()method - string1.contains(string2)
        String frameWork = "Spring Boot 3";
        boolean resultFour = frameWork.contains("3"); // true
        System.out.println("contains() method output: " + resultFour);




    }

}


public class Strings{
    public static void main(String[] args) {
        System.out.println("Strings in Java...");

        //JavaString class
        JavaString javaObj = new JavaString();
        javaObj.createString();

        //stringBuiltInMethods
        javaObj.stringBuiltInMethods();

    }
}