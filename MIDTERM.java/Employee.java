public class Employee {
    private int employeeID = 0;
    private String employeeName = "";
    private double employeeSalary = 0.0;
    public int getEmployeeID() {
        return employeeID;
    }
    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }
    public String getEmployeeName(){
        return employeeName;
    }
    public String getEmployeeNameLastFirstFormat() {
        String firstName = "";
        String lastName = "";
        int spaceIdx = 0;
        spaceIdx = employeeName.indexOf(" ");
        firstName = employeeName.substring(0, spaceIdx);
        lastName = employeeName.substring(spaceIdx +1);
        return lastName + ", " + firstName;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    public double getEmployeeSalary() {
        return employeeSalary;
    }
    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }
    public Employee(int employeeID, String employeeName, double employeeSalary){
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
    }
}
