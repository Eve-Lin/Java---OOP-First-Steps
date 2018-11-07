class SuperChildConstructor {

    SuperChildConstructor() {
        System.out.println("My ParentClassConstructor");
    }

}

class ChildClass extends SuperChildConstructor{

    ChildClass(){
        System.out.println("My ChildClass Constructor");
    }

    public static void main(String[] args) {
        new ChildClass();
    }
        }
