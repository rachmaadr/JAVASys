public class CastAndCheck {
  public static void main(String[] args) {
    sayHello(new Employee("Jhon Doe"));
    sayHello(new Manager("Alex", "Manager", 50));
    sayHello(new Staff("Jhon Doe", "Technician"));
  }

  static void sayHello(Employee employee) {
    if (employee instanceof Manager) {
      Manager manager = (Manager) employee;
      System.out.println("Hello Manager " + manager.name);
    } else if (employee instanceof Staff) {
      Staff staff = (Staff) employee;
      System.out.println("Hello staff " + staff.name);
    } else {
      System.out.println("Hello Employee " + employee.name);
    }
  }
}
