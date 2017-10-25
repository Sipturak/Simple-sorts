
/**
 * Write a description of class Binary here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Arrays;

public class Binary
{
   private int [] arr;
   private int nEl;
   
   public Binary(int max){
       arr = new int [max];
       nEl = 0;
    }
    
   public void insert(int value){
       arr[nEl] = value;
       nEl++;
    }
    
   public void bubbleSort(){
    
       for(int i = 1; i < arr.length;i++){
           for(int j = 0; j < arr.length - i;j++){
               int curr = arr[j];
               if(arr[j] > arr[j+1]){
                   arr[j] = arr[j+1];
                   arr[j+1] = curr;
                }
            }
        }
    
    }
    
   public int find(int searchKey){
      int lowerBound = 0;
      int upperBound = arr.length - 1;
      int cInt; 
      while(true){
          cInt = (lowerBound + upperBound) / 2;
          if(arr[cInt] == searchKey){
              return searchKey;
          }
          else if(lowerBound > upperBound){
              return nEl;
            }
          else{
              if(arr[cInt] < searchKey){
                  lowerBound = cInt + 1;
                }
              else{
                  upperBound = cInt - 1;
               }
            }
        }
   }
  
    public String display(){
        return Arrays.toString(arr);
    }
   
}
