public class Address {

    int streetNum;
    String strName;
    String city;
    String country;

    Address(int num, String str,String city, String country){

        this.streetNum = num;
        this.strName = str;
        this.city = city;
        this.country = country;
    }
}

class Student{

    int rollNum;
    String studentName;
    Address studentAddress; //creating a HAS-A relationship with Address class

    Student(int rollNum, String name, Address addr){
        this.rollNum = rollNum;
        this.studentName = name;
        this.studentAddress = addr;
    }

    public static void main(String[] args) {
        Address adr = new Address(1000, "Vitosha", "Sofia", "Bulgaria");

        Student student = new Student(1, "Eve",adr);

        System.out.println(student.studentName);
        System.out.println(student.studentAddress.city);
        System.out.println(student.studentAddress.country);
    }
}