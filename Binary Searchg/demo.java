
/**
 * Write a description of class demo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class demo
{
    public static void main (String [] args){
      
   
        Binary b = new Binary(10);
        b.insert(1);
        b.insert(55);
        b.insert(88);
        b.insert(5);
        b.insert(10);
        b.insert(66);
        b.insert(555);
        System.out.println("Insert and display " + b.display());
        b.bubbleSort();
        System.out.println("Bubble sort " + b.display());
        System.out.print("Find a value : ");
        int cInt = new Scanner(System.in).nextInt();
        if(cInt == b.find(cInt)){
            System.out.println("Found it");
        }
        else{
            System.out.println("Enter number is not in arrary" );
        }
        


    }
}

