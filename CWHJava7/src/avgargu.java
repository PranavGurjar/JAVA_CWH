public class avgargu {
        static float avg(float ...arr){
            float sum=0;
            float avg;

            for(float elem : arr){
                sum+=elem;
            }
            avg = sum/ arr.length;
            return avg;
        }

        public static void main(String[] args) {

            float average = avg( 10, 5, 4, 5, 6);


            System.out.println("The average using argument = "+ average);

        }
    }


