public class LinearSearch {
    static int lsearch( int []arr, int elm) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (elm == arr[i]) {
                index = i;
                break;
            }
        }
        return index;
    }

    public static void  main(String[]args){
        int arr[] = { 4,1,10,-3,12};
        int elm =  4;
        int indexFound = LinearSearch.lsearch(arr,elm);

        if (indexFound != -1) {
            System.out.println( " The Element is at" + " "+ indexFound);
        }
        else{
            System.out.println( " The Element is not there.");
        }
    }
}
