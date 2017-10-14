/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeworkregex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 *
 * @author lenovo
 */
public class Cnp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter CNP: ");
        String source = scan.next();
        if(source.length()!= 13)
        {
            System.out.println("The CNP must have 13 digits.");
        }
        else 
        {
            String regex;
            regex= "[1-2](0[1-9]|1[0-2]{2})(0[1-9]|1[0-9]|2[0-9]|3[0-1])(19[0-99]|200[0-9]|201[0-7])(\\d{4})";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(regex);
            boolean found = false;
            while (matcher.find())
            {  
                found = true;
                System.out.println("I found a correct CNP");
              
            } 
        }
       
    }
}
