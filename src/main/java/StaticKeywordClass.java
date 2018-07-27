public class StaticKeywordClass {
    static {
        System.out.println("Static method is invoked");
    }

    public static void main(String argv[]) {
        System.out.println("Main method is invoked");


        Employee employee = new Employee("John", 12312, "Google");
        employee.DisplayData(employee);
        Employee.changeCompanyName();
        employee = new Employee("Peter", 12312, "HCL");
        employee.DisplayData(employee);


    }
}

class Employee {
    static int count = 0;
    int id;
    String name;
    static String Company = "Infosys";

    public Employee(String name, int id, String company) {
        this.name = name;
        this.id = id;

    }

    public void DisplayData(Employee employee) {
        System.out.println("Count Value: " + ++count);
        System.out.println("Name: " + employee.name + "\n Employee ID: " + employee.id + "\n Company: " + employee.Company);
    }

    public static void changeCompanyName() {
        Company = "Global Logic";
    }
}
