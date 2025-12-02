public class EmployeeApp {
  public static void main(String[] args) {
    Employee employee;
    employee = new Employee("Jhon Doe", 20);
    employee.introduction();

    Staff staff;
    staff = new Staff("Andi", "Programmer");
    staff.introduction("Lorry");

    Manager manager;
    manager = new Manager("ALex", "Manager", 5000000);
    manager.introduction("Ferdy");
  }
}