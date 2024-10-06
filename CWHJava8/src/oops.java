
        class Employee{

            int salary;
            String name;

            public void setName(String n){
                name = n;
            }

            public int getSalary(){
                return salary;
            }

            public String getName(){
                return name;
            }



        }
        public class oops {
        public static void main(String[] args) {
            Employee pranav = new Employee();

            pranav.setName("raj");
            pranav.salary= 400;

            System.out.println(pranav.getName());
            System.out.println(pranav.getSalary());
        }

}
