
import java.util.Arrays;
//implements array operations without generics and then using generics
// Implements generics at method level

class ArrayImplementation{
    //1. Function to add an element to an array
    public void addElement(int[] arr, int elem, int index){
        arr[index] = elem;
    }

    //2. remove/Delete an element from an array
    public int[] removeElemAtIndex(int[] arr, int index){
        //shift all elements to the left [2, 4, 6]
        for(int i = index; i < arr.length; i++){
            if(i == arr.length - 1){
                arr[i] = 0;
            }else{
                arr[i] = arr[i + 1];
            }
        }
        return arr;
    }

    //3. update method
    public double[] updateElem(double[] arr, int index, double newValue){
        arr[index] = newValue;
        return arr;
    }

    //4. Delete an element
    public String[] deleteElem(String[] arr, int index){
        // delete at index and shift elems to its right to left by 1. Last gets default value
        for(int i = index; i < arr.length; i++){
            if(i == arr.length - 1){
                arr[i] = null;
            }else{
                arr[i] = arr[i + 1];
            }
        }
        return arr;
    }
}

//methods using generics
class ArrayOpsUsingGenerics{
    // add element method
    // It is a single method but works with data types of String, int, double etc
    // method level generics syntax: public <T, W> returnType name(params)
    
    //1. add elements
    public <T> T[] genericsAddElem(T[] arr, int index, T value){
        arr[index] = value;
        return arr;
    }

}


public class ArraysOperation{
    public static void main(String[] args){
        //Instantiate a class
        ArrayImplementation arrayImplObj = new ArrayImplementation();

        //1. add elements to an array
        int[] arrOne = new int[3];
        arrayImplObj.addElement(arrOne, 3, 0);
        System.out.println("Add elem method at a given index...");
        System.out.println(Arrays.toString(arrOne));
        arrayImplObj.addElement(arrOne, 4, 1);

        //2. Remove elem at a given index - shifts all elems after that index to the left
        // [2, 4, 6], index = 0, output = [4, 6, 0]
        int[] arrTwo = {2, 4, 6};
        int index = 0;
        int[] resultArrTwo = arrayImplObj.removeElemAtIndex(arrTwo, index);
        System.out.println("Remove method at a given index...");
        System.out.println(Arrays.toString(resultArrTwo));

        //3. update element -> (double[] arr, int index, double newValue)
        double[] arrThree = {1.0, 3.0, 5.0};
        double newValue = 13.3;
        int indexToUpdate = 2;
        double [] updatedArr = arrayImplObj.updateElem(arrThree, indexToUpdate, newValue);
        System.out.println("Update method...");
        System.out.println(Arrays.toString(updatedArr));

        //4. delete method
        // String[] deleteElem(String[] arr, int index)
        String[] arrFour = {"JAVA", "Spring 6", "Spring Boot3"};
        int indexThree = 0;
        String[] resultArr = arrayImplObj.deleteElem(arrFour, indexThree);
        System.out.println("Delete elem method...");
        System.out.println(Arrays.toString(resultArr));

        //ArrayOpsUsingGenerics class functions
        ArrayOpsUsingGenerics genericArrObj = new ArrayOpsUsingGenerics();
        
        //1. genericsAddElem() - create two different types of arrays and add elems
        Integer[] firstGenericsArr = new Integer[4]; // use Wrapper class with generics
        int genericsIndexOne = 0;
        int genericsVal = 2;
       Integer[] resultArrOne = genericArrObj.genericsAddElem(firstGenericsArr, genericsIndexOne, genericsVal);
       System.out.println("Generics method...");
       System.out.println(Arrays.toString(resultArrOne));

       //example 2 
       String [] names = new String[2];
       String lang1 = "JAVA";
       int indexFour = 1;
       System.out.println("Generic method output...");
       System.out.println(Arrays.toString(genericArrObj.genericsAddElem(names, indexFour, lang1)));


    }
}