public class ByteRange{
    public static void main(String [] args){
        System.out.println("Byte Range...");
        checkByteRangeError();
    }
    public static void checkByteRangeError(){
        byte num1 = 13;
        System.out.println(num1);
       // byte num = 128; // range of byte is -128 to 127
                        // This line shows syntax error
    }
}