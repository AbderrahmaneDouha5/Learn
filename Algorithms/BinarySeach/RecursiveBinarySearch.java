import java.util.Arrays;
public class RecursiveBinarySearch {
    RecursiveBinarySearch(int[] array, int key){
        int result = BinarySearch(array,key,0,array.length);
        System.out.print(result>=0?"The index of key int array : "+result:"not found");
    }
    // @param a the array to be search in
    // @param k the value to be search for  
    // @param l the lower value in the array -a-
    // @param the higher in the array -a-
    //
    int BinarySearch(int a[], int k, int l, int h){
        
        int mid = l+(h-l)/2;

        if(l>=h)
            return -1;
        int value = a[mid];
        if(value<k) 
            return BinarySearch(a,k,mid+1,h);
        else if(value>k) 
            return BinarySearch(a,k,l,mid);
        else
            return mid;
        
    }
    
    
    
}
