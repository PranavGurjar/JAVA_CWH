import java.util.ArrayDeque;

public class ArrayDequeCollection {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ArrayDeque<Integer> ad2 = new ArrayDeque<>();

        ad1.add(5);
        ad1.add(4);
        ad1.add(1);
        ad1.add(3);
        ad1.add(2);
        ad1.addFirst(6);
        ad1.addLast(7);
        ad1.offerFirst(0);
        ad1.offerLast(8);


        ad2.add(22);
        ad2.addFirst(11);
        ad2.add(33);
        ad2.addLast(44);
        

//        ad1.pollFirst();
//        ad1.removeFirst();
//
//        ad1.pollLast();
//        ad1.removeLast();

        System.out.println(ad1);

//        System.out.println(ad1.getFirst());
//        System.out.println(ad1.peekFirst());
//
//        System.out.println(ad1.getLast());
//        System.out.println(ad1.peekLast());





        ad1.addLast(676);
        ad1.addFirst(788);
        System.out.println(ad1.contains(2));
        System.out.println(ad1);

        ad1.addAll(ad2);

        //ad1.clear();
        for(Integer i1 : ad1)
        {
            System.out.print(i1+", ");
        }
    }
}
