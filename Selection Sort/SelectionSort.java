
/**
 * Write a description of class SelectionSort here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Arrays;

public class SelectionSort
{
    public static void main(String [] args){
    
        Selection s = new Selection(10);
        s.insert(20);
        s.insert(2);
        s.insert(10);
        s.insert(25);
        s.insert(40);
        s.insert(22);
        
        System.out.println("Curretn arrays ");
        s.display();
        s.selectionSort();
        System.out.println("After selection sort");
        s.display();
    }
   
}
