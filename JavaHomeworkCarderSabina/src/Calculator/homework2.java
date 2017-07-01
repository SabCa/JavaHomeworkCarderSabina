/*
    an algorithm for a arithmetic computer 
    homework1 (the clasic read from keypad calculator)
 */
package Calculator;

import java.util.Scanner;

/**
 *
 * @author Sab
 */
public class homework2
{

    public static void main(String[] args) 
    {
        int num1;
        int num2;
        String operator;


        Scanner input = new Scanner(System.in);

        System.out.println("please enter the first number");
        num1 = input.nextInt();
       
        System.out.println("please enter the second number");
        num2 = input.nextInt();

        Scanner op = new Scanner(System.in);

        System.out.println("Please enter operator");
        operator = op.next();

        switch (operator)
        {
                case "+" :
                System.out.println("your result is " + (num1 + num2));
                break;
                
                case "-" :
                System.out.println("your result is " + (num1 - num2));
                break;
                
                case "/" :
                System.out.println("your result is " + (num1 / num2));
                break;
                
                case "*" :
                System.out.println("your result is " + (num1 * num2));
                break;
                
                default :
                    System.out.println("Sorry, you introduced wrong data. I quit:) ");
                    /* the output for wrong data only works if you put a wrong operator, not if you give num1 or num2 
                    other values except for int
                    i don't know how to fix that yet*/
        }
 // PRESS SHIFT + F6

    }
}