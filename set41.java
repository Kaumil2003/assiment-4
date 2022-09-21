/*
 * Write a program to show the try - catch block to catch the different types of exception. Different type of exception types

github link:
 * ID:21ce108
 * Name:Kaumil ptni
 */


import java.util.*;

public class set41 {  
 
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);
        try  
        {  
        int data=50/0;
        }  
             
        catch(ArithmeticException e)  
        {  
                 
            System.out.println("Can't divided by zero");  
        }  
        try{
            int[] array = new int[5];  
        for(int i=0;i<6;i++)
        {
           array[i]=sc.nextInt();  
        }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println ("Array Index is Out Of Bounds\n");
        }
        try {
            System.out.println ("enter string\n");
         
            String str= sc.next();      
            System.out.print("You have entered: "+str);  
            char c = str.charAt(15);
            System.out.println(c);
        }
        catch(StringIndexOutOfBoundsException e) {
            System.out.println("\nStringIndexOutOfBoundsException\n");
        }
         try {
            String a = null; 
            System.out.println(a.charAt(0));
        } catch(NullPointerException e) {
            System.out.println("NullPointerException..");
        }
       
    }  
     
}  
