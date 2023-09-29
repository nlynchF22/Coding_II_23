public class Tester {
    public static void main(String[] args){
        Rectangle rect = new Rectangle(12, 3);
        Employee employee = new Employee(2932, "Billy Bob", 2903.90);
        System.out.println(rect.areaCalc());
        System.out.println(rect.perimeterCalc());
        System.out.println(employee.getEmployeeID());
        System.out.println(employee.getEmployeeName());
        System.out.println(employee.getEmployeeNameLastFirstFormat());
        System.out.println(employee.getEmployeeSalary());
    }    
}
