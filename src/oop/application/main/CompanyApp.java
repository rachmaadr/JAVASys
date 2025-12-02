package oop.application.main;

import oop.application.data.Company;

public class CompanyApp {
  public static void main(String[] args) {
    Company company = new Company();
    company.setName("Jhon Doe");

    Company.Employee employeeName = company.new Employee();
    employeeName.setName("Allice");
    System.out.println(employeeName);
    System.out.println(company);
  }
}
