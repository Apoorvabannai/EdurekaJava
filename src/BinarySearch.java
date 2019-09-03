public class BinarySearch {
    static int binarysearch(int[] arr, int r, int l, int x) {
        if (r >= l) {

            int mid = l + (r - l) / 2;
            if (arr[mid] == x) {
                return mid;
            }
            if (arr[mid] > x) {
                return binarysearch(arr, mid + 1, r, x);
            }
        }
        return -1;
    }
    public static void  main(String[]args){
        int arr[] = { 4,1,10,-3,12};
        int elm =  9;
        int len = arr.length;
        int indexFound = BinarySearch.binarysearch(arr,0,len-1,elm);

        if (indexFound != -1) {
            System.out.println( " The Element is at" + " "+ indexFound);
        }
        else{
            System.out.println( " The Element is not there.");
        }
    }
}



