package com.C2Evaluation;

import java.util.Scanner;

public class StringManipulator {
    public StringBuffer removeVowels(String input)
    {
//write the logic to remove all the vowels from the supplied input string
//and return that string
//if somebody calls this method with a null value then return the null
        StringBuffer stringWithoutVowels = new StringBuffer();
  //      System.out.println(stringWithoutVowels);
        for(int i =0;i<input.length();i++)
        {
             if('a' == input.charAt(i) || 'e' == input.charAt(i) || 'i' == input.charAt(i) || 'o' == input.charAt(i) || 'u' == input.charAt(i) )
            {
                continue;
            }else{
                 stringWithoutVowels.append(input.charAt(i));
             }
        }
      //  String stringWithoutVowels = (String) stringWithoutVowels  <--- this id not possible
        return stringWithoutVowels;
    }
    public static void main(String[] args) {
//Create a scanner class object to take input from the user
//prompt the user to enter a valid String.
//call the removeVowels method by creating an object of StringManipulator class.
//print the result
        Scanner scan =  new Scanner(System.in);
        System.out.println("Enter the String");
        String str = scan.next();
        StringManipulator strMan= new StringManipulator();
        System.out.println(strMan.removeVowels(str));
    }
}