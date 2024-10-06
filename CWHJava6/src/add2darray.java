public class add2darray {
        public static void main(String[] args) {
            int [] [] num1={{1, 2, 3},
                    {4, 5, 6}};
            int [] [] num2={{6, 5, 4},
                    {3, 2, 1}};
            int [] [] result={{0, 0, 0},
                    {0, 0, 0}};

            int i, j;
            for(i=0; i<num1.length; i++)
            {
                for(j=0; j<num1[i].length; j++)
                {
                    System.out.format("i = %d, j= %d \n", i, j);
                    result[i][j]=num1[i][j]+num2[i][j];
                }
                System.out.println("\n");
            }
            System.out.println("result\n");
            for(i=0; i<num1.length; i++)
            {
                for(j=0; j<num1[i].length; j++)
                {
                    System.out.print(result[i][j] +"\t");
                }
                System.out.println("\n");
            }

        }
    }


