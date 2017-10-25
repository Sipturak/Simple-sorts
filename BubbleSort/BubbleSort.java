
/**
 * Write a description of class a here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Arrays;
public class BubbleSort
{
   private int [] numbers;
   private int nEl;
   
   public BubbleSort(int max){
       numbers = new int[max];
       nEl = 0;
   }
   
   public void insert(int value){
       numbers[nEl] = value;
       nEl++;
    }
    /**
     * 
     */
    public void bubbleSort(){
        for(int i = numbers.length - 1; i > 0; i--){
            for(int j = 0; j < i; j++){
                int temp = numbers[j];
                if(numbers[j] > numbers[j+1]){
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
    }
    /**
     * 
     */
    public int median(){
        int cInt,lowerBound,upperBound;
        lowerBound = 0;
        upperBound = numbers.length - 1;
        while(true){
            cInt = (lowerBound + upperBound) / 2;
            if(cInt > numbers[cInt - 1] && cInt < numbers[cInt + 1]){
                return cInt;
            }
        }
    }
    
    public void display(){
        for(int i = 0; i < numbers.length;i++){
            System.out.println("Element on index " + i + " is " + numbers[i]);
        }
    }
   
}

