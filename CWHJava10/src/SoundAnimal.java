
    class Animal{
        public void printani(){
            System.out.println("Animal is like dog, cat");
        }

    }

    class Dog extends Animal{
        public void print(){
            System.out.println("bark = bow. bow");
        }
    }




    public class SoundAnimal {
        public static void main(String[] args) {
            Animal a = new Animal();
            System.out.format("Constructor and inheritance of animal \n");
            a.printani();

            Dog d = new Dog();
            System.out.format("\n\nConstructor and inheritance of dog \n");
            d.printani();
            d.print();

        }
    }

