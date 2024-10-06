public class floatavg {
        public static void main(String[] args) {
            double [] num={8.9, 6.2, 2.5, 8.4, 9.0};
            double sum=0;

            for(double elem: num)
            {
                sum=sum+elem;
            }

            System.out.println("the value of the average sum is  =  "+sum/num.length);
        }
    }
