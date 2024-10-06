import java.util.HashSet;

public class HashSetCollection {
    public static void main(String[] args) {
        HashSet<Integer> h1 = new HashSet<>(6,0.5f);
        HashSet<Integer> h2 = new HashSet<>();
        h1.add(5);
        h1.add(1);
        h1.add(2);
        h1.add(4);
        h1.add(5);
        h1.add(3);

        System.out.println(h1);

//        System.out.println("h1 before removing any element : " + h1);
//        h1.remove(5); //deletes 3 from the hashset
//        System.out.println("h1 after removing a element : " + h1);

//        System.out.println(h1.isEmpty());
//        System.out.println(h2.isEmpty());

//        System.out.println("h1 before : " + h1);
//        h1.clear(); //deletes all the elements from the hashset
//        System.out.println("h1 after  : " + h1);

        System.out.println("The size of h1 is : " + h1.size());
    }
}
