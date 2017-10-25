
/**
 * Write a description of class OddEvenSort here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Arrays;

public class OddEvenSort
{
   private int [] arr;
   private int nEl;
   private int maxSize;
   
   public OddEvenSort(int s){
       maxSize = s;
       arr = new int[maxSize];
       nEl = 0;
    }
    public void insert(int value){
        arr[nEl++] = value;
    }
    public int delete(int value){
        
        int j;
        for(j = 0; j < arr.length - 1;j++){
            if(arr[j] == value){
                break;
            }
        }
        if(nEl == 0){
            return 0;
        }
        else{
            for(int k = j; k < arr.length - 1; k++){
                arr[k] = arr[k+1];
            }
            nEl--;
            return value;
        }
    }
    public void oddEvenSort(){
        boolean isSorted = false;
        while(!isSorted){
            isSorted = true;
            int i;
            for(i = 1; i < arr.length - 1 ; i+=2){

                    if(arr[i]  > arr[i + 1]){
                        swap(i, i + 1);
                        isSorted = false;
                    }
                
               
            }
            for(i = 0; i < arr.length - 1; i+=2){

                    if(arr[i] > arr[i+1]){
                        swap(i , i+1);
                        isSorted = false;
                    }
                
            }
        }
    }
    public void swap(int a ,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public String display(){
        return Arrays.toString(arr);
    }
}
