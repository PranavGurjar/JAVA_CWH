class MyGeneric<T1, T2>{
    int val;
    private T1 t1;
    private T2 t2;

    public MyGeneric(int val, T1 t1, T2 t2) {
        this.val = val;
        this.t1 = t1;
        this.t2 = t2;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }

    public T2 getT2() {
        return t2;
    }

    public void setT2(T2 t2) {
        this.t2 = t2;
    }
}


class MyGenerics {
    public static void main(String[] args) {
//        ArrayList<Integer> ar = new ArrayList<>();
//        ArrayList<int> ar = new ArrayList<>();   // this is produce the error
//        ar.add("Str 1");
//        ar.add(52);
//        ar.add(643);
//        ar.add(new Scanner(System.in));

//        int a =  (int)  ar.get(2); //typecast
//        int a = ar.get(2);
//        System.out.println(a);





        MyGeneric<String, Integer> g = new MyGeneric(23, "Pranav Mahajan", 28);

        String str = g.getT1();
        System.out.println(str);

        int num = g.getT2();
        System.out.println(num);


    }
}
