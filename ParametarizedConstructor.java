public class ParametarizedConstructor {

    int empId;
    String empName;

//parameterized constructor with two parameters

    ParametarizedConstructor(int id, String name) {
        this.empId = id;
        this.empName = name;
    }

    void info() {
        System.out.println("Id: " + empId + "Name: " + empName);
    }

    public static void main(String args[]) {
        ParametarizedConstructor obj1 = new ParametarizedConstructor(10245, "Chaitanya");
        ParametarizedConstructor obj2 = new ParametarizedConstructor(92334, "Negan");
        obj1.info();
        obj2.info();
    }
}