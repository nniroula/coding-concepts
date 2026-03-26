/*
final variable = to create a constant variable
final method = to create a constant method
                You cannot override final(constant) method
final class = To prevent inheritance - final class cannot be inherited
        final class is used to hold sensitive operations such as
        file access, encryption. Allowing inheritance would allow
        someone to override how methods behave.
        Can you instantiate a final class? -> YES
 */
final class Final{
    public void printLanguage(){
        System.err.println("JAVA");
    }
}

/* implements final method and final variable */
// class Parent extends Final{ shows syntax error - can't inherit final class
class Parent{
    public final void addTwoNumbers(int num1, int num2){
        int sum = num1 + num2;
        System.out.println("Sum of two nums: " + sum);
    }
  
    public void alterFinalVariable(){
        final String language = "JAVA";
        System.out.println(language);
        // language = "JavaScript"; // cannot reassign value to a final variable
    }
}

class Child extends Parent{
    //cannot ovveride the final method from parent class - shows syntax error
   /*
    public final void addTwoNumbers(int num1, int num2){
        int sum = num1 + num2;
        System.out.println("Sum of two nums: " + sum);
    }
    */

   @Override
   public void alterFinalVariable(){
    String framework = "Spring Boot 3";
    System.out.println(framework);
   }

}

public class FinalKeyWord{
    public static void main(String[] args){
        System.out.println("final key word in java...");

        //instantiate a final class
        Final finalObj = new Final();
        finalObj.printLanguage();

        //instantiate parent class
        Parent parent = new Parent();
        parent.addTwoNumbers(2, 3);
    }
}