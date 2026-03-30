import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class LinkedListImplementation{
    public void linkedListOperation(){
        //1.1 create a linkedlist and add an element
        List<String> llStr = new LinkedList<>();
        llStr.add("Java");
        //1.2 create another linkedList and add all elements from it to the first likedList
        List<String> llTwo = new LinkedList<>();
        llTwo.add("C#");
        llTwo.add("Python");
        llTwo.add("JS");
        llStr.addAll(llTwo);

        //2.0 Access an element from the linkedlist
        String indexZeroElem = llStr.get(0); // retrieve elem at index 0
        System.out.println("Elem at index 0 is " + indexZeroElem);

        // 2.1 Access the linkedList and print all elements using for loop
        System.out.println("LinkedList elements using for loop...");
        
        // 3. size of a linkedList
        for(int i = 0; i < llStr.size(); i++){
            System.out.print(" " + llStr.get(i));
        }
        System.out.println();

        //2.2 Access the linkedList and print all elements using forEach loop
        // forEach() takes lambda expression as an argument
        System.out.println("LinkedList elems using forEach()...");
        llStr.forEach(elem -> {System.out.print(" " + elem);} );
        System.out.println();

        //2.3 access the linkedList and print all elements using an iterator
        Iterator<String> itr = llStr.iterator();
        System.out.println("LinkedList elems using Iterator class and iterator method...");
        while(itr.hasNext()){
            System.out.print(" " + itr.next());
        }
        System.out.println();

        //4. Check if a linkedList is empty
        System.out.println("isEmpty() method checks if a linkedlist is empty..." + llStr.isEmpty());

        //5. Insert element at the middle - using indices
        LinkedList<Integer> listOne = new LinkedList<>();
        listOne.add(10);
        listOne.addFirst(5);
        listOne.add(1, 30);
        System.out.println("Insert method " + listOne); // prints [5, 10, 30]
        
        //6. Remove an element from the middle - use index
        //remove() method removes all elems - so, use remove(index)
        listOne.remove(1); //deletes 30
        System.out.println("LinkedList after remove(index)..." + listOne);
       
        listOne.removeAll(listOne);
        System.out.println("Size of LinkedList after removeAll()..." + listOne.size());

        //7. Check if a LinkedList contains an element

        

    }


    //5. Insert element at the middle - using indices
    //6. Remove an element from the middle - use index
    //7. Check if a LinkedList contains an element
    //8. Update an element - use set() with an index
    //9. Add an element to the beginning - use addFirst()
    //10. Add an element to the end - use addLast()



}

public class LinkedLists{
    public static void main(String[] args) {
        System.out.println("******* LinkedList in Java ******");

        //instantiate a class
        LinkedListImplementation llImpl = new LinkedListImplementation();
        llImpl.linkedListOperation();


    }
}