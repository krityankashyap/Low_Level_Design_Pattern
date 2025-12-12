package SOLID.Example1.betterCode;

public class Employee {
  private int id;  // Employee ID
  private String name; // Employee name
  private String address;  // employee address

  public Employee(int id, String name, String address){
    this.id= id;
    this.name= name;
    this.address= address;
  }

  public int getEmployeeID(){
    return id;
  }
  
  public String getEmployeeName(){
    return name;
  }
  
  public String getEmployeeAddress(){
    return address;
  }

  public void setEmployeeAddress(String address){
    this.address= address;
  }

  public void setEmployeeName(String name){
    this.name= name;
  }
}
