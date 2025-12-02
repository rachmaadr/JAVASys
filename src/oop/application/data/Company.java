package oop.application.data;

public class Company {
  private String name;
  public class Employee {
    private String name;
    // Mengakses Outer Class
    public String getCompany(){
      return Company.this.getName();
    }
    public String getName(){
      return name;
    }
    public void setName(String targetName){
      this.name = targetName;
    }
    public String toString(){
      return "Employee name: " + this.name;
    } 
  }
  public String getName(){
    return name;
  }
  public void setName(String targetName){
    this.name = targetName;
  }
  public String toString(){
    return "Company Name: " + this.name;
  }
}
