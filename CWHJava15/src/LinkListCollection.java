import java.util.LinkedList;

public class LinkListCollection {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();

        l1.add(10);
        l1.add(50);
        l1.add(20);
        l1.add(40);
        l1.add(30);

        l2.add(11);
        l2.add(55);
        l2.add(22);
        l2.add(44);


        l1.addAll(0, l2);
        l1.addFirst(60);
        l2.addFirst(33);

        l1.addLast(70);
        l2.addLast(66);

        System.out.println(l1);
        System.out.println(l2);

        l1.addAll(0, l2);
        System.out.println(l1);

        System.out.println(l1.contains(50));
        System.out.println(l1.indexOf(20));
        System.out.println(l1.lastIndexOf(30));
        //l1.clear();
        l1.set(1, 566);
        for(int i=0; i<l1.size(); i++){
            System.out.print(l1.get(i));
            System.out.print(", ");
        }

    }
}
