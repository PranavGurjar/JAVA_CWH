import java.util.ArrayList;

public class ArrayListCollection {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>(3);
        l1.add(30);
        l1.add(10);
        l1.add(20);
        l1.add(15);
        l1.add(20);
        l1.add(30);

        l1.add(2,25);

        l2.add(2);
        l2.add(1,1);
        l2.add(3);
        l2.add(5);

//        l1.clear();

//        System.out.println("Before remove index 2 "+l1);
//        l1.remove(2);
//        System.out.println("After remove index 2 "+l1);

//        System.out.println("Array list : "+ l1);
//        System.out.println("L1 list contains 10 : " + l1.contains(10));
//        System.out.println("L1 list contains 14 : " + l1.contains(14));

//        System.out.println("L1 Array list : "+ l1);
//        System.out.println("L2 Array list : " +l2);
//        l1.addAll(0, l2);
//        System.out.println("L1 Array list after merging: "+ l1);
//        System.out.println("L2 Array list : " +l2);

//        System.out.println("L1 Array list : "+ l1);
//        System.out.println("The first occurrence of 20 in l1 is at index : " + l1.indexOf(20));

//        System.out.println("L1 Array list : "+ l1);
//        System.out.println("The last occurrence of 30 in l1 is at index : " + l1.lastIndexOf(30));

        l1.addAll(0, l2);
        l1.addLast(676);
        l1.addFirst(788);
        System.out.println(l1.contains(27));
        System.out.println(l1.indexOf(20));
        System.out.println(l1.lastIndexOf(676));
        //l1.clear();
        l1.set(1, 566);
        for(int i=0; i<l1.size(); i++){
            System.out.print(l1.get(i));
            System.out.print(", ");
        }
        System.out.println();

//        for each loop
//        for (Integer int1 : l1){
//            System.out.print(int1+", ");
//        }
    }
}
