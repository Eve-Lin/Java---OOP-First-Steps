public class SuperKeyword {

    int num = 90;
}

class SubClass extends SuperKeyword{

    int num = 110;

    private void printNum(){

        System.out.println(super.num);  //prints the 'num' variable of the parent class
    }

    public static void main(String[] args) {

        SubClass obj1 = new SubClass();
        obj1.printNum();
    }
}
