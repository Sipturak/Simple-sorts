
/**
 * Write a description of class demo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class demo
{
   public static void main(String [] args){
       BubbleSort b = new BubbleSort(7);
       b.insert(3);
       b.insert(6);
       b.insert(1);
       b.insert(4);
       b.insert(2);
       b.insert(5);
       b.insert(0);
       
       System.out.println("Before sorting : ");
       b.display();
       
       b.bubbleSort();
       System.out.println("After sorting : ");
       b.display();
       System.out.println("Middle value is "  + b.median());
    }
}
