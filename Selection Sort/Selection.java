
/**
 * Write a description of class Selection here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Arrays;
public class Selection
{
   private long [] num;
   private int maxSize;
   private int nEl;
   
   public Selection(int s){
       maxSize = s;
       num = new long[maxSize];
       nEl = 0;
   }
   /**
    * Insert item in array;
    */
   public void insert(long j){
       num[nEl] = j;
       nEl++;
   }
   /**
    * Delete value from array
    * @return deleted item of array
    */
   public long delete(long value){
       int j;
       for(j = 0; j < num.length; j++){
           if(value == num[j]){
               break;
            }
        }
        if(nEl == 0){
            return 0;
        }
        else{
            for(int i = j; i < num.length - 1;i++){
                num[i+1] = num[i];
            }
            nEl--;
            
            return value;
        }
    }
    /**
     * Sort array with selection sort on the way that you look for the minimum item and than switch with left most
     */
    public void selectionSort(){
        long temp;
        int min;
        for(int i = 0; i < num.length; i++){
            temp = num[i]; //current item 
            min = i; //recod the left most item like min
            for(int j = i + 1; j < num.length ; j++){
                if(num[j] < num[min]){ //compare with right most if it is true
                    min = j;  //sve right most item in like min
                }
            }
            swap(i,min);
        }
    }
    public void swap(int a, int b){
        long temp = num[a];
        num[a] = num[b];
        num[b] = temp;
    }
   public void display(){
       for(int i = 0; i < num.length;i++){
           System.out.print(num[i] + " ");
        }
        System.out.println();
    }
}
