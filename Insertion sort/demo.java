
/**
 * Write a description of class demo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class demo
{
   public static void main(String [] args){
       Insertion i = new Insertion(6);
       i.insert(2);
       i.insert(1);
       i.insert(5);
       i.insert(-1);
       i.display();
       System.out.println(i.delete(-1));
       i.insert(1);
       i.display();
       i.insertionSort();
       i.display();
    }
}
