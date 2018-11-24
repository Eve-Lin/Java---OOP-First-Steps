public class SuperKeywordEx {

    SuperKeywordEx(){

        System.out.println("Parent class constructor");
    }

    SuperKeywordEx(String str){
        System.out.println("Parameterized Parent Class Constructor.");
    }
}

class Child extends SuperKeywordEx{

    Child(){

        super("Hello World!"); //will use directly the parameterized constructor of the parent

        System.out.println("The Constructor of the Child Class.");
    }

    public void display(){
        System.out.println("Hi there!");
    }

    public static void main(String[] args) {

        Child firstChild = new Child();
        firstChild.display();

        //Parameterized Parent Class Constructor.
        //The Constructor of the Child Class.
        //Hi there!
    }
}