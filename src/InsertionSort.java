public class InsertionSort { // didnt understand
    static void sort( int arr[]){
        int l= arr.length;
        for( int i=0; i<l;i++){
            int key = arr[i];
            int j= i-1;
            while( j>=0 && arr[j]>key) {
                arr[j+1] = arr[j];
                j= j-1;
            }
              arr[j+1] = key;
        }

    }
    public static void main(String[]args){
        int [] arr ={ 5,9,2,6,-4,4,3,8};
        InsertionSort.sort(arr);
        for( int i=0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
