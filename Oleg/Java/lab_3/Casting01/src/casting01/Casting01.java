
package casting01;

public class Casting01 {
    public static void main(String[] args) {
        //Declare and initialize a byte with a value of 128
        //Observe NetBeans' complaint
        //Declare and initialize a short with a value of 128
        short value = 128;
        //Create a print statement that casts this short to a byte
        System.out.println((byte)value);
        //Declare and initialize a byte with a value of 127
        byte value_1=127;
        //Add 1 to this variable and print it
        value_1++;
        System.out.println(value_1);
        //Add 1 to this variable again and print it again
        value_1++;
        System.out.println(value_1);
    }    
}
