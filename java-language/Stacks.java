import java.util.Stack;

class StackImplementation{
    public void stackOperations(){
        //1. create a stack
        Stack<Integer> stack = new Stack<>();

        //2. add elements with push()
        stack.push(2);
        stack.push(4);
        stack.push(6);

        //3. remove elements with pop()
        stack.pop();
        System.out.println("Stack after pop(): " + stack);

        //4. check the stack top element with peek()
        int stackTopElem = stack.peek();
        System.out.println("Stack top elem with pop(): " + stackTopElem);
        System.out.println("Current stack: " + stack);


    }
}

//leetcode  input: "(])"
class Solution {
    public boolean isValid(String s) {
        boolean isValidParenthesis = false;
        // create a stack to hold parentheses
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(stack.isEmpty() && s.charAt(i) == ')' 
                || stack.isEmpty() && s.charAt(i) == '}' 
                || stack.isEmpty() && s.charAt(i) == ']'){
                    return false;
            }
           // System.out.println("CHAR VAL: " + s.charAt(i));
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                stack.push(s.charAt(i));
            }else {
            //check the top element and pop out if next char is its closing parenthesis
                char stackTopElem = stack.peek();
                if(stackTopElem == '(' && s.charAt(i) == ')' 
                    || stackTopElem == '{' && s.charAt(i) == '}' 
                    || stackTopElem == '[' && s.charAt(i) == ']'){
                    stack.pop();
                }else{
                    return false;
                }
            }
        }
        if(stack.isEmpty()){
            isValidParenthesis = true;
        }
        //System.out.println("Current stack in parenthesese: " + stack);
        
        return isValidParenthesis;
    }
}


public class Stacks{
    public static void main(String[] args) {
        System.out.println("****** Stack in java...");

        //instantiate the class
        StackImplementation stackObj = new StackImplementation();
        stackObj.stackOperations();

        // instantiate a Solution class
        Solution solObj = new Solution();
        String inputOne = "()";
        String inputTwo = "()[]{}";
        String inputThree = "([])";
        String inputFour = "(]";
        String inputFive = "]";
        String inputSix = "(])";

        // boolean resultOne = solObj.isValid(inputOne);
        // System.out.println(resultOne);
        // boolean resultTwo = solObj.isValid(inputTwo);
        // System.out.println(resultTwo);
        // boolean resultThree = solObj.isValid(inputThree);
        // System.out.println(resultThree);
        // boolean resultFour = solObj.isValid(inputFour);
        // System.out.println(resultFour);

        //Make sure this works
        //  String inputFive = "]";
        boolean resultFive = solObj.isValid(inputFive);
        System.out.println("Result 5: " + resultFive);

        // Make sure it works for this "(])"
        boolean resultSix = solObj.isValid(inputSix);
        System.out.println("Result 6: " + resultSix);

    }
}