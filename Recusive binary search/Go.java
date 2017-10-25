
/**
 * Write a description of class Go here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Go
{
    //instance variables
    private int size;
    private int [] arr;
    private int nEl;
    
    //Constructor
    public Go(int maxSize){
        size = maxSize;
        arr = new int[size];
        nEl = 0;
    }
    /**
     * In the same time insert value in array and sort it with linear search
     */
    public  void insert(int value){
        int i;
        for(i = 0; i < nEl;i++){  //linear serach
            if(arr[i] > value){
                break; 
            }
        }
        for(int k = nEl; k > i; k--){
            arr[k]= arr[k -1]; 
        }
        arr[i] = value;
        nEl++;
    }
    /**
     * Display elements in array
     */
    public void display(){
        for(int i = 0; i < nEl; i++){
            System.out.print(arr[i] + " , " );
        }
        System.out.println();
    }
    /**
     * Use a recusive binary search to find element in array
     * @param key which you wan to find in array
     * @param lowerBound - lowerBound of array at index 0
     * @param upperBound - upperBound in array or the last element in array
     * @return true if element is same as key else return false
     */
    private boolean recusiveBinary(int key, int lowerBound,int upperBound){
        int cIndex;
        cIndex = (lowerBound + upperBound) / 2;
        if(arr[cIndex] == key){
            return true;
        }
        else if(lowerBound > upperBound){
            return false;
        }
        else{
            if(arr[cIndex] < key){
                return recusiveBinary(key, cIndex + 1,upperBound);
            }
            else{
                return recusiveBinary(key,lowerBound, cIndex - 1);
            }
        }
    }
    /**
     * Find key in array
     * @return true if you found it
     */
    public boolean find(int key){
        return recusiveBinary(key, 0 , nEl - 1);
    }
    public static void main (String [] args){
        Go g = new Go(5);
        g.insert(2);
        g.insert(3);
        g.insert(1);
        g.insert(4);
        g.display();
        System.out.println(g.find(5));
    }
}
