/*

abstract class AbstractClass {       //Abstract parent class

    abstract void sound ();
}

 */



public class Dog extends AbstractClass{

        public void sound(){
            System.out.println("Woof");
        }

        public static void main(String[] args) {
            Dog myDoggy = new Dog();
            myDoggy.sound();
        }
    }

