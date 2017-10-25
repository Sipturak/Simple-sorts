
/**
 * Write a description of class demo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class demo
{
    public static void main(String [] args){
        OddEvenSort s = new OddEvenSort(6);
        s.insert(2);
        s.insert(3);
        s.insert(10);
        s.insert(8);
        s.insert(7);
        s.insert(1);
        s.oddEvenSort();
    }
}
