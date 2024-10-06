public class calculatearrayfloat {
    public static void main(String[] args) {
        float [] no = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        float sum = 0;
        for(float num : no)
        {
            sum = sum+num;
        }
        System.out.println(sum);
    }
}

//public class Main {
//    public static void main(String[] args) {
//        double [] num={8.9, 6.2, 2.5, 8.4, 9.0};
//        double sum=0;
//
//        for(double elem: num)
//        {
//            sum=sum+elem;
//        }
//        System.out.print(sum);
//    }
//}