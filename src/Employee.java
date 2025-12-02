class Employee {
  String name;
  Integer age;
  final String companyName = "PT. " + "ABC " + "Indonesia";

  Employee(String targetName, Integer targetAge) {
    this.name = targetName;
    this.age = targetAge;
  }

  Employee(String name) {
    this(name,null);
  }

  void introduction() {
    System.out.println("Hello, I am " + this.name +
        ", my age is " + this.age +
        ", I work for " + this.companyName);
  }
}

class Staff extends Employee {
  String role;

  Staff(String name, String role) {
    super(name, null);
    this.role = role;
  }
  Staff(String name){
    super(name);
  }

  void introduction(String targetName) {
    System.out
        .println("Hello " + targetName +
            ", I am " + this.name +
            ". My role is " + role +
            " in " + this.companyName);
  }
}

class Manager extends Staff {
  int salary;

  Manager(String name, String role, int salary) {
    super(name, role);
    this.salary = salary;
  }
  Manager(String name){
    super(name);
  }

  void introduction(String targetName) {
    System.out.println("Hello " + targetName +
        ", my name is " + this.name +
        ", I am the " + this.role +
        " in " + this.companyName +
        " with salary " + salary);
  }
}