package lab10;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andrew.abel
 */
public class ValidateTester {

    public static void main(String[] args) {

        // An array of inputs
        String[] inputs = new String[5];
        inputs[0] = "ISBN 978-0-273-72131-4";
        inputs[1] = "iSBN 978-0-273-72131-4";
        inputs[2] = "ISBN 978-0-273-72131-e";
        inputs[3] = "ISCN 978-0-273-72131-4 ";
        inputs[4] = "ISCN 978-0-273-72131";

        // An array of expected answers
        boolean[] res = {true, false, false, false, false};

        // Check each ISBN
        for (int i = 0; i < inputs.length; i++) {
            System.out.println("Test Case " + i + ".");
            System.out.println("Your output: " + Validate.validateString(inputs[i]));

            System.out.println("Expected: " + res[i]);
            System.out.println();
        }
        
    }

}
