import java.util.ArrayList;

public class ArrayListQ1 {
    public static void main(String[] args) {
        ArrayList ar = new ArrayList<>();
        ar.add(" Student 1 ");
        ar.add(" Student 2 ");
        ar.add(" Student 3 ");
        ar.add(" Student 4 ");
        ar.add(" Student 5 ");
        ar.add(" Student 6 ");
        ar.add(" Student 7 ");
        ar.add(" Student 8 ");
        ar.add(" Student 9 ");
        ar.add(" Student 10 ");

//        System.out.println(ar);

        for (Object s : ar)
        {
            System.out.println(s);
        }

    }
}
