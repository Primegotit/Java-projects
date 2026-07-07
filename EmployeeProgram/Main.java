package EmployeeProgram;
public class Main{
    public static void main(String[] args){
        employee1 emp1 = new employee1("Promise");
        employee1 emp2 = new employee1("Prime");
        employee1 emp3 = new employee1("Blaunx");

        emp1.setAge(21);
        emp1.setDesignation("Manager");
        emp1.setSalary(23.4);
        emp1.printDetails();
        
    }
}
