//
//    class employee{
//        int id;
//        String name;
//    }
//    public class Main {
//    public static void main(String[] args) {
//        employee obj = new employee();
//
//        obj.id = 12;
//        obj.name = "pranav";
//
//        System.out.println(obj.id);
//        System.out.println(obj.name);
//
//    }
//}


//class employee{
//    int id;
//    String name;
//
//    public void printdetails(){
//        System.out.println("the id is "+id);
//        System.out.println("the name is "+name);
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        employee obj = new employee();
//
//        //setting the attributes
//        obj.id = 12;
//        obj.name = "pranav";
//
//        //print the attributes
//        obj.printdetails();
//
////        System.out.println(obj.id);
////        System.out.println(obj.name);
//
//    }
//}

class employee{
    int id;
    int salary;
    String name;

    public void printdetails(){
        System.out.println("the id is "+id);
        System.out.println("the name is "+name);
    }
    public int getSalary(){
        return salary;
    }
}
public class Main {
    public static void main(String[] args) {
        employee pranav = new employee();
        employee ram = new employee();

        //setting the attributes
        pranav.id = 12;
        pranav.name = "pranav";
        pranav.salary = 34;

        ram.id = 15;
        ram.name = "ram";
        ram.salary = 12;

        //print the attributes
        pranav.printdetails();
        int salary = pranav.getSalary();
        System.out.println("pranav salary = "+salary);

        ram.printdetails();
        salary = ram.getSalary();
        System.out.println("ram salary = "+salary);

//        System.out.println(obj.id);
//        System.out.println(obj.name);

    }
}