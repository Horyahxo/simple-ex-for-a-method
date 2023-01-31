/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package methods.pkg_.min;
import java.util.Scanner; 

/**
 this program allows you to find the min and the max between  3 numbers of your choice 
 */
public class Methods_Min {

    
    public static void main(String[] args) {
   Scanner in = new Scanner (System.in);
     int first,second,third;
     System.out.println("your first number : ");
          first = in.nextInt();
     System.out.println(" your second number : ");
           second = in.nextInt();
     System.out.println(" your third number : ");
          third = in.nextInt();
          
          if (first == second && second == third)
           System.out.println ("they are equal");
          else
          {
          System.out.println ("the smallest number is " + min ( first,second,third));
          System.out.println ("the biggest number is " + max ( first,second,third));
          }
    }
    
   public static int min(int n1 , int n2,int n3){
    int min = n1 ;
    if (n1 > n2)
    min = n2;
     if (n2 > n3)
        min = n3;
        return min ; 
   }
    public static int max(int n1 , int n2,int n3){
    int max = n1 ;
    if (n1 < n2)
    max = n2;
     if (n2 < n3)
        max = n3;
        return max ; 
   }
}
