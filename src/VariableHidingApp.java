public class VariableHidingApp {
  public static void main(String[] args) {
    Child child = new Child();
    child.name = "Jhon Doe";
    child.getChildClass();
    System.out.println(child.name);

    Parent parent = new Parent();
    parent.name = "Allice";
    parent.getParentClass();
    System.out.println(parent.name);
  }
}
