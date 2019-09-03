import java.lang.management.BufferPoolMXBean;

public class Bubblesort {
    public static  void sort( int[]arr){
        int len = arr.length;
        for( int i = 0; i<len; i++){ // 0 t0 3
            for( int j=0; j<len-i-1;j++){ //  i = 0; j 0 to 4
               if(arr[j]>arr[j+1]){
                   int temp = arr[j]; // swapping adjacent element
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
               }
            }
        }
    }
    public static void main(String[]args){
         int [] arr ={ 5,9,2,6,-4,4,3,8};
           Bubblesort.sort(arr);
           for( int i=0; i<arr.length;i++){
             System.out.print (arr[i]+ " ");
           }
      }
}
