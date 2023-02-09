package logical_programming;

import java.util.Scanner;

public class PalindromeString {
	//Creating checkPalindrome() method to check string  
    public static void checkPalindrome(String str){    
        String rev = ""; // Objects of String class     
        int length;  
          
        //Getting length of the string  
        length = str.length();     
          
        //Reversing string  
        for ( int j = length - 1; j >= 0; j-- )    
            rev = rev + str.charAt(j);  
          
        //Cheking whether the given string is equal to the reverse string or not   
        if (str.equals(rev))    
            System.out.println(str+" is a palindrome string.");    
        else    
            System.out.println(str+" is not a palindrome string.");          
    }     
	
    public static void main(String[] args) {   
        
        //Getting string from the user  
        Scanner sc = new Scanner(System.in);   
        String str = sc.nextLine();  
      
        //Calling checkPalindrome() method to check whether the given string is palindrome or not  
        checkPalindrome(str);  
    }  
}  
  
    

