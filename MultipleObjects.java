public class MultipleObjects {
    int x = 5;

    public static void main(String[] args) {
        MultipleObjects myObj1 = new MultipleObjects();   //Object 1
        MultipleObjects myObj2 = new MultipleObjects();   //Object 2
        myObj2.x = 25;

        System.out.println(myObj1.x);
        System.out.println(myObj2.x);
    }
}
