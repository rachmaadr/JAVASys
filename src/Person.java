class Person {
  String name;
  int age;
  final String address = "Indonesia";
  Person(String name, Integer age){
    this.name = name;
    this.age = age;
    System.out.println("iam " + name + ", my age is " + age);
  }
  Person(String name){
    this(name, null);
  }
  Person(){
    this(null);
  }
  void sayHello(String name) {
    System.out.println("Hello " + name + ", my name is " + this.name);
  }
}