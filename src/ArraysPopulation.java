public class ArraysPopulation {
    public static void main(String []args){
        // why to use arrays
        int state1 =890;
        int state2 =450;
        int state3= 678;
        int state4 = 908;
        int state5 = 430;
        // instead of writing multiple times we can store the values in arrays
            int[] population =new int[5];
            System.out.println("The country population is"+ population);
            // reading element in array
            System.out.println(population[0]);
            System.out.println(population[1]);// out put will be 0 as 0 is stored in array as default.
            System.out.println(population[2]);
            // write into array
            population[0]= 890;// here elements will have some value
            population[1]= 450;
            population[2]=678;
            population[3]=908;
            population[4]=430;
            System.out.println(population[0]);
            System.out.println(population[1]);
            System.out.println(population[2]);
            System.out.println(population[3]);
            System.out.println(population[4]);
        for( int i =0; i< population.length;i++) {
            System.out.println(" The population in each state is "+ population[i]);
        }
        // we usually write for each loop for arrays

          for( int i: population ){
              System.out.println(i);
          }
    }
}
