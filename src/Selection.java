public class Selection {
    static void sort(int[]arr) {
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            int min = i;//assuming min is ith.
            for (int j = i + 1; j < length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
     public static void main(String []args) {
        int [ ] arr = { 4,1,10,-3,12};
        Selection.sort(arr);
        for( int elm: arr){
            System.out.print( elm + " ");
        }
     }




}
