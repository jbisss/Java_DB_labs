/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conditionalex;

/**
 *
 * @author anshenoy
 */
public class TernaryOperator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 4, y = 9;
        if (y / x < 3) {
            x += y;
        } else {
            x *= y;
        }
        System.out.println("After if stmt, x = " + x);
        // Use a ternary operator to perform the same logic as above.
        int x_1 = 4, y_1 = 9;
        x_1 = (y_1/x_1 <= 3 ? x_1+y_1 : x_1*y_1);
        System.out.println("After ternary operator, x_1 = " + x_1);
    }
}

      
    

