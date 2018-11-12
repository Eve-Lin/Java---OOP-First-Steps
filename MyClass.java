public class MyClass {
    int x = 10;

    public static void main(String[] args) {
        MyClass myObj = new MyClass();
        myObj.x = 25; // will generate an error: cannot assign a value to a final variable
        System.out.println(myObj.x);
    }
}
