package EmployeeProgram;

public class employee1 {
    private String name;
    private int age;
    private String designation;
    private double salary;

    public employee1(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    public void setDesignation(String designation){
        this.designation = designation;
    }

    public String getDesignation(){
        return this.designation;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public double getSalary(){
        return this.salary;
    }

    public void printDetails(){
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Designation: " + this.designation);
        System.out.println("Salary: " + this.salary);

    }

}
