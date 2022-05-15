public class IterationBinarySearch {
    
    IterationBinarySearch(int[] array, int key){
        int result = BinarySearch(array,key);
        System.out.print(result>=0?"The index of key int array : "+result:"not found");
    }

    // @param a the array to be search in
    // @param k the value to be search for  
    private int BinarySearch(int[] a, int k){
        int l = 0, h = a.length;

        while(l<h){
            int mid = l+(h-l)/2;
            int value = a[mid];
            //if a[mid] less than key
            //than search in the second part of array -a-
            if(value<k) 
                l = mid+1;
            //if a[mid] biger than key
            //than search in the first part of array -a-
            else if(value>k) 
                h = mid;
            //if a[mid] equal to key
            //than return mid (indek of key)
            else 
                return mid;
        }
        //otherways return -1 (key doesn't exist in the array -a-)
        return -1;
    }
    
        
}
