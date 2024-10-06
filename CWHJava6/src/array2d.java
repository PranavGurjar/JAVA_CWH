public class array2d {
        public static void main(String[] args) {
            int [] num1={1, 2, 3 , 4};
            int [] num2={1, 2, 3};
            int i, j;
            for(int elem1: num1)
            {
                for(int elem2:num2)
                {
                    System.out.println(elem1+ "," + elem2);
                }
                System.out.println("\n");
            }

        }
    }


