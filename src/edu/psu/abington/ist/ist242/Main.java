/*
Project: Lab 3 Java Branching
Purpose Details: Learn how to use Java branching syntax: if, if-else, boolean value, logical, switch
Course: IST 242
Author: Aneta O'Donnell
Date Developed: 1/20/2020
Last Date Changed: 2/1/2020
Revision: 3
*/

package edu.psu.abington.ist.ist242;

public class Main {

    public static void main(String[] args) {
        // four program arguments passed into the main method as a String array in the variable object named args.
        // args[0] = 1; args[1] = 2; args[2] = True; args[3] = 3

        // SECTION 1
        // if expression: if it matches the program argument value 1 passed-in then print the value matched
        if(Integer.parseInt(args[0])==1) // args[0] = 1; args[1] = 2; args[2] = True; args[3] = 3
        {
            System.out.println("Argument value: "+args[0]);
        }

        // SECTION 2
        // if-else expression: if it matches the program argument value 2 passed-in then print if the value matched or not matched
        if(Integer.parseInt(args[1])==2) // args[0] = 1; args[1] = 2; args[2] = True; args[3] = 3
        {
            System.out.println("Value matched: "+args[1]); // if arg 1 value is 2 then it will print 2
        }
        else
            System.out.println("Value " +args[1]+" not matched"); // if arg 1 value is not 2 then it will print not matched


        // SECTION 3
        // if expression with a boolean condition: if arg 3 matches the Boolean (values - true or false, yes or no) program argument value 3 passed in, then the code block will print the boolean value
        if(Boolean.parseBoolean(args[2])==true) // args[0] = 1; args[1] = 2; args[2] = True; args[3] = 3
            System.out.println("Boolean matched: "+args[2]);

        // SECTION 4
        // switch statement: Using the program argument value 4 passed in find the value in the switch and print the value one, two, three.
        switch(Integer.parseInt(args[1])) // args[0] = 1; args[1] = 2; args[2] = True; args[3] = 3
        {
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            default:
                System.out.println("NO MATCH");
        }
    }
}



