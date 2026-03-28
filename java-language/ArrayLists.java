
import java.util.ArrayList;
import java.util.List;

//ArrayList takes Wrapper classes as data type
//Wrapper classes convert primitive data types into objects

class ArrayListImplementation{
    public void operations(){
        // ***** 1. create an arraylist *****
        ArrayList<String> al = new ArrayList<>();
        System.out.println("Array list creation...");
        System.out.println(al);

        // ***** 2. Add elements to an arraylist *****
        al.add("Java"); //add elem directly without index 
        al.add(1, "Python"); //use index to add elem

        // use another arraylist to add all elements
        ArrayList<Integer> alTwo = new ArrayList<>();
        alTwo.add(0, 10); // at index 0, add 10
        ArrayList<Integer> receivingAl = new ArrayList<>();
        alTwo.add(2);
        alTwo.add(4);
        alTwo.add(6);
        receivingAl.addAll(alTwo);

        System.out.println("Add elems from another array list...");
        System.out.println(receivingAl);

        // ***** 3. Get an element from an arraylist *****
        String elem = al.get(0); // 0 is an index. returns Java
        System.out.println("Element from the arraylist: " + elem);

        // ***** 4. Traverse through an arraylist *****
        //use forEach method - it takes lambda expression as an argument
        List<Double> alD = new ArrayList<>();
        alD.add(2.4);
        alD.add(3.9);
        alD.add(2.0);
        System.out.println("forEach loop output...");
        alD.forEach(item -> { // Must have this curly brace
            if(item % 2 == 0){
                System.out.println(item); // prints 2.0
            }
        });

        // ***** 5. Remove an element from an arraylist *****
        // remove() method removes an element by index
        double val = alD.remove(2);
        System.out.println("Removed item is " + val);

        // ***** 6. isEmpty() method checks if an arraylist is empty *****
        boolean empty = alD.isEmpty();
        System.out.println("isEmpty() method output: " + empty);

        // ***** 6. contains() method checks if an element is present in an arraylist *****
        boolean present = alD.contains(2.4); // returns true
        System.out.println("contains() method output: " + present);

        // ***** 7. removeIf() method removes based on condition *****
        // removeIf method takes lambda expression as an argument
        alD.removeIf(num -> num == 2.4); // removes 2.4
        System.out.println("After removeIf() method output: " + alD);

        // ***** 8. retainAll() method ***** 
        // removes commom elements from the first arraylist
        // and returns true if the first ArrayList is changed 
        List<Integer> alOne = new ArrayList<>();
        List<Integer> alAnother = new ArrayList<>();

        for(int i = 0; i < 3; i++){
            alOne.add(i);
        }

        for(int j = 0; j < 5; j++){
            alAnother.add(j);
            j++;
        }
        //resultAl =
        System.out.println("retainAll() method output: " +
        alOne.retainAll(alAnother));
        System.out.println(alOne);

    }
}

public class ArrayLists{
    public static void main(String[] args) {
       System.out.println("*** ArrayList ***");

       //ArrayListImplementation class
       ArrayListImplementation alImpl = new ArrayListImplementation();
       alImpl.operations();

    }
}