package SOLID.Example1.ProblematicCode;

public class Employee {
  private int id; // Employee ID
  private String name; // Employee Name
  private String address;

  public Employee(int id, String name, String address){
    this.id= id;
    this.name= name;
    this.address= address;
  }

  public void performaceReport(){
    // Generating performance report
    System.out.println("Generating performace report "+ name);
  }

  public double CaluculateSalary(){
    // Calculating salary

    return 1000.0;
  }

  public void updateEmployeeData(){
    // Updating employee data
    System.out.println("Employee data is updated");
  }

  public void fetchEmployeeData(){
    // Fetching employee data
    System.out.println("Employee data is fetched");
  }
}
