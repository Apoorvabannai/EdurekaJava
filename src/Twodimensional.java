public class Twodimensional {
    public static void main(String[] args) {
         int [] [] wp = { { 12345,1654, 8596, 6785, 8756},{ 4567, 8459, 8763}, {874,756,937, 847}
         };
         System.out.println("The world population is "+ wp[0]);
         System.out.println("The world population  1 and 2 is "+ wp[0][1]);
         for( int i =0; i<wp.length;i++) {
             for(int j=0; j<wp[i].length;j++){
                 System.out.print(wp[i][j] + "  ");
             }
             System.out.println( );
         }

    }

}
