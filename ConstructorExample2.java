public class ConstructorExample2 {

    ConstructorExample2(){
        System.out.println("The constructor of the parent class.");
    }
}

class Child2 extends ConstructorExample2{

    Child2(){

        System.out.println("The constructor of the child class.");
    }
    Child2(int num){

        System.out.println("Parameterized Constructor.");
    }
    public void display(){
        System.out.println("Hi there!");
    }

    public static void main(String[] args) {

        Child2 obj1 = new Child2();
        obj1.display();

        // prints: The constructor of the parent class
        // The constructor of the child class.
        // Hi there!

        Child2 obj2 = new Child2(7);
        obj2.display();


        // The constructor of the parent class.
        // Parameterized Constructor.
        // Hi there!
    }
}