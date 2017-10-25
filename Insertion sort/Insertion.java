
/**
 * Write a description of class Insertion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Insertion
{
   private int [] arr;
   private int nEl;
   private int maxSize;
   
   public Insertion(int s){
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
    public void insertionSort(){
        
        for(int i = 1; i < arr.length;i++){
            int temp = arr[i];
            for(int j = i; j > 0; j--){
                if(arr[j - 1] >= temp){
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
                else{
                    break;
                }
               
            }
        }
    
    }
    public void display(){
        for(int i = 0 ; i < arr.length;i++){
            System.out.print(arr[i] + " " );
        }
        System.out.println("");
    }
   
}
